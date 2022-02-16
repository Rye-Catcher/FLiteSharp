package main.java.flitesharp.component.literal;

import main.java.flitesharp.component.Component;

public class BooleanComponent extends Component {
    private final boolean value;

    public BooleanComponent(boolean value){
        this.value = value;
    }

    public boolean getValue() {
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
