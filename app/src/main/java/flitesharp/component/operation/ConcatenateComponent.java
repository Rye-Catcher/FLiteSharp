package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a CONCATENATE operation. The result of the corresponding program is the result of the
 * CONCATENATE.
 */
public class ConcatenateComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new ConcatenateComponent representing a CONCATENATE operation between two ListComponent.
     * @param leftOperand component representing the initial list
     * @param rightOperand component representing the list to be concatenated to the initial list
     */
    public ConcatenateComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        leftOperand.setType(lop);
        rightOperand.setType(rop);

        if (lop.getName() == TypeName.LIST && rop.getName() == TypeName.LIST
            && lop.getLastChild().match(rop.getLastChild())) {
            this.setType(new TypeElement(TypeName.LIST, lop.getChildren()));
            return this.getType();
        } else {
            throw new IllegalTypeException("A LIST value is expected for CONCAT operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ConcatenateComponent is the result of the CONCATENATE operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return new ListComponent(((ListComponent) leftOperand.evaluate(env))
                .concatenate(((ListComponent) rightOperand.evaluate(env)).getValue()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Concatenate[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

