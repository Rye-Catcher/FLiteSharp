package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

/**
 * A component representing a SUBTRACTION operation.
 * The result of the corresponding program is the result of the SUBTRACTION.
 */
public class SubtractionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new SubtractionComponent representing a SUBTRACTION operation between two other components.
     * @param leftOperand component representing the first operand of the SUBTRACTION operation
     * @param rightOperand component representing the second operand of the SUBTRACTION operation
     */
    public SubtractionComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a SubtractionComponent is the result of the SUBTRACTION operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        double result = leftOperand.evaluate().getNumberValue() -
                rightOperand.evaluate().getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Subtraction[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

