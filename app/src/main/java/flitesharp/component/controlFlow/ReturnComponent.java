package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

/**
 * A component representing a RETURN expression.
 * The result of the corresponding program is the result of the RETURN BODY.
 */
public class ReturnComponent extends Component {
    private final Component body;

    /**
     * Constructs a ReturnComponent representing a RETURN expression.
     * @param body the body of the RETURN expression.
     */
    public ReturnComponent(Component body) {
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>By default, the program result of a RETURN is the result of RETURN BODY.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return body.evaluate(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Return[" + body.getStringRepresentation() + "]";
    }
}
