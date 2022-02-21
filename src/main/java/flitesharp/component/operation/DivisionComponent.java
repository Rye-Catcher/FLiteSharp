package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

/**
 * A component representing a DIVISION operation.
 * The result of the corresponding program is the result of the DIVISION.
 */
public class DivisionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new DivisionComponent representing a DIVISION operation between two other components.
     * @param leftOperand component representing the first operand of the DIVISION operation
     * @param rightOperand component representing the second operand of the DIVISION operation
     */
    public DivisionComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a DivisionComponent is the result of the DIVISION operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        //How to deal with 0 ?
        double result = leftOperand.evaluate().getNumberValue() /
                rightOperand.evaluate().getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Division[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

