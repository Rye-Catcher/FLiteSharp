package flitesharp.component.function;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;

import java.util.ArrayList;

public class ApplicationComponent extends Component {
    private final Component name;
    private final ArrayList<DataComponent> arguments;

    public ApplicationComponent(Component name, ArrayList<DataComponent> arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    @Override
    public DataComponent evaluate(EnvFrame env) {
        Object val = this.name.evaluate(env);
        if (val instanceof LambdaExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createBindings(arguments));
            return tmp.evaluateBody(newEnv);
        } else if (val instanceof FunctionExprComponent tmp) {
            EnvFrame newEnv = env.extend();
            newEnv.loadBindings(tmp.createBindings(arguments));
            return tmp.evaluateBody(newEnv);
        } else {
            //throw sth
        }
        return null;
    }

    @Override
    public String getStringRepresentation() {
        return null;
    }
}
