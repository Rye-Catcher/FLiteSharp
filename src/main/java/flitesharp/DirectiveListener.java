package flitesharp;

import io.antlr.gen.FLiteSharpBaseListener;
import io.antlr.gen.FLiteSharpParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class DirectiveListener extends FLiteSharpBaseListener {
    private String getCtxName(ParserRuleContext ctx) {
        String str = ctx.getClass().getName();
        str = str.substring(str.indexOf("$")+1,str.lastIndexOf("Context"));
        str = str.toLowerCase();
        return str;
    }

    private String text = "";

    @Override
    public void enterAddition(FLiteSharpParser.AdditionContext ctx) {
        text += "[" + getCtxName(ctx) + " ";
    }

    @Override
    public void exitAddition(FLiteSharpParser.AdditionContext ctx) {
        text += "]";
    }

    @Override
    public void enterNumber(FLiteSharpParser.NumberContext ctx) {
        text += "[" + getCtxName(ctx) + " " + ctx.getText() + "]";
    }

    public String getText() {
        return text;
    }
}
