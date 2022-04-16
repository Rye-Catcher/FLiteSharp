package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.exception.compilingException.NameNotAFunctionException;
import flitesharp.type.TypeElement;
import flitesharp.exception.compilingException.IllegalTypeException;
import flitesharp.type.TypeName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A component representing a function application.
 * The result of the corresponding program is the evaluation result of the application.
 */
public class ApplicationComponent extends Component {
    private final NameComponent name;
    private final List<Component> arguments;

    /**
     * Constructs a new ApplicationComponent representing a FUNCTION APPLICATION.
     * @param name the name of the function
     * @param arguments the arguments of the application
     */
    public ApplicationComponent(NameComponent name, List<Component> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    /**
     * {@inheritDoc}
     *
     * @return the return type of the applied function if the types of the arguments match the types of the parameters
     * of the function. It throws an exception otherwise
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        List<TypeElement> args = new ArrayList<>();
        for (Component x : arguments) {
            TypeElement typeElement = x.checkType(env);
            args.add(typeElement);
        }

        TypeElement typeFunc = this.name.checkType(env);
        if(typeFunc.getName() != TypeName.FUNC) {
            throw new NameNotAFunctionException(name);
        }
        List<TypeElement> children = typeFunc.getChildren();
        if (args.size() < children.size() - 1) {
            throw new IllegalTypeException("not enough arguments in function application", this);
        } else if (args.size() > children.size() - 1) {
            throw new IllegalTypeException("too many arguments in function application", this);
        }
        for (int i = 0; i < args.size(); i++) {
            if (!args.get(i).match(children.get(i))) {
                throw new IllegalTypeException("value type " + args.get(i).getStringRepresentation() +
                        " is not matching parameter type " + children.get(i).getStringRepresentation(), this);
            }
        }

        this.setType(typeFunc.getLastChild());
        return this.getType();
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of an ApplicationComponent is the evaluation result of the application.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        ArrayList<DataComponent> args =
                arguments.stream().map(x -> x.evaluate(env)).collect(Collectors.toCollection(ArrayList::new));

        DataComponent val = this.name.evaluate(env);
        if (val instanceof FunctionalExprComponent tmp) {
            return tmp.evaluateBody(args);
        }
        return new UndefinedComponent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("Application[" + this.name.getStringRepresentation() + ", argument[");
        for (Component arg : arguments) {
            res.append(arg.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("]]");
        return res.toString();
    }
}
