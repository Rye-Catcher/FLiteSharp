package flitesharp.unitOfMeasure.exception;

/**
 * Represents the error that occurs when an integer different from one is used to represent a unit of measure in a unit
 * formula.
 */
public class MalformedUnitFormulaException extends RuntimeException {

    /**
     * Constructs a MalformedUnitFormulaException containing an error message that also specifies the value of the
     * integer causing the error and the position in the source code of that value.
     * @param value the value of the integer causing the error
     * @param line the number of the line of code containing the value causing the error
     * @param character the position of the value causing the error in its line of code
     */
    public MalformedUnitFormulaException(int value, int line, int character) {
        super("line " + line + ":" + character + " ERROR: Numeric value " + value +
                " does not represents a unit of measure");
    }

}
