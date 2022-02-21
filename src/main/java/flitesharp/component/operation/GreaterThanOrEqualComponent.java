package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;
import main.java.flitesharp.component.literal.LiteralComponent;

/**
 * A component representing an GREATERTHANOREQUAL operation. The result of the corresponding program is the result of
 * the GREATERTHANOREQUAL.
 */
public class GreaterThanOrEqualComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new GreaterThanOrEqualComponent representing a GREATERTHANOREQUAL operation between two other
     * components.
     * @param leftOperand component representing the first operand of the GREATERTHANOREQUAL operation
     * @param rightOperand component representing the second operand of the GREATERTHANOREQUAL operation
     */
    public GreaterThanOrEqualComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a GreaterThanOrEqualComponent is the result of the GREATERTHANOREQUAL operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        boolean result = leftOperand.evaluate().getNumberValue() >=
                rightOperand.evaluate().getNumberValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "GreaterThanOrEqual[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
