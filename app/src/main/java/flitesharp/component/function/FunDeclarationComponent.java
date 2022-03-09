package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;

import java.util.ArrayList;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        env.addNewBinds(this.name.toString(), this.getType(), new FunctionExprComponent(name, params, body));
        return this.getType();
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
