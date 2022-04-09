package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.IllegalTypeException;

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
     * @return a bool type if the operand is of type bool
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement op = operand.checkType(env);
        if (op.getName() == TypeName.BOOL) {
            this.setType(new TypeElement(op));
            return this.getType();
        } else {
            throw new IllegalTypeException("A BOOL value is expected for NOT operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an NotComponent is the result of the NOT operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
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
