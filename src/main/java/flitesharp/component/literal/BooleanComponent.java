package main.java.flitesharp.component.literal;

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
     *
     * <p>The program result of a BooleanComponent is the value of the represented boolean.</p>
     */
    @Override
    public BooleanComponent evaluate() {
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
