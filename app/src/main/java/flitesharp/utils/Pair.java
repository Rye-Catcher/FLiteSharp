package flitesharp.utils;

import java.util.AbstractMap;
import java.util.Map;

/**
 * A class representing a pair of two values. The two values can have different types.
 */
public class Pair <T, U> {
    private final Map.Entry<T, U> pair;

    /**
     * Construct a new pair containing two given values.
     * @param first the first value of the pair
     * @param second the second value of the pair
     */
    public Pair(T first, U second) {
        pair = new AbstractMap.SimpleEntry<>(first, second);
    }

    /**
     * Returns the first value of the pair.
     * @return the first value of the pair
     */
    public T getFirst() {
        return pair.getKey();
    }

    /**
     * Returns the second value of the pair.
     * @return the second value of the pair
     */
    public U getSecond() {
        return pair.getValue();
    }
}
