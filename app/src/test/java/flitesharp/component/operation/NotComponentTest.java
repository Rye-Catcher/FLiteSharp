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

public class NotComponentTest {
    private BooleanComponent op1;
    private BooleanComponent op2;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        op1 = new BooleanComponent(true);
        op2 = new BooleanComponent(false);
        emptyEnv = new EnvFrame(null, null);
    }

    @Test
    public void evaluate_notTrue_shouldReturnFalse() {
        BooleanComponent result = (BooleanComponent) new NotComponent(op1).evaluate(emptyEnv);
        assertFalse(result.getBooleanValue());
    }

    @Test
    public void evaluate_notFalse_shouldReturnTrue() {
        BooleanComponent result = (BooleanComponent) new NotComponent(op2).evaluate(emptyEnv);
        assertTrue(result.getBooleanValue());
    }

    @Test
    public void checkType_bool_shouldReturnBool() {
        op1.setType(new TypeElement(TypeName.BOOL));
        TypeName result = null;
        try {
             result = new NotComponent(op1).checkType(emptyEnv).getName();
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result, TypeName.BOOL);
    }

    @Test
    public void checkType_wrongType_shouldThrowException() {
        Component wrongTyped = new ListComponent(new ArrayList<>());
        try {
            new NotComponent(wrongTyped).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
