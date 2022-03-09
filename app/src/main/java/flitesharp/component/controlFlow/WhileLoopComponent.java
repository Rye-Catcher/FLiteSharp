package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement typeTest = test.checkType(env);
        test.setType(typeTest);

        if (typeTest.getName().equals(TypeName.BOOL)) {
            return new TypeElement(TypeName.UNIT);
        } else {
            throw new IllegalTypeException("A BOOL value is expected for the TEST of conditions");
        }
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

