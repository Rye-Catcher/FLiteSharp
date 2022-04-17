package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeName;

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
     * <p>Checks that the bind value and the name have the same type. If the type is the same the name is stored in
     * the environment, otherwise an exception is thrown.</p>
     * @return undefined type
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement valueType = this.value.checkType(env);
        TypeElement nameType = this.name.getType();
        if(!nameType.match(valueType) &&
                !(nameType.getName() == TypeName.LIST &&
                        valueType.getName() == TypeName.LIST &&
                        valueType.getLastChild() == null)) {
            throw new IllegalTypeException("Types " + nameType.getStringRepresentation() + " and " +
                    valueType.getStringRepresentation() + " are not matching", this);
        }
        env.addNewBinds(this.name.toString(), valueType, new UndefinedComponent());
        this.setType(new TypeElement(TypeName.UNDEFINED));
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>A VarDeclarationComponent has no result because it represents a variable declaration, which is not an
     * expression. The evaluation of a VarDeclarationComponent associate a value with a name in the environment and
     * returns undefined.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent val = this.value.evaluate(env);
        env.addNewBinds(this.name.toString(), val.getType(), val);
        return new UndefinedComponent();
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
