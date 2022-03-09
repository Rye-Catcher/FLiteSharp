package flitesharp.primitive;

import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.NumberComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.utils.Pair;

import java.util.HashMap;
import java.util.Map;

public final class PrimitiveValue {
    private static final HashMap<String, Map.Entry<TypeElement, DataComponent>> primitiveVals = new HashMap<>();

    public static void loadPrimitiveVals() {
        primitiveVals.put("PI",
                Pair.of(new TypeElement(TypeName.DOUBLE), new NumberComponent(Math.asin(1.0) * 2)));
    }
    public static HashMap<String, Map.Entry<TypeElement, DataComponent>> getPrimitiveVals() {
        return primitiveVals;
    }
}
