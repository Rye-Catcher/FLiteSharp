package main.java.flitesharp.component.literal;

import main.java.flitesharp.component.Component;

public abstract class LiteralComponent extends Component {
    public boolean getBooleanValue() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public float getNumberValue() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
