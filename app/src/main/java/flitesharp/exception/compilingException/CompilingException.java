package flitesharp.exception.compilingException;

import flitesharp.component.Component;

/**
 * Represents an error that occurs during the type-checking of the program. Errors represented by CompilingExceptions
 * occur if the source code provided by the user is not correct and causes errors at compile-time.
 */
public abstract class CompilingException extends Exception{

    /**
     * Constructs a CompilingException containing an error message that also specifies the position in the source code
     * of the expression that generated the exception.
     * @param message the error message
     * @param exceptionGen the component representing the expression that generated the exception
     */
    public CompilingException(String message, Component exceptionGen) {
        super("line " + exceptionGen.getLineNumber() + ":" + exceptionGen.getCharNumber() + " ERROR: " + message);
    }

}
