package flitesharp.component;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.LiteralComponent;

/**
 * A component represent a generic part of a program. It can for example be a literal, an operation, a block. A
 * component can be evaluated to get the result of the corresponding program.
 */
public abstract class Component {
    /**
     * Evaluates the program represented by the component and returns the program result.
     * @return a literal containing the result of the program
     */
    public abstract LiteralComponent evaluate(EnvFrame env);

    /**
     * Returns a string representation of the component.
     * @return a string representation of the component
     */
    public abstract String getStringRepresentation();
}
