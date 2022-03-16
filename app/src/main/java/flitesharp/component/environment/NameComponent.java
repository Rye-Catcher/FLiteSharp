package flitesharp.component.environment;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.exception.IllegalTypeException;

public class NameComponent extends Component {
    private final String name;

    public NameComponent(String name) {
        this.name = name;
    }

    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        return env.findType(name);
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
