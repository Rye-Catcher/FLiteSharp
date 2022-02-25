package flitesharp.component.literal;

public class UndefinedComponent extends LiteralComponent{
    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean equals(LiteralComponent toCompare) {
        return toCompare instanceof UndefinedComponent; // To be revised once we have type checking
    }

    @Override
    public LiteralComponent evaluate() {
        return this;
    }

    @Override
    public String getStringRepresentation() {
        return "[Undefined]";
    }
}
