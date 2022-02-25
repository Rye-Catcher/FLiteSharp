package flitesharp.component.literal;

/**
 * A component representing an undefined literal. The result of the corresponding program is the undefined value.
 */
public class UndefinedComponent extends LiteralComponent{
    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean equals(LiteralComponent toCompare) {
        return toCompare instanceof UndefinedComponent; // To be revised once we have type checking
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an UndefinedComponent is the undefined value.</p>
     */
    @Override
    public LiteralComponent evaluate() {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[Undefined]";
    }
}
