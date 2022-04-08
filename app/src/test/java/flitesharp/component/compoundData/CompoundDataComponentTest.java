package flitesharp.component.compoundData;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.operation.AdditionComponent;
import flitesharp.component.operation.AndComponent;
import flitesharp.component.operation.SubtractionComponent;
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

public class CompoundDataComponentTest {
    private AdditionComponent numElem1;
    private SubtractionComponent numElem2;
    private AndComponent boolElem;
    private TypeElement intKgType;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        storage.addUnit("kg");
        intKgType = new TypeElement(TypeName.INT);
        intKgType.setUnitOfMeasure(new UnitOfMeasure(storage.getUnit("kg")));
        numElem1 = new AdditionComponent(new NumberComponent(3,intKgType), new NumberComponent(7, intKgType));
        numElem2 = new SubtractionComponent(new NumberComponent(15,intKgType), new NumberComponent(10, intKgType));
        boolElem = new AndComponent(new BooleanComponent(true), new BooleanComponent(false));
        emptyEnv = new EnvFrame(null, null);
    }

    @Test
    public void evaluate_listDeclaration_shouldReturnEvaluatedList() {
        List<Component> list = new ArrayList<>();
        list.add(numElem1);
        list.add(numElem2);
        CompoundDataComponent component = new CompoundDataComponent(list, true);
        List<DataComponent> result = null;
        try {
            result = ((ListComponent) component.checkTypeAndEvaluate(emptyEnv)).getValue();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(2, result.size());
        assertEquals(10, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertEquals(5, ((NumberComponent) result.get(1)).getNumberValue(), 0.0);
    }

    @Test
    public void evaluate_tupleDeclaration_shouldReturnEvaluatedTuple() {
        List<Component> tuple = new ArrayList<>();
        tuple.add(numElem1);
        tuple.add(boolElem);
        CompoundDataComponent component = new CompoundDataComponent(tuple, false);
        List<DataComponent> result = null;
        try {
            result = ((TupleComponent) component.checkTypeAndEvaluate(emptyEnv)).getValue();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(2, result.size());
        assertEquals(10, ((NumberComponent) result.get(0)).getNumberValue(), 0.0);
        assertFalse(((BooleanComponent) result.get(1)).getBooleanValue());
    }

    @Test
    public void checkType_listOfIntKgDeclaration_shouldReturnListOfIntKg() {
        List<Component> list = new ArrayList<>();
        list.add(numElem1);
        list.add(numElem2);
        CompoundDataComponent component = new CompoundDataComponent(list, true);
        TypeElement result = null;
        try {
            result = component.checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        List<TypeElement> children = new ArrayList<>();
        children.add(intKgType);
        assertTrue(result.match(new TypeElement(TypeName.LIST, children)));
    }

    @Test
    public void checkType_tupleOfIntKgAndBoolDeclaration_shouldReturnTupleOfIntKgAndBool() {
        List<Component> tuple = new ArrayList<>();
        tuple.add(numElem1);
        tuple.add(boolElem);
        CompoundDataComponent component = new CompoundDataComponent(tuple, false);
        TypeElement result = null;
        try {
            result = component.checkType(emptyEnv);
        } catch (IllegalTypeException e) {
            fail();
        }
        List<TypeElement> children = new ArrayList<>();
        children.add(intKgType);
        children.add(new TypeElement(TypeName.BOOL));
        assertTrue(result.match(new TypeElement(TypeName.TUPLE, children)));
    }

    @Test
    public void checkType_listWithDifferentTypesDeclaration_shouldThrowException() {
        List<Component> list = new ArrayList<>();
        list.add(numElem1);
        list.add(boolElem);
        CompoundDataComponent component = new CompoundDataComponent(list, true);
        try {
            component.checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
