package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        operand.setType(operand.checkType(env));
        if (operand.getType().getName() == TypeName.BOOL) {
            this.setType(operand.getType());
            return this.getType();
        } else {
            throw new IllegalTypeException("A BOOL value is expected for NOT operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an NotComponent is the result of the NOT operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        boolean result = !((BooleanComponent)operand.evaluate(env)).getBooleanValue();
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
