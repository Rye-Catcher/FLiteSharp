package main.java.flitesharp.component;

import main.java.flitesharp.component.literal.LiteralComponent;

public abstract class Component {
    public abstract LiteralComponent evaluate();

    public abstract String getStringRepresentation();
}
