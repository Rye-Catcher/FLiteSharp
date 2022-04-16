package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.NameNotFoundException;
import flitesharp.exception.compilingException.NameNotYetDefinedException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;

/**
 * A component representing the name of a variable or a function.
 */
public class NameComponent extends Component {
    private final String name;

    /**
     * Constructs a new NameComponent representing the given name.
     * @param name the string corresponding to the name of the variable or function
     */
    public NameComponent(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type associated with this name
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement result = env.findType(name);
        if(result == null)
            throw new NameNotFoundException(this);
        else if(result.getName() == TypeName.UNDEFINED)
            throw new NameNotYetDefinedException(this);
        return result;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a NameComponent is the value associated to the represented name in the current
     * environment.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return env.findVal(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        return "name[" + this.name + "]";
    }

    /**
     * Returns the string corresponding to the name of the variable.
     * @return the string corresponding to the name of the variable
     */
    @Override
    public String toString() {
        return this.name;
    }
}
