package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a DIVISION operation.
 * The result of the corresponding program is the result of the DIVISION.
 */
public class DivisionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new DivisionComponent representing a DIVISION operation between two other components.
     * @param leftOperand component representing the first operand of the DIVISION operation
     * @param rightOperand component representing the second operand of the DIVISION operation
     */
    public DivisionComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a double type if the two operands are of type double or an int type if the two operands are of type int.
     * The unit of measure of the returned type is the division of the units of the operands.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.getName() == TypeName.DOUBLE || lop.getName() == TypeName.INT) {
            if (lop.getName() == rop.getName()) {
                TypeElement newType = new TypeElement(lop.getName());
                newType.setUnitOfMeasure(lop.getUnitOfMeasure().divide(rop.getUnitOfMeasure()));
                this.setType(newType);
                return this.getType();
            } else {
                throw new IllegalTypeException("Types " + lop.getStringRepresentation() + " and " +
                        rop.getStringRepresentation() + " are not matching", this);
            }
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for DIVISION operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a DivisionComponent is the result of the DIVISION operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        //How to deal with 0 ?
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() /
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        if(getType().getName() == TypeName.INT)
            result = (int) result;
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Division[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

