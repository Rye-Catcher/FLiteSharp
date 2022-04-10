package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;

import java.util.ArrayList;

/**
 * A component representing a recursive function expression
 * The result of the corresponding program is itself.
 */
public class RecFunctionExprComponent extends FunctionalExprComponent {

    /**
     * Constructs a new RecFunctionExprComponent representing a RECURSIVE FUNCTION EXPRESSION.
     * @param params parameters of the function
     * @param body the body of the function
     * @param env the environment in which the function has been declared
     * @param type the type of the function
     */
    public RecFunctionExprComponent(ArrayList<Component> params, Component body, EnvFrame env, TypeElement type) {
        super(params, body, env, type);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a RecFunctionExprComponent is itself.</p>
     */
    @Override
    public RecFunctionExprComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "[recursive function" + super.getStringRepresentation();
    }

}

