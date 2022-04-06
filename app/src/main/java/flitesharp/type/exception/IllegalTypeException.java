package flitesharp.type.exception;

import flitesharp.component.Component;

/**
 * Represents an error that some given data does not fulfill the type constraints
 */
public class IllegalTypeException extends Exception{
    /**
     * @param message should contain relevant message on the failed data type constraints
     */
    public IllegalTypeException(String message) {
        super(message);
    }

    /**
     * @param message should contain relevant message on the failed data type constraints
     * @param cause of the main exception
     */
    public IllegalTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs an IllegalTypeException containing an error message that also specifies the position in the source
     * code of the expression that generated the exception.
     * @param message should contain a relevant message explaining the failed data type constraints
     * @param exceptionGen the component representing the expression that generated the exception
     */
    public IllegalTypeException(String message, Component exceptionGen) {
        super("line " + exceptionGen.getLineNumber() + ":" + exceptionGen.getCharNumber() + " ERROR: " + message);
    }
}
