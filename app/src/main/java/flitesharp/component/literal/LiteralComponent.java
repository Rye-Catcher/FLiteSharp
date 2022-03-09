package flitesharp.component.literal;

import flitesharp.component.data.DataComponent;

/**
 * A component representing a generic literal. This class provides utility functions to retrieve and compare the value
 * of that literal.
 */
public abstract class LiteralComponent extends DataComponent {
    /**
     * Returns the boolean value of the literal if any.
     * @return the boolean value of the literal if any
     * @throws UnsupportedOperationException if the literal hasn't a boolean value
     */
    public boolean getBooleanValue() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the numeric value of a literal if any.
     * @return the numeric value of a literal if any
     * @throws UnsupportedOperationException if the literal hasn't a numeric value
     */
    public double getNumberValue() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if this literal and the given literal have the same type and value.
     * @param toCompare given literal to compare
     * @return ture if this literal and the given literal have the same value; false if the value is different but the
     * type is the same; null if the type is different
     */
    public abstract <T extends DataComponent> Boolean equals(T toCompare);
}