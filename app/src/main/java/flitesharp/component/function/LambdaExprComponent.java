package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.UndefinedComponent;

import java.util.ArrayList;

/**
 * A component representing a lambda expression declaration.
 * The result of the corresponding program is UNDEFINED.
 */
public class LambdaExprComponent extends Component {
    private final ArrayList<Component> params;
    private final Component body;

    /**
     * Constructs a new LambdaExprComponent representing a LAMBDA EXPRESSION.
     * @param params parameters of a LAMBDA EXPRESSION
     * @param body the return body of a LAMBDA EXPRESSION
     */
    public LambdaExprComponent(ArrayList<Component> params, Component body) {
        this.params = params;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a LambdaExprComponent is UNDEFINED.</p>
     */
    @Override
    public LiteralComponent evaluate(EnvFrame env) {
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("lambda[params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }
}
