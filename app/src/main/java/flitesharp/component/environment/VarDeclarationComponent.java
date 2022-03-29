package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;
import flitesharp.utils.Pair;

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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement tp = this.value.checkType(env);
        this.value.setType(tp);
        env.addNewBinds(this.name.toString(), tp, new UndefinedComponent());
        if(!this.name.getType().match(tp)) {
            throw new IllegalTypeException("Types aren't matching");
        }
        return tp;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a VarDeclarationComponent is the value of the variable.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = this.value.evaluate(env);
        env.addNewBinds(this.name.toString(), val.getType(), val);
        return null;
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
