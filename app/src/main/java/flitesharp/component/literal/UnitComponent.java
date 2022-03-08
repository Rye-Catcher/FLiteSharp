package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

/**
 * A component representing a unit literal. The result of the corresponding program is a unit value denoted by `()`.
 */
public class UnitComponent extends LiteralComponent {
    /**
     * Constructs a new UnitComponent with a given value.
     */
    public UnitComponent(){
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        return toCompare instanceof UnitComponent;
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
    public String getStringRepresentation() {
        return "[unit, ()]";
    }
}
