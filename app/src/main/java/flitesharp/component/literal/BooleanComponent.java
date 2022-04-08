package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a boolean literal. The result of the corresponding program is the value of the literal.
 */
public class BooleanComponent extends DataComponent {
    private final boolean value;

    /**
     * Constructs a new BooleanComponent with a given value.
     * @param value the value of the literal represented by the component
     */
    public BooleanComponent(boolean value){
        this.value = value;
    }

    /**
     * Returns the boolean value of the literal.
     * @return the boolean value of the literal
     */
    public boolean getBooleanValue() {
        return value;
    }

    /**
     * {@inheritDoc}
     *
     * @return bool type
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        this.setType(new TypeElement(TypeName.BOOL));
        return this.getType();
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
