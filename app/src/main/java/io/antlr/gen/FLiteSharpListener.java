// Generated from FLiteSharp.g4 by ANTLR 4.9.3

    package io.antlr.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FLiteSharpParser}.
 */
public interface FLiteSharpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FLiteSharpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FLiteSharpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FLiteSharpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FLiteSharpParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#blockLine}.
	 * @param ctx the parse tree
	 */
	void enterBlockLine(FLiteSharpParser.BlockLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#blockLine}.
	 * @param ctx the parse tree
	 */
	void exitBlockLine(FLiteSharpParser.BlockLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(FLiteSharpParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(FLiteSharpParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FLiteSharpParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FLiteSharpParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(FLiteSharpParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(FLiteSharpParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplication(FLiteSharpParser.FunctionApplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplication(FLiteSharpParser.FunctionApplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(FLiteSharpParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(FLiteSharpParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(FLiteSharpParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(FLiteSharpParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(FLiteSharpParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(FLiteSharpParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(FLiteSharpParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(FLiteSharpParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(FLiteSharpParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(FLiteSharpParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code List}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterList(FLiteSharpParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code List}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitList(FLiteSharpParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(FLiteSharpParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(FLiteSharpParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(FLiteSharpParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(FLiteSharpParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(FLiteSharpParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(FLiteSharpParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(FLiteSharpParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(FLiteSharpParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(FLiteSharpParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(FLiteSharpParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attach}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttach(FLiteSharpParser.AttachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attach}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttach(FLiteSharpParser.AttachContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(FLiteSharpParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(FLiteSharpParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaFunction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(FLiteSharpParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaFunction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(FLiteSharpParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(FLiteSharpParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(FLiteSharpParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(FLiteSharpParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(FLiteSharpParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Concatenate}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenate(FLiteSharpParser.ConcatenateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Concatenate}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenate(FLiteSharpParser.ConcatenateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FLiteSharpParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FLiteSharpParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(FLiteSharpParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(FLiteSharpParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tuple}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple(FLiteSharpParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tuple}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple(FLiteSharpParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower(FLiteSharpParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower(FLiteSharpParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForToExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterForToExpression(FLiteSharpParser.ForToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForToExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitForToExpression(FLiteSharpParser.ForToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(FLiteSharpParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(FLiteSharpParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(FLiteSharpParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(FLiteSharpParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(FLiteSharpParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(FLiteSharpParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(FLiteSharpParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(FLiteSharpParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(FLiteSharpParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(FLiteSharpParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#applyParameters}.
	 * @param ctx the parse tree
	 */
	void enterApplyParameters(FLiteSharpParser.ApplyParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#applyParameters}.
	 * @param ctx the parse tree
	 */
	void exitApplyParameters(FLiteSharpParser.ApplyParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void enterFuncApplication(FLiteSharpParser.FuncApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#funcApplication}.
	 * @param ctx the parse tree
	 */
	void exitFuncApplication(FLiteSharpParser.FuncApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#bind}.
	 * @param ctx the parse tree
	 */
	void enterBind(FLiteSharpParser.BindContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#bind}.
	 * @param ctx the parse tree
	 */
	void exitBind(FLiteSharpParser.BindContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(FLiteSharpParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#conditionalExpr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(FLiteSharpParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(FLiteSharpParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(FLiteSharpParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#forToExpr}.
	 * @param ctx the parse tree
	 */
	void enterForToExpr(FLiteSharpParser.ForToExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#forToExpr}.
	 * @param ctx the parse tree
	 */
	void exitForToExpr(FLiteSharpParser.ForToExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#curlyBlock}.
	 * @param ctx the parse tree
	 */
	void enterCurlyBlock(FLiteSharpParser.CurlyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#curlyBlock}.
	 * @param ctx the parse tree
	 */
	void exitCurlyBlock(FLiteSharpParser.CurlyBlockContext ctx);
}