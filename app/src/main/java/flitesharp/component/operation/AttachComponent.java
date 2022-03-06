package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.compoundData.ListComponent;

/**
 * A component representing an ATTACH operation. The result of the corresponding program is the result of the ATTACH.
 */
public class AttachComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    /**
     * Constructs a new AttachComponent representing an ATTACH operation between a Component and a ListComponent.
     * @param leftOperand component representing the element to be attached in front of the list
     * @param rightOperand component representing the list to which the new element should be attached
     */
    public AttachComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a AttachComponent is the result of the ATTACH operation.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return new ListComponent(((ListComponent) rightOperand.evaluate(env)).attach(leftOperand.evaluate(env)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "Attach[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}

