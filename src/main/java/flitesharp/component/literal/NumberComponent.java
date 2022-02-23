package flitesharp.component.literal;

/**
 * A component representing a number literal. The result of the corresponding program is the value of the literal.
 */
public class NumberComponent extends LiteralComponent {
    private final double value;

    /**
     * Constructs a new NumberComponent with a given value.
     * @param value the value of the literal represented by the component
     */
    public NumberComponent(double value){
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getNumberValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NumberComponent is the value of the represented numeric value.</p>
     */
    @Override
    public NumberComponent evaluate() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if (value - Math.floor(value) < 0.0000001) {
            return "[number, " + (int)(value) + "]";
        }
        return "[number, " + value + "]";
    }
}
