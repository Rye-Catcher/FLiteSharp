package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NegativeComponentTest {
    private NumberComponent op;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        op = new NumberComponent(-3, new TypeElement(TypeName.INT));
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_neg3_shouldReturn3() {
        NumberComponent result = null;
        try {
            result = (NumberComponent) new NegativeComponent(op).checkTypeAndEvaluate(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(3, result.getNumberValue(), 0.0);
    }

    @Test
    public void checkType_int_shouldReturnInt() {
        op.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new NegativeComponent(op).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.INT);
    }

    @Test
    public void checkType_double_shouldReturnDouble() {
        op.setType(new TypeElement(TypeName.DOUBLE));
        TypeName result = null;
        try {
            result = new NegativeComponent(op).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.DOUBLE);
    }

    @Test
    public void checkType_intKg_shouldReturnIntKg() {
        TypeElement opType = new TypeElement(TypeName.INT);
        opType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        op.setType(opType);
        TypeElement result = null;
        try {
            result = new NegativeComponent(op).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.INT);
        assertEquals(result.getUnitOfMeasure().getStringRepresentation(), storage.getUnit("kg").getStringRepresentation());
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        Component wrongTyped = new ListComponent(new ArrayList<>());
        try {
            new NegativeComponent(wrongTyped).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
