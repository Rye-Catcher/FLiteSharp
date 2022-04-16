package flitesharp.component.environment;

import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.component.operation.AndComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VarDeclarationComponentTest {
    private VarDeclarationComponent declaration;
    private EnvFrame baseEnv;

    @Before
    public void setUp() {
        NameComponent name = new NameComponent("a");
        name.setType(new TypeElement(TypeName.BOOL));
        declaration = new VarDeclarationComponent(name,
                new AndComponent(new BooleanComponent(true), new BooleanComponent(false)));
        baseEnv = new EnvFrame();
    }

    @Test
    public void evaluate_aDeclaration_shouldAddAToEnv() {
        assertTrue(declaration.evaluate(baseEnv) instanceof UndefinedComponent);
        assertFalse(((BooleanComponent) baseEnv.findVal("a")).getBooleanValue());
    }

    @Test
    public void checkType_aDeclaration_shouldAddAToEnv() {
        TypeElement result = null;
        try {
            result = declaration.checkType(baseEnv);
        } catch (CompilingException e) {
            fail();
        }
        assertEquals(result.getName(), TypeName.UNDEFINED);
        assertEquals(baseEnv.findType("a").getName(), TypeName.BOOL);
    }

    @Test
    public void checkType_declarationWithWrongAssignment_shouldThrowException() {
        NameComponent name = new NameComponent("a");
        name.setType(new TypeElement(TypeName.INT));
        declaration = new VarDeclarationComponent(name,
                new AndComponent(new BooleanComponent(true), new BooleanComponent(false)));
        try {
            declaration.checkType(baseEnv);
            fail();
        } catch (IllegalTypeException ignored) {
        } catch (CompilingException e) {
            fail();
        }
    }

}
