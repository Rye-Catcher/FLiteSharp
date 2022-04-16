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
	 * Visit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(FLiteSharpParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(FLiteSharpParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(FLiteSharpParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(FLiteSharpParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code List}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FLiteSharpParser.ListContext ctx);
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
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(FLiteSharpParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionSubtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionSubtraction(FLiteSharpParser.AdditionSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attach}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach(FLiteSharpParser.AttachContext ctx);
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
	 * Visit a parse tree produced by the {@code MultiplicationDivision}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationDivision(FLiteSharpParser.MultiplicationDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(FLiteSharpParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(FLiteSharpParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(FLiteSharpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Concatenate}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenate(FLiteSharpParser.ConcatenateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FLiteSharpParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FLiteSharpParser.BlockContext ctx);
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
	 * Visit a parse tree produced by {@link FLiteSharpParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(FLiteSharpParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#sequentialExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialExpression(FLiteSharpParser.SequentialExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#sequenceLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceLine(FLiteSharpParser.SequenceLineContext ctx);
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
	 * Visit a parse tree produced by {@link FLiteSharpParser#recFuncDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecFuncDeclaration(FLiteSharpParser.RecFuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(FLiteSharpParser.FuncDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link FLiteSharpParser#conditionalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(FLiteSharpParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(FLiteSharpParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(FLiteSharpParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesType(FLiteSharpParser.ParenthesesTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleType(FLiteSharpParser.TupleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#unitDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitDeclaration(FLiteSharpParser.UnitDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#unitFormula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitFormula(FLiteSharpParser.UnitFormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#unitProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitProduct(FLiteSharpParser.UnitProductContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneUnit(FLiteSharpParser.OneUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisUnit(FLiteSharpParser.ParenthesisUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponentialUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentialUnit(FLiteSharpParser.ExponentialUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleUnit(FLiteSharpParser.SingleUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLiteSharpParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(FLiteSharpParser.ExponentContext ctx);
}