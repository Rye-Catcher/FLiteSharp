package flitesharp;

import io.antlr.gen.FLiteSharpListener;
import io.antlr.gen.FLiteSharpParser;

public interface EvalListener extends FLiteSharpListener {
    void enterStart(FLiteSharpParser.StartContext ctx);
    void exitStart(FLiteSharpParser.StartContext ctx);
    void enterMultiplication(FLiteSharpParser.MultiplicationContext ctx);
    void exitMultiplication(FLiteSharpParser.MultiplicationContext ctx);
    void enterAddition(FLiteSharpParser.AdditionContext ctx);
    void enterOr(FLiteSharpParser.OrContext ctx);
    void exitOr(FLiteSharpParser.OrContext ctx);
    void enterLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx);
    void exitLessThanOrEqual(FLiteSharpParser.LessThanOrEqualContext ctx);
    void enterGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
    void exitGreaterThanOrEqual(FLiteSharpParser.GreaterThanOrEqualContext ctx);
    void enterNot(FLiteSharpParser.NotContext ctx);
    void exitNot(FLiteSharpParser.NotContext ctx);
    void enterLessThan(FLiteSharpParser.LessThanContext ctx);
    void exitLessThan(FLiteSharpParser.LessThanContext ctx);
    void enterEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx);
    void exitEqualPhysical(FLiteSharpParser.EqualPhysicalContext ctx);
    void enterSubtraction(FLiteSharpParser.SubtractionContext ctx);
    void exitSubtraction(FLiteSharpParser.SubtractionContext ctx);
    void enterNumber(FLiteSharpParser.NumberContext ctx);
    void exitNumber(FLiteSharpParser.NumberContext ctx);
    void enterGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
    void exitGreaterThan(FLiteSharpParser.GreaterThanContext ctx);
    void enterNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx);
    void exitNotEqualPhysical(FLiteSharpParser.NotEqualPhysicalContext ctx);
    void enterAnd(FLiteSharpParser.AndContext ctx);
    void exitAnd(FLiteSharpParser.AndContext ctx);
    void enterDivision(FLiteSharpParser.DivisionContext ctx);
    void exitDivision(FLiteSharpParser.DivisionContext ctx);
    void enterBoolean(FLiteSharpParser.BooleanContext ctx);
    void exitBoolean(FLiteSharpParser.BooleanContext ctx);
    void enterParentheses(FLiteSharpParser.ParenthesesContext ctx);
    void exitParentheses(FLiteSharpParser.ParenthesesContext ctx);
    void enterPower(FLiteSharpParser.PowerContext ctx);
    void exitPower(FLiteSharpParser.PowerContext ctx);
    void enterParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx);
    void exitParenthesesExpression(FLiteSharpParser.ParenthesesExpressionContext ctx);
    void exitAddition(FLiteSharpParser.AdditionContext ctx);
}
