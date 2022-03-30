package flitesharp.component.operation;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MultiplicationComponentTest {
    private NumberComponent left;
    private NumberComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        left = new NumberComponent(3);
        right = new NumberComponent(2);
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_3Multiply2_shouldReturn6() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.DOUBLE));
        MultiplicationComponent component = new MultiplicationComponent(left, right);
        try {
            component.checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        NumberComponent result = (NumberComponent) component.evaluate(emptyEnv);
        assertEquals(6, result.getNumberValue(), 0.00001);
    }

    @Test
    public void checkType_bothInt_shouldReturnInt() {
        left.setType(new TypeElement(TypeName.INT));
        right.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new MultiplicationComponent(left, right).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.INT);
    }

    @Test
    public void checkType_bothDouble_shouldReturnDouble() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.DOUBLE));
        TypeName result = null;
        try {
            result = new MultiplicationComponent(left, right).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.DOUBLE);
    }

    @Test
    public void checkType_bothIntKgM_shouldReturnIntKgMultiplyM() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        right.setType(rightType);
        TypeElement result = null;
        try {
            result = new MultiplicationComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        Map <String, Integer> map = new HashMap<>();
        map.put("kg",1);
        map.put("m",1);
        assertEquals(result.getName(), TypeName.INT);
        assertTrue(result.getUnitOfMeasure().match(new UnitOfMeasure(map)));
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.INT));
        try {
            new MultiplicationComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.LIST));
        right.setType(new TypeElement(TypeName.LIST));
        try {
            new MultiplicationComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
