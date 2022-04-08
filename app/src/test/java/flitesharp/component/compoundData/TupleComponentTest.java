package flitesharp.component.compoundData;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
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

import static org.junit.Assert.*;

public class TupleComponentTest {
    private TupleComponent tupleComponent;
    private TypeElement childType;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        emptyEnv = new EnvFrame(null, null);
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        List<DataComponent> elements = new ArrayList<>();
        childType = new TypeElement(TypeName.INT);
        childType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        NumberComponent elem = new NumberComponent(4, childType);
        elements.add(elem);
        elements.add(new BooleanComponent(true));
        tupleComponent = new TupleComponent(elements);
    }

    @Test
    public void checkType_intKgAndBoolElements_shouldReturnTupleOfIntKgAndBool() {
        TypeElement result = null;
        try {
            result = tupleComponent.checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        List<TypeElement> children = new ArrayList<>();
        children.add(childType);
        children.add(new TypeElement(TypeName.BOOL));
        TypeElement tupleType = new TypeElement(TypeName.TUPLE, children);
        assertTrue(result.match(tupleType));
    }

    @Test
    public void getValue_listOf4and2_shouldReturn4and2() {
        List<DataComponent> result = tupleComponent.getValue();
        assertEquals(result.size(), 2);
        assertEquals(4, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertTrue(((BooleanComponent) result.get(1)).getBooleanValue());
    }

}
