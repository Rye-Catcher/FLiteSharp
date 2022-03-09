package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing an undefined literal. The result of the corresponding program is the undefined value.
 */
public class UndefinedComponent extends LiteralComponent{
    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        return toCompare instanceof UndefinedComponent; // To be revised once we have type checking
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        throw new IllegalTypeException("Undefined has no type");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an UndefinedComponent is the undefined value.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
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
