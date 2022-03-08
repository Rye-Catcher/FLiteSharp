package flitesharp.type;

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

    /**
     * {@inheritDoc}
     *
     * @return a TypeElement corresponding to a primitive type
     */
    @Override
    public TypeElement visitPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx) {
        return new TypeElement(TypeName.getTypeName(ctx.TYPE().getText().trim()));
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
        for(FLiteSharpParser.TypeDeclarationContext context: ctx.typeDeclaration()) {
            children.add(context.accept(this));
        }
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
        for(FLiteSharpParser.TypeDeclarationContext context: ctx.typeDeclaration()) {
            children.add(context.accept(this));
        }
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
