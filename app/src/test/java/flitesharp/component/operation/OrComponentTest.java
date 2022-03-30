package flitesharp.component.operation;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrComponentTest {
    private BooleanComponent left;
    private BooleanComponent right;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        left = new BooleanComponent(true);
        right = new BooleanComponent(false);
        emptyEnv = new EnvFrame(null, null);
    }

    @Test
    public void evaluate_trueOrFalse_shouldReturnTrue() {
        BooleanComponent result = (BooleanComponent) new OrComponent(left, right).evaluate(emptyEnv);
        assertTrue(result.getBooleanValue());
    }

    @Test
    public void evaluate_falseOrFalse_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new OrComponent(right, right).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void checkType_bothBool_shouldReturnBool() {
        left.setType(new TypeElement(TypeName.BOOL));
        right.setType(new TypeElement(TypeName.BOOL));
        TypeName result = null;
        try {
             result = new OrComponent(left, right).checkType(emptyEnv).getName();
        } catch (IllegalTypeException e) {
            fail();
        }
        assertEquals(result, TypeName.BOOL);
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        left.setType(new TypeElement(TypeName.LIST));
        right.setType(new TypeElement(TypeName.LIST));
        try {
            new OrComponent(left, right).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) { }
    }

}
