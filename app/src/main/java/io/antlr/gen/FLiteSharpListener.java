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
	 * Enter a parse tree produced by the {@code RecFunctionDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRecFunctionDeclaration(FLiteSharpParser.RecFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RecFunctionDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRecFunctionDeclaration(FLiteSharpParser.RecFunctionDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnit(FLiteSharpParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnit(FLiteSharpParser.UnitContext ctx);
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
	 * Enter a parse tree produced by the {@code ForInExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterForInExpression(FLiteSharpParser.ForInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInExpression}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitForInExpression(FLiteSharpParser.ForInExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code AdditionSubtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionSubtraction(FLiteSharpParser.AdditionSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionSubtraction}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionSubtraction(FLiteSharpParser.AdditionSubtractionContext ctx);
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
	 * Enter a parse tree produced by the {@code MultiplicationDivision}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationDivision(FLiteSharpParser.MultiplicationDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationDivision}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationDivision(FLiteSharpParser.MultiplicationDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDouble(FLiteSharpParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDouble(FLiteSharpParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitOfMeasureDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnitOfMeasureDeclaration(FLiteSharpParser.UnitOfMeasureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitOfMeasureDeclaration}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnitOfMeasureDeclaration(FLiteSharpParser.UnitOfMeasureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(FLiteSharpParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(FLiteSharpParser.IntegerContext ctx);
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
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FLiteSharpParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link FLiteSharpParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FLiteSharpParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link FLiteSharpParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpression(FLiteSharpParser.BlockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#blockExpression}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpression(FLiteSharpParser.BlockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#sequentialExpression}.
	 * @param ctx the parse tree
	 */
	void enterSequentialExpression(FLiteSharpParser.SequentialExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#sequentialExpression}.
	 * @param ctx the parse tree
	 */
	void exitSequentialExpression(FLiteSharpParser.SequentialExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#sequenceLine}.
	 * @param ctx the parse tree
	 */
	void enterSequenceLine(FLiteSharpParser.SequenceLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#sequenceLine}.
	 * @param ctx the parse tree
	 */
	void exitSequenceLine(FLiteSharpParser.SequenceLineContext ctx);
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
	 * Enter a parse tree produced by {@link FLiteSharpParser#recFuncDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecFuncDeclaration(FLiteSharpParser.RecFuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#recFuncDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecFuncDeclaration(FLiteSharpParser.RecFuncDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link FLiteSharpParser#forInExpr}.
	 * @param ctx the parse tree
	 */
	void enterForInExpr(FLiteSharpParser.ForInExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#forInExpr}.
	 * @param ctx the parse tree
	 */
	void exitForInExpr(FLiteSharpParser.ForInExprContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(FLiteSharpParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(FLiteSharpParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListType(FLiteSharpParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListType(FLiteSharpParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesType(FLiteSharpParser.ParenthesesTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesType(FLiteSharpParser.ParenthesesTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(FLiteSharpParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(FLiteSharpParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveType}
	 * labeled alternative in {@link FLiteSharpParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(FLiteSharpParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#unitDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnitDeclaration(FLiteSharpParser.UnitDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#unitDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnitDeclaration(FLiteSharpParser.UnitDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#unitFormula}.
	 * @param ctx the parse tree
	 */
	void enterUnitFormula(FLiteSharpParser.UnitFormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#unitFormula}.
	 * @param ctx the parse tree
	 */
	void exitUnitFormula(FLiteSharpParser.UnitFormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#unitProduct}.
	 * @param ctx the parse tree
	 */
	void enterUnitProduct(FLiteSharpParser.UnitProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#unitProduct}.
	 * @param ctx the parse tree
	 */
	void exitUnitProduct(FLiteSharpParser.UnitProductContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void enterOneUnit(FLiteSharpParser.OneUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void exitOneUnit(FLiteSharpParser.OneUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisUnit(FLiteSharpParser.ParenthesisUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisUnit(FLiteSharpParser.ParenthesisUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExponentialUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void enterExponentialUnit(FLiteSharpParser.ExponentialUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExponentialUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void exitExponentialUnit(FLiteSharpParser.ExponentialUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUnit(FLiteSharpParser.SingleUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleUnit}
	 * labeled alternative in {@link FLiteSharpParser#unitElement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUnit(FLiteSharpParser.SingleUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLiteSharpParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(FLiteSharpParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLiteSharpParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(FLiteSharpParser.ExponentContext ctx);
}