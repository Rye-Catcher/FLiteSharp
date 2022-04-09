package flitesharp.unitOfMeasure;

import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;

import java.util.List;

/**
 * This visitor class explores the branches of the tree returned by the parser corresponding to a units of measure
 * formula. Each exploration of a formula returns a unit of measure corresponding to the formula.
 */
public class FLiteSharpUnitsOfMeasureCreatorVisitor extends FLiteSharpBaseVisitor<UnitOfMeasure> {

    /**
     * {@inheritDoc}
     *
     * @return a unit of measure representing a non-dimensional quantity
     */
    @Override
    public UnitOfMeasure visitOneUnit(FLiteSharpParser.OneUnitContext ctx) {
        return new UnitOfMeasure();
    }

    /**
     * {@inheritDoc}
     *
     * @return a primitive unit of measure
     */
    @Override
    public UnitOfMeasure visitSingleUnit(FLiteSharpParser.SingleUnitContext ctx) {
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        return new UnitOfMeasure(storage.getUnit(ctx.VARIABLE().getText().trim()));
    }

    /**
     * {@inheritDoc}
     *
     * @return the unit of measure corresponding to the formula enclosed in the parentheses
     */
    @Override
    public UnitOfMeasure visitParenthesisUnit(FLiteSharpParser.ParenthesisUnitContext ctx) {
        return ctx.unitFormula().accept(this);
    }

    /**
     * {@inheritDoc}
     *
     * @return a unit of measure corresponding to the exponentiation of a formula
     */
    @Override
    public UnitOfMeasure visitExponentialUnit(FLiteSharpParser.ExponentialUnitContext ctx) {
        int exponent = Integer.parseInt(ctx.exp.INTEGER().getText().trim());
        if(ctx.exp.SUB() != null)
            exponent *= -1;
        return ctx.argument.accept(this).computeExponential(exponent);
    }

    /**
     * {@inheritDoc}
     *
     * @return the unit of measure corresponding to the multiplication or division of a sequence of formulas
     */
    @Override
    public UnitOfMeasure visitUnitProduct(FLiteSharpParser.UnitProductContext ctx) {
        return auxiliaryVisitProduct(ctx.unitElement(), ctx.DIV() != null);
    }

    /**
     * {@inheritDoc}
     *
     * @return the unit of measure corresponding to the implicit product of the top-level sequence of formulas
     */
    @Override
    public UnitOfMeasure visitUnitFormula(FLiteSharpParser.UnitFormulaContext ctx) {
        UnitOfMeasure toReturn = auxiliaryVisitProduct(ctx.unitElement(), ctx.DIV() != null);
        for(FLiteSharpParser.UnitProductContext p: ctx.unitProduct()) {
            toReturn = toReturn.multiply(p.accept(this));
        }
        return toReturn;
    }

    /**
     * Returns the multiplication of a sequence of formulas or of their reciprocal.
     * @param elements the sequence of formulas
     * @param div true if the reciprocal of each formula should be used in the multiplication; false otherwise
     * @return the multiplication of a sequence of formulas or of their reciprocal
     */
    private UnitOfMeasure auxiliaryVisitProduct(List<FLiteSharpParser.UnitElementContext> elements, boolean div) {
        UnitOfMeasure toReturn = new UnitOfMeasure();
        for(FLiteSharpParser.UnitElementContext e: elements) {
            toReturn = toReturn.multiply(e.accept(this));
        }
        if(div)
            return toReturn.computeExponential(-1);
        return toReturn;
    }

}
