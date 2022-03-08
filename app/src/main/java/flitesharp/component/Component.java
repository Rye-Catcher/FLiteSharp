package flitesharp.component;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;

/**
 * A component represent a generic part of a program. It can for example be a literal, an operation, a block. A
 * component can be evaluated to get the result of the corresponding program.
 */
public abstract class Component {
    private TypeElement type;

    /**
     * Returns the type of the component.
     * @return the type of the component
     */
    public TypeElement getType() {
        return type;
    }

    /**
     * Sets the type of the component.
     * @param type the type to set
     */
    public void setType(TypeElement type) {
        this.type = type;
    }

    /**
     * Evaluates the program represented by the component and returns the program result.
     * @return a data containing the result of the program
     */
    public abstract DataComponent evaluate(EnvFrame env);

    /**
     * Returns a string representation of the component.
     * @return a string representation of the component
     */
    public abstract String getStringRepresentation();
}
