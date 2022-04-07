package flitesharp.component.literal;

import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing an integer or double literal. The result of the corresponding program is the value of the
 * literal.
 */
public class NumberComponent extends DataComponent {
    private final double value;

    /**
     * Constructs a new NumberComponent with a given value.
     * @param value the value of the literal represented by the component
     */
    public NumberComponent(double value){
        this.value = value;
    }

    /**
     * Returns the numeric value of the literal.
     * @return the numeric value of the literal
     */
    public double getNumberValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        if (this.getType().getName() == TypeName.DOUBLE || this.getType().getName() == TypeName.INT) {
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE type is expected");
        }
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
        if (this.getType() == null) {
            if (value - ((int) value) < 1e-6) {
                return "[integer, " + (int)(value) + "]";
            }
            return "[double, " + value + "]";
        }
        else if (this.getType().getName() == TypeName.INT) {
            return "[integer, " + (int)(value) + "]";
        }
        return "[double, " + value + "]";
    }
}
