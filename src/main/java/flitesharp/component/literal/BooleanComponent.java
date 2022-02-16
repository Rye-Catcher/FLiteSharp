package main.java.flitesharp.component.literal;

public class BooleanComponent extends LiteralComponent {
    private final boolean value;

    public BooleanComponent(boolean value){
        this.value = value;
    }

    @Override
    public boolean getBooleanValue() {
        return value;
    }

    @Override
    public BooleanComponent evaluate() {
        return this;
    }

    @Override
    public String getStringRepresentation() {
        return "[boolean, " + value + "]";
    }
}
