package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing an GREATERTHAN operation. The result of the corresponding program is the result of the
 * GREATERTHAN.
 */
public class GreaterThanComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new GreaterThanOrEqualComponent representing a GREATERTHAN operation between two other
     * components.
     * @param leftOperand component representing the first operand of the GREATERTHAN operation
     * @param rightOperand component representing the second operand of the GREATERTHAN operation
     */
    public GreaterThanComponent(Component leftOperand, Component rightOperand){
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
        if ((leftOperand.getType().getName() == TypeName.DOUBLE
                || leftOperand.getType().getName() == TypeName.INT)
                && (rightOperand.getType().getName() == TypeName.DOUBLE
                || rightOperand.getType().getName() == TypeName.INT)) {
            this.setType(new TypeElement(TypeName.BOOL));
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for GREATER THAN operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a GreaterThanComponent is the result of the GREATERTHAN operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        boolean result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() >
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        return new BooleanComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "GreaterThan[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
