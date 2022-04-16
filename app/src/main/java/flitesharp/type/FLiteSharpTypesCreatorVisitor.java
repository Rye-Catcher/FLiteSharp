package flitesharp.type;

import flitesharp.unitOfMeasure.FLiteSharpUnitsOfMeasureCreatorVisitor;
import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;

import java.util.ArrayList;
import java.util.List;

/**
 * This visitor class explores the branches of the tree returned by the parser corresponding to a type declaration. Each
 * exploration of a type declaration returns a tree corresponding to the declared type. Each node of the tree is a
 * TypeElement (see TypeElement for further details).
 */
public class FLiteSharpTypesCreatorVisitor extends FLiteSharpBaseVisitor<TypeElement> {
    private final FLiteSharpUnitsOfMeasureCreatorVisitor unitsOfMeasureCreatorVisitor;

    /**
     * Constructs and initialize a new FLiteSharpTypesCreatorVisitor.
     */
    public FLiteSharpTypesCreatorVisitor() {
        super();
        unitsOfMeasureCreatorVisitor = new FLiteSharpUnitsOfMeasureCreatorVisitor();
    }

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to a primitive type
     */
    @Override
    public TypeElement visitPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx) {
        TypeElement type = new TypeElement(TypeName.getTypeName(ctx.TYPE().getText().trim()));
        if((type.getName() == TypeName.INT || type.getName() == TypeName.DOUBLE) && ctx.uom != null)
            type.setUnitOfMeasure(ctx.uom.accept(unitsOfMeasureCreatorVisitor));
        return type;
    }

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to a list type
     */
    @Override
    public TypeElement visitListType(FLiteSharpParser.ListTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        children.add(ctx.typeDeclaration().accept(this));
        return new TypeElement(TypeName.LIST, children);
    }

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to a tuple type
     */
    @Override
    public TypeElement visitTupleType(FLiteSharpParser.TupleTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        children.add(ctx.right.accept(this));
        FLiteSharpParser.TypeDeclarationContext next = ctx.left;
        while(next instanceof FLiteSharpParser.TupleTypeContext){
            children.add(0, ((FLiteSharpParser.TupleTypeContext) next).right.accept(this));
            next = ((FLiteSharpParser.TupleTypeContext) next).left;
        }
        children.add(0,next.accept(this));
        return new TypeElement(TypeName.TUPLE, children);
    }

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to a function type
     */
    @Override
    public TypeElement visitFunctionType(FLiteSharpParser.FunctionTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        children.add(ctx.right.accept(this));
        FLiteSharpParser.TypeDeclarationContext next = ctx.left;
        while(next instanceof FLiteSharpParser.FunctionTypeContext){
            children.add(0, ((FLiteSharpParser.FunctionTypeContext) next).right.accept(this));
            next = ((FLiteSharpParser.FunctionTypeContext) next).left;
        }
        children.add(0,next.accept(this));
        return new TypeElement(TypeName.FUNC, children);
    }

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to the type enclosed by the parentheses
     */
    @Override
    public TypeElement visitParenthesesType(FLiteSharpParser.ParenthesesTypeContext ctx) {
        return ctx.typeDeclaration().accept(this);
    }

}
