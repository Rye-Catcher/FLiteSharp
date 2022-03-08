package flitesharp.component.literal;

import flitesharp.component.type.TypeName;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

/**
 * A component representing an integer or double literal. The result of the corresponding program is the value of the
 * literal.
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
     */
    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        if(toCompare.getType() != this.getType()) {
            return false;
        }
        double toCompareValue = ((LiteralComponent) toCompare).getNumberValue();
        if(this.getType().getName() == TypeName.INT) {
            return ((int) value) == ((int) toCompareValue);
        }
        return toCompareValue == value;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NumberComponent is the value of the represented integer or double literal.</p>
     */
    @Override
    public NumberComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if (getType().getName() == TypeName.INT) {
            return "[integer, " + (int)(value) + "]";
        }
        return "[double, " + value + "]";
    }
}
