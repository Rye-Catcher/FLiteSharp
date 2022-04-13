package flitesharp.component.function;

import flitesharp.component.BlockComponent;
import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.operation.AdditionComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaExprComponentTest {
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
    public void evaluateBody_ABGivenAsArguments_shouldReturnAPlusB() {
        List<DataComponent> arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        arguments.add(new NumberComponent(4,new TypeElement(TypeName.INT)));
        LambdaExprComponent component = null;
        try {
            component = (LambdaExprComponent) new LambdaExprComponent(params, body).checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        DataComponent result = component.evaluateBody(arguments);
        assertEquals(7, ((NumberComponent) result).getNumberValue(), 0.0);
    }

    @Test
    public void evaluateBody_OnlyAGivenAsArguments_shouldReturnAPlusB() {
        List<DataComponent> arguments = new ArrayList<>();
        arguments.add(new NumberComponent(3,new TypeElement(TypeName.INT)));
        params.remove(1);
        emptyEnv.addNewBinds("b", new TypeElement(TypeName.INT), new NumberComponent(6, new TypeElement(TypeName.INT)));
        LambdaExprComponent component = null;
        try {
            component = (LambdaExprComponent) new LambdaExprComponent(params, body).checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        DataComponent result = component.evaluateBody(arguments);
        assertEquals(9, ((NumberComponent) result).getNumberValue(), 0.0);
    }

    @Test
    public void checkType_2IntParamsAndIntReturnValue_shouldReturnFuncTypeOfThreeInt() {
        TypeElement result = null;
        try {
            result = new LambdaExprComponent(params, body).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertTrue(result.match(type));
    }

}
