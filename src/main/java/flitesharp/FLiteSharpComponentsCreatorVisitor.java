package flitesharp;

import java.util.ArrayList;

import flitesharp.component.BlockComponent;
import flitesharp.component.ParenthesesComponent;
import flitesharp.component.literal.NumberComponent;
import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;
import flitesharp.component.Component;
import flitesharp.component.literal.BooleanComponent;
import flitesharp.component.operation.*;

/**
 * This visitor class explores the tree returned by the parser and constructs the corresponding tree of components. Each
 * node of the constructed tree is a Component representing part of the parsed program.
 */
public class FLiteSharpComponentsCreatorVisitor extends FLiteSharpBaseVisitor<Component> {


    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing a BLOCK
     */
    @Override
    public Component visitStart(FLiteSharpParser.StartContext ctx) {
        return this.visit(ctx.block());
    }

    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing a BLOCK of EXPRESSIONS
     */
    @Override
    public Component visitBlock(FLiteSharpParser.BlockContext ctx) {
        ArrayList<Component> exprLst = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.expression()) {
            exprLst.add(this.visit(expr));
        }
        return new BlockComponent(exprLst);
    }

    /**
     * {@inheritDoc}
     *
     * @return a ParenthesesComponent representing an PARENTHESES EXPRESSION
     */
    @Override
    public Component visitParentheses(FLiteSharpParser.ParenthesesContext ctx) {
        return new ParenthesesComponent(this.visit(ctx.parenthesesExpression().inner));
    }


    /**
     * {@inheritDoc}
     *
     * @return a NegativeComponent representing the NEGATIVE operation retrieved from ctx
     */
    @Override
    public Component visitNegative(FLiteSharpParser.NegativeContext ctx) {
        return new NegativeComponent(ctx.expression().accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a PowerComponent representing the POWER operation retrieved from ctx
     */
    @Override
    public Component visitPower(FLiteSharpParser.PowerContext ctx) {
        return new PowerComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a AdditionComponent representing the ADDITION operation retrieved from ctx
     */
    @Override
    public Component visitAddition(FLiteSharpParser.AdditionContext ctx) {
        return new AdditionComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a SubtractionComponent representing the SUBTRACTION operation retrieved from ctx
     */
    @Override
    public Component visitSubtraction(FLiteSharpParser.SubtractionContext ctx) {
        return new SubtractionComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a MultiplicationComponent representing the MULTIPLICATION operation retrieved from ctx
     */
    @Override
    public Component visitMultiplication(FLiteSharpParser.MultiplicationContext ctx) {
        return new MultiplicationComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a DivisionComponent representing the DIVISION operation retrieved from ctx
     */
    @Override
    public Component visitDivision(FLiteSharpParser.DivisionContext ctx) {
        return new DivisionComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return an OrComponent representing the OR operation retrieved from ctx
     */
    @Override
    public Component visitOr(FLiteSharpParser.OrContext ctx) {
        return new OrComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a BooleanComponent representing the boolean literal retrieved from ctx
     */
    @Override
    public Component visitBoolean(FLiteSharpParser.BooleanContext ctx) {
        return new BooleanComponent(Boolean.parseBoolean(ctx.getText().trim()));
    }

    /**
     * {@inheritDoc}
     *
     * @return a NumberComponent representing the number literal retrieved from ctx
     */
    @Override
    public Component visitNumber(FLiteSharpParser.NumberContext ctx) {
        return new NumberComponent(Double.parseDouble(ctx.getText().trim()));
    }
}
