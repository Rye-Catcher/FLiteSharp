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
 * A component representing a tuple. The elements of a tuple are literal components.
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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        if (this.getType().getName() == TypeName.TUPLE) {
            this.setType(new TypeElement(TypeName.TUPLE));
            return this.getType();
        } else {
            throw new IllegalTypeException("A TUPLE value is expected");
        }
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

}
