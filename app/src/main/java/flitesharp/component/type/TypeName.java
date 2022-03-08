package flitesharp.component.type;

public enum TypeName {
    BOOL, INT, DOUBLE, UNIT, FUNC, LIST, TUPLE;

    public static TypeName getTypeName(String name) {
        return TypeName.valueOf(name.toUpperCase());
    }
}
