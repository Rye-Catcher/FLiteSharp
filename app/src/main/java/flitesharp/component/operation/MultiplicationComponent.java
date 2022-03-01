package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;

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
    public LiteralComponent evaluate(EnvFrame env) {
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() *
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
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

