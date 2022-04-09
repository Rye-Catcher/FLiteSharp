package flitesharp.component.controlFlow;

import flitesharp.component.Component;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.literal.UnitComponent;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.exception.IllegalTypeException;

/**
 * A component representing a conditional expression. The result of the corresponding program is the result of the THEN
 * branch if the test is true and of the ELSE branch if the test is false. If test is false and there's no ELSE branch
 * the result is the literal undefined.
 */
public class ConditionalExpressionComponent extends Component {
    private final Component test;
    private final Component consequent;
    private final Component alternate;

    /**
     * Constructs a new ConditionalExpressionComponent representing a conditional expression with ELSE branch.
     * @param test component representing the test condition of the expression
     * @param consequent component representing operations of the THEN branch
     * @param alternate component representing operations of the ELSE branch
     */
    public ConditionalExpressionComponent(Component test, Component consequent, Component alternate) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    /**
     * Constructs a new ConditionalExpressionComponent representing a conditional expression without ELSE branch.
     * @param test component representing the test condition of the expression
     * @param consequent component representing operations of the THEN branch
     */
    public ConditionalExpressionComponent(Component test, Component consequent) {
        this.test = test;
        this.consequent = consequent;
        this.alternate = null;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type of the consequent (including the unit of measure if any). The type of the test must always be
     * bool. If there is no else branch the type of the consequent must be unit; otherwise the types of consequent and
     * alternate must be the same (including the unit of measure).
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement typeTest = test.checkType(env);
        TypeElement typeCons = consequent.checkType(env);
        if (typeTest.getName() != TypeName.BOOL) {
            throw new IllegalTypeException("A BOOL value is expected for TEST of conditionals", this);
        }
        if (alternate != null) {
            TypeElement typeAlt = alternate.checkType(env);

            if (typeCons.match(typeAlt)) {
                this.setType(new TypeElement(typeCons));
                return this.getType();
            } else {
                throw new IllegalTypeException("Type " + typeCons.getStringRepresentation() + " of then branch and type " +
                        typeAlt.getStringRepresentation() + " of else branch are not matching", this);
            }
        } else {
            if (typeCons.getName() != TypeName.UNIT) {
                throw new IllegalTypeException("A UNIT value is expected for then branch if there is no else branch" +
                        " in conditionals but type " + typeCons.getStringRepresentation() + " has been found instead", this);
            }
            this.setType(new TypeElement(typeCons));
            return this.getType();
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The program result of a ConditionalExpressionComponent is the result of the THEN branch if the test is true
     * and of the ELSE branch if the test is false. If test is false and there's no ELSE branch the result is the
     * literal unit.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent result;
        if(((BooleanComponent)(test.evaluate(env))).getBooleanValue())
            result = consequent.evaluate(env);
        else if(alternate != null)
            result = alternate.evaluate(env);
        else
            result = new UnitComponent();
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        if(alternate != null)
            return "if-then-else[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + ", "
                    + alternate.getStringRepresentation() + "]";
        else
            return "if-then[" + test.getStringRepresentation() + ", " + consequent.getStringRepresentation() + "]";
    }
}

