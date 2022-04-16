package flitesharp.component.operation;

import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AttachComponentTest {
    private NumberComponent left;
    private ListComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        left = new NumberComponent(3, new TypeElement(TypeName.INT));
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(4, new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(-7, new TypeElement(TypeName.INT));
        list.add(element);
        right = new ListComponent(list);
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_attach3_shouldReturnListOfThreeInt() {
        List<DataComponent> result = ((ListComponent) new AttachComponent(left, right).evaluate(emptyEnv)).getValue();
        assertEquals(result.size(), 3);
        assertEquals(3, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_attachToEmptyList_shouldReturnListOfThree() {
        List<DataComponent> result = ((ListComponent) new AttachComponent(left, new ListComponent(new ArrayList<>()))
                .evaluate(emptyEnv)).getValue();
        assertEquals(result.size(), 1);
        assertEquals(3, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
    }

    @Test
    public void checkType_intAndListInt_shouldReturnListInt() {
        left.setType(new TypeElement(TypeName.INT));
        TypeElement result = null;
        try {
             result = new AttachComponent(left, new ListComponent(new ArrayList<>())).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
    }

    @Test
    public void checkType_intAndEmptyList_shouldReturnListInt() {
        left.setType(new TypeElement(TypeName.INT));
        TypeElement result = null;
        try {
            result = new AttachComponent(left, right).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
    }

    @Test
    public void checkType_intKgAndListIntKg_shouldReturnListIntKg() {
        TypeElement type = new TypeElement(TypeName.INT);
        type.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(type);
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(4, type);
        list.add(element);
        element = new NumberComponent(-7, type);
        list.add(element);
        right = new ListComponent(list);
        TypeElement result = null;
        try {
            result = new AttachComponent(left, right).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        List<TypeElement> children = new ArrayList<>();
        children.add(type);
        assertTrue(result.match(new TypeElement(TypeName.LIST, children)));
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        try {
            new AttachComponent(left, right).checkType(emptyEnv);
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
        TypeElement rightType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        left.setType(leftType);
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(4, rightType);
        list.add(element);
        element = new NumberComponent(-7, rightType);
        list.add(element);
        right = new ListComponent(list);
        try {
            new AttachComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
