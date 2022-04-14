package flitesharp.unitOfMeasure;

import java.util.*;

/**
 * This class represents a storage for declared units of measure. Each time a measure is declared it is stored in the
 * UnitOfMeasureStorage with the formula associated with that measure (the formula associated with primitive measures is
 * the measure itself). UnitOfMeasureStorage is a singleton.
 */
public class UnitOfMeasureStorage {
    private static UnitOfMeasureStorage storage;
    private final Map<String, UnitOfMeasure> units;

    /**
     * Constructs a new empty UnitOfMeasureStorage.
     */
    private UnitOfMeasureStorage() {
        units = new HashMap<>();
    }

    /**
     * Add a new primitive unit to the storage
     * @param name the name of the primitive unit to add
     * @return true if the unit has been added correctly; false if the unit was already present
     */
    public boolean addUnit(String name) {
        Map<String, Integer> formula = new HashMap<>();
        formula.put(name, 1);
        return addUnit(name, new UnitOfMeasure(formula));
    }

    /**
     * Add a new unit representing the given formula to the storage
     * @param name the name of the unit to add
     * @param unit the formula of the unit to add
     * @return true if the unit has been added correctly; false if the unit was already present
     */
    public boolean addUnit(String name, UnitOfMeasure unit) {
        if(getUnit(name) != null) {
            return false;
        }
        units.put(name, unit);
        return true;
    }

    /**
     * Returns the formula associated with the given unit of measure. If the unit is not present it returns null. If the
     * unit is primitive it returns the unit itself
     * @param name the name of the unit to retrieve
     * @return the formula associated with the given unit of measure, null if the unit is not present or the unit itself
     * if the unit is primitive
     */
    public UnitOfMeasure getUnit(String name) {
        return units.get(name);
    }

    /**
     * Returns the unique instance of the storage.
     * @return the unique instance of the storage
     */
    public static UnitOfMeasureStorage getStorage() {
        if(storage == null)
            storage = new UnitOfMeasureStorage();
        return storage;
    }

    /**
     * Empties the storage.
     */
    public void resetStorage() {
        units.clear();
    }
}
