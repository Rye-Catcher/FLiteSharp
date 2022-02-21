package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

/**
 * A component representing a MULTIPLICATION operation.
 * The result of the corresponding program is the result of the MULTIPLICATION.
 */
public class MultiplicationComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new MultiplicationComponent representing a MULTIPLICATION operation between two other components.
     * @param leftOperand component representing the first operand of the MULTIPLICATION operation
     * @param rightOperand component representing the second operand of the MULTIPLICATION operation
     */
    public MultiplicationComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a MultiplicationComponent is the result of the MULTIPLICATION operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        double result = leftOperand.evaluate().getNumberValue() *
                rightOperand.evaluate().getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Multiplication[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

