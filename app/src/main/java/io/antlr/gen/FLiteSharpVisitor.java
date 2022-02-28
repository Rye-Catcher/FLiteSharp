// Generated from FLiteSharp.g4 by ANTLR 4.9.3

    package io.antlr.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FLiteSharpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FLiteSharpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FLiteSharpParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FLiteSharpParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(FLiteSharpParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FLiteSharpParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(FLiteSharpParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionApplication}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApplication(FLiteSharpParser.FunctionApplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalStatement}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(FLiteSharpParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(FLiteSharpParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(FLiteSharpParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(FLiteSharpParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(FLiteSharpParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code List}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FLiteSharpParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(FLiteSharpParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(FLiteSharpParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(FLiteSharpParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(FLiteSharpParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionReturn}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(FLiteSharpParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(FLiteSharpParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(FLiteSharpParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(FLiteSharpParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaFunction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(FLiteSharpParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(FLiteSharpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(FLiteSharpParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FLiteSharpParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(FLiteSharpParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tuple}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(FLiteSharpParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(FLiteSharpParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#parenthesesExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#tupleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExpression(FLiteSharpParser.TupleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(FLiteSharpParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(FLiteSharpParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(FLiteSharpParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#funcDeclration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclration(FLiteSharpParser.FuncDeclrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(FLiteSharpParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(FLiteSharpParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#applyParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyParameters(FLiteSharpParser.ApplyParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#funcApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncApplication(FLiteSharpParser.FuncApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#bind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind(FLiteSharpParser.BindContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#conditionalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStmt(FLiteSharpParser.ConditionalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FLiteSharpParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(FLiteSharpParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#curlyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurlyBlock(FLiteSharpParser.CurlyBlockContext ctx);
}