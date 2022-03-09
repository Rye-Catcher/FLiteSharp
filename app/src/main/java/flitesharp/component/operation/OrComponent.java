package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement lop = leftOperand.checkType(env);
        TypeElement rop = rightOperand.checkType(env);
        leftOperand.setType(lop);
        rightOperand.setType(rop);
        if (leftOperand.getType().match(rightOperand.getType())) {
            this.setType(new TypeElement(TypeName.BOOL));
            return this.getType();
        } else {
            throw new IllegalTypeException("A BOOL value is expected for OR operations");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an OrComponent is the result of the OR operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
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
