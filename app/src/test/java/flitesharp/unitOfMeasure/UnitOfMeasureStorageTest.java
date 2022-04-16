package flitesharp.unitOfMeasure;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UnitOfMeasureStorageTest {
    private UnitOfMeasureStorage storage;
    private UnitOfMeasure primitiveUnit;
    private UnitOfMeasure unit;

    @Before
    public void setUp() {
        storage = UnitOfMeasureStorage.getStorage();
        Map<String, Integer> formula = new HashMap<>();
        formula.put("m", 1);
        primitiveUnit = new UnitOfMeasure(formula);
        formula.put("s", -2);
        formula.put("kg", 1);
        unit = new UnitOfMeasure(formula);
    }

    @Test
    public void addUnit_primitiveUnit_shouldReturnTrue() {
        storage.resetStorage();
        assertTrue(storage.addUnit("m"));
        assertTrue(storage.getUnit("m").match(primitiveUnit));
    }

    @Test
    public void addUnit_nonPrimitiveUnit_shouldReturnTrue() {
        storage.resetStorage();
        assertTrue(storage.addUnit("N", unit));
        assertTrue(storage.getUnit("N").match(unit));
    }

    @Test
    public void addUnit_alreadyPresentUnit_shouldReturnFalse() {
        storage.resetStorage();
        assertTrue(storage.addUnit("m"));
        assertFalse(storage.addUnit("m"));
    }

    @Test
    public void getUnit_primitiveUnit_shouldReturnPrimitiveUnit() {
        storage.resetStorage();
        storage.addUnit("m");
        assertTrue(storage.getUnit("m").match(primitiveUnit));
    }

    @Test
    public void getUnit_nonPrimitiveUnit_shouldReturnUnitFormula() {
        storage.resetStorage();
        storage.addUnit("N", unit);
        assertTrue(storage.getUnit("N").match(unit));
    }

    @Test
    public void getUnit_notPresentUnit_shouldReturnNull() {
        storage.resetStorage();
        assertNull(storage.getUnit("m"));
    }

}
