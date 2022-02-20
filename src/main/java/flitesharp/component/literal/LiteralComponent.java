package flitesharp.component.literal;

import flitesharp.component.Component;

/**
 * A component representing a generic literal. This class provides utility functions to retrieve the value of that
 * literal.
 */
public abstract class LiteralComponent extends Component {
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
}