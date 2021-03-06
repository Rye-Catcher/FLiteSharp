package flitesharp.type;

import flitesharp.unitOfMeasure.UnitOfMeasure;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the type of a component. Each type is identified by a TypeName.
 * Each type can be primitive or compound:
 * <p> - Primitive types have no children. The available primitive types are int, double, bool and unit.</p>
 * <p> - Compound types have a list of children. The available compound types are list, tuple and func:</p>
 * <p> -- LIST: is the type representing a list. It's children list contains only one TypeElement representing the type
 *              of each element of the list. The children list is empty if the represented list is empty.</p>
 * <p> -- TUPLE: is the type representing a tuple. It's children list contains a TypeElement for each element of the
 *               tuple. The i-th TypeElement represents the type of the i-th element of the tuple.</p>
 * <p> -- FUNC: is the type representing a function. It's children list contains a TypeElement for each parameter. The
 *              i-th TypeElement represents the type of the i-th parameter of the function. Moreover another TypeElement
 *              is appended at the end of the list and represents the return type of the function.</p>
 * TypeElements representing integers or double can have an associated unit of measure. All other types are
 * non-dimensional.
 */
public class TypeElement {
    private final TypeName name;
    private final List <TypeElement> children;
    private UnitOfMeasure unitOfMeasure;

    /**
     * Constructs a new TypeElement with the given name and no children.
     * @param name name of the new TypeElement
     */
    public TypeElement(TypeName name) {
        this.name = name;
        this.children = new ArrayList<>();
        this.unitOfMeasure = new UnitOfMeasure();
    }

    /**
     * Constructs a new TypeElement identical to a given TypeElement.
     * @param toCopy the TypeElement to copy
     */
    public TypeElement(TypeElement toCopy) {
        this.name = toCopy.name;
        this.children = new ArrayList<>(toCopy.children);
        this.unitOfMeasure = new UnitOfMeasure(toCopy.unitOfMeasure);
    }

    /**
     * Constructs a new TypeElement with the given name and the given list of children.
     * @param name name of the new TypeElement
     * @param children list of children of the new TypeElement
     */
    public TypeElement(TypeName name, List <TypeElement> children) {
        this.name = name;
        this.children = new ArrayList<>(children);
        this.unitOfMeasure = new UnitOfMeasure();
    }

    /**
     * Associates a given unit of measure to the TypeElement.
     * @param unitOfMeasure unit of measure to associate
     */
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = new UnitOfMeasure(unitOfMeasure);
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
     * Returns the last child of the TypeElement. If the TypeElement has no children returns null.
     * @return the last child of the TypeElement or null if TypeElement has no children
     */
    public TypeElement getLastChild() {
        if(!children.isEmpty())
            return children.get(children.size()-1);
        return null;
    }

    /**
     * Returns the unit of measure associated with the TypeElement.
     * @return the unit of measure associated with the TypeElement
     */
    public UnitOfMeasure getUnitOfMeasure() {
        if(unitOfMeasure == null)
            return null;
        return new UnitOfMeasure(unitOfMeasure);
    }

    /**
     * Compares the TypeElement with a given TypeElement. The two TypeElements are considered identical if they have the
     * same type name, the same unit of measure and each of their children is identical; otherwise they are considered
     * different.
     * @param toMatch the given TypeElement to compare
     * @return true if the TypeElement is identical to the given TypeElement; false otherwise
     */
    public boolean match(TypeElement toMatch) {
        if(toMatch.getName() != name || toMatch.getChildren().size() != children.size())
            return false;
        boolean result = unitOfMeasure.match(toMatch.getUnitOfMeasure());
        List <TypeElement> childrenToMatch = toMatch.getChildren();
        for(int i=0; i < children.size() && result; i++) {
            result = children.get(i).match(childrenToMatch.get(i));
        }
        return result;
    }

    /**
     * Returns a string representation of the type.
     * @return a string representation of the type
     */
    public String getStringRepresentation() {
        if(children.isEmpty())
            if(!unitOfMeasure.isEmpty())
                return name.toString().toLowerCase() + unitOfMeasure.getStringRepresentation();
            else
                return name.toString().toLowerCase();
        else if(name == TypeName.LIST)
            return "(" + getLastChild().getStringRepresentation() + " list)";
        else if(name == TypeName.TUPLE) {
            StringBuilder s = new StringBuilder("(");
            for(TypeElement t: children) {
                s.append(t.getStringRepresentation()).append(" * ");
            }
            s.setLength(s.length()-3);
            s.append(")");
            return s.toString();
        }
        else {
            StringBuilder s = new StringBuilder("(");
            for(TypeElement t: children) {
                s.append(t.getStringRepresentation()).append(" -> ");
            }
            s.setLength(s.length()-4);
            s.append(")");
            return s.toString();
        }
    }

}
