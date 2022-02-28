package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;

/**
 * A component representing a ADDITION operation. The result of the corresponding program is the result of the ADDITION.
 */
public class AdditionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new AdditionComponent representing a ADDITION operation between two other components.
     * @param leftOperand component representing the first operand of the ADDITION operation
     * @param rightOperand component representing the second operand of the ADDITION operation
     */
    public AdditionComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a AdditionComponent is the result of the ADDITION operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        double result = leftOperand.evaluate(env).getNumberValue() +
                rightOperand.evaluate(env).getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Addition[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

