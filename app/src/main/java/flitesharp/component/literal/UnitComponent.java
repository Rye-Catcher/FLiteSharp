package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;

/**
 * A component representing a unit literal. The result of the corresponding program is a unit value denoted by `()`.
 */
public class UnitComponent extends DataComponent {

    /**
     * Constructs a new UnitComponent.
     */
    public UnitComponent(){
    }

    /**
     * {@inheritDoc}
     *
     * @return unit type
     */
    @Override
    public TypeElement checkType(EnvFrame env) {
        this.setType(new TypeElement(TypeName.UNIT));
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a UnitComponent is a unit value denoted by `()`.</p>
     */
    @Override
    public UnitComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void prettyPrint() {
        System.out.print("()");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[unit, ()]";
    }
}
