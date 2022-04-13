package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;

/**
 * A component representing an OR operation. The result of the corresponding program is the result of the OR.
 */
public class OrComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new OrComponent representing an OR operation between two other components.
     * @param leftOperand component representing the first operand of the OR operation
     * @param rightOperand component representing the second operand of the OR operation
     */
    public OrComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a bool type if the two operands are of type bool.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.getName() == TypeName.BOOL) {
            if(lop.match(rop)) {
                this.setType(new TypeElement(TypeName.BOOL));
                return this.getType();
            } else {
                throw new IllegalTypeException("Types " + lop.getStringRepresentation() + " and " +
                        rop.getStringRepresentation() + " are not matching", this);
            }
        } else {
            throw new IllegalTypeException("A BOOL value is expected for OR operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an OrComponent is the result of the OR operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        boolean result = ((BooleanComponent)leftOperand.evaluate(env)).getBooleanValue() ||
                ((BooleanComponent)rightOperand.evaluate(env)).getBooleanValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Or[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
