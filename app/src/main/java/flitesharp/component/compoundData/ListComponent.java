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
 * A component representing a list. The elements of a list are literal components.
 */
public class ListComponent extends DataComponent{
    private final List<DataComponent> elements;

    /**
     * Constructs a new ListComponent containing the given list of elements.
     * @param elements the elements of the new ListComponent
     */
    public ListComponent(List<DataComponent> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        if (this.getType().getName() == TypeName.LIST) {
            return new TypeElement(getType());
        } else {
            throw new IllegalTypeException("A LIST value is expected");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ListComponent is the ListComponent itself.</p>
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

    public List<DataComponent> attach(DataComponent toAttach) {
        List<DataComponent> result = new ArrayList<>(elements);
        result.add(0, toAttach);
        return result;
    }

    public List<DataComponent> concatenate(List<DataComponent> toAttach) {
        List<DataComponent> result = new ArrayList<>(elements);
        result.addAll(toAttach);
        return result;
    }

    public List<DataComponent> getValue() {
        return new ArrayList<>(elements);
    }

    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        return null;
    }
}
