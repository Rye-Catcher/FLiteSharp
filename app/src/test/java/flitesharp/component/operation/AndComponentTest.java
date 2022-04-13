package flitesharp.component.operation;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.compilingException.IllegalTypeException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AndComponentTest {
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
    public void evaluate_trueAndFalse_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new AndComponent(left, right).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void evaluate_trueAndTrue_shouldReturnTrue() {
        BooleanComponent result = (BooleanComponent) new AndComponent(left, left).evaluate(emptyEnv);
        assertTrue(result.getBooleanValue());
    }

    @Test
    public void checkType_bothBool_shouldReturnBool() {
        left.setType(new TypeElement(TypeName.BOOL));
        right.setType(new TypeElement(TypeName.BOOL));
        TypeName result = null;
        try {
             result = new AndComponent(left, right).checkType(emptyEnv).getName();
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result, TypeName.BOOL);
    }

    @Test
    public void checkType_wrongTypes_shouldThrowException() {
        Component wrongTyped = new ListComponent(new ArrayList<>());
        try {
            new AndComponent(wrongTyped, wrongTyped).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
