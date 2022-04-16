package flitesharp.exception;

/**
 * Represents an error that occurs when the divisor in a division operation is equal to zero.
 */
public class DivisionByZeroException extends RuntimeException{

    /**
     * Constructs a DivisionByZeroException containing an error message.
     */
    public DivisionByZeroException() {
        super("RUNTIME ERROR: division by zero");
    }
}
