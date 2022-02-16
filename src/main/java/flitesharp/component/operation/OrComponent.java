package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;
import main.java.flitesharp.component.literal.LiteralComponent;

public class OrComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    public OrComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public LiteralComponent evaluate() {
        boolean result = leftOperand.evaluate().getBooleanValue() ||
                rightOperand.evaluate().getBooleanValue();
        return new BooleanComponent(result);
    }

    @Override
    public String getStringRepresentation() {
        return "Or[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
