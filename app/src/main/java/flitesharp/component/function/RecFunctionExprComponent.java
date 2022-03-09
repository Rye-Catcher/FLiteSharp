package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A component representing a recursive function expression
 * The result of the corresponding program is itself.
 */
public class RecFunctionExprComponent extends DataComponent {
    private final Component name;
    private final ArrayList<Component> params;
    private final Component body;

    /**
     * Constructs a new RecFunctionExprComponent representing a RECURSIVE FUNCTION EXPRESSION.
     * @param name the name of the FUNCTION EXPRESSION
     * @param params parameters of the function
     * @param body the body of the function
     */
    public RecFunctionExprComponent(Component name, ArrayList<Component> params, Component body) {
        this.name = name;
        this.params = params;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a RecFunctionExprComponent is itself.</p>
     */
    @Override
    public RecFunctionExprComponent evaluate(EnvFrame env) {
        return this;
    }

    public HashMap<String, Map.Entry<TypeElement, DataComponent>>
    createTypeBindings(ArrayList<TypeElement> arguments) {
        HashMap<String, Map.Entry<TypeElement, DataComponent>> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), Pair.of(arguments.get(i), new UndefinedComponent()));
        }
        return tmp;
    }

    public HashMap<String, Map.Entry<TypeElement, DataComponent>> createBindings(ArrayList<DataComponent> arguments) {
        HashMap<String, Map.Entry<TypeElement, DataComponent>> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), Pair.of(arguments.get(i).getType(), arguments.get(i)));
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
        StringBuilder res = new StringBuilder("[recursive function, params[");
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
        if (toCompare instanceof RecFunctionExprComponent tmp) {
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

