package flitesharp.component.environment;

import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.NameNotFoundException;
import flitesharp.exception.compilingException.NameNotYetDefinedException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class NameComponentTest {
    private NameComponent name;
    private EnvFrame baseEnv;

    @Before
    public void setUp() {
        Map<String, Pair<TypeElement, DataComponent>> bindings = new HashMap<>();
        bindings.put("a", new Pair<>(new TypeElement(TypeName.INT), new NumberComponent(10, new TypeElement(TypeName.INT))));
        bindings.put("b", new Pair<>(new TypeElement(TypeName.BOOL), new BooleanComponent(true)));
        baseEnv = new EnvFrame(null, bindings);
        name = new NameComponent("b");
    }

    @Test
    public void evaluate_presentName_shouldReturnValue() {
        assertTrue(((BooleanComponent) name.evaluate(baseEnv)).getBooleanValue());
    }

    @Test
    public void evaluate_presentNameInPreviousFrame_shouldReturnValue() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("c", new TypeElement(TypeName.INT), elem);
        assertTrue(((BooleanComponent) name.evaluate(env)).getBooleanValue());
    }

    @Test
    public void evaluate_namePresent2Times_shouldReturnInnerValue() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("b", new TypeElement(TypeName.INT), elem);
        assertEquals(3, ((NumberComponent) name.evaluate(env)).getNumberValue(), 0.0);
    }

    @Test
    public void checkType_presentName_shouldReturnType() {
        TypeElement result = null;
        try {
            result = name.checkType(baseEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_presentNameWithoutValue_shouldReturnType() {
        TypeElement result = null;
        EnvFrame env = new EnvFrame();
        env.addNewBinds("b", new TypeElement(TypeName.BOOL), new UndefinedComponent());
        try {
            result = name.checkType(env);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_presentNameInPreviousFrame_shouldReturnType() {
        TypeElement result = null;
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("c", new TypeElement(TypeName.INT), elem);
        try {
            result = name.checkType(env);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_namePresent2Times_shouldReturnInnerValue() {
        TypeElement result = null;
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("b", new TypeElement(TypeName.INT), elem);
        try {
            result = name.checkType(env);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.INT);
    }

    @Test
    public void checkType_notPresentName_shouldThrowException() {
        EnvFrame env = new EnvFrame();
        try {
             name.checkType(env);
             fail();
        } catch (NameNotFoundException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_notYetPresentName_shouldThrowException() {
        EnvFrame env = new EnvFrame();
        env.addNewBinds("b", new TypeElement(TypeName.UNDEFINED), new UndefinedComponent());
        try {
            name.checkType(env);
            fail();
        } catch (NameNotYetDefinedException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
