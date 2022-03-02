package flitesharp.component.literal;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list literal. The elements of a list literal are literal components.
 */
public class ListLiteralComponent extends LiteralComponent{
    private final List<DataComponent> elements;

    /**
     * Constructs a new ListLiteralComponent containing the given list of elements.
     * @param elements the elements of the new ListLiteralComponent
     */
    public ListLiteralComponent(List<DataComponent> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ListLiteralComponent is the ListLiteralComponent itself.</p>
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
        StringBuilder s = new StringBuilder("list[");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append("; ");
        s.append("]");
        return s.toString();
    }

    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        return null;
    }
}
