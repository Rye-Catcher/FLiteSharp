package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a unary NEGATIVE operation. The result of the corresponding program is the result of the
 * NEGATIVE.
 */
public class NegativeComponent extends Component {
    private final Component expr;

    /**
     * Constructs a new NegativeComponent representing a unary NEGATIVE operation.
     * @param expr component representing the operand of NEGATIVE operation
     */
    public NegativeComponent(Component expr){
        this.expr = expr;
    }

    /**
     * {@inheritDoc}
     *
     * @return a double type if the operand is of type double or an int type if the operand is of type int. The unit of
     * measure of the returned type is the same of the operand.
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement op = expr.checkType(env);
        if (op.getName() == TypeName.DOUBLE
                || op.getName() == TypeName.INT) {
            this.setType(new TypeElement(op));
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for NEGATIVE operations", this);
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NegativeComponent is the result of the NEGATIVE operation.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        double result = -((NumberComponent)expr.evaluate(env)).getNumberValue();
        return new NumberComponent(result);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Negative[" + expr.getStringRepresentation() + "]";
    }
}
