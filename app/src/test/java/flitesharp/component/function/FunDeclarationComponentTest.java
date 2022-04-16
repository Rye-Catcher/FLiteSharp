package flitesharp.component.function;

import flitesharp.component.BlockComponent;
import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.component.operation.AdditionComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.exception.compilingException.NameNotYetDefinedException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FunDeclarationComponentTest {
    private BlockComponent body;
    private List<Component> params;
    private TypeElement type;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        List<Component> list = new ArrayList<>();
        list.add(new AdditionComponent(new NameComponent("a"), new NameComponent("b")));
        body = new BlockComponent(list);
        params = new ArrayList<>();
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
        type = new TypeElement(TypeName.FUNC, children);
        emptyEnv = new EnvFrame();
    }

    @Test
    public void evaluate_2IntParamsReturnInt_shouldReturnUndefined() {
        List<DataComponent> arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        arguments.add(new NumberComponent(4,new TypeElement(TypeName.INT)));
        NameComponent name = new NameComponent("f");
        name.setType(type);
        DataComponent result = null;
        try {
            result = new FunDeclarationComponent(name, params, body, false).checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        FunctionExprComponent fun = (FunctionExprComponent) emptyEnv.findVal("f");
        assertTrue(result instanceof UndefinedComponent);
        assertTrue(fun.getType().match(type));
        assertEquals(7, ((NumberComponent) fun.evaluateBody(arguments)).getNumberValue(), 0.0);
    }

    @Test
    public void typeCheck_intNameIntReturnValue_shouldReturnUndefined() {
        NameComponent name = new NameComponent("f");
        name.setType(type);
        TypeElement result = null;
        try {
            result = new FunDeclarationComponent(name, params, body, false).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertTrue(result.match(new TypeElement(TypeName.UNDEFINED)));
    }

    @Test
    public void typeCheck_doubleNameIntReturnValue_shouldThrowException() {
        NameComponent name = new NameComponent("f");
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.DOUBLE));
        type = new TypeElement(TypeName.FUNC, children);
        name.setType(type);
        try {
            new FunDeclarationComponent(name, params, body, false).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void typeCheck_recursiveCallInNonRecursiveFunction_shouldThrowException() {
        List<Component> arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        List<Component> list = new ArrayList<>();
        list.add(new AdditionComponent(new NameComponent("a"), app));
        body = new BlockComponent(list);
        params.remove(1);
        NameComponent name = new NameComponent("f");
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.INT));
        type = new TypeElement(TypeName.FUNC, children);
        name.setType(type);
        emptyEnv.addNewBinds("f", new TypeElement(TypeName.UNDEFINED), new UndefinedComponent());
        try {
            new FunDeclarationComponent(name, params, body, false).checkType(emptyEnv);
            fail();
        } catch (NameNotYetDefinedException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void typeCheck_recursiveCallInRecursiveFunction_shouldReturnUndefined() {
        List<Component> arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        ApplicationComponent app = new ApplicationComponent(new NameComponent("f"), arguments);
        List<Component> list = new ArrayList<>();
        list.add(new AdditionComponent(new NameComponent("a"), app));
        body = new BlockComponent(list);
        params.remove(1);
        NameComponent name = new NameComponent("f");
        List<TypeElement> children = new ArrayList<>();
        children.add(new TypeElement(TypeName.INT));
        children.add(new TypeElement(TypeName.INT));
        type = new TypeElement(TypeName.FUNC, children);
        name.setType(type);
        emptyEnv.addNewBinds("f", new TypeElement(TypeName.UNDEFINED), new UndefinedComponent());
        TypeElement result = null;
        try {
            result = new FunDeclarationComponent(name, params, body, true).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertTrue(result.match(new TypeElement(TypeName.UNDEFINED)));
    }

}
