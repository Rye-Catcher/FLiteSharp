package flitesharp.component.literal;

import flitesharp.component.environment.EnvFrame;

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
    public Boolean equals(LiteralComponent toCompare) {
        boolean toCompareValue;
        try {
            toCompareValue = toCompare.getBooleanValue();
        }
        catch (UnsupportedOperationException e) {
            return null; //To be updated once we decide how to manage type checking
        }
        return toCompareValue == value;
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
