package flitesharp.type;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the type of a component. Each type is identified by a TypeName.
 * Each type can be primitive or compound:
 * <p> - Primitive types have no children. The available primitive types are int, double, bool and unit.</p>
 * <p> - Compound types have a list of children. The available compound types are list, tuple and func:</p>
 * <p> -- LIST: is the type representing a list. It's children list contains only one TypeElement representing the type
 *              of each element of the list.</p>
 * <p> -- TUPLE: is the type representing a tuple. It's children list contains a TypeElement for each element of the
 *               tuple. The i-th TypeElement represents the type of the i-th element of the tuple.</p>
 * <p> -- FUNC: is the type representing a function. It's children list contains a TypeElement for each parameter. The
 *              i-th TypeElement represents the type of the i-th parameter of the function. Moreover another TypeElement
 *              is appended at the end of the list and represents the return type of the function.</p>
 */
public class TypeElement {
    private final TypeName name;
    private final List <TypeElement> children;

    /**
     * Constructs a new TypeElement with the given name and no children.
     * @param name name of the new TypeElement
     */
    public TypeElement(TypeName name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    /**
     * Constructs a new TypeElement with the given name and the given list of children.
     * @param name name of the new TypeElement
     * @param children list of children of the new TypeElement
     */
    public TypeElement(TypeName name, List <TypeElement> children) {
        this.name = name;
        this.children = new ArrayList<>(children);
    }

    /**
     * Returns the name of the TypeElement.
     * @return the name of the TypeElement
     */
    public TypeName getName() {
        return name;
    }

    /**
     * Returns the list of children of the TypeElement.
     * @return the list of children of the TypeElement
     */
    public List <TypeElement> getChildren() {
        return new ArrayList<>(children);
    }

    /**
     * Compares the TypeElement with a given TypeElement. The two TypeElements are considered identical if the have the
     * same type name and each of their children is identical, otherwise they are considered different.
     * @param toMatch the given TypeElement to compare
     * @return true if the TypeElement is identical to the given TypeElement; false otherwise
     */
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

    /**
     * Returns the last child of the TypeElement. If the TypeElement has no children returns null.
     * @return the last child of the TypeElement or null if TypeElement has no children
     */
    public TypeElement getLastChild() { // Can be useful to get the return type of functions
                                        // or the type of lists elements
        if(!children.isEmpty())
            return children.get(children.size()-1);
        return null;
    }
}
