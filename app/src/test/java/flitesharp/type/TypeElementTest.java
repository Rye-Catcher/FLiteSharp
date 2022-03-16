package flitesharp.type;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TypeElementTest {

    @Test
    public void match_identicalWithNoChildren_shouldReturnTrue() {
        TypeElement typeElement1 = new TypeElement(TypeName.DOUBLE);
        TypeElement typeElement2 = new TypeElement(TypeName.DOUBLE);
        assertTrue(typeElement1.match(typeElement2));
    }

    @Test
    public void match_differentWithNoChildren_shouldReturnFalse() {
        TypeElement typeElement1 = new TypeElement(TypeName.BOOL);
        TypeElement typeElement2 = new TypeElement(TypeName.DOUBLE);
        assertFalse(typeElement1.match(typeElement2));
    }

    @Test
    public void match_identicalWithChildren_shouldReturnTrue() {
        List<TypeElement> children = new ArrayList<>();
        for(int i=0; i<5; i++) {
            children.add(new TypeElement(TypeName.INT));
        }
        TypeElement typeElement1 = new TypeElement(TypeName.TUPLE, children);
        TypeElement typeElement2 = new TypeElement(TypeName.TUPLE, children);
        assertTrue(typeElement1.match(typeElement2));
    }

    @Test
    public void match_differentWithDifferentNumberOfChildren_shouldReturnFalse() {
        List<TypeElement> children = new ArrayList<>();
        for(int i=0; i<5; i++) {
            children.add(new TypeElement(TypeName.INT));
        }
        TypeElement typeElement1 = new TypeElement(TypeName.TUPLE, children);
        children.add(new TypeElement(TypeName.INT));
        TypeElement typeElement2 = new TypeElement(TypeName.TUPLE, children);
        assertFalse(typeElement1.match(typeElement2));
    }

    @Test
    public void match_differentWithSameNumberOfChildren_shouldReturnFalse() {
        List<TypeElement> children = new ArrayList<>();
        for(int i=0; i<5; i++) {
            children.add(new TypeElement(TypeName.INT));
        }
        TypeElement typeElement1 = new TypeElement(TypeName.TUPLE, children);
        children.set(4, new TypeElement(TypeName.DOUBLE));
        TypeElement typeElement2 = new TypeElement(TypeName.TUPLE, children);
        assertFalse(typeElement1.match(typeElement2));
    }
}
