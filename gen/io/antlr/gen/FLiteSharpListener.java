// Generated from F:/Github repos/CS4215 project/FLiteSharp/src/main/resources/parser\FLiteSharp.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by the {@code EqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx);
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
	 * Enter a parse tree produced by the {@code NotEqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualPhysical}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx);
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
	 * Enter a parse tree produced by {@link FLiteSharpParser#tuple_continue}.
	 * @param ctx the parse tree
	 */
	void enterTuple_continue(FLiteSharpParser.Tuple_continueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#tuple_continue}.
	 * @param ctx the parse tree
	 */
	void exitTuple_continue(FLiteSharpParser.Tuple_continueContext ctx);
}