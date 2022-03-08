package flitesharp.component.type;

/**
 * Each object of this enumeration represents the name of a type.
 */
public enum TypeName {
    BOOL, INT, DOUBLE, UNIT, FUNC, LIST, TUPLE;

    /**
     * Returns the object representing the given type name.
     * @param name string containing the name of the type to retrieve
     * @return the object representing the given type name
     */
    public static TypeName getTypeName(String name) {
        return TypeName.valueOf(name.toUpperCase());
    }
}
