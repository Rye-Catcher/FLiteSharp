package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;

/**
 * A component representing a POWER operation. The result of the corresponding program is the result of the POWER.
 */
public class PowerComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new PowerComponent representing a POWER operation between two other components.
     * @param leftOperand component representing the first operand of the POWER operation
     * @param rightOperand component representing the second operand of the POWER operation
     */
    public PowerComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * @return a double type if the two operands are of type double and have no unit of measure.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if (lop.match(rop) && lop.getName() == TypeName.DOUBLE && lop.getUnitOfMeasure().match(new UnitOfMeasure())) {
            this.setType(new TypeElement(TypeName.DOUBLE));
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for POWER operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a PowerComponent is the result of the POWER operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        double result = Math.pow(((NumberComponent)leftOperand.evaluate(env)).getNumberValue(),
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue());
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Power[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
