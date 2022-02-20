package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;

/**
 * A component representing a LESSTHANOREQUAL operation.
 * The result of the corresponding program is the result of the LESSTHANOREQUAL.
 */
public class LessThanOrEqualComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new LessThanOrEqualComponent representing a LESSTHANOREQUAL operation between two other components.
     * @param leftOperand component representing the first operand of the LESSTHANOREQUAL operation
     * @param rightOperand component representing the second operand of the LESSTHANOREQUAL operation
     */
    public LessThanOrEqualComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a LessThanOrEqualComponent is the result of the LESSTHANOREQUAL operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        boolean result = leftOperand.evaluate().getNumberValue() <
                rightOperand.evaluate().getNumberValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "LessThanOrEqual[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

