package flitesharp.component;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        return expr.checkType(env);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ParenthesesComponent is the result of the EXPRESSION inside the PARENTHESES.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return expr.evaluate(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return expr.getStringRepresentation();
    }
}

