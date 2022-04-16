package flitesharp.component.environment;


import flitesharp.component.data.DataComponent;
import flitesharp.type.TypeElement;
import flitesharp.utils.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * A component representing an Environment Frame to assist the program evaluation.
 */
public class EnvFrame {
    private final Map<String, Pair<TypeElement, DataComponent>>  bindings;
    private final EnvFrame preRef;

    /**
     * Constructs a new empty environment.
     */
    public EnvFrame() {
        bindings = new HashMap<>();
        preRef = null;
    }

    /**
     * Constructs a new EnvFrameComponent representing an environment frame.
     * @param preRef the enclosing environment frame
     * @param bindings component representing bindings in the environment
     */
    public EnvFrame (EnvFrame preRef, Map<String, Pair<TypeElement, DataComponent>> bindings) {
        this.bindings = bindings;
        this.preRef = preRef;
    }

    /**
     * Extends the current environment frame.
     * @return the newly extended frame
     */
    public EnvFrame extend() {
        return new EnvFrame(this, new HashMap<>());
    }

    /**
     * Adds or replaces a binding in the current frame.
     * @param name the binding name
     * @param type the type of the name
     * @param value corresponding value
     */
    public void addNewBinds(String name, TypeElement type, DataComponent value) {
        bindings.put(name, new Pair<>(type, value));
    }

    public void delBinds(String name) {
        bindings.remove(name);
    }
    /**
     * Finds the corresponding value of a name in environment frames.
     * If no names are matched in the current frame, it will go find in the enclosing frame.
     * If still no name can be matched, it will return null.
     * @param name the name to find the corresponding value
     * @return the value of the name;
     */
    public DataComponent findVal(String name) {
        EnvFrame curFrame = this;
        while ((curFrame != null) && (!curFrame.bindings.containsKey(name))) {
            curFrame = curFrame.preRef;
        }
        if (curFrame == null) {
            return null;
        }
        return curFrame.bindings.get(name).getSecond();
    }

    /**
     * Finds the corresponding type of name in environment frames.
     * If no names are matched in the current frame, it will go find in the enclosing frame.
     * If still no name can be matched, it will return null.
     * @param name the name to find the corresponding type
     * @return the type of the name;
     */
    public TypeElement findType(String name) {
        EnvFrame curFrame = this;
        while ((curFrame != null) && (!curFrame.bindings.containsKey(name))) {
            curFrame = curFrame.preRef;
        }
        if (curFrame == null) {
            return null;
        }
        return curFrame.bindings.get(name).getFirst();
    }

    /**
     * Loads bindings from another Hashmap
     * @param bindings the bindings to be merged
     */
    public void loadBindings(Map<String, Pair<TypeElement, DataComponent>> bindings) {
        this.bindings.putAll(bindings);
    }

    /**
     * Returns the enclosing environment frame.
     * @return the enclosing environment frame
     */
    public EnvFrame getPreviousRef() {
        return this.preRef;
    }

}
