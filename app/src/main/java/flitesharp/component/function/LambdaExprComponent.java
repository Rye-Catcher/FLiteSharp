package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A component representing a lambda expression declaration.
 * The result of the corresponding program is itself.
 */
public class LambdaExprComponent extends FunctionalExprComponent {

    /**
     * Constructs a new LambdaExprComponent representing a LAMBDA EXPRESSION.
     * @param params parameters of a LAMBDA EXPRESSION
     * @param body the return body of a LAMBDA EXPRESSION
     */
    public LambdaExprComponent(List<Component> params, Component body) {
        super(params, body, null, null);
    }

    /**
     * {@inheritDoc}
     *
     * @return type (t1 -> ... tn -> t) where t1,...,tn are the types of the parameters and t is the return type of the
     * lambda expression
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        if (this.getType() != null) {
            return this.getType();
        }
        List<TypeElement> tmp = new ArrayList<>();

        Map<String, Pair<TypeElement, DataComponent>> tmpBinds = new HashMap<>();
        for (Component param : getParams()) {
            tmpBinds.put(
                    param.toString(),
                    new Pair<>(param.getType(), new UndefinedComponent()));
            tmp.add(param.getType());
        }
        EnvFrame newFrame = env.extend();
        newFrame.loadBindings(tmpBinds);
        tmp.add(getBody().checkType(newFrame));
        this.setType(new TypeElement(TypeName.FUNC, tmp));

        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a LambdaExprComponent is itself.</p>
     */
    @Override
    public LambdaExprComponent evaluate(EnvFrame env) {
        setEnv(env);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[lambda" + super.getStringRepresentation();
    }

}
