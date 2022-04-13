package flitesharp.component.operation;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PowerComponentTest {
    private NumberComponent left;
    private NumberComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        left = new NumberComponent(9.0, new TypeElement(TypeName.DOUBLE));
        right = new NumberComponent(0.5, new TypeElement(TypeName.DOUBLE));
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_9To1Half_shouldReturn3() {
        NumberComponent result = null;
        try {
            result = (NumberComponent) new PowerComponent(left, right).checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(3, result.getNumberValue(), 0.000001);
    }

    @Test
    public void checkType_bothDouble_shouldReturnDouble() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.DOUBLE));
        TypeName result = null;
        try {
            result = new PowerComponent(left, right).checkType(emptyEnv).getName();
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result, TypeName.DOUBLE);
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        right.setType(new TypeElement(TypeName.INT));
        try {
            new PowerComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.INT));
        right.setType(new TypeElement(TypeName.INT));
        try {
            new PowerComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_oneOpHasUOM_shouldThrowException() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        right.setType(rightType);
        try {
            new PowerComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_bothOpHaveUOM_shouldThrowException() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        TypeElement rightType = new TypeElement(TypeName.INT);
        rightType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        right.setType(rightType);
        try {
            new PowerComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
