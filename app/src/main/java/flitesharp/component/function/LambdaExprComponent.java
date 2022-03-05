package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A component representing a lambda expression declaration.
 * The result of the corresponding program is itself.
 */
public class LambdaExprComponent extends DataComponent {
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
     * <p>The program result of a LambdaExprComponent is itself.</p>
     */
    @Override
    public LambdaExprComponent evaluate(EnvFrame env) {
        return this;
    }

    public HashMap<String, DataComponent> createBindings(ArrayList<DataComponent> arguments) {
        HashMap<String, DataComponent> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), arguments.get(i));
        }
        return tmp;
    }

    public DataComponent evaluateBody(EnvFrame env) {
        return this.body.evaluate(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("[lambda, params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <T extends DataComponent> Boolean equals(T toCompare) {
        if (toCompare instanceof  LambdaExprComponent) {
            return this.params.equals(((LambdaExprComponent) toCompare).params)
                    && this.body.equals(((LambdaExprComponent) toCompare).body);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getStringRepresentation();
    }
}
