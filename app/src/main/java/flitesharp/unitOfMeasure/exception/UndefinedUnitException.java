package flitesharp.unitOfMeasure.exception;

public class UndefinedUnitException extends RuntimeException {

    public UndefinedUnitException(String name) {
        super("Unit of measure '" + name + "' is not defined");
    }

}
