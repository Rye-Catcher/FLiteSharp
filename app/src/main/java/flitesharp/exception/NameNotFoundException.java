package flitesharp.exception;

import flitesharp.component.environment.NameComponent;

/**
 * Represents the error that occurs when a name is used in a scope where it hasn't been declared.
 */
public class NameNotFoundException extends CompilingException{

    /**
     * Constructs an NameNotFoundException containing an error message that also specifies the name causing the error
     * and the position in the source code of the name that generated the exception.
     * @param exceptionGen the NameComponent representing the name that generated the exception
     */
    public NameNotFoundException(NameComponent exceptionGen) {
        super("name " + exceptionGen + " is not defined in this scope", exceptionGen);
    }

}
