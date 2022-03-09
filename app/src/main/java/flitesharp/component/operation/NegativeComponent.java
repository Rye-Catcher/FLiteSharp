package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a unary NEGATIVE operation. The result of the corresponding program is the result of the NEGATIVE.
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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        expr.setType(expr.checkType(env));
        if (expr.getType().getName() == TypeName.DOUBLE
                || expr.getType().getName() == TypeName.INT) {
            this.setType(expr.getType());
            return this.getType();
        } else {
            throw new IllegalTypeException("An INT or DOUBLE value is expected for NEGATIVE operations");
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
