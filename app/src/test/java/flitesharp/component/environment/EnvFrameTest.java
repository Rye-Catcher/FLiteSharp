package flitesharp.component.environment;

import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class EnvFrameTest {
    private Map<String, Pair<TypeElement, DataComponent>> bindings;
    private EnvFrame baseEnv;

    @Before
    public void setUp() {
        bindings = new HashMap<>();
        bindings.put("a", new Pair<>(new TypeElement(TypeName.INT), new NumberComponent(10, new TypeElement(TypeName.INT))));
        bindings.put("b", new Pair<>(new TypeElement(TypeName.BOOL), new BooleanComponent(true)));
        baseEnv = new EnvFrame(null, bindings);
    }

    @Test
    public void extend_env_shouldReturnExtendedEnv() {
        EnvFrame env = baseEnv.extend();
        assertEquals(env.getPreviousRef(), baseEnv);
    }

    @Test
    public void addNewBinds_emptyEnv_shouldReturnEnvWithBindings() {
        EnvFrame env = new EnvFrame();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("c", new TypeElement(TypeName.INT), elem);
        assertEquals(env.findVal("c"), elem);
    }

    @Test
    public void findVal_presentValue_shouldReturnValue() {
        assertTrue(((BooleanComponent) baseEnv.findVal("b")).getBooleanValue());
    }

    @Test
    public void findVal_presentValueInPreviousFrame_shouldReturnValue() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("c", new TypeElement(TypeName.INT), elem);
        assertTrue(((BooleanComponent) env.findVal("b")).getBooleanValue());
    }

    @Test
    public void findVal_notPresentValue_shouldReturnNull() {
        assertNull(baseEnv.findVal("c"));
    }

    @Test
    public void findVal_valuePresent2Times_shouldReturnInnerValue() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("a", new TypeElement(TypeName.INT), elem);
        assertEquals(3, ((NumberComponent)env.findVal("a")).getNumberValue(), 0.0);
    }

    @Test
    public void findType_presentValue_shouldReturnType() {
        assertEquals(baseEnv.findType("b").getName(), TypeName.BOOL);
    }

    @Test
    public void findType_presentValueInPreviousFrame_shouldReturnType() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("c", new TypeElement(TypeName.INT), elem);
        assertEquals(env.findType("b").getName(), TypeName.BOOL);
    }

    @Test
    public void findType_notPresentValue_shouldReturnNull() {
        assertNull(baseEnv.findType("c"));
    }

    @Test
    public void findType_valuePresent2Times_shouldReturnInnerType() {
        EnvFrame env = baseEnv.extend();
        NumberComponent elem = new NumberComponent(3, new TypeElement(TypeName.INT));
        env.addNewBinds("b", new TypeElement(TypeName.INT), elem);
        assertEquals(env.findType("b").getName(), TypeName.INT);
    }

    @Test
    public void loadBindings_emptyEnv_shouldReturnEnvWithBindings() {
        EnvFrame env = new EnvFrame();
        env.loadBindings(bindings);
        assertEquals(10, ((NumberComponent)env.findVal("a")).getNumberValue(), 0.0);
        assertTrue(((BooleanComponent) env.findVal("b")).getBooleanValue());
    }
}
