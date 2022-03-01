package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.UndefinedComponent;

/**
 * A component representing a conditional statement or expression. The result of the corresponding program is the result
 * of the IF branch if the test is true and of the ELSE branch if the test is false. If test is false and
 * there's no ELSE branch the result is the literal undefined.
 */
public class ConditionalStatementComponent extends Component {
    private final Component test;
    private final Component consequent;
    private final Component alternate;

    /**
     * Constructs a new ConditionalStatementComponent representing a conditional statement or expression with ELSE
     * branch.
     * @param test component representing the test condition of the statement or expression
     * @param consequent component representing operations of the IF branch
     * @param alternate component representing operations of the ELSE branch
     */
    public ConditionalStatementComponent(Component test, Component consequent, Component alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    /**
     * Constructs a new ConditionalStatementComponent representing a conditional statement without ELSE branch.
     * @param test component representing the test condition of the statement or expression
     * @param consequent component representing operations of the IF branch
     */
    public ConditionalStatementComponent(Component test, Component consequent) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ConditionalStatementComponent is the result of the IF branch if the test is true and
     * of the ELSE branch if the test is false. If test is false and there's no ELSE branch the result is the literal
     * undefined.</p>
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
            return "if-else[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + ", "
                    + alternate.getStringRepresentation() + "]";
        else
            return "if[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + "]";
    }
}

