package flitesharp.component.type;

import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;

import java.util.ArrayList;
import java.util.List;

/**
 * This visitor class explores the tree returned by the parser and constructs the corresponding tree of components. Each
 * node of the constructed tree is a Component representing part of the parsed program.
 */
public class FLiteSharpTypesCreatorVisitor extends FLiteSharpBaseVisitor<TypeElement> {

    @Override
    public TypeElement visitPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx) {
        return new TypeElement(TypeName.valueOf(ctx.TYPE().getText().trim()));
    }

    @Override
    public TypeElement visitListType(FLiteSharpParser.ListTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        children.add(ctx.typeDeclaration().accept(this));
        return new TypeElement(TypeName.LIST, children);
    }

    @Override
    public TypeElement visitTupleType(FLiteSharpParser.TupleTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        for(FLiteSharpParser.TypeDeclarationContext context: ctx.typeDeclaration()) {
            children.add(context.accept(this));
        }
        return new TypeElement(TypeName.TUPLE, children);
    }

    @Override
    public TypeElement visitFunctionType(FLiteSharpParser.FunctionTypeContext ctx) {
        List <TypeElement> children = new ArrayList<>();
        for(FLiteSharpParser.TypeDeclarationContext context: ctx.typeDeclaration()) {
            children.add(context.accept(this));
        }
        return new TypeElement(TypeName.FUNC, children);
    }

    @Override
    public TypeElement visitParenthesesType(FLiteSharpParser.ParenthesesTypeContext ctx) {
        return ctx.typeDeclaration().accept(this);
    }

}
