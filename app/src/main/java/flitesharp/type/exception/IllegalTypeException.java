package flitesharp.type.exception;

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
}
