package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing an ADDITION operation. The result of the corresponding program is the result of the
 * ADDITION.
 */
public class AdditionComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new AdditionComponent representing an ADDITION operation between two other components.
     * @param leftOperand component representing the first operand of the ADDITION operation
     * @param rightOperand component representing the second operand of the ADDITION operation
     */
    public AdditionComponent(Component leftOperand, Component rightOperand){
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
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        if ((lop.getName() == TypeName.DOUBLE
                || lop.getName() == TypeName.INT)
            && lop.match(rop)) {
            this.setType(new TypeElement(lop));
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for ADDITION operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an AdditionComponent is the result of the ADDITION operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        double result = ((NumberComponent)leftOperand.evaluate(env)).getNumberValue() +
                ((NumberComponent)rightOperand.evaluate(env)).getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Addition[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

