package flitesharp.component;

import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.component.operation.AdditionComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.exception.compilingException.NameNotFoundException;
import flitesharp.exception.compilingException.NameNotYetDefinedException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BlockComponentTest {
    private List<Component> initialList;
    private EnvFrame emptyEnv;

    @Before
    public void setUp() {
        initialList = new ArrayList<>();
        NameComponent name = new NameComponent("a");
        name.setType(new TypeElement(TypeName.INT));
        initialList.add(new VarDeclarationComponent(name, new NumberComponent(3, new TypeElement(TypeName.INT))));
        initialList.add(new AdditionComponent(new NameComponent("a"), new NumberComponent(4, new TypeElement(TypeName.INT))));
        emptyEnv = new EnvFrame();
    }

    @Test
    public void evaluate_correctBlock_shouldReturn7() {
        NumberComponent result = null;
        try {
            result = (NumberComponent) new BlockComponent(initialList).checkTypeAndEvaluate(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(7, result.getNumberValue(), 0.0);
    }

    @Test
    public void checkType_correctBlock_shouldReturnInt() {
        TypeElement result = null;
        try {
            result = new BlockComponent(initialList).checkType(emptyEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.INT);
    }

    @Test
    public void checkType_badTypedBlock_shouldThrowException() {
        initialList.add(new AdditionComponent(new NameComponent("a"), new NumberComponent(4, new TypeElement(TypeName.DOUBLE))));
        try {
            new BlockComponent(initialList).checkType(emptyEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_blockWithUndeclaredVariable_shouldThrowException() {
        initialList.add(new AdditionComponent(new NameComponent("b"), new NumberComponent(4, new TypeElement(TypeName.INT))));
        try {
            new BlockComponent(initialList).checkType(emptyEnv);
            fail();
        } catch (NameNotFoundException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

    @Test
    public void checkType_blockWithNotYetDeclaredVariable_shouldThrowException() {
        initialList.add(0, new AdditionComponent(new NameComponent("a"), new NumberComponent(4, new TypeElement(TypeName.INT))));
        try {
            new BlockComponent(initialList).checkType(emptyEnv);
            fail();
        } catch (NameNotYetDefinedException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
