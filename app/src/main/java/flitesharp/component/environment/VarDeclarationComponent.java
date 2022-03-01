package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;

/**
 * A component representing a variable declaration.
 * The result of the corresponding program is the value of the variable.
 */
public class VarDeclarationComponent extends Component {
    private final Component name;
    private final Component value;

    /**
     * Constructs a new VarDeclarationComponent representing a VARIABLE BINDING.
     * @param name the variable name
     * @param value the variable value
     */
    public VarDeclarationComponent(Component name, Component value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Gets the variable name in String format
     * @return the variable name
     */
    public String getNameStr() {
        return this.name.toString();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a VarDeclarationComponent is the value of the variable.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = this.value.evaluate(env);
        env.addNewBinds(this.name.toString(), val);
        return val;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "varDec["
                + this.name.getStringRepresentation() + " , "
                + this.value.getStringRepresentation() + "]";
    }
}
