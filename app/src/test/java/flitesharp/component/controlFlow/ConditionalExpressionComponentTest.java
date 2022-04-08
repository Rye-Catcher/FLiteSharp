package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UnitComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ConditionalExpressionComponentTest {
    private BooleanComponent test;
    private NumberComponent cons;
    private NumberComponent alt;
    private UnitComponent unit;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        test = new BooleanComponent(true);
        test.setType(new TypeElement(TypeName.BOOL));
        cons = new NumberComponent(7, new TypeElement(TypeName.INT));
        alt = new NumberComponent(2, new TypeElement(TypeName.INT));
        unit = new UnitComponent();
        unit.setType(new TypeElement(TypeName.UNIT));
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_testTrue_shouldReturn7() {
        NumberComponent result = (NumberComponent) new ConditionalExpressionComponent(test, cons, alt).evaluate(emptyEnv);
        assertEquals(7, result.getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_testFalse_shouldReturn2() {
        NumberComponent result = (NumberComponent) new ConditionalExpressionComponent(new BooleanComponent(false), cons, alt).evaluate(emptyEnv);
        assertEquals(2, result.getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_testTrueWithoutElse_shouldReturnUnit() {
        DataComponent result = new ConditionalExpressionComponent(test, unit).evaluate(emptyEnv);
        assertTrue(result instanceof UnitComponent);
    }

    @Test
    public void evaluate_testFalseWithoutElse_shouldReturnUnit() {
        DataComponent result = new ConditionalExpressionComponent(new BooleanComponent(false), unit).evaluate(emptyEnv);
        assertTrue(result instanceof UnitComponent);
    }

    @Test
    public void checkType_boolTestIntOperands_shouldReturnInt() {
        cons.setType(new TypeElement(TypeName.INT));
        alt.setType(new TypeElement(TypeName.INT));
        TypeName result = null;
        try {
             result = new ConditionalExpressionComponent(test, cons, alt).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.INT);
    }

    @Test
    public void checkType_boolTestIntKgOperands_shouldReturnIntKg() {
        TypeElement consType = new TypeElement(TypeName.INT);
        consType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        cons.setType(consType);
        TypeElement altType = new TypeElement(TypeName.INT);
        altType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        alt.setType(altType);
        TypeElement result = null;
        try {
            result = new ConditionalExpressionComponent(test, cons, alt).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.INT);
        assertEquals(result.getUnitOfMeasure().getStringRepresentation(), storage.getUnit("kg").getStringRepresentation());
    }

    @Test
    public void checkType_unitConsWithoutElse_shouldReturnUnit() {
        TypeName result = null;
        try {
            result = new ConditionalExpressionComponent(test, unit).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.UNIT);
    }

    @Test
    public void checkType_notBoolTest_shouldThrowException() {
        Component wrongTyped = new ListComponent(new ArrayList<>());
        cons.setType(new TypeElement(TypeName.INT));
        alt.setType(new TypeElement(TypeName.INT));
        try {
            new ConditionalExpressionComponent(wrongTyped, cons, alt).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentOperandsTypes_shouldThrowException() {
        cons.setType(new TypeElement(TypeName.DOUBLE));
        alt.setType(new TypeElement(TypeName.INT));
        try {
            new ConditionalExpressionComponent(test, cons, alt).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentOperandsUOM_shouldThrowException() {
        TypeElement consType = new TypeElement(TypeName.INT);
        consType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        cons.setType(consType);
        TypeElement altType = new TypeElement(TypeName.INT);
        altType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        alt.setType(altType);
        try {
            new ConditionalExpressionComponent(test, cons, alt).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_notUnitConsWithoutElse_shouldThrowException() {
        cons.setType(new TypeElement(TypeName.DOUBLE));
        try {
            new ConditionalExpressionComponent(test, cons).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
