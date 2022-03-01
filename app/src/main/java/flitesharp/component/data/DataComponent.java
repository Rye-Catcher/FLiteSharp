package flitesharp.component.data;

import flitesharp.component.Component;

/**
 * A component representing a generic data.
 */
public abstract class DataComponent extends Component {
    /**
     * Checks if this data and the given data have the same type and value
     * @param toCompare given data to compare
     * @return ture if this literal and the given literal have the same type and the same value
     */
    public abstract <T extends DataComponent> Boolean equals(T toCompare);
}
