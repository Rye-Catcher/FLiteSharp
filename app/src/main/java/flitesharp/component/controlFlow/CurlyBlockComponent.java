package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;

/**
 * A component representing a sequence of expressions enclosed by curly brackets and possibly empty.
 * The result of the corresponding program is the result of the last expression in the block. If the block is empty the
 * result is the literal undefined.
 */
public class CurlyBlockComponent extends Component {
    private final Component sequence;

    /**
     * Constructs a new CurlyBlockComponent representing to an empty block.
     */
    public CurlyBlockComponent() {
        sequence = null;
    }

    /**
     * Constructs a new CurlyBlockComponent representing a non-empty block of expressions.
     * @param sequence the component representing the block of expressions
     */
    public CurlyBlockComponent(Component sequence) {
        this.sequence = sequence;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement tp = null;
        if (sequence == null) {
            tp = new TypeElement(TypeName.UNIT);
        } else {
            tp = sequence.checkType(env);
        }
        this.setType(tp);
        return tp;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a CurlyBlockComponent is the result of the last expression in the block. If the block
     * is empty the result is the literal undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        if(sequence == null)
            return new UndefinedComponent();
        else
            return sequence.evaluate(env);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if(sequence == null)
            return "{}";
        else
            return "{" + sequence.getStringRepresentation() + "}";
    }
}
