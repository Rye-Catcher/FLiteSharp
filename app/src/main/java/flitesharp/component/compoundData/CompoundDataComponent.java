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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        List<TypeElement> typeLst = new ArrayList<>();
        if (this.isList) {


            if (this.getType().getName() == TypeName.LIST) {
                this.setType(new TypeElement(TypeName.LIST));

                TypeElement tp = this.getType().getLastChild();
                if (tp == null && !elements.isEmpty()) {
                    tp = elements.get(0).checkType(env);
                }
                for (Component expr : elements) {
                    expr.setType(expr.checkType(env));

                    if (!expr.getType().match(tp)) {
                        throw new IllegalTypeException("Wrong data type in the list");
                    }
                    typeLst.add(expr.getType());
                }

                this.setType(new TypeElement(TypeName.LIST, typeLst));
                return this.getType();
            } else {
                throw new IllegalTypeException("A LIST value is expected", this);
            }


        } else {
            if (this.getType().getName() == TypeName.TUPLE) {
                this.setType(new TypeElement(TypeName.TUPLE));

                List<TypeElement> lst = this.getType().getChildren();
                boolean flag = (lst != null && !lst.isEmpty()) || elements.isEmpty();

                for (int i = 0; i < elements.size(); i++) {
                    Component expr = elements.get(i);
                    expr.setType(expr.checkType(env));

                    if (flag && !expr.getType().match(lst.get(i))) {
                        throw new IllegalTypeException("Wrong data type in the tuple");
                    }
                    typeLst.add(expr.getType());
                }

                this.setType(new TypeElement(TypeName.TUPLE, typeLst));
                return this.getType();
            } else {
                throw new IllegalTypeException("A TUPLE value is expected");
            }
        }
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

