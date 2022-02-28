package flitesharp.component.primitive;

import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.NumberComponent;

import java.util.HashMap;

public final class PrimitiveValue {
    private static final HashMap<String, LiteralComponent> primitiveVals = new HashMap<>();

    public static void loadPrimitiveVals() {
        primitiveVals.put("PI", new NumberComponent(Math.asin(1.0) * 2));
    }
    public static HashMap<String, LiteralComponent> getPrimitiveVals() {
        return primitiveVals;
    }
}
