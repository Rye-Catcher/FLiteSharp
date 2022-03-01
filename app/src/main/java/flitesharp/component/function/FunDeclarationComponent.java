package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;

import java.util.ArrayList;

/**
 * A component representing a function declaration.
 * The result of the corresponding program is the UNDEFINED.
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
     * <p>The program result of a FunDeclarationComponent is UNDEFINED.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) { //Should be evaluated to a function thing
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("function[" + name.getStringRepresentation() + ", params[");
        for (Component param : params) {
            res.append(param.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("], body[\n").append(body.getStringRepresentation()).append("]]");
        return res.toString();
    }
}
