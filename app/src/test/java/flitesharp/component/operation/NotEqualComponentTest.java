package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NotEqualComponentTest {
    private NumberComponent leftNum;
    private NumberComponent rightNum;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        leftNum = new NumberComponent(1, new TypeElement(TypeName.INT));
        rightNum = new NumberComponent(0, new TypeElement(TypeName.INT));
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_1NotEqual0_shouldReturnTrue() {
        BooleanComponent result = (BooleanComponent) new NotEqualComponent(leftNum, rightNum).evaluate(emptyEnv);
        assertTrue(result.getBooleanValue());
    }

    @Test
    public void evaluate_1NotEqual1_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new NotEqualComponent(leftNum, leftNum).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void checkType_bothInt_shouldReturnBool() {
        leftNum.setType(new TypeElement(TypeName.INT));
        rightNum.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new NotEqualComponent(leftNum, rightNum).checkType(emptyEnv).getName();
        } catch (CompilingException e) {
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
            result = new NotEqualComponent(leftNum, rightNum).checkType(emptyEnv).getName();
        } catch (CompilingException e) {
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
            result = new NotEqualComponent(leftNum, rightNum).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        leftNum.setType(new TypeElement(TypeName.DOUBLE));
        rightNum.setType(new TypeElement(TypeName.INT));
        try {
            new NotEqualComponent(leftNum, rightNum).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        Component wrongTyped = new ListComponent(new ArrayList<>());
        try {
            new NotEqualComponent(wrongTyped, wrongTyped).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
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
            new NotEqualComponent(leftNum, rightNum).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
