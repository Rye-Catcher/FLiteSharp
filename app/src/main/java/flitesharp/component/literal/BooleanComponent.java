package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a boolean literal. The result of the corresponding program is the value of the literal.
 */
public class BooleanComponent extends LiteralComponent {
    private final boolean value;

    /**
     * Constructs a new BooleanComponent with a given value.
     * @param value the value of the literal represented by the component
     */
    public BooleanComponent(boolean value){
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean getBooleanValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        boolean toCompareValue;
        try {
            toCompareValue = ((LiteralComponent)toCompare).getBooleanValue();
        }
        catch (UnsupportedOperationException e) {
            return null; //To be updated once we decide how to manage type checking
        }
        return toCompareValue == value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        if (this.getType().getName() == TypeName.BOOL) {
            return this.getType();
        } else {
            throw new IllegalTypeException("A BOOL type is expected");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a BooleanComponent is the value of the represented boolean.</p>
     */
    @Override
    public BooleanComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[boolean, " + value + "]";
    }
}
