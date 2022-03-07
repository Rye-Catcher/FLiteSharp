package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;

import java.util.List;

/**
 * A component representing a for loop. The result of the corresponding program is always the literal undefined.
 */
public class ForLoopComponent extends Component {
    private final Component identifier;
    private final Component enumerable;
    private final Component body;


    /**
     * Constructs a new ForLoopComponent representing a for loop.
     * @param init component representing the initialization expression of the for loop
     * @param test component representing the test condition of the for loop
     * @param body component representing the body of the for loop
     * @param increment component representing the increment expression of the for loop
     */
    public ForLoopComponent(Component identifier, Component enumerable, Component body) {
        this.identifier = identifier;
        this.enumerable = enumerable;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a WhileLoopComponent is always the literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        List<DataComponent> list = ((ListComponent) enumerable.evaluate(env)).getValue();
        EnvFrame newEnv = env.extend();
        for(DataComponent d: list) {
            newEnv.addNewBinds(identifier.toString(), d);
            body.evaluate(newEnv);
        }
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "for[" + identifier.getStringRepresentation() + ", " + enumerable.getStringRepresentation()
                + ", "  + body.getStringRepresentation() + "]";
    }
}

