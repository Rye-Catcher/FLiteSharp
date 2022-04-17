package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing a list or tuple declaration. Each element of this CompoundDataComponent is a component to be
 * evaluated. The result of the evaluation is a ListComponent or a TupleComponent containing the result of each element
 * of the CompoundDataComponent.
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
     * @return the type of the declared list or tuple
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        List<TypeElement> typeLst = new ArrayList<>();
        if (this.isList) {
            if(elements.isEmpty()) {
                this.setType(new TypeElement(TypeName.LIST));
            }
            else {
                TypeElement tp = elements.get(0).checkType(env);
                for (Component expr : elements) {
                    if (!expr.checkType(env).match(tp)) {
                        throw new IllegalTypeException("All expressions in a list must have the same type", this);
                    }
                }
                typeLst.add(tp);
                this.setType(new TypeElement(TypeName.LIST, typeLst));
            }
        } else {
            for (Component expr : elements) {
                typeLst.add(expr.checkType(env));
            }
            this.setType(new TypeElement(TypeName.TUPLE, typeLst));
        }
        return this.getType();
    }


    /**
     * {@inheritDoc}
     *
     * <p>The program result of a CompoundDataComponent is a ListComponent or TupleComponent containing the result of
     * each element of the CompoundDataComponent.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        List<DataComponent> results = new ArrayList<>();
        for(Component c: elements)
            results.add(c.evaluate(env));
        if(isList)
            return new ListComponent(results);
        else
            return new TupleComponent(results);
    }

    /**
     * Returns true if the component represents a list declaration and false if it represents a tuple declaration.
     * @return true if the component represents a list declaration and false if it represents a tuple declaration
     */
    public boolean isList() {
        return isList;
    }

    /**
     * Returns the elements of the declared list or tuple.
     * @return the elements of the declared list or tuple
     */
    public List<Component> getElements() {
        return elements;
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
        if(!elements.isEmpty())
            s.delete(s.length()-2, s.length());
        s.append("]");
        return s.toString();
    }
}

