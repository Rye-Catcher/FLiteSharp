package flitesharp.component;

import java.util.ArrayList;

import flitesharp.component.controlFlow.ReturnComponent;
import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.function.FunDeclarationComponent;
import flitesharp.component.literal.UndefinedComponent;


/**
 * A component representing a BLOCK
 * By default, the result of the corresponding program is the result of the last EXPRESSION in this BLOCK.
 */
public class BlockComponent extends Component {
    private final ArrayList<Component> exprs;
    /**
     * Constructs a new BlockComponent representing a BLOCK of expressions.
     * @param exprs component representing EXPRESSIONS in the BLOCK
     */
    public BlockComponent(ArrayList<Component> exprs) {
        this.exprs = exprs;
    }

    /**
     * {@inheritDoc}
     *
     * <p>By default, the program result of a BLOCK is the result of the last EXPRESSION in the BLOCK.</p>
     */
    @Override
    public DataComponent evaluate(EnvFrame env) {
        DataComponent result = null;
        EnvFrame newEnv = env.extend();

        for (Component expr: exprs) {
            if (expr instanceof VarDeclarationComponent) {
                newEnv.addNewBinds(((VarDeclarationComponent) expr).getNameStr(), new UndefinedComponent());
            } else if (expr instanceof FunDeclarationComponent) {
                newEnv.addNewBinds(((FunDeclarationComponent) expr).getNameStr(), new UndefinedComponent());
            }
        }

        for (Component expr: exprs) {
            if (expr instanceof ReturnComponent tmp) {
                result = tmp.evaluate(newEnv);
                break;
            } else {
                result = expr.evaluate(newEnv);
            }
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getStringRepresentation() {
        StringBuilder blockStr = new StringBuilder("Block[\n");
        for (Component expr: exprs) {
            blockStr.append("\t").append(expr.getStringRepresentation());

            if (exprs.indexOf(expr) != (exprs.size() - 1)) {
                blockStr.append(",\n");
            }
        }
        blockStr.append("]");
        return blockStr.toString();
    }
}
