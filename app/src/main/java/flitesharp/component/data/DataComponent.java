package flitesharp.component.data;

import flitesharp.component.Component;
import flitesharp.component.environment.EnvFrame;
import flitesharp.type.TypeElement;

/**
 * A DataComponent represents a component that can be returned as the result of an evaluation.
 */
public abstract class DataComponent extends Component {

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a DataComponent is the DataComponent itself because all DataComponents are already the
     * results of an evaluation and can't be evaluated again.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        return this;
    }

    /**
     * Prints the value of the data component on the standard output in a more user-friendly format.
     */
    public abstract void prettyPrint();
}
