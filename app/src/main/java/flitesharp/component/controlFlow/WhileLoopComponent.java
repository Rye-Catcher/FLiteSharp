package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;

/**
 * A component representing a while loop. The result of the corresponding program is always the literal undefined.
 */
public class WhileLoopComponent extends Component {
    private final Component test;
    private final Component body;

    /**
     * Constructs a new WhileLoopComponent representing a while loop.
     * @param test component representing the test condition of the while loop
     * @param body component representing the body of the while loop
     */
    public WhileLoopComponent(Component test, Component body) {
        this.test = test;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a WhileLoopComponent is always the literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        while(((BooleanComponent)test.evaluate(env)).getBooleanValue())
            body.evaluate(env);
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "while[" + test.getStringRepresentation() + ", " + body.getStringRepresentation() + "]";
    }
}

