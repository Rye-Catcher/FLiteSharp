package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.exception.IllegalTypeException;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        return this.name.checkType(env);
    }

    public TypeElement checkReturnType(EnvFrame env) throws CompilingException {
        return this.body.checkType(env);
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

    public HashMap<String, Pair<TypeElement, DataComponent>>
        createTypeBindings(ArrayList<TypeElement> arguments) {
        HashMap<String, Pair<TypeElement, DataComponent>> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), new Pair<>(arguments.get(i), new UndefinedComponent()));
        }
        return tmp;
    }

    public HashMap<String, Pair<TypeElement, DataComponent>> createBindings(ArrayList<DataComponent> arguments) {
        HashMap<String, Pair<TypeElement, DataComponent>> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), new Pair<>(arguments.get(i).getType(), arguments.get(i)));
        }
        return tmp;
    }

    /**
     * By default, the function is not recursive
     */
    public DataComponent evaluateBody(EnvFrame env) {
        env.addNewBinds(this.name.toString(), this.getType(), new UndefinedComponent());
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

    @Override
    public String toString() {
        return this.getStringRepresentation();
    }
}

