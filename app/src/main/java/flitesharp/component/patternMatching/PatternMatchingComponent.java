package flitesharp.component.patternMatching;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UnitComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeElement;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a pattern matching operation.
 * The result of the pattern matching is the result of the first matching
 */
public class PatternMatchingComponent extends Component {
    private NameComponent varName;
    private List<Pair<Component, Component>> patterns;

    /**
     * Constructs a new PatternMatchingComponent representing a pattern matching operation.
     * @param varName the name of the variable
     * @param patterns the patterns to be matched
     */
    public PatternMatchingComponent(NameComponent varName, List<Pair<Component, Component>> patterns) {
        this.varName = varName;
        this.patterns = patterns;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type of the result of the pattern matching if all patterns branches returns the same type
     * and all pattern types matches the type of the variable
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        List<TypeElement> typeLst = new ArrayList<>();
        TypeElement varType = varName.checkType(env);
        //System.out.println(varName.toString());
        for (Pair<Component, Component> pattern : patterns) {
            TypeElement type = pattern.getSecond().checkType(env);
            typeLst.add(type);
            if (!pattern.getFirst().checkType(env).match(varType)) {
                throw new IllegalTypeException("The pattern type does not match the variable type", this);
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
        for (Pair<Component, Component> pattern : patterns) {
            Component patternComponent = pattern.getFirst();
            DataComponent patternResult = pattern.getSecond().evaluate(env);

            if (patternComponent instanceof BooleanComponent patternBool) {
                BooleanComponent varBool = (BooleanComponent) varData;
                if (patternBool.getBooleanValue() == varBool.getBooleanValue()) {
                    return patternResult;
                }
            } else if (patternComponent instanceof NumberComponent patternNum) {
                NumberComponent varNum = (NumberComponent) varData;
                if (patternNum.getNumberValue() == varNum.getNumberValue()) {
                    return patternResult;
                }
            }
        }
        throw new RuntimeException("Pattern matching failed");
    }

    @Override
    public String getStringRepresentation() {
        StringBuilder str = new StringBuilder("PatternMatching[" + varName.getStringRepresentation() + "|");
        for (Pair<Component, Component> pattern : patterns) {
            str.append(", ")
                    .append(pattern.getFirst().getStringRepresentation()).append(" -> ")
                    .append(pattern.getSecond().getStringRepresentation());
        }
        str.append("]");
        return str.toString();
    }
}
