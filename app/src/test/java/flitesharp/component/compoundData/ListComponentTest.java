package flitesharp.component.compoundData;

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

public class ListComponentTest {
    private ListComponent listComponent;
    private TypeElement childType;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        List<DataComponent> elements = new ArrayList<>();
        childType = new TypeElement(TypeName.INT);
        childType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        NumberComponent elem = new NumberComponent(4, childType);
        elements.add(elem);
        elem = new NumberComponent(2, childType);
        elements.add(elem);
        listComponent = new ListComponent(elements);
    }

    @Test
    public void checkType_intKgElements_shouldReturnListOfIntKg() {
        TypeElement result = null;
        try {
            result = listComponent.checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        TypeElement childType = new TypeElement(TypeName.INT);
        childType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        List<TypeElement> children = new ArrayList<>();
        children.add(childType);
        TypeElement listType = new TypeElement(TypeName.LIST, children);
        assertTrue(result.match(listType));
    }

    @Test
    public void attach_three_shouldReturnThreeFourTwo() {
        List<DataComponent> result = listComponent.attach(new NumberComponent(3, childType));
        assertEquals(result.size(), 3);
        assertEquals(3, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
    }

    @Test
    public void attach_threeToEmptyList_shouldReturnThreeFourTwo() {
        ListComponent empty = new ListComponent(new ArrayList<>());
        List<DataComponent> result = empty.attach(new NumberComponent(3, childType));
        assertEquals(result.size(), 1);
        assertEquals(3, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
    }

    @Test
    public void concatenate_fourTwoToFourTwo_shouldReturnFourTwoFourTwo() {
        List<DataComponent> result = listComponent.concatenate(listComponent);
        assertEquals(result.size(), 4);
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(3)).getNumberValue(), 0.0);
    }

    @Test
    public void concatenate_fourTwoToEmptyList_shouldReturnFourTwo() {
        ListComponent empty = new ListComponent(new ArrayList<>());
        List<DataComponent> result = empty.concatenate(listComponent);
        assertEquals(result.size(), 2);
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void concatenate_emptyListToFourTwo_shouldReturnFourTwo() {
        ListComponent empty = new ListComponent(new ArrayList<>());
        List<DataComponent> result = listComponent.concatenate(empty);
        assertEquals(result.size(), 2);
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void concatenate_emptyListToEmptyList_shouldReturnEmptyList() {
        ListComponent empty = new ListComponent(new ArrayList<>());
        List<DataComponent> result = empty.concatenate(empty);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getValue_listOf4and2_shouldReturn4and2() {
        List<DataComponent> result = listComponent.getValue();
        assertEquals(result.size(), 2);
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(2, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }
}
