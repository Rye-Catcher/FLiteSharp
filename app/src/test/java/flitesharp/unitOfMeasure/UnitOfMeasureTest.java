package flitesharp.unitOfMeasure;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UnitOfMeasureTest {
    private UnitOfMeasure initialUnit;

    @Before
    public void setUp() {
        Map<String, Integer> formula = new HashMap<>();
        formula.put("a", 1);
        formula.put("b", 3);
        formula.put("c", -2);
        formula.put("d", 0);
        initialUnit = new UnitOfMeasure(formula);
    }

    @Test
    public void match_twoEmptyUnits_shouldReturnTrue() {
        assertTrue(new UnitOfMeasure().match(new UnitOfMeasure()));
    }

    @Test
    public void match_unitsWithDifferentSize_shouldReturnFalse() {
        Map<String, Integer> formula = new HashMap<>();
        formula.put("a", 1);
        formula.put("b", 3);
        UnitOfMeasure toCompare = new UnitOfMeasure(formula);
        assertFalse(initialUnit.match(toCompare));
    }

    @Test
    public void match_unitsWithDifferentNames_shouldReturnFalse() {
        Map<String, Integer> formula = new HashMap<>();
        formula.put("a", 1);
        formula.put("b", 3);
        formula.put("e", -2);
        UnitOfMeasure toCompare = new UnitOfMeasure(formula);
        assertFalse(initialUnit.match(toCompare));
    }

    @Test
    public void match_identicalUnits_shouldReturnTrue() {
        Map<String, Integer> formula = new HashMap<>();
        formula.put("a", 1);
        formula.put("b", 3);
        formula.put("c", -2);
        UnitOfMeasure toCompare = new UnitOfMeasure(formula);
        assertTrue(initialUnit.match(toCompare));
    }

    @Test
    public void multiply_noNewUnitMultiplier_shouldReturnUnitsProduct() {
        Map<String, Integer> multiplierFormula = new HashMap<>();
        multiplierFormula.put("a", 1);
        multiplierFormula.put("b", -3);
        UnitOfMeasure multiplier = new UnitOfMeasure(multiplierFormula);
        UnitOfMeasure result = initialUnit.multiply(multiplier);
        Map<String, Integer> expectedResultFormula = new HashMap<>();
        expectedResultFormula.put("a", 2);
        expectedResultFormula.put("c", -2);
        UnitOfMeasure expectedResult = new UnitOfMeasure(expectedResultFormula);
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void multiply_newUnitMultiplier_shouldReturnUnitsProduct() {
        Map<String, Integer> multiplierFormula = new HashMap<>();
        multiplierFormula.put("a", 1);
        multiplierFormula.put("b", -3);
        multiplierFormula.put("e", -1);
        UnitOfMeasure multiplier = new UnitOfMeasure(multiplierFormula);
        UnitOfMeasure result = initialUnit.multiply(multiplier);
        Map<String, Integer> expectedResultFormula = new HashMap<>();
        expectedResultFormula.put("a", 2);
        expectedResultFormula.put("c", -2);
        expectedResultFormula.put("e", -1);
        UnitOfMeasure expectedResult = new UnitOfMeasure(expectedResultFormula);
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void multiply_emptyMultiplier_shouldReturnInitialUnit() {
        UnitOfMeasure multiplier = new UnitOfMeasure();
        UnitOfMeasure result = initialUnit.multiply(multiplier);
        assertTrue(result.match(initialUnit));
    }

    @Test
    public void multiply_inverseMultiplier_shouldReturnEmptyUnit() {
        Map<String, Integer> multiplierFormula = new HashMap<>();
        multiplierFormula.put("a", -1);
        multiplierFormula.put("b", -3);
        multiplierFormula.put("c", 2);
        UnitOfMeasure multiplier = new UnitOfMeasure(multiplierFormula);
        UnitOfMeasure result = initialUnit.multiply(multiplier);
        UnitOfMeasure expectedResult = new UnitOfMeasure();
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void computeExponential_zeroExponent_shouldReturnEmptyUnit() {
        UnitOfMeasure result = initialUnit.computeExponential(0);
        assertTrue(result.match(new UnitOfMeasure()));
    }

    @Test
    public void computeExponential_minusOneExponent_shouldReturnInverseUnit() {
        UnitOfMeasure result = initialUnit.computeExponential(-1);
        Map<String, Integer> expectedResultFormula = new HashMap<>();
        expectedResultFormula.put("a", -1);
        expectedResultFormula.put("b", -3);
        expectedResultFormula.put("c", 2);
        UnitOfMeasure expectedResult = new UnitOfMeasure(expectedResultFormula);
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void computeExponential_exponent_shouldReturnUnitToTheExponent() {
        UnitOfMeasure result = initialUnit.computeExponential(3);
        Map<String, Integer> expectedResultFormula = new HashMap<>();
        expectedResultFormula.put("a", 3);
        expectedResultFormula.put("b", 9);
        expectedResultFormula.put("c", -6);
        UnitOfMeasure expectedResult = new UnitOfMeasure(expectedResultFormula);
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void divide_divisor_shouldReturnQuotientUnit() {
        Map<String, Integer> divisorFormula = new HashMap<>();
        divisorFormula.put("a", 1);
        divisorFormula.put("e", -2);
        UnitOfMeasure divisor = new UnitOfMeasure(divisorFormula);
        UnitOfMeasure result = initialUnit.divide(divisor);
        Map<String, Integer> expectedResultFormula = new HashMap<>();
        expectedResultFormula.put("c", -2);
        expectedResultFormula.put("b", 3);
        expectedResultFormula.put("e", 2);
        UnitOfMeasure expectedResult = new UnitOfMeasure(expectedResultFormula);
        assertTrue(result.match(expectedResult));
    }

    @Test
    public void isEmpty_dimensionlessQuantity_shouldReturnTrue() {
        assertTrue(new UnitOfMeasure().isEmpty());
    }

    @Test
    public void isEmpty_nonDimensionlessQuantity_shouldReturnFalse() {
        assertFalse(initialUnit.isEmpty());
    }

}
