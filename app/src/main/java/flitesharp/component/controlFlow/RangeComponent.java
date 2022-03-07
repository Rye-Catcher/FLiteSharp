package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.compoundData.ListComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.NumberComponent;

import java.util.ArrayList;
import java.util.List;

public class RangeComponent extends Component {
    private final Component starting;
    private final Component ending;
    private final Component increment;

    public RangeComponent(Component starting, Component increment, Component ending) {
        this.starting = starting;
        this.ending = ending;
        this.increment = increment;
    }

    public RangeComponent(Component starting, Component ending) {
        this.starting = starting;
        this.ending = ending;
        this.increment = null;
    }

    @Override
    public DataComponent evaluate(EnvFrame env) {
        List<DataComponent> list = new ArrayList<>();
        int start = (int)((NumberComponent) starting.evaluate(env)).getNumberValue();
        int end = (int)((NumberComponent) ending.evaluate(env)).getNumberValue();
        int incr = 1;
        if(increment != null)
            incr = (int)((NumberComponent) increment.evaluate(env)).getNumberValue();
        if(incr == 0)
            return new ListComponent(list);
        if(incr < 0)
            while(start >= end) {
                list.add(new NumberComponent(start));
                start += incr;
            }
        else
            while(start <= end) {
                list.add(new NumberComponent(start));
                start += incr;
            }

        return new ListComponent(list);
    }

    @Override
    public String getStringRepresentation() {
        String s = "range[" + starting.getStringRepresentation() + ", ";
        if(increment != null)
            s += increment.getStringRepresentation() + ", ";
        s += ending.getStringRepresentation() + "]";
        return s;
    }
}
