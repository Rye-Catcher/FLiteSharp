package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a tuple. The elements of a tuple are DataComponents.
 */
public class TupleComponent extends DataComponent {
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
     * @return a tuple type containing also the type of the tuple's elements
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        List <TypeElement> children = new ArrayList<>();
        for(DataComponent e: elements) {
            children.add(e.checkType(env));
        }
        this.setType(new TypeElement(TypeName.TUPLE, children));
        return this.getType();
    }

    /**
     * Returns the elements of the tuple.
     * @return the elements of the tuple
     */
    public List<DataComponent> getValue() {
        return new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder s = new StringBuilder("tuple(");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append(", ");
        if(!elements.isEmpty())
            s.delete(s.length()-2, s.length());
        s.append(")");
        return s.toString();
    }

}
