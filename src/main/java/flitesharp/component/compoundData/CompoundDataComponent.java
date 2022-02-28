package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.literal.ListLiteralComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.TupleLiteralComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list or tuple declaration. Each element of this CompoundDataComponent is a component to be
 * evaluated. The result of the evaluation is a ListLiteralComponent or a TupleLiteralComponent containing the result of
 * each element of the CompoundDataComponent.
 */
public class CompoundDataComponent extends Component {
    private final List<Component> elements;
    private final boolean isList;

    /**
     * Constructs a new CompoundDataComponent representing the declaration of a list or tuple with given elements.
     * @param elements component representing the elements of the newly declared list or tuple
     * @param isList true if the new CompoundDataComponent represents a list; false if it represents a tuple
     */
    public CompoundDataComponent(List<Component> elements, boolean isList) {
        this.elements = new ArrayList<>(elements);
        this.isList = isList;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a CompoundDataComponent is a ListLiteralComponent or TupleLiteralComponent containing
     * the result of each element of the CompoundDataComponent.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        List<LiteralComponent> results = new ArrayList<>();
        for(Component c: elements)
            results.add(c.evaluate());
        if(isList)
            return new ListLiteralComponent(results);
        else
            return new TupleLiteralComponent(results);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder s;
        if(isList)
            s = new StringBuilder("listDeclaration[");
        else
            s = new StringBuilder("tupleDeclaration[");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append("; ");
        s.append("]");
        return s.toString();
    }
}

