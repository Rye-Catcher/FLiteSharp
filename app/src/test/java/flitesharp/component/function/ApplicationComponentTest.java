package flitesharp.component.function;

import flitesharp.component.BlockComponent;
import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.component.operation.AdditionComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.exception.compilingException.NameNotAFunctionException;
import flitesharp.exception.compilingException.NameNotFoundException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ApplicationComponentTest {
    private FunctionExprComponent function;
    private NameComponent name;
    private List<Component> arguments;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        List<Component> list = new ArrayList<>();
        list.add(new AdditionComponent(new NameComponent("a"), new NameComponent("b")));
        BlockComponent body = new BlockComponent(list);
        List<Component> params = new ArrayList<>();
        NameComponent p1 = new NameComponent("a");
        p1.setType(new TypeElement(TypeName.INT));
        NameComponent p2 = new NameComponent("b");
        p2.setType(new TypeElement(TypeName.INT));
        params.add(p1);
        params.add(p2);
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.INT));
        TypeElement type = new TypeElement(TypeName.FUNC, children);
        emptyEnv = new EnvFrame();
        function = new FunctionExprComponent(params, body, emptyEnv, type);
        try {
            EnvFrame tmp = emptyEnv.extend();
            tmp.addNewBinds("a", new TypeElement(TypeName.INT), new UndefinedComponent());
            tmp.addNewBinds("b", new TypeElement(TypeName.INT), new UndefinedComponent());
            body.checkType(tmp);
        } catch (CompilingException e) {
            fail();
        }
        name = new NameComponent("f");
        name.setType(type);
        arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        arguments.add(new NumberComponent(4,new TypeElement(TypeName.INT)));
    }

    @Test
    public void evaluate_correctFunctionApplication_shouldReturn7() {
        emptyEnv.addNewBinds("f", name.getType(), function);
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        NumberComponent result = null;
        try {
            result = (NumberComponent) app.checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(7, result.getNumberValue(), 0.0);
    }

    @Test
    public void checkType_wellTypedApplication_shouldReturnReturnType() {
        emptyEnv.addNewBinds("f", name.getType(), function);
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        TypeElement result = null;
        try {
            result = app.checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertTrue(result.match(new TypeElement(TypeName.INT)));
    }

    @Test
    public void checkType_nameNotFound_shouldThrowException() {
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        try {
            app.checkType(emptyEnv);
            fail();
        } catch (NameNotFoundException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_nameNotAFunction_shouldThrowException() {
        emptyEnv.addNewBinds("f", new TypeElement(TypeName.BOOL), new BooleanComponent(true));
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        try {
            app.checkType(emptyEnv);
            fail();
        } catch (NameNotAFunctionException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_notEnoughArguments_shouldThrowException() {
        emptyEnv.addNewBinds("f", name.getType(), function);
        arguments.remove(1);
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        try {
            app.checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_tooManyArguments_shouldThrowException() {
        emptyEnv.addNewBinds("f", name.getType(), function);
        arguments.add(new BooleanComponent(true));
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        try {
            app.checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_badTypedArguments_shouldThrowException() {
        emptyEnv.addNewBinds("f", name.getType(), function);
        arguments.remove(1);
        arguments.add(new BooleanComponent(true));
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        try {
            app.checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
