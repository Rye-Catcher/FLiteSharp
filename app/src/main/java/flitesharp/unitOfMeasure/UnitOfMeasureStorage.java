package flitesharp.unitOfMeasure;

import flitesharp.unitOfMeasure.exception.UndefinedUnitException;

import java.util.*;

public class UnitOfMeasureStorage {
    private static UnitOfMeasureStorage storage;
    private final Map<String, UnitOfMeasure> units;

    private UnitOfMeasureStorage() {
        units = new HashMap<>();
    }

    public void addUnit(String name) {
        Map<String, Integer> formula = new HashMap<>();
        formula.put(name, 1);
        addUnit(name, new UnitOfMeasure(formula));
    }

    public void addUnit(String name, UnitOfMeasure unit) {
        units.put(name, unit);
    }

    public UnitOfMeasure getUnit(String name) {
        UnitOfMeasure unit = units.get(name);
        if(unit != null)
            return unit;
        throw new UndefinedUnitException(name);
    }

    public static UnitOfMeasureStorage getStorage() {
        if(storage == null)
            storage = new UnitOfMeasureStorage();
        return storage;
    }
}
