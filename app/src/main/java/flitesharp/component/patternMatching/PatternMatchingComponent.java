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
import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a pattern matching operation.
 * The result of the pattern matching is the result of the first matching
 */
public class PatternMatchingComponent extends Component {
    private final Component toMatch;
    private final List<Triplet<Component, Component, Component>> patterns;

    /**
     * Constructs a new PatternMatchingComponent representing a pattern matching operation.
     * @param toMatch the name of the variable
     * @param patterns the patterns to be matched
     */
    public PatternMatchingComponent(Component toMatch, List<Triplet<Component, Component, Component>> patterns) {
        this.toMatch = toMatch;
        this.patterns = patterns;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type of the result of the pattern matching if all patterns branches returns the same type
     * and all pattern types matches the type of the expression
     * and the conditional branches returns the boolean type
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        List<TypeElement> typeLst = new ArrayList<>();
        TypeElement exprType = toMatch.checkType(env);

        for (Triplet<Component, Component, Component> pattern : patterns) {
            EnvFrame newEnv = env.extend();
            if (pattern.getValue0() instanceof NameComponent) {
                //variable pattern
                newEnv.addNewBinds(pattern.getValue0().toString(), exprType, null);
                typeLst.add(pattern.getValue2().checkType(newEnv));

                if (pattern.getValue1() != null
                        && !pattern.getValue1().checkType(newEnv).match(new TypeElement(TypeName.BOOL))) {
                    throw new IllegalTypeException("The condition type does not match the boolean type", pattern.getValue1());
                }
            } else if (pattern.getValue0() instanceof CompoundDataComponent patternComp) {
                if (patternComp.isList()) {
                    List<Component> plst = patternComp.getElements();
                    if (exprType.getName() != TypeName.LIST) {
                        throw new IllegalTypeException("The pattern type does not match the expression type", pattern.getValue0());
                    } else {
                        TypeElement lstType = exprType.getLastChild();
                        for (Component data : plst) {
                            if (data instanceof NameComponent) {
                                //variable pattern
                                newEnv.addNewBinds(data.toString(), lstType, null);
                            } else {
                                if (!data.checkType(newEnv).match(lstType)) {
                                    throw new IllegalTypeException("The pattern type does not match the expression type", pattern.getValue0());
                                }
                            }
                        }
                        if (pattern.getValue1() != null
                                && !pattern.getValue1().checkType(newEnv).match(new TypeElement(TypeName.BOOL))) {
                            throw new IllegalTypeException("The condition type does not match the boolean type", pattern.getValue1());
                        }
                    }
                    typeLst.add(pattern.getValue2().checkType(newEnv));
                } else {
                    throw new IllegalTypeException("Patterns of type tuple are not supported", pattern.getValue0());
                }
            } else {
                TypeElement type = pattern.getValue2().checkType(newEnv);
                typeLst.add(type);

                TypeElement patternType = pattern.getValue0().checkType(newEnv);
                if (!patternType.match(exprType)) {
                    throw new IllegalTypeException("The pattern type does not match the expression type", pattern.getValue0());
                } else if(patternType.getName() == TypeName.FUNC) {
                    throw new IllegalTypeException("Patterns of type function are not supported", pattern.getValue0());
                } else if (pattern.getValue1() != null
                        && !pattern.getValue1().checkType(env).match(new TypeElement(TypeName.BOOL))) {
                    throw new IllegalTypeException("The condition type does not match the boolean type", pattern.getValue1());
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
        DataComponent exprData = toMatch.evaluate(env);
        for (Triplet<Component, Component, Component> pattern: patterns) {
            Component patternComponent = pattern.getValue0();
            DataComponent patternResult;

            BooleanComponent condition = new BooleanComponent(true);

            EnvFrame newEnv = env.extend();

            if (patternComponent instanceof NameComponent patternName) {
                //variable pattern
                newEnv.addNewBinds(patternName.toString(), exprData.getType(), exprData);
                patternResult = pattern.getValue2().evaluate(newEnv);
                if (pattern.getValue1() != null) {
                    condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                }
                if (condition.getBooleanValue()) {
                    return patternResult;
                }
            } else if (patternComponent instanceof BooleanComponent patternBool) {
                BooleanComponent varBool = (BooleanComponent) exprData;
                if (patternBool.getBooleanValue() == varBool.getBooleanValue()) {
                    patternResult = pattern.getValue2().evaluate(newEnv);
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                    }
                    if (condition.getBooleanValue()) {
                        return patternResult;
                    }
                }
            } else if (patternComponent instanceof NumberComponent patternNum) {
                NumberComponent varNum = (NumberComponent) exprData;
                if (patternNum.getNumberValue() == varNum.getNumberValue()) {
                    patternResult = pattern.getValue2().evaluate(newEnv);
                    if (pattern.getValue1() != null) {
                        condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                    }
                    if (condition.getBooleanValue()) {
                        return patternResult;
                    }
                }
            } else if (patternComponent instanceof UnitComponent) {
                patternResult = pattern.getValue2().evaluate(newEnv);
                if (pattern.getValue1() != null) {
                    condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                }
                if (condition.getBooleanValue()) {
                    return patternResult;
                }
            } else if (patternComponent instanceof CompoundDataComponent patternComp) {
                if (patternComp.isList()) {
                    List<Component> plst = patternComp.getElements();
                    ListComponent exprLst = (ListComponent) exprData;
                    List<DataComponent> vLst = exprLst.getValue();
                    TypeElement lstType = null;
                    if(vLst.isEmpty() && plst.isEmpty()) {
                        patternResult = pattern.getValue2().evaluate(newEnv);
                        if (pattern.getValue1() != null) {
                            condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                        }
                        if (condition.getBooleanValue()) {
                            return patternResult;
                        }
                    } else if (!vLst.isEmpty()){
                        lstType = vLst.get(0).getType();
                    }
                    if (plst.size() == vLst.size()) {
                        boolean flag = true;
                        for (int i = 0; i < plst.size() & flag; i++) {
                            if (plst.get(i) instanceof NameComponent name) {
                                newEnv.addNewBinds(name.toString(), vLst.get(i).getType(), vLst.get(i));
                            } else if (lstType.getName() == TypeName.DOUBLE) {
                                if (plst.get(i) instanceof NumberComponent patternNum) {
                                    NumberComponent varNum = (NumberComponent) vLst.get(i).evaluate(newEnv);
                                    if (patternNum.getNumberValue() != varNum.getNumberValue()) {
                                        flag = false;
                                    }
                                }
                            } else if (lstType.getName() == TypeName.INT) {
                                if (plst.get(i) instanceof NumberComponent patternNum) {
                                    NumberComponent varNum = (NumberComponent) vLst.get(i).evaluate(newEnv);
                                    if (patternNum.getNumberValue() != varNum.getNumberValue()) {
                                        flag = false;
                                    }
                                }
                            } else if (lstType.getName() == TypeName.BOOL) {
                                if (plst.get(i) instanceof BooleanComponent patternBool) {
                                    BooleanComponent varBool = (BooleanComponent) vLst.get(i).evaluate(newEnv);
                                    if (patternBool.getBooleanValue() != varBool.getBooleanValue()) {
                                        flag = false;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            patternResult = pattern.getValue2().evaluate(newEnv);
                            if (pattern.getValue1() != null) {
                                condition = (BooleanComponent) pattern.getValue1().evaluate(newEnv);
                            }
                            if (condition.getBooleanValue()) {
                                return patternResult;
                            }
                        }
                    }
                }
            }
        }
        throw new RuntimeException("Pattern matching failed! The list of patterns is not exhaustive");
    }

    @Override
    public String getStringRepresentation() {
        StringBuilder str = new StringBuilder("PatternMatching[" + toMatch.getStringRepresentation() + "|");
        for (Triplet<Component, Component, Component> pattern : patterns) {
            str.append(", ")
                    .append(pattern.getValue0().getStringRepresentation()).append(" -> ")
                    .append(pattern.getValue2().getStringRepresentation());
        }
        str.append("]");
        return str.toString();
    }
}
