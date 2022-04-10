package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.exception.IllegalTypeException;
import flitesharp.utils.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A component representing a function declaration.
 * The result of the corresponding program is a FUNCTION EXPRESSION.
 */
public class FunDeclarationComponent extends Component {
    private final Component name;
    private final ArrayList<Component> params;
    private final Component body;

    /**
     * Constructs a new FunDeclarationComponent representing a FUNCTION DECLARATION.
     * @param name the name of the FUNCTION
     * @param params parameters of the FUNCTION
     * @param body the body of the FUNCTION
     */
    public FunDeclarationComponent(Component name, ArrayList<Component> params, Component body) {
        this.name = name;
        this.params = params;
        this.body = body;
    }

    /**
     * Gets the function name in String format
     * @return the function name
     */
    public String getNameStr() {
        return this.name.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>Checks that the function body type corresponds to the declared return type of the name. If the type is the
     * same the name is stored in the environment, otherwise an exception is thrown.</p>
     * @return null
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        HashMap<String, Pair<TypeElement, DataComponent>> tmpBinds = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmpBinds.put(
                    params.get(i).toString(),
                    new Pair<>(this.getType().getChildren().get(i), null));
        }
        EnvFrame newFrame = env.extend();
        newFrame.loadBindings(tmpBinds);

        TypeElement bodyType = this.body.checkType(newFrame);
        TypeElement returnType = this.getType().getLastChild();
        if (!bodyType.match(returnType)) {
            throw new IllegalTypeException("Body type " + bodyType.getStringRepresentation() + " and return value type " +
                    returnType.getStringRepresentation() + "are not matching", this);
        }
        env.addNewBinds(this.name.toString(), this.getType(), new FunctionExprComponent(name, params, body));
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a FunDeclarationComponent is a FUNCTION EXPRESSION.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = new FunctionExprComponent(name, params, body);
        env.addNewBinds(this.name.toString(), this.getType(), val);
        return val;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("FunDeclare[" + name.getStringRepresentation() + ", params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[\n").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }
}
