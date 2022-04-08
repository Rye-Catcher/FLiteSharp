package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a MULTIPLICATION operation.
 * The result of the corresponding program is the result of the MULTIPLICATION.
 */
public class MultiplicationComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new MultiplicationComponent representing a MULTIPLICATION operation between two other components.
     * @param leftOperand component representing the first operand of the MULTIPLICATION operation
     * @param rightOperand component representing the second operand of the MULTIPLICATION operation
     */
    public MultiplicationComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a double type if the two operands are of type double or an int type if the two operands are of type int.
     * The unit of measure of the returned type is the multiplication of the units of the operands.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.getName() == TypeName.DOUBLE || lop.getName() == TypeName.INT) {
            if (lop.getName() == rop.getName()) {
                TypeElement newType = new TypeElement(lop.getName());
                newType.setUnitOfMeasure(lop.getUnitOfMeasure().multiply(rop.getUnitOfMeasure()));
                this.setType(newType);
                return this.getType();
            } else {
                throw new IllegalTypeException("Types " + lop.getStringRepresentation() + " and " +
                        rop.getStringRepresentation() + " are not matching", this);
            }
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for MULTIPLICATION operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a MultiplicationComponent is the result of the MULTIPLICATION operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() *
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        return new NumberComponent(result, this.getType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Multiplication[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

