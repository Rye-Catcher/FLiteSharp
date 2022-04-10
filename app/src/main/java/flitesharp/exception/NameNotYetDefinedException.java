package flitesharp.exception;

import flitesharp.component.environment.NameComponent;

/**
 * Represents the error that occurs when a name is used before its declaration.
 */
public class NameNotYetDefinedException extends CompilingException{

    /**
     * Constructs an NameNotYetDefinedException containing an error message that also specifies the name causing the
     * error and the position in the source code of the name that generated the exception.
     * @param exceptionGen the NameComponent representing the name that generated the exception
     */
    public NameNotYetDefinedException(NameComponent exceptionGen) {
        super("name " + exceptionGen + " has not been defined yet", exceptionGen);
    }

}
