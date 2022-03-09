package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a conditional expression. The result of the corresponding program is the result of the THEN
 * branch if the test is true and of the ELSE branch if the test is false. If test is false and there's no ELSE branch
 * the result is the literal undefined.
 */
public class ConditionalExpressionComponent extends Component {
    private final Component test;
    private final Component consequent;
    private final Component alternate;

    /**
     * Constructs a new ConditionalExpressionComponent representing a conditional expression with ELSE branch.
     * @param test component representing the test condition of the expression
     * @param consequent component representing operations of the THEN branch
     * @param alternate component representing operations of the ELSE branch
     */
    public ConditionalExpressionComponent(Component test, Component consequent, Component alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    /**
     * Constructs a new ConditionalExpressionComponent representing a conditional expression without ELSE branch.
     * @param test component representing the test condition of the expression
     * @param consequent component representing operations of the THEN branch
     */
    public ConditionalExpressionComponent(Component test, Component consequent) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement typeTest = test.checkType(env);
        TypeElement typeCons = consequent.checkType(env);
        test.setType(typeTest);
        consequent.setType(typeCons);
        if (typeTest.getName() != TypeName.BOOL) {
            throw new IllegalTypeException("A BOOL value is expected for TEST of conditionals");
        }

        if (alternate != null) {
            TypeElement typeAlt = alternate.checkType(env);
            alternate.setType(typeAlt);

            if (typeCons.match(typeAlt)) {
                return typeAlt;
            } else {
                throw new IllegalTypeException("The CONSEQUENT and ALTERNATE of conditionals " +
                        "are expected to have the same type");
            }
        } else {
            if (typeCons.getName() != TypeName.UNIT) {
                throw new IllegalTypeException("A UNIT value is expected for CONSEQUENT" +
                        "if there is no ALTERNATE in conditionals");
            }
            return typeCons;
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ConditionalExpressionComponent is the result of the THEN branch if the test is true
     * and of the ELSE branch if the test is false. If test is false and there's no ELSE branch the result is the
     * literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent result;
        if(((BooleanComponent)(test.evaluate(env))).getBooleanValue())
            result = consequent.evaluate(env);
        else if(alternate != null)
            result = alternate.evaluate(env);
        else
            result = new UndefinedComponent();
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if(alternate != null)
            return "if-then-else[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + ", "
                    + alternate.getStringRepresentation() + "]";
        else
            return "if-then[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + "]";
    }
}

