package flitesharp.component.literal;

import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

/**
 * A component representing an integer or double literal. The result of the corresponding program is the value of the
 * literal.
 */
public class NumberComponent extends DataComponent {
    private final double value;

    /**
     * Constructs a new NumberComponent with a given value and type.
     * @param value the value of the literal represented by the component
     * @param type the type of the literal represented by the component (int or double)
     */
    public NumberComponent(double value, TypeElement type){
        this.value = value;
        this.setType(type);
    }

    /**
     * Returns the numeric value of the literal.
     * @return the numeric value of the literal
     */
    public double getNumberValue() {
        if(this.getType().getName() == TypeName.INT) {
            return ((int) value);
        }
        return value;
    }

    /**
     * {@inheritDoc}
     *
     * @return double if the component is a double literal or int if the component is an integer literal. If the type of
     * the component is invalid (neither int nor double) it returns null
     */
    @Override
    public TypeElement checkType(EnvFrame env) {
        if (this.getType().getName() == TypeName.DOUBLE || this.getType().getName() == TypeName.INT) {
            return this.getType();
        } else {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void prettyPrint() {
        if(this.getType().getName() == TypeName.INT) {
            System.out.print((int) value);
        } else {
            System.out.print(value);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if (this.getType().getName() == TypeName.INT) {
            return "[integer, " + (int)(value) + "]";
        }
        return "[double, " + value + "]";
    }
}
