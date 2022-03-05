package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;

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

