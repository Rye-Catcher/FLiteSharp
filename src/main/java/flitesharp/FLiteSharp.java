package flitesharp;

import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class FLiteSharp {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/code.txt";

    private static void processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.expression();
        DirectiveListener extractor = new DirectiveListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
        System.out.println(extractor.getText());
    }

    public static void main(String[] args) throws IOException {
        CharStream inputStream = null;

        try {
            inputStream = CharStreams.fromFileName(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        processAntlr(inputStream);
        return ;
    }
}