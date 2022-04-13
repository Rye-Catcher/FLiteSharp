package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list. The elements of a list are DataComponents all with the same type.
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
     *
     * @return a list type if the list is empty or a (t list) type where t is the type of the list elements otherwise
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        if(elements.isEmpty()) {
            this.setType(new TypeElement(TypeName.LIST));
        }
        else {
            List <TypeElement> children = new ArrayList<>();
            children.add(elements.get(0).checkType(env));
            this.setType(new TypeElement(TypeName.LIST, children));
        }
        return this.getType();
    }

    /**
     * Returns a new list containing the given element followed by all the elements of this list.
     * @param toAttach the element to be inserted at the beginning of the new list
     * @return a new list containing the given element followed by all the elements of this list
     */
    public List<DataComponent> attach(DataComponent toAttach) {
        List<DataComponent> result = new ArrayList<>(elements);
        result.add(0, toAttach);
        return result;
    }

    /**
     * Returns a new list which is the concatenation of this list with the given list. The elements of the given list
     * follow the elements of this list.
     * @param toConcatenate the list to concatenate
     * @return a new list which is the concatenation of this list with the given list
     */
    public List<DataComponent> concatenate(ListComponent toConcatenate) {
        List<DataComponent> result = new ArrayList<>(elements);
        result.addAll(toConcatenate.getValue());
        return result;
    }

    /**
     * Returns the elements of the list.
     * @return the elements of the list
     */
    public List<DataComponent> getValue() {
        return new ArrayList<>(elements);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder s = new StringBuilder("list[");
        for(Component c: elements)
            s.append(c.getStringRepresentation()).append("; ");
        if(!elements.isEmpty())
            s.delete(s.length()-2, s.length());
        s.append("]");
        return s.toString();
    }

}
