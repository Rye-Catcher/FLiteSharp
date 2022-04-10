package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.IllegalTypeException;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A component representing a lambda expression declaration.
 * The result of the corresponding program is itself.
 */
public class LambdaExprComponent extends DataComponent {
    private final ArrayList<Component> params;
    private final Component body;
    private boolean isChecked;
    /**
     * Constructs a new LambdaExprComponent representing a LAMBDA EXPRESSION.
     * @param params parameters of a LAMBDA EXPRESSION
     * @param body the return body of a LAMBDA EXPRESSION
     */
    public LambdaExprComponent(ArrayList<Component> params, Component body) {
        this.params = params;
        this.body = body;
        this.isChecked = false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        if (isChecked) {
            return this.getType();
        }
        List<TypeElement> tmp = this.getType().getChildren();

        HashMap<String, Pair<TypeElement, DataComponent>> tmpBinds = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmpBinds.put(
                    params.get(i).toString(),
                    new Pair<>(params.get(i).getType(), new UndefinedComponent()));
        }
        EnvFrame newFrame = env.extend();
        newFrame.loadBindings(tmpBinds);
        tmp.add(body.checkType(newFrame));
        this.setType(new TypeElement(TypeName.FUNC, tmp));

        isChecked = true;
        return this.getType();
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

    @Override
    public String toString() {
        return this.getStringRepresentation();
    }
}
