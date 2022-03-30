package flitesharp.component.operation;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LessThanComponentTest {
    private NumberComponent leftNum;
    private NumberComponent rightNum;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        leftNum = new NumberComponent(1);
        rightNum = new NumberComponent(0);
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_1LessThan0_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new LessThanComponent(leftNum, rightNum).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void evaluate_0LessThan1_shouldReturnTrue() {
        BooleanComponent result = (BooleanComponent) new LessThanComponent(rightNum, leftNum).evaluate(emptyEnv);
        assertTrue(result.getBooleanValue());
    }

    @Test
    public void evaluate_0LessThan0_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new LessThanComponent(rightNum, rightNum).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void checkType_bothInt_shouldReturnBool() {
        leftNum.setType(new TypeElement(TypeName.INT));
        rightNum.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new LessThanComponent(leftNum, rightNum).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.BOOL);
    }

    @Test
    public void checkType_bothDouble_shouldReturnBool() {
        leftNum.setType(new TypeElement(TypeName.DOUBLE));
        rightNum.setType(new TypeElement(TypeName.DOUBLE));
        TypeName result = null;
        try {
            result = new LessThanComponent(leftNum, rightNum).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.BOOL);
    }

    @Test
    public void checkType_bothIntKg_shouldReturnBool() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        leftNum.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        rightNum.setType(rightType);
        TypeElement result = null;
        try {
            result = new LessThanComponent(leftNum, rightNum).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        leftNum.setType(new TypeElement(TypeName.DOUBLE));
        rightNum.setType(new TypeElement(TypeName.INT));
        try {
            new LessThanComponent(leftNum, rightNum).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        leftNum.setType(new TypeElement(TypeName.LIST));
        rightNum.setType(new TypeElement(TypeName.LIST));
        try {
            new LessThanComponent(leftNum, rightNum).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentUOM_shouldThrowException() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        leftNum.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        rightNum.setType(rightType);
        try {
            new LessThanComponent(leftNum, rightNum).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
