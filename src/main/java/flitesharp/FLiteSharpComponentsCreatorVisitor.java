package main.java.flitesharp;

import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;
import main.java.flitesharp.component.Component;
import main.java.flitesharp.component.literal.BooleanComponent;
import main.java.flitesharp.component.operation.OrComponent;

public class FLiteSharpComponentsCreatorVisitor extends FLiteSharpBaseVisitor<Component> {

    @Override
    public Component visitBoolean(FLiteSharpParser.BooleanContext ctx) {
        return new BooleanComponent(Boolean.parseBoolean(ctx.getText().trim()));
    }

    @Override
    public Component visitOr(FLiteSharpParser.OrContext ctx) {
        return new OrComponent(ctx.left.accept(this), ctx.right.accept(this));
    }


}
