package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;

import java.util.ArrayList;
import java.util.List;

/**
 * A component representing an ATTACH operation. The result of the corresponding program is the result of the ATTACH.
 */
public class AttachComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new AttachComponent representing an ATTACH operation between a Component and a ListComponent.
     * @param leftOperand component representing the element to be attached in front of the list
     * @param rightOperand component representing the list to which the new element should be attached
     */
    public AttachComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a (t list) type where t is the type of the first operand (including the unit of measure if any). The
     * second operand must be of type (t list).
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (rop.getName() == TypeName.LIST) {
            TypeElement childType = rop.getLastChild();
            if (childType == null || lop.match(childType)) {
                List<TypeElement> children = new ArrayList<>();
                children.add(new TypeElement(lop));
                this.setType(new TypeElement(TypeName.LIST, children));
                return this.getType();
            } else {
                throw new IllegalTypeException("A value of the same type as the LIST elements (" +
                        rop.getLastChild().getStringRepresentation() + ") is expected for ATTACH operations", this);
            }
        } else {
            throw new IllegalTypeException("A LIST value is expected for ATTACH operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a AttachComponent is the result of the ATTACH operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return new ListComponent(((ListComponent) rightOperand.evaluate(env)).attach(leftOperand.evaluate(env)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Attach[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

