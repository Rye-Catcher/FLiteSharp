package flitesharp.utils;

import java.util.AbstractMap;
import java.util.Map;

public class Pair <T, U> {
    private final Map.Entry<T, U> pair;

    public Pair(T first, U second) {
        pair = new AbstractMap.SimpleEntry<>(first, second);
    }

    public T getFirst() {
        return pair.getKey();
    }

    public U getSecond() {
        return pair.getValue();
    }
}
