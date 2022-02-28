package flitesharp.component.compoundDataStructure;

import flitesharp.component.Component;
import flitesharp.component.literal.ListLiteralComponent;
import flitesharp.component.literal.LiteralComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list declaration. Each element of this ListComponent is a component to be evaluated. The
 * result of the evaluation is a ListLiteralComponent containing the result of each element of the ListComponent.
 */
public class ListComponent extends Component {
    private final List<Component> elements;

    /**
     * Constructs a new ListComponent representing the declaration of an empty list.
     */
    public ListComponent() {
        elements = new ArrayList<>();
    }

    /**
     * Constructs a new ListComponent representing the declaration of a list with given elements.
     * @param elements component representing the elements of the newly declared list
     */
    public ListComponent(List<Component> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ListComponent is a ListLiteralComponent containing the result of each element of the
     * ListComponent.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        List<LiteralComponent> results = new ArrayList<>();
        for(Component c: elements)
            results.add(c.evaluate());
        return new ListLiteralComponent(results);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder s = new StringBuilder("listDeclaration[");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append("; ");
        s.append("]");
        return s.toString();
    }
}

