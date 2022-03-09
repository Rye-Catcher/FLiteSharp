package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
            if (leftOperand.getType().getName() == TypeName.INT
                    && leftOperand.getType().match(rightOperand.getType())) {
                this.setType(new TypeElement(TypeName.INT));
            } else {
                this.setType(new TypeElement(TypeName.DOUBLE));
            }
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for SUBTRACTION operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a SubtractionComponent is the result of the SUBTRACTION operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() -
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Subtraction[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

