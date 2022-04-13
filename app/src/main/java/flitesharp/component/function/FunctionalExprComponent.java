package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A component representing a function expression
 * The result of the corresponding program is itself.
 */
public abstract class FunctionalExprComponent extends DataComponent {
    private final List<Component> params;
    private final Component body;
    private EnvFrame env;

    /**
     * Constructs a new FunctionExprComponent representing a FUNCTION EXPRESSION.
     * @param params parameters of the function
     * @param body the body of the function
     * @param env the environment in which the function has been declared
     * @param type the type of the function
     */
    public FunctionalExprComponent(List<Component> params, Component body, EnvFrame env, TypeElement type) {
        this.params = params;
        this.body = body;
        if(env != null)
            this.env = env.extend();
        if(type != null)
            this.setType(new TypeElement(type));
    }

    /**
     * Returns the component representing the body of the function.
     * @return the component representing the body of the function
     */
    public Component getBody() {
        return body;
    }

    /**
     * Returns the list of parameters of the function.
     * @return the list of parameters of the function
     */
    public ArrayList<Component> getParams() {
        return new ArrayList<>(params);
    }

    /**
     * Create a new function environment extending the given environment.
     * @param env the environment to be extended
     */
    protected void setEnv(EnvFrame env) {
        this.env = env.extend();
    }

    /**
     * {@inheritDoc}
     *
     * @return type (t1 -> ... tn -> t) where t1,...,tn are the types of the parameters and t is the return type of the
     * function
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        return this.getType();
    }

    /**
     * Creates a map of bindings between names of the parameters and types and values of the given list of components.
     * @param arguments the list of components containing types and values to be bound
     * @return a map of bindings between names of the parameters and types and values of the given list of components
     */
    private Map<String, Pair<TypeElement, DataComponent>> createBindings(List<DataComponent> arguments) {
        Map<String, Pair<TypeElement, DataComponent>> tmp = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmp.put(params.get(i).toString(), new Pair<>(arguments.get(i).getType(), arguments.get(i)));
        }
        return tmp;
    }

    /**
     * Evaluates the body of the function in the function environment, using the given parameters.
     * @param arguments the list of components representing the parameters of the function
     * @return the result of the body evaluation
     */
    public DataComponent evaluateBody(List<DataComponent> arguments) {
        env.loadBindings(createBindings(arguments));
        return this.body.evaluate(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder(", params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }

}

