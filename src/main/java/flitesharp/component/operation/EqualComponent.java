package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;
import main.java.flitesharp.component.literal.LiteralComponent;

/**
 * A component representing an EQUAL operation. The result of the corresponding program is the result of the
 * EQUAL.
 */
public class EqualComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new EqualComponent representing an EQUAL operation between two other components.
     * @param leftOperand component representing the first operand of the EQUAL operation
     * @param rightOperand component representing the second operand of the EQUAL operation
     */
    public EqualComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an EqualComponent is the result of the EQUAL operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        boolean result = leftOperand.evaluate().equals(rightOperand.evaluate());
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Equal[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
