package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;

/**
 * A component representing a for loop. The result of the corresponding program is always the literal undefined.
 */
public class ForLoopComponent extends Component {
    private final Component init;
    private final Component test;
    private final Component increment;
    private final Component body;

    /**
     * Constructs a new ForLoopComponent representing a for loop.
     * @param init component representing the initialization expression of the for loop
     * @param test component representing the test condition of the for loop
     * @param body component representing the body of the for loop
     * @param increment component representing the increment expression of the for loop
     */
    public ForLoopComponent(Component init, Component test, Component increment, Component body) {
        this.init = init;
        this.test = test;
        this.increment = increment;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a WhileLoopComponent is always the literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        init.evaluate(env);
        while(((BooleanComponent)test.evaluate(env)).getBooleanValue()) {
            body.evaluate(env);
            increment.evaluate(env);
        }
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "for[" + init.getStringRepresentation() + ", " + test.getStringRepresentation() + ", "
                + increment.getStringRepresentation() + ", " + body.getStringRepresentation() + "]";
    }
}

