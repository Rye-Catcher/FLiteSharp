package flitesharp.primitive;

import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;

import java.util.HashMap;
import java.util.Map;

public final class PrimitiveValue {
    private static final HashMap<String, Pair<TypeElement, DataComponent>> primitiveVals = new HashMap<>();

    public static void loadPrimitiveVals() {
        primitiveVals.put("PI",
                new Pair<>(new TypeElement(TypeName.DOUBLE),
                        new NumberComponent(Math.asin(1.0) * 2, new TypeElement(TypeName.DOUBLE))));
    }
    public static HashMap<String, Pair<TypeElement, DataComponent>> getPrimitiveVals() {
        return primitiveVals;
    }
}
