package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

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
    public LiteralComponent evaluate() {
        double result = leftOperand.evaluate().getNumberValue() +
                rightOperand.evaluate().getNumberValue();
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

