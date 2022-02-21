package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

/**
 * A component representing a POWER operation. The result of the corresponding program is the result of the POWER.
 */
public class PowerComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new PowerComponent representing a POWER operation between two other components.
     * @param leftOperand component representing the first operand of the POWER operation
     * @param rightOperand component representing the second operand of the POWER operation
     */
    public PowerComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a PowerComponent is the result of the POWER operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        double result = Math.pow(leftOperand.evaluate().getNumberValue(),
                rightOperand.evaluate().getNumberValue());
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Power[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
