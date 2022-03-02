package flitesharp;

import flitesharp.component.compoundData.CompoundDataComponent;
import flitesharp.component.controlFlow.ConditionalStatementComponent;
import flitesharp.component.controlFlow.CurlyBlockComponent;
import flitesharp.component.controlFlow.ForLoopComponent;
import flitesharp.component.controlFlow.WhileLoopComponent;
import flitesharp.component.controlFlow.*;
import flitesharp.component.environment.NameComponent;
import flitesharp.component.environment.VarDeclarationComponent;
import flitesharp.component.function.ApplicationComponent;
import flitesharp.component.function.FunDeclarationComponent;
import flitesharp.component.function.LambdaExprComponent;
import io.antlr.gen.FLiteSharpBaseVisitor;
import io.antlr.gen.FLiteSharpParser;
import flitesharp.component.*;
import flitesharp.component.literal.*;
import flitesharp.component.operation.*;

import java.util.ArrayList;
import java.util.List;

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
     * @return a CurlyBlockComponent representing a BLOCK of EXPRESSIONS enclosed by curly brackets and possibly empty
     */
    @Override
    public Component visitCurlyBlock(FLiteSharpParser.CurlyBlockContext ctx) {
        if(ctx.sequence == null)
            return new CurlyBlockComponent();
        else
            return new CurlyBlockComponent(ctx.sequence.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a ParenthesesComponent representing a PARENTHESES EXPRESSION
     */
    @Override
    public Component visitParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx) {
        return new ParenthesesComponent(ctx.inner.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a ParenthesesComponent representing a PARENTHESES EXPRESSION
     */
    @Override
    public Component visitBinding(FLiteSharpParser.BindingContext ctx) {
        return new VarDeclarationComponent(
                new NameComponent(ctx.bind().name.getText().trim()),
                ctx.bind().expression().accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a LambdaExprComponent representing a LAMBDA EXPRESSION
     */
    @Override
    public Component visitLambdaFunction(FLiteSharpParser.LambdaFunctionContext ctx) {
        ArrayList<Component> paramsLst = new ArrayList<>();
        ctx.lambdaExpression().lambdaParameters().
                VARIABLE().forEach(
                        var -> paramsLst.add(new NameComponent(var.getText().trim())));
        return new LambdaExprComponent(paramsLst, ctx.lambdaExpression().lambdaBody.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a FunDeclarationComponent representing a FUNCTION DECLARATION
     */
    @Override
    public Component visitFunctionDeclaration(FLiteSharpParser.FunctionDeclarationContext ctx) {
        ArrayList<Component> paramsLst = new ArrayList<>();
        ctx.funcDeclration().params.
                VARIABLE().forEach(
                        var -> paramsLst.add(new NameComponent(var.getText().trim())));
        return new FunDeclarationComponent(
                new NameComponent(ctx.funcDeclration().functionName.getText().trim()),
                paramsLst,
                ctx.funcDeclration().functionBody.accept(this));
    }

    @Override
    public Component visitFuncApplication(FLiteSharpParser.FuncApplicationContext ctx) {
        ArrayList<Component> argumentLst = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.applyParameters().expression()) {
            argumentLst.add(this.visit(expr));
        }
        return new ApplicationComponent(
                new NameComponent(ctx.name.getText().trim()),
                argumentLst);
    }

    /**
     * {@inheritDoc}
     *
     * @return a BlockComponent representing a BLOCK
     */
    @Override
    public Component visitSuite(FLiteSharpParser.SuiteContext ctx) {
        return this.visit(ctx.block());
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
     * @return a LessThanComponent representing the LESSTHAN operation retrieved from ctx
     */
    @Override
    public Component visitLessThan(FLiteSharpParser.LessThanContext ctx) {
        return new LessThanComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a LessThanOrEqualComponent representing the LESSTHANOREQUAL operation retrieved from ctx
     */
    @Override
    public Component visitLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx) {
        return new LessThanOrEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a GreaterThanComponent representing the GREATERTHAN operation retrieved from ctx
     */
    @Override
    public Component visitGreaterThan(FLiteSharpParser.GreaterThanContext ctx) {
        return new GreaterThanComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return an EqualComponent representing the EQUAL operation retrieved from ctx
     */
    @Override
    public Component visitEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx) {
        return new EqualComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a NotEqualComponent representing the NOTEQUAL operation retrieved from ctx
     */
    @Override
    public Component visitNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx) {
        return new NotEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a GreaterThanOrEqualComponent representing the GREATERTHANOREQUAL operation retrieved from ctx
     */
    @Override
    public Component visitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx) {
        return new GreaterThanOrEqualComponent(ctx.left.accept(this), ctx.right.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return an AndComponent representing the AND operation retrieved from ctx
     */
    @Override
    public Component visitAnd(FLiteSharpParser.AndContext ctx) {
        return new AndComponent(ctx.left.accept(this), ctx.right.accept(this));
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
     * @return a NotComponent representing the NOT operation retrieved from ctx
     */
    @Override
    public Component visitNot(FLiteSharpParser.NotContext ctx) {
        return new NotComponent(ctx.argument.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a NameComponent representing the name retrieved from ctx
     */
    @Override
    public Component visitVariable(FLiteSharpParser.VariableContext ctx) {
        return new NameComponent(ctx.getText().trim());
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

    /**
     * {@inheritDoc}
     *
     * @return a ConditionalStatementComponent representing the conditional statement retrieved from ctx
     */
    @Override
    public Component visitConditionalStmt(FLiteSharpParser.ConditionalStmtContext ctx) {
        if(ctx.alternate != null)
            return new ConditionalStatementComponent(ctx.test.accept(this), ctx.consequent.accept(this),
                    ctx.alternate.accept(this));
        else
            return new ConditionalStatementComponent(ctx.test.accept(this), ctx.consequent.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a ConditionalStatementComponent representing the conditional expression retrieved from ctx. The
     * expression is converted into an if-else statement
     */
    @Override
    public Component visitConditionalExpression(FLiteSharpParser.ConditionalExpressionContext ctx) {
        return new ConditionalStatementComponent(ctx.test.accept(this), ctx.consequent.accept(this),
                ctx.alternate.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a WhileLoopComponent representing the while loop retrieved from ctx
     */
    @Override
    public Component visitWhileStatement(FLiteSharpParser.WhileStatementContext ctx) {
        return new WhileLoopComponent(ctx.test.accept(this), ctx.body.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a ForLoopComponent representing the for loop retrieved from ctx
     */
    @Override
    public Component visitForStatement(FLiteSharpParser.ForStatementContext ctx) {
        return new ForLoopComponent(ctx.init.accept(this), ctx.test.accept(this), ctx.increment.accept(this),
                ctx.body.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a ReturnComponent representing a return retrieved from ctx
     */
    @Override
    public Component visitReturn(FLiteSharpParser.ReturnContext ctx) {
        return new ReturnComponent(ctx.returnStmt().returnBody.accept(this));
    }

    /**
     * {@inheritDoc}
     *
     * @return a CompoundDataComponent representing the list declaration retrieved from ctx
     */
    @Override
    public Component visitListExpression(FLiteSharpParser.ListExpressionContext ctx) {
        List <Component> elements = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.expression()) {
            elements.add(expr.accept(this));
        }
        return new CompoundDataComponent(elements, true);
    }

    /**
     * {@inheritDoc}
     *
     * @return a CompoundDataComponent representing the tuple declaration retrieved from ctx
     */
    @Override
    public Component visitTupleExpression(FLiteSharpParser.TupleExpressionContext ctx) {
        List <Component> elements = new ArrayList<>();
        for (FLiteSharpParser.ExpressionContext expr : ctx.expression()) {
            elements.add(expr.accept(this));
        }
        return new CompoundDataComponent(elements, false);
    }
}
