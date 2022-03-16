package flitesharp.component;

import java.util.ArrayList;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.function.FunDeclarationComponent;
import flitesharp.component.function.RecFunDeclarationComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;
import flitesharp.type.exception.IllegalTypeException;


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
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws IllegalTypeException {
        TypeElement result = null;
        EnvFrame newEnv = env.extend();

        for (Component expr: exprs) {
            if (expr instanceof VarDeclarationComponent) {
                newEnv.addNewBinds(
                        ((VarDeclarationComponent) expr).getNameStr(),
                        new TypeElement(TypeName.UNIT), new UndefinedComponent());
            } else if (expr instanceof FunDeclarationComponent) {
                newEnv.addNewBinds(
                        ((FunDeclarationComponent) expr).getNameStr(),
                        null, new UndefinedComponent());
            } else if (expr instanceof RecFunDeclarationComponent) {
                newEnv.addNewBinds(
                        ((RecFunDeclarationComponent) expr).getNameStr(),
                        null, new UndefinedComponent());
            }
        }

        for (Component expr : exprs) {
            result = expr.checkType(newEnv);
        }

        return result;
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
                newEnv.addNewBinds(
                        ((VarDeclarationComponent) expr).getNameStr(),
                        null, new UndefinedComponent());
            } else if (expr instanceof FunDeclarationComponent) {
                newEnv.addNewBinds(
                        ((FunDeclarationComponent) expr).getNameStr(),
                        null, new UndefinedComponent());
            } else if (expr instanceof  RecFunDeclarationComponent) {
                newEnv.addNewBinds(
                        ((RecFunDeclarationComponent) expr).getNameStr(),
                        null, new UndefinedComponent());
            }
        }

        for (Component expr: exprs) {
            result = expr.evaluate(newEnv);
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
