package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a tuple. The elements of a tuple are literal components.
 */
public class TupleComponent extends LiteralComponent {
    private final List<DataComponent> elements;

    /**
     * Constructs a new TupleComponent containing the given list of elements.
     * @param elements the elements of the new TupleComponent
     */
    public TupleComponent(List<DataComponent> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a TupleComponent is the TupleComponent itself.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder s = new StringBuilder("tuple(");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append(", ");
        s.append(")");
        return s.toString();
    }

    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        return null;
    }
}
