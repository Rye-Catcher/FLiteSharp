package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
     */
    public ForLoopComponent(Component identifier, Component enumerable, Component body) {
        this.identifier = identifier;
        this.enumerable = enumerable;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        List<DataComponent> list = ((ListComponent) enumerable.evaluate(env)).getValue();
        EnvFrame newEnv = env.extend();
        for(DataComponent d: list) {
            newEnv.addNewBinds(identifier.toString(), new TypeElement(TypeName.INT), d);
            body.checkType(newEnv);
        }
        this.setType(new TypeElement(TypeName.UNIT));
        return new TypeElement(TypeName.UNIT);
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
            newEnv.addNewBinds(identifier.toString(), new TypeElement(TypeName.INT), d);
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

