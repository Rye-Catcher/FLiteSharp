package flitesharp.component;

import java.util.List;

import flitesharp.component.data.DataComponent;
import flitesharp.component.environment.EnvFrame;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.function.FunDeclarationComponent;
import flitesharp.component.literal.UndefinedComponent;
import flitesharp.exception.compilingException.CompilingException;
import flitesharp.type.TypeElement;
import flitesharp.type.TypeName;


/**
 * A component representing a BLOCK.
 * By default, the result of the corresponding program is the result of the last EXPRESSION in this BLOCK.
 */
public class BlockComponent extends Component {
    private final List<Component> exprs;

    /**
     * Constructs a new BlockComponent representing a BLOCK of expressions.
     * @param exprs component representing EXPRESSIONS in the BLOCK
     */
    public BlockComponent(List<Component> exprs) {
        this.exprs = exprs;
    }

    /**
     * {@inheritDoc}
     *
     * @return the type of the last expression in the block
     */
    @Override
    public TypeElement checkType(EnvFrame env) throws CompilingException {
        TypeElement result = null;
        EnvFrame newEnv = scanDeclarations(env);

        for (Component expr : exprs) {
            result = expr.checkType(newEnv);
        }
        this.setType(result);
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
        EnvFrame newEnv = scanDeclarations(env);

        for (Component expr: exprs) {
            result = expr.evaluate(newEnv);
        }
        return result;
    }

    /**
     * Scans all the expressions in the block looking for variable and function declarations. It extends the given
     * environment by adding all the declared names found in the block.
     * @param env the environment to be extended
     * @return the extended environment
     */
    private EnvFrame scanDeclarations(EnvFrame env) {
        EnvFrame newEnv = env.extend();
        for (Component expr: exprs) {
            if (expr instanceof VarDeclarationComponent) {
                newEnv.addNewBinds(
                        ((VarDeclarationComponent) expr).getNameStr(),
                        new TypeElement(TypeName.UNDEFINED), new UndefinedComponent());
            } else if (expr instanceof FunDeclarationComponent) {
                newEnv.addNewBinds(
                        ((FunDeclarationComponent) expr).getNameStr(),
                        new TypeElement(TypeName.UNDEFINED), new UndefinedComponent());
            }
        }
        return newEnv;
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
