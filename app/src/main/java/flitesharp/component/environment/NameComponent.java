package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;

public class NameComponent extends Component {
    private final String name;

    public NameComponent(String name) {
        this.name = name;
    }

    @Override
    public DataComponent evaluate(EnvFrame env) {
        return env.findVal(name);
    }

    @Override
    public String getStringRepresentation() {
        return "name[" + this.name + "]";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
