package flitesharp.component.operation;

import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
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
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConcatenateComponentTest {
    private ListComponent left;
    private ListComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(1);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(9);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        left = new ListComponent(list);
        list = new ArrayList<>();
        element = new NumberComponent(4);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(-7);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        right = new ListComponent(list);
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        left.setType(new TypeElement(TypeName.LIST, children));
        right.setType(new TypeElement(TypeName.LIST, children));
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_concatenate_shouldReturnConcatenatedList() {
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(left, right).evaluate(emptyEnv)).getValue();
        assertEquals(1, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(9, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(3)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_concatenateEmptyList_shouldReturnSameList() {
        ListComponent newLeft = new ListComponent(new ArrayList<>());
        List<DataComponent> result = ((ListComponent) new ConcatenateComponent(newLeft, right).evaluate(emptyEnv)).getValue();
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void checkType_bothListInt_shouldReturnListInt() {
        TypeElement result = null;
        try {
             result = new ConcatenateComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
    }

    @Test
    public void checkType_intKgAndListIntKg_shouldReturnListIntKg() {
        List<TypeElement> children = new ArrayList<>();
        TypeElement child = new TypeElement(TypeName.INT);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        children.add(child);
        left.setType(new TypeElement(TypeName.LIST, children));
        children = new ArrayList<>();
        child = new TypeElement(TypeName.INT);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        children.add(child);
        right.setType(new TypeElement(TypeName.LIST, children));
        TypeElement result = null;
        try {
            result = new ConcatenateComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
        assertEquals(result.getLastChild().getUnitOfMeasure().getStringRepresentation(), storage.getUnit("kg").getStringRepresentation());
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.DOUBLE));
        left.setType(new TypeElement(TypeName.LIST, children));
        try {
            new ConcatenateComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentUOM_shouldThrowException() {
        List<TypeElement> children = new ArrayList<>();
        TypeElement child = new TypeElement(TypeName.DOUBLE);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        children.add(child);
        left.setType(new TypeElement(TypeName.LIST, children));
        children = new ArrayList<>();
        child = new TypeElement(TypeName.DOUBLE);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        children.add(child);
        right.setType(new TypeElement(TypeName.LIST, children));
        try {
            new ConcatenateComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
