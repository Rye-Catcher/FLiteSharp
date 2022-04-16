package flitesharp.component.patternMatching;

import flitesharp.component.Component;
import flitesharp.component.compoundData.CompoundDataComponent;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UnitComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;
import org.javatuples.Triplet;

import javax.xml.crypto.Data;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a pattern matching operation.
 * The result of the pattern matching is the result of the first matching
 */
public class PatternMatchingComponent extends Component {
    private NameComponent varName;
    private List<Triplet<Component, Component, Component>> patterns;

    /**
     * Constructs a new PatternMatchingComponent representing a pattern matching operation.
     * @param varName the name of the variable
     * @param patterns the patterns to be matched
     */
    public PatternMatchingComponent(NameComponent varName, List<Triplet<Component, Component, Component>> patterns) {
        this.varName = varName;
        this.patterns = patterns;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type of the result of the pattern matching if all patterns branches returns the same type
     * and all pattern types matches the type of the variable
     * and the conditional branches returns the boolean type
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        List<TypeElement> typeLst = new ArrayList<>();
        TypeElement varType = varName.checkType(env);

        for (Triplet<Component, Component, Component> pattern : patterns) {
            if (pattern.getValue0() instanceof NameComponent
                    && env.findType(pattern.getValue0().toString()) == null) {
                //variable pattern
                env.addNewBinds(pattern.getValue0().toString(), varType, null);
                typeLst.add(pattern.getValue2().checkType(env));

                if (pattern.getValue1() != null
                        && !pattern.getValue1().checkType(env).match(new TypeElement(TypeName.BOOL))) {
                    throw new IllegalTypeException("The condition type does not match the boolean type", this);
                }
                env.delBinds(pattern.getValue0().toString());
                continue;
            } else if (pattern.getValue0() instanceof CompoundDataComponent patternComp) {
                if (patternComp.isList()) {
                    List<Component> plst = patternComp.getElements();
                    List<String> varLst = new ArrayList<>();
                    if (varType.getName() != TypeName.LIST) {
                        throw new IllegalTypeException("The variable is not a list but the pattern is!", this);
                    } else {
                        TypeElement lstType = varType.getLastChild();
                        for (Component data : plst) {
                            if (data instanceof NameComponent && env.findType(data.toString()) == null) {
                                //variable pattern
                                varLst.add(data.toString());
                                env.addNewBinds(data.toString(), lstType, null);
                                continue;
                            } else {
                                if (!data.checkType(env).match(lstType)) {
                                    throw new IllegalTypeException(
                                            "The pattern list doesnot match the type of the variable",
                                            this);
                                }
                            }
                        }
                        if (pattern.getValue1() != null
                                && !pattern.getValue1().checkType(env).match(new TypeElement(TypeName.BOOL))) {
                            throw new IllegalTypeException("The condition type does not match the boolean type", this);
                        }
                    }
                    typeLst.add(pattern.getValue2().checkType(env));
                    for (String var : varLst) {
                        env.delBinds(var);
                    }
                }
            } else {
                TypeElement type = pattern.getValue2().checkType(env);
                typeLst.add(type);

                if (!pattern.getValue0().checkType(env).match(varType)) {
                    throw new IllegalTypeException("The pattern type does not match the variable type", this);
                } else if (pattern.getValue1() != null
                        && !pattern.getValue1().checkType(env).match(new TypeElement(TypeName.BOOL))) {
                    throw new IllegalTypeException("The condition type does not match the boolean type", this);
                }
            }
        }

        TypeElement fstType = typeLst.get(0);
        for (TypeElement type : typeLst) {
            if (!type.match(fstType)) {
                throw new IllegalTypeException("Pattern matching branches have different types", this);
            }
        }

        this.setType(fstType);
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a pattern matching expression is the result of the matched pattern</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent varData = varName.evaluate(env);
        for (Triplet<Component, Component, Component> pattern: patterns) {
            Component patternComponent = pattern.getValue0();
            DataComponent patternResult = null;

            BooleanComponent condition = new BooleanComponent(true);

            if (patternComponent instanceof NameComponent patternName) {
                DataComponent patternData = patternName.evaluate(env);
                if (patternData == null) {
                    //variable pattern
                    env.addNewBinds(patternName.toString(), varData.getType(), varData);
                    patternResult = pattern.getValue2().evaluate(env);
                    env.delBinds(patternName.toString());
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                    }
                    if (condition.getBooleanValue()) {
                        return patternResult;
                    }
                } else {
                    if (patternData instanceof BooleanComponent patternBool) {
                        BooleanComponent varBool = (BooleanComponent) varData;
                        if (pattern.getValue1() != null) {
                            condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                        }
                        if (patternBool.getBooleanValue() == varBool.getBooleanValue() && condition.getBooleanValue()) {
                            patternResult = pattern.getValue2().evaluate(env);
                            return patternResult;
                        }
                    } else if (patternData instanceof NumberComponent patternNum) {
                        NumberComponent varNum = (NumberComponent) varData;
                        if (pattern.getValue1() != null) {
                            condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                        }
                        if (patternNum.getNumberValue() == varNum.getNumberValue() && condition.getBooleanValue()) {
                            patternResult = pattern.getValue2().evaluate(env);
                            return patternResult;
                        }
                    }
                }
            } else if (patternComponent instanceof BooleanComponent patternBool) {
                BooleanComponent varBool = (BooleanComponent) varData;
                if (patternBool.getBooleanValue() == varBool.getBooleanValue() && condition.getBooleanValue()) {
                    patternResult = pattern.getValue2().evaluate(env);
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                    }
                    return patternResult;
                }
            } else if (patternComponent instanceof NumberComponent patternNum) {
                NumberComponent varNum = (NumberComponent) varData;
                if (patternNum.getNumberValue() == varNum.getNumberValue() && condition.getBooleanValue()) {
                    patternResult = pattern.getValue2().evaluate(env);
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                    }
                    return patternResult;
                }
            } else if (patternComponent instanceof UnitComponent) {
                if (condition.getBooleanValue()) {
                    patternResult = pattern.getValue2().evaluate(env);
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                    }
                    return patternResult;
                }
            } else if (patternComponent instanceof CompoundDataComponent patternComp) {
                //throw new RuntimeException("Not implemented yet");

                if (patternComp.isList()) {
                    List<Component> plst = patternComp.getElements();
                    ListComponent varLst = (ListComponent) varData;
                    List<DataComponent> vLst = varLst.getValue();
                    TypeElement lstType = vLst.get(0).getType();
                    List<String> nameLst = new ArrayList<>();
                    if (plst.size() == vLst.size()) {
                        boolean flag = true;
                        for (int i = 0; i < plst.size() & flag; i++) {
                            if (plst.get(i) instanceof NameComponent name
                                && env.findVal(name.toString()) == null) {
                                env.addNewBinds(name.toString(), vLst.get(i).getType(), vLst.get(i));
                                nameLst.add(name.toString());
                            } else if (lstType.getName() == TypeName.DOUBLE) {
                                if (plst.get(i) instanceof NumberComponent patternNum) {
                                    NumberComponent varNum = (NumberComponent) vLst.get(i).evaluate(env);
                                    if (patternNum.getNumberValue() != varNum.getNumberValue()) {
                                        flag = false;
                                    }
                                }
                            } else if (lstType.getName() == TypeName.INT) {
                                if (plst.get(i) instanceof NumberComponent patternNum) {
                                    NumberComponent varNum = (NumberComponent) vLst.get(i).evaluate(env);
                                    if (patternNum.getNumberValue() != varNum.getNumberValue()) {
                                        flag = false;
                                    }
                                }
                            } else if (lstType.getName() == TypeName.BOOL) {
                                if (plst.get(i) instanceof BooleanComponent patternBool) {
                                    BooleanComponent varBool = (BooleanComponent) vLst.get(i).evaluate(env);
                                    if (patternBool.getBooleanValue() != varBool.getBooleanValue()) {
                                        flag = false;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            patternResult = pattern.getValue2().evaluate(env);
                            if (pattern.getValue1() != null) {
                                condition = (BooleanComponent) pattern.getValue1().evaluate(env);
                            }
                            for (String name : nameLst) {
                                env.delBinds(name);
                            }
                            if (condition.getBooleanValue()) {
                                return patternResult;
                            }
                        }
                    } else {
                        throw new RuntimeException("List size not match");
                    }
                }
            }
        }
        throw new RuntimeException("Pattern matching failed");
    }

    @Override
    public String getStringRepresentation() {
        StringBuilder str = new StringBuilder("PatternMatching[" + varName.getStringRepresentation() + "|");
        for (Triplet<Component, Component, Component> pattern : patterns) {
            str.append(", ")
                    .append(pattern.getValue0().getStringRepresentation()).append(" -> ")
                    .append(pattern.getValue2().getStringRepresentation());
        }
        str.append("]");
        return str.toString();
    }
}
