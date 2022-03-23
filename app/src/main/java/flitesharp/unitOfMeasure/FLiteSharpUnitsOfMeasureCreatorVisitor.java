package flitesharp.unitOfMeasure;

import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This visitor class explores the tree returned by the parser and constructs the corresponding tree of components. Each
 * node of the constructed tree is a Component representing part of the parsed program.
 */
public class FLiteSharpUnitsOfMeasureCreatorVisitor extends FLiteSharpBaseVisitor<UnitOfMeasure> {

    @Override
    public UnitOfMeasure visitOneUnit(FLiteSharpParser.OneUnitContext ctx) {
        return new UnitOfMeasure();
    }

    @Override
    public UnitOfMeasure visitSingleUnit(FLiteSharpParser.SingleUnitContext ctx) {
        UnitOfMeasureStorage storage = UnitOfMeasureStorage.getStorage();
        return new UnitOfMeasure(storage.getUnit(ctx.VARIABLE().getText().trim()));
    }

    @Override
    public UnitOfMeasure visitParenthesisUnit(FLiteSharpParser.ParenthesisUnitContext ctx) {
        return ctx.unitFormula().accept(this);
    }

    @Override
    public UnitOfMeasure visitExponentialUnit(FLiteSharpParser.ExponentialUnitContext ctx) {
        int exponent = Integer.parseInt(ctx.exp.INTEGER().getText().trim());
        if(ctx.exp.SUB() != null)
            exponent *= -1;
        return ctx.argument.accept(this).computeExponential(exponent);
    }

    @Override
    public UnitOfMeasure visitUnitProduct(FLiteSharpParser.UnitProductContext ctx) {
        return auxiliaryVisitProduct(ctx.unitElement(), ctx.DIV() != null);
    }

    @Override
    public UnitOfMeasure visitUnitFormula(FLiteSharpParser.UnitFormulaContext ctx) {
        UnitOfMeasure toReturn = auxiliaryVisitProduct(ctx.unitElement(), ctx.DIV() != null);
        for(FLiteSharpParser.UnitProductContext p: ctx.unitProduct()) {
            toReturn = toReturn.multiply(p.accept(this));
        }
        return toReturn;
    }

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
