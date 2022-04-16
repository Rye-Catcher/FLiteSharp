package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;

/**
 * A component representing an undefined literal. The result of the corresponding program is the undefined value.
 */
public class UndefinedComponent extends DataComponent{

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) {
        this.setType(new TypeElement(TypeName.UNDEFINED));
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an UndefinedComponent is the undefined value.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void prettyPrint() {
        System.out.print("undefined");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[Undefined]";
    }
}
