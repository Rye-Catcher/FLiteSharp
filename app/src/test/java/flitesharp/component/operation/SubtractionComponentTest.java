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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SubtractionComponentTest {
    private NumberComponent left;
    private NumberComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        left = new NumberComponent(3);
        right = new NumberComponent(7);
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_3Minus7_shouldReturnNeg4() {
        NumberComponent result = (NumberComponent) new SubtractionComponent(left, right).evaluate(emptyEnv);
        assertEquals(-4, result.getNumberValue(), 0.0);
    }

    @Test
    public void checkType_bothInt_shouldReturnInt() {
        left.setType(new TypeElement(TypeName.INT));
        right.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new SubtractionComponent(left, right).checkType(emptyEnv).getName();
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
            result = new SubtractionComponent(left, right).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.DOUBLE);
    }

    @Test
    public void checkType_bothIntKg_shouldReturnIntKg() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        right.setType(rightType);
        TypeElement result = null;
        try {
            result = new SubtractionComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.INT);
        assertEquals(result.getUnitOfMeasure().getStringRepresentation(), storage.getUnit("kg").getStringRepresentation());
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.INT));
        try {
            new SubtractionComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.LIST));
        right.setType(new TypeElement(TypeName.LIST));
        try {
            new SubtractionComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentUOM_shouldThrowException() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        right.setType(rightType);
        try {
            new SubtractionComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
