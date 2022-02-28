package flitesharp.component.literal;

import flitesharp.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list literal. The elements of a list literal are literal components.
 */
public class ListLiteralComponent extends LiteralComponent{
    private final List<LiteralComponent> elements;

    /**
     * Constructs a new ListLiteralComponent containing the given list of elements.
     * @param elements the elements of the new ListLiteralComponent
     */
    public ListLiteralComponent(List<LiteralComponent> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean equals(LiteralComponent toCompare) {  //TODO: Implement this
        return false;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ListLiteralComponent is the ListLiteralComponent itself.</p>
     */
    @Override
    public LiteralComponent evaluate() {
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
}
