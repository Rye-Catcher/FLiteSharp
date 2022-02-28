package flitesharp.component.environment;

import flitesharp.component.literal.LiteralComponent;
import flitesharp.component.literal.UndefinedComponent;

import java.util.HashMap;

/**
 * A component representing an Environment Frame to assist the program evaluation.
 */
public class EnvFrame {
    private final HashMap<String, LiteralComponent> bindings;
    private final EnvFrame preRef;
    /**
     * Constructs a new EnvFrameComponent representing an environment frame.
     * @param preRef the enclosing environment frame
     * @param bindings component representing bindings in the environment
     */
    public EnvFrame (EnvFrame preRef, HashMap<String, LiteralComponent> bindings) {
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
     * @param value corresponding value
     */
    public void addNewBinds(String name, LiteralComponent value) {
        bindings.put(name, value);
    }

    /**
     * Finds the corresponding value of a name in environment frames.
     * If no names are matched in the current frame, it will go find in the enclosing frame.
     * If still no name can be matched, it will throw an exception
     * @param name the name to find the corresponding value
     * @return the value of the name;
     */
    public LiteralComponent findVal(String name) {
        LiteralComponent res = new UndefinedComponent();
        EnvFrame curFrame = this;
        while ((curFrame != null) && (!curFrame.bindings.containsKey(name))) {
            curFrame = curFrame.preRef;
            //System.out.println(curFrame); //for debugging
        }

        if (curFrame == null) {
            //throw exception
            return res;
        }
        return curFrame.bindings.get(name);
    }

    /**
     * Loads bindings from another Hashmap
     * @param bindings the bindings to be merged
     */
    public void loadBindings(HashMap<String, LiteralComponent> bindings) {
        this.bindings.putAll(bindings);
    }

    /**
     * Get the enclosing environemnt frame
     */
    public EnvFrame getPreviousRef() {
        return this.preRef;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        this.bindings.entrySet().forEach(entry -> {
            res.append(entry.getKey());
        });
        return res.toString();
    }
}
