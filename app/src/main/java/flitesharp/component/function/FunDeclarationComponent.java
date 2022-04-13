package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A component representing a function declaration. The declared function can also be recursive.
 */
public class FunDeclarationComponent extends Component {
    private final Component name;
    private final List<Component> params;
    private final Component body;
    private final boolean isRecursive;

    /**
     * Constructs a new FunDeclarationComponent representing a FUNCTION DECLARATION.
     * @param name the name of the FUNCTION
     * @param params parameters of the FUNCTION
     * @param body the body of the FUNCTION
     * @param isRecursive true if the function is recursive; false otherwise
     */
    public FunDeclarationComponent(NameComponent name, List<Component> params, Component body, boolean isRecursive) {
        this.name = name;
        this.params = params;
        this.body = body;
        this.isRecursive = isRecursive;
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
        if(isRecursive) {
            env.addNewBinds(this.name.toString(), this.name.getType(), new UndefinedComponent());
        }
        Map<String, Pair<TypeElement, DataComponent>> tmpBinds = new HashMap<>();
        for (Component param : params) {
            tmpBinds.put(
                    param.toString(),
                    new Pair<>(param.getType(), new UndefinedComponent()));
        }
        EnvFrame newFrame = env.extend();
        newFrame.loadBindings(tmpBinds);

        TypeElement bodyType = this.body.checkType(newFrame);
        TypeElement returnType = this.name.getType().getLastChild();
        if (!bodyType.match(returnType)) {
            throw new IllegalTypeException("Body type " + bodyType.getStringRepresentation() + " and return value type " +
                    returnType.getStringRepresentation() + "are not matching", this);
        }
        env.addNewBinds(this.name.toString(), this.name.getType(), new UndefinedComponent());

        this.setType(new TypeElement(TypeName.UNDEFINED));
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>A FunDeclarationComponent has no result because it represents a function declaration, which is not an
     * expression. The evaluation of a FunDeclarationComponent associate a function with a name in the environment and
     * returns undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = new FunctionExprComponent(params, body, env, name.getType());
        env.addNewBinds(this.name.toString(), this.name.getType(), val);
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder();
        if(isRecursive) {
            res.append("Rec");
        }
        res.append("FunDeclare[").append(name.getStringRepresentation()).append(", params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[\n").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }
}
