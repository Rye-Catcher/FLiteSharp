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

public class AttachComponentTest {
    private NumberComponent left;
    private ListComponent right;
    private EnvFrame emptyEnv;
    private UnitOfMeasureStorage storage;

    @Before
    public void setUp() {
        left = new NumberComponent(3);
        List<DataComponent> list = new ArrayList<>();
        NumberComponent element = new NumberComponent(4);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        element = new NumberComponent(-7);
        element.setType(new TypeElement(TypeName.INT));
        list.add(element);
        right = new ListComponent(list);
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        TypeElement type = new TypeElement(TypeName.LIST, children);
        right.setType(type);
        emptyEnv = new EnvFrame(null, null);
        storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        storage.addUnit("m");
    }

    @Test
    public void evaluate_attach3_shouldReturn10() {
        List<DataComponent> result = ((ListComponent) new AttachComponent(left, right).evaluate(emptyEnv)).getValue();
        assertEquals(3, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(4, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
        assertEquals(-7, ((NumberComponent) result.get(2)).getNumberValue(), 0.0);
    }

    @Test
    public void checkType_intAndListInt_shouldReturnListInt() {
        left.setType(new TypeElement(TypeName.INT));
        TypeElement result = null;
        try {
             result = new AttachComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
    }

    @Test
    public void checkType_intKgAndListIntKg_shouldReturnListIntKg() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        List<TypeElement> children = new ArrayList<>();
        TypeElement child = new TypeElement(TypeName.INT);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        children.add(child);
        right.setType(new TypeElement(TypeName.LIST, children));
        TypeElement result = null;
        try {
            result = new AttachComponent(left, right).checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.LIST);
        assertEquals(result.getLastChild().getName(), TypeName.INT);
        assertEquals(result.getLastChild().getUnitOfMeasure().getStringRepresentation(), storage.getUnit("kg").getStringRepresentation());
    }

    @Test
    public void checkType_differentTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.DOUBLE));
        try {
            new AttachComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

    @Test
    public void checkType_differentUOM_shouldThrowException() {
        TypeElement leftType = new TypeElement(TypeName.INT);
        leftType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        left.setType(leftType);
        List<TypeElement> children = new ArrayList<>();
        TypeElement child = new TypeElement(TypeName.INT);
        child.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("m")));
        children.add(child);
        right.setType(new TypeElement(TypeName.LIST, children));
        try {
            new AttachComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
