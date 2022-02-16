package main.java.flitesharp.component.operation;

import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;

public class OrComponent extends Component {
    private final Component leftOperand;
    private final Component rightOperand;

    public OrComponent(Component leftOperand, Component rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public Component evaluate() {
        boolean result = ((BooleanComponent) leftOperand.evaluate()).getValue() ||
                ((BooleanComponent) rightOperand.evaluate()).getValue();
        return new BooleanComponent(result);
    }

    @Override
    public String getStringRepresentation() {
        return "Or[" + leftOperand.getStringRepresentation() + ", " + rightOperand.getStringRepresentation() + "]";
    }
}
