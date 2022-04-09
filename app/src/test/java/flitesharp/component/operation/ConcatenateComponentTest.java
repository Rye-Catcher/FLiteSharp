package flitesharp.component.operation;

import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.IllegalTypeException;
import flitesharp.unitOfMeasure.UnitOfMeasure;
import flitesharp.unitOfMeasure.UnitOfMeasureStorage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ConcatenateComponentTest {
    private ListComponent left;
    private ListComponent right;
    private EnvFrame emptyEnv;
    private TypeElement intKgType;
    private TypeElement intMType;

    @Before
    public void setUp() {
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(1, new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(9, new TypeElement(TypeName.INT));
        list.add(element);
        left = new ListComponent(list);
        list = new ArrayList<>();
        element = new NumberComponent(4, new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(-7, new TypeElement(TypeName.INT));
        list.add(element);
        right = new ListComponent(list);
        emptyEnv = new EnvFrame(null, null);
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
        intKgType = new TypeElement(TypeName.INT);
        intKgType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        intMType = new TypeElement(TypeName.INT);
        intMType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
    }

    @Test
    public void evaluate_concatenate_shouldReturnConcatenatedList() {
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(left, right).evaluate(emptyEnv)).getValue();
        assertEquals(4, result.size());
        assertEquals(1, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(9, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(3)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_concatenateToEmptyList_shouldReturnSameList() {
        ListComponent newLeft = new ListComponent(new ArrayList<>());
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(newLeft, right).evaluate(emptyEnv)).getValue();
        assertEquals(2, result.size());
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_concatenateWithEmptyList_shouldReturnSameList() {
        ListComponent newRight = new ListComponent(new ArrayList<>());
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(left, newRight).evaluate(emptyEnv)).getValue();
        assertEquals(2, result.size());
        assertEquals(1, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(9, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_concatenateTwoEmptyLists_shouldReturnSameList() {
        ListComponent emptyList = new ListComponent(new ArrayList<>());
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(emptyList, emptyList).evaluate(emptyEnv)).getValue();
        assertEquals(0, result.size());
    }

    @Test
    public void checkType_bothListInt_shouldReturnListInt() {
        TypeElement result = null;
        try {
             result = new ConcatenateComponent(left, right).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
        assertEquals(1, result.getChildren().size());
    }

    @Test
    public void checkType_ListIntAndEmptyList_shouldReturnListInt() {
        TypeElement result = null;
        try {
            result = new ConcatenateComponent(left, new ListComponent(new ArrayList<>())).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
        assertEquals(1, result.getChildren().size());
    }

    @Test
    public void checkType_EmptyListAndListInt_shouldReturnListInt() {
        TypeElement result = null;
        try {
            result = new ConcatenateComponent(new ListComponent(new ArrayList<>()), right).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
        assertEquals(1, result.getChildren().size());
    }

    @Test
    public void checkType_EmptyListAndListInt_shouldReturnEmptyList() {
        ListComponent emptyList = new ListComponent(new ArrayList<>());
        TypeElement result = null;
        try {
            result = new ConcatenateComponent(emptyList, emptyList).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(0, result.getChildren().size());
    }

    @Test
    public void checkType_intKgAndListIntKg_shouldReturnListIntKg() {
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(1, intKgType);
        list.add(element);
        element = new NumberComponent(9, intKgType);
        list.add(element);
        left = new ListComponent(list);
        list = new ArrayList<>();
        element = new NumberComponent(4, intKgType);
        list.add(element);
        element = new NumberComponent(-7, intKgType);
        list.add(element);
        right = new ListComponent(list);
        TypeElement result = null;
        try {
            result = new ConcatenateComponent(left, right).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertTrue(result.getLastChild().match(intKgType));
        assertEquals(1, result.getChildren().size());
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(1, intKgType);
        list.add(element);
        element = new NumberComponent(9, intKgType);
        list.add(element);
        left = new ListComponent(list);
        try {
            new ConcatenateComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_differentUOM_shouldThrowException() {
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(1, intMType);
        list.add(element);
        element = new NumberComponent(9, intMType);
        list.add(element);
        left = new ListComponent(list);
        list = new ArrayList<>();
        element = new NumberComponent(4, intKgType);
        list.add(element);
        element = new NumberComponent(-7, intKgType);
        list.add(element);
        right = new ListComponent(list);
        try {
            new ConcatenateComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
