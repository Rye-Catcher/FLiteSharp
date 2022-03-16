package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * A component representing a function application
 * The result of the corresponding program is the evaluation result of the application.
 */
public class ApplicationComponent extends Component {
    private final Component name;
    private final ArrayList<Component> arguments;

    /**
     * Constructs a new ApplicationComponent representing a FUNCTION APPLICATION.
     * @param name the name of the function
     * @param arguments the arguments of the application
     */
    public ApplicationComponent(Component name, ArrayList<Component> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        ArrayList<TypeElement> args =
                arguments.stream().map(x -> {
                    try {
                        return x.checkType(env);
                    } catch (IllegalTypeException e) {
                        e.printStackTrace();
                    }
                    return null;
                }).collect(Collectors.toCollection(ArrayList::new));

        //the function value
        Object val = env.findVal(this.name.toString());

        //Declaration type
        TypeElement typeFunc = this.name.checkType(env);
        if (args.size() != typeFunc.getChildren().size() - 1) {
            throw new IllegalTypeException("Wrong type of arguments");
        }
        for (int i = 0; i < args.size(); i++) {
            if (!args.get(i).match(typeFunc.getChildren().get(i))) {
                throw new IllegalTypeException("Wrong type of arguments");
            }
        }

        return typeFunc.getLastChild();
        /*
        if (val instanceof LambdaExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createTypeBindings(args));
            TypeElement tp = tmp.checkType(newEnv);
            if (typeFunc.getLastChild().match(tp.getLastChild())) {
                return tp;
            } else {
                throw new IllegalTypeException("Wrong type of return value");
            }
        } else if (val instanceof FunctionExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            //bug
            newEnv.loadBindings(tmp.createTypeBindings(args));
            TypeElement tp = tmp.checkReturnType(newEnv);
            //System.out.println(tp.getStringRepresentation());
            if (typeFunc.getLastChild().match(tp)) {
                return tp;
            } else {
                throw new IllegalTypeException("Wrong type of return value");
            }
        } else if (val instanceof  RecFunctionExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createTypeBindings(args));
            TypeElement tp = tmp.checkReturnType(newEnv);
            if (typeFunc.getLastChild().match(tp)) {
                return tp;
            } else {
                throw new IllegalTypeException("Wrong type of return value");
            }
        } else {
            //throw sth
        }
        */
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ApplicationComponent is the evaluation result of the application.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        ArrayList<DataComponent> args =
                arguments.stream().map(x -> x.evaluate(env)).collect(Collectors.toCollection(ArrayList::new));

        Object val = this.name.evaluate(env);
        if (val instanceof LambdaExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createBindings(args));
            return tmp.evaluateBody(newEnv);
        } else if (val instanceof FunctionExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createBindings(args));
            return tmp.evaluateBody(newEnv);
        } else if (val instanceof  RecFunctionExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createBindings(args));
           // System.out.println(args.get(0).getStringRepresentation());
            return tmp.evaluateBody(newEnv);
        } else {
            //throw sth
        }
        return null;
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
