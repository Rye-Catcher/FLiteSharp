package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;

/**
 * A component representing an OR operation. The result of the corresponding program is the result of the OR.
 */
public class OrComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new OrComponent representing an OR operation between two other components.
     * @param leftOperand component representing the first operand of the OR operation
     * @param rightOperand component representing the second operand of the OR operation
     */
    public OrComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an OrComponent is the result of the OR operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        boolean result = ((BooleanComponent)leftOperand.evaluate(env)).getBooleanValue() ||
                ((BooleanComponent)rightOperand.evaluate(env)).getBooleanValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Or[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
