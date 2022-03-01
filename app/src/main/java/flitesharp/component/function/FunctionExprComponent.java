package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A component representing a function expression
 * The result of the corresponding program is itself.
 */
public class FunctionExprComponent extends DataComponent {
    private final Component name;
    private final ArrayList<Component> params;
    private final Component body;

    /**
     * Constructs a new FunctionExprComponent representing a FUNCTION EXPRESSION.
     * @param name the name of the FUNCTION EXPRESSION
     * @param params parameters of the function
     * @param body the body of the function
     */
    public FunctionExprComponent(Component name, ArrayList<Component> params, Component body) {
        this.name = name;
        this.params = params;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a FunctionExprComponent is itself.</p>
     */
    @Override
    public FunctionExprComponent evaluate(EnvFrame env) {
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
        StringBuilder res = new StringBuilder("[function, params[");
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
        if (toCompare instanceof FunctionExprComponent tmp) {
            return this.name.toString().equals(tmp.name.toString())
                    && this.params.equals(tmp.params)
                    && this.body.equals(tmp.body);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getStringRepresentation();
    }
}

