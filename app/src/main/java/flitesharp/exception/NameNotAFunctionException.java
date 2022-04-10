package flitesharp.exception;

import flitesharp.component.environment.NameComponent;

/**
 * Represents the error that occurs when a name which is not bound to a function is used as function name in a function
 * application.
 */
public class NameNotAFunctionException extends CompilingException{

    /**
     * Constructs an NameNotAFunctionException containing an error message that also specifies the name causing the
     * error and the position in the source code of the name that generated the exception.
     * @param exceptionGen the NameComponent representing the name that generated the exception
     */
    public NameNotAFunctionException(NameComponent exceptionGen) {
        super("name " + exceptionGen + " is not a function and can not be applied", exceptionGen);
    }

}
