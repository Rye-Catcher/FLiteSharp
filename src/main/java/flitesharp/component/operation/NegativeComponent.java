package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.LiteralComponent;
import main.java.flitesharp.component.literal.NumberComponent;

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
     *
     * <p>The program result of a NegativeComponent is the result of the NEGATIVE operation.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        double result = -expr.evaluate().getNumberValue();
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
