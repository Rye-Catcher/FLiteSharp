package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.exception.IllegalTypeException;

/**
 * A component representing an undefined literal. The result of the corresponding program is the undefined value.
 */
public class UndefinedComponent extends DataComponent{

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        throw new IllegalTypeException("Undefined has no type", this);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an UndefinedComponent is the undefined value.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[Undefined]";
    }
}
