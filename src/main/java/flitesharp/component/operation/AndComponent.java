package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;
import main.java.flitesharp.component.literal.LiteralComponent;

/**
 * A component representing an AND operation. The result of the corresponding program is the result of the AND.
 */
public class AndComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new AndComponent representing an AND operation between two other components.
     * @param leftOperand component representing the first operand of the AND operation
     * @param rightOperand component representing the second operand of the AND operation
     */
    public AndComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an AndComponent is the result of the AND operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        boolean result = leftOperand.evaluate().getBooleanValue() &&
                rightOperand.evaluate().getBooleanValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "And[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
