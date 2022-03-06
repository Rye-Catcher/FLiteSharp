package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UndefinedComponent;

/**
 * A component representing a for loop. The result of the corresponding program is always the literal undefined.
 */
public class ForToLoopComponent extends Component {
    private final Component identifier;
    private final Component starting;
    private final Component ending;
    private final boolean isTo;
    private final Component body;


    /**
     * Constructs a new ForLoopComponent representing a for loop.
     * @param init component representing the initialization expression of the for loop
     * @param test component representing the test condition of the for loop
     * @param body component representing the body of the for loop
     * @param increment component representing the increment expression of the for loop
     */
    public ForToLoopComponent(Component identifier, Component starting, Component ending, Component body, boolean isTo) {
        this.identifier = identifier;
        this.starting = starting;
        this.ending = ending;
        this.body = body;
        this.isTo = isTo;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a WhileLoopComponent is always the literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        int i = (int) ((NumberComponent) starting.evaluate(env)).getNumberValue();
        int n = (int) ((NumberComponent) ending.evaluate(env)).getNumberValue();
        EnvFrame newEnv = env.extend();
        if(isTo)
            while(i <= n) {
                newEnv.addNewBinds(identifier.toString(), new NumberComponent(i));
                body.evaluate(newEnv);
                i += 1;
            }
        else
            while(i >= n) {
                newEnv.addNewBinds(identifier.toString(), new NumberComponent(i));
                body.evaluate(newEnv);
                i -= 1;
            }
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        String s = "for[" + identifier.getStringRepresentation() + ", " + starting.getStringRepresentation();
        if(isTo)
            s += " to ";
        else
            s += " downto ";
        s += ending.getStringRepresentation() + ", "  + body.getStringRepresentation() + "]";
        return s;
    }
}

