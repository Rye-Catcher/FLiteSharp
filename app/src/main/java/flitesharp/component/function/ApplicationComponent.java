package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ApplicationComponent extends Component {
    private final Component name;
    private final ArrayList<Component> arguments;

    public ApplicationComponent(Component name, ArrayList<Component> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

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
        } else {
            //throw sth
        }
        return null;
    }

    @Override
    public String getStringRepresentation() {
        StringBuilder res = new StringBuilder("Application[" + this.name + ", argument[");
        for (Component arg : arguments) {
            res.append(arg.getStringRepresentation()).append(" ");
        }
        res = new StringBuilder(res.toString().trim());
        res.append("]]");
        return res.toString();
    }
}
