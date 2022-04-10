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
 * A component representing a recursive function declaration.
 * The result of the corresponding program is a RECURSIVE FUNCTION EXPRESSION.
 */
public class RecFunDeclarationComponent extends Component {
    private final Component name;
    private final ArrayList<Component> params;
    private final Component body;

    /**
     * Constructs a new RecFunDeclarationComponent representing a RECURSIVE FUNCTION DECLARATION.
     * @param name the name of the FUNCTION
     * @param params parameters of the FUNCTION
     * @param body the body of the FUNCTION
     */
    public RecFunDeclarationComponent(Component name, ArrayList<Component> params, Component body) {
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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        HashMap<String, Pair<TypeElement, DataComponent>> tmpBinds = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            tmpBinds.put(
                    params.get(i).toString(),
                    new Pair<>(this.getType().getChildren().get(i), new UndefinedComponent()));
        }
        env.addNewBinds(this.name.toString(), this.getType(), new FunctionExprComponent(name, params, body));
        EnvFrame newFrame = env.extend();
        newFrame.loadBindings(tmpBinds);

        TypeElement bodyType = this.body.checkType(newFrame);
        TypeElement returnType = this.getType().getLastChild();
        if (!bodyType.match(returnType)) {
            throw new IllegalTypeException("Body type " + bodyType.getStringRepresentation() + " and return value type " +
                    returnType.getStringRepresentation() + "are not matching", this);
        }

        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a RecFunDeclarationComponent is a RECURSIVE FUNCTION EXPRESSION.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = new RecFunctionExprComponent(name, params, body);
        env.addNewBinds(this.name.toString(), this.getType(), val);
        return val;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("RecFunDeclare[" + name.getStringRepresentation() + ", params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[\n").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }
}
