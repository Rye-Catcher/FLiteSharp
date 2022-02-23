package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;

/**
 * A component representing a NOT operation. The result of the corresponding program is the result of the NOT.
 */
public class NotComponent extends Component {
    private final Component operand;

    /**
     * Constructs a new NotComponent representing a NOT operation performed on another component.
     * @param operand component representing the operand of the NOT operation
     */
    public NotComponent(Component operand){
        this.operand = operand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an NotComponent is the result of the NOT operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        boolean result = !operand.evaluate().getBooleanValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Not[" + operand.getStringRepresentation() + "]";
    }
}
