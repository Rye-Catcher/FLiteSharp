package flitesharp.component;

import flitesharp.component.literal.LiteralComponent;

/**
 * A component representing a PARENTHESES expression.
 * The result of the corresponding program is the result of the EXPRESSION inside the PARENTHESES.
 */
public class ParenthesesComponent extends Component {
    private final Component expr;

    /**
     * Constructs a new ParenthesesComponent representing a PARENTHESES expression.
     * @param expr component representing the EXPRESSION inside the PARENTHESES
     */
    public ParenthesesComponent(Component expr){
        this.expr = expr;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ParenthesesComponent is the result of the EXPRESSION inside the PARENTHESES.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        return expr.evaluate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return expr.getStringRepresentation();
    }
}

