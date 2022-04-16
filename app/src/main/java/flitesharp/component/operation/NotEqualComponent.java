package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;

/**
 * A component representing a NOTEQUAL operation. The result of the corresponding program is the result of the
 * NOTEQUAL.
 */
public class NotEqualComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new NotEqualComponent representing an NOTEQUAL operation between two other components.
     * @param leftOperand component representing the first operand of the NOTEQUAL operation
     * @param rightOperand component representing the second operand of the NOTEQUAL operation
     */
    public NotEqualComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a bool type. The two operands must have the same type (int or double) and have the same unit of measure.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.getName() == TypeName.DOUBLE || lop.getName() == TypeName.INT) {
            if(lop.match(rop)) {
                this.setType(new TypeElement(TypeName.BOOL));
                return this.getType();
            } else {
                throw new IllegalTypeException("Types " + lop.getStringRepresentation() + " and " +
                        rop.getStringRepresentation() + " are not matching", this);
            }
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for NOT EQUAL operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NotEqualComponent is the result of the NOTEQUAL operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        double val1 = ((NumberComponent) leftOperand.evaluate(env)).getNumberValue();
        double val2 = ((NumberComponent) rightOperand.evaluate(env)).getNumberValue();
        boolean result = Double.compare(val1, val2) != 0;
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "NotEqual[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
