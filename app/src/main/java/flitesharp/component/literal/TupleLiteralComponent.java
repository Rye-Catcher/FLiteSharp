package flitesharp.component.literal;

import flitesharp.component.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a tuple literal. The elements of a tuple literal are literal components.
 */
public class TupleLiteralComponent extends LiteralComponent{
    private final List<LiteralComponent> elements;

    /**
     * Constructs a new TupleLiteralComponent containing the given list of elements.
     * @param elements the elements of the new TupleLiteralComponent
     */
    public TupleLiteralComponent(List<LiteralComponent> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean equals(LiteralComponent toCompare) {  //TODO: Implement this
        return false;
    }   //TODO: Implement this

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a TupleLiteralComponent is the TupleLiteralComponent itself.</p>
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
        StringBuilder s = new StringBuilder("tuple(");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append(", ");
        s.append(")");
        return s.toString();
    }
}
