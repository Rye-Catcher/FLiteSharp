package flitesharp.component;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * A component represent a generic part of a program. It can for example be a literal, an operation, a block. A
 * component can be evaluated to get the result of the corresponding program. It is also possible to check if the
 * program represented by the component is well-typed and does not contain compile-time errors.
 */
public abstract class Component {
    private TypeElement type;
    private int lineNumber;
    private int charNumber;

    /**
     * Constructs and initialize a new Component.
     */
    public Component() {
        lineNumber = 0;
        charNumber = 0;
    }

    /**
     * Returns the number of the line in the source code file containing the expression represented by the component.
     * @return the number of the line in the source code file containing the expression represented by the component
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * Returns the starting position, in the source code line, of the expression represented by the component.
     * @return the starting position, in the source code line, of the expression represented by the component
     */
    public int getCharNumber() {
        return charNumber;
    }

    /**
     * Sets the position of the expression represented by the component in the source code file.
     * @param lineNumber the number of the line in the source code file containing the expression represented by the
     *                   component
     * @param charNumber the starting position, in the source code line, of the expression represented by the component
     */
    public void setFilePosition(int lineNumber, int charNumber) {
        this.lineNumber = lineNumber;
        this.charNumber = charNumber;
    }

    /**
     * Sets the position of the expression represented by the component in the source code file equal to the position
     * of the given terminal node of the parsed tree. This method can be used to set the position of a component to the
     * position of the first token in the represented expression. As an example the position of a ParenthesesComponent
     * can be set to the position of its left parentheses token by passing the node containing that token.
     * @param terminalNode the terminal node containing the position of the expression
     */
    public void setFilePositionFromTerminalNode(TerminalNode terminalNode) {
        setFilePosition(terminalNode.getSymbol().getLine(), terminalNode.getSymbol().getCharPositionInLine());
    }

    /**
     * Returns the type of the component.
     * @return the type of the component
     */
    public TypeElement getType() {
        return type;
    }

    /**
     * Sets the type of the component.
     * @param type the type to set
     */
    public void setType(TypeElement type) {
        this.type = type;
    }

    /**
     * Checks that the component is well-typed and that it does not generate compile-time errors.
     * @return the type of program represented by the component
     * @throws CompilingException if the program represented by the component is not well-typed or generates other
     * compile-time errors
     */
    public abstract TypeElement checkType(EnvFrame env) throws CompilingException;

    /**
     * Evaluates the program represented by the component and returns the program result.
     * @return a data containing the result of the program
     */
    public abstract DataComponent evaluate(EnvFrame env);

    /**
     * Checks that the program represented by component is well-typed, evaluates it and returns its result.
     * @param env the initial environment used for type-checking and evaluation
     * @return the result of the component evaluation
     * @throws CompilingException if the program represented by the component contains errors that occur at compile-time
     */
    public DataComponent checkTypeAndEvaluate(EnvFrame env) throws CompilingException {
        this.checkType(env);
        return this.evaluate(env);
    }

    /**
     * Returns a string representation of the component.
     * @return a string representation of the component
     */
    public abstract String getStringRepresentation();
}
