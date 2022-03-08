package flitesharp.component.type;

import java.util.ArrayList;
import java.util.List;

public class TypeElement {
    private final TypeName name;
    private final List <TypeElement> children;

    public TypeElement(TypeName name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public TypeElement(TypeName name, List <TypeElement> children) {
        this.name = name;
        this.children = new ArrayList<>(children);
    }

    public TypeName getName() {
        return name;
    }

    public List <TypeElement> getChildren() {
        return new ArrayList<>(children);
    }

    public boolean match(TypeElement toMatch) {
        if(toMatch.getName() != name)
            return false;
        List <TypeElement> childrenToMatch = toMatch.getChildren();
        boolean result = true;
        for(int i=0; i<children.size(); i++) {
            result &= children.get(i).match(childrenToMatch.get(i));
        }
        return result;
    }

}
