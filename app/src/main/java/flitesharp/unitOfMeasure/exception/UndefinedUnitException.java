package flitesharp.unitOfMeasure.exception;

/**
 * Represents the error that occurs when a unit of measure is used in a formula without having been previously declared.
 */
public class UndefinedUnitException extends RuntimeException {

    /**
     * Constructs an UndefinedUnitException containing an error message that also specifies the unit causing the error
     * and the position in the source code of the unit that generated the exception.
     * @param name the name of the unit causing the error
     * @param line the number of the line of code containing the unit causing the error
     * @param character the position of the unit causing the error in its line of code
     */
    public UndefinedUnitException(String name, int line, int character) {
        super("line " + line + ":" + character + " ERROR: Unit of measure '" + name + "' is not defined");
    }

}
