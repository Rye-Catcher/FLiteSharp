package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if ((lop.getName() == TypeName.DOUBLE
                || lop.getName() == TypeName.INT)
                && lop.match(rop)) {
            this.setType(new TypeElement(TypeName.BOOL));
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for NOT EQUAL operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NotEqualComponent is the result of the NOTEQUAL operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        boolean result = !leftOperand.evaluate(env).equals(rightOperand.evaluate(env));
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
