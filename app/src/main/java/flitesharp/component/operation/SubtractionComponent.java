package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.IllegalTypeException;

/**
 * A component representing a SUBTRACTION operation.
 * The result of the corresponding program is the result of the SUBTRACTION.
 */
public class SubtractionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new SubtractionComponent representing a SUBTRACTION operation between two other components.
     * @param leftOperand component representing the first operand of the SUBTRACTION operation
     * @param rightOperand component representing the second operand of the SUBTRACTION operation
     */
    public SubtractionComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a double type if the two operands are of type double or an int type if the two operands are of type int.
     * The two operands must also have the same unit of measure. The unit of measure of the returned type is the same of
     * the operands.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.getName() == TypeName.DOUBLE || lop.getName() == TypeName.INT) {
            if (lop.match(rop)) {
                this.setType(new TypeElement(lop));
                return this.getType();
            } else {
                throw new IllegalTypeException("Types " + lop.getStringRepresentation() + " and " +
                        rop.getStringRepresentation() + " are not matching", this);
            }
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for SUBTRACTION operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a SubtractionComponent is the result of the SUBTRACTION operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() -
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        return new NumberComponent(result, this.getType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Subtraction[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

