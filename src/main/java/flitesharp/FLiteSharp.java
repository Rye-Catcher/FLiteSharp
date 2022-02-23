package flitesharp;

import flitesharp.component.Component;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import io.antlr.gen.FLiteSharpVisitor;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class FLiteSharp {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/code.txt";

    private static void processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.start();
        FLiteSharpVisitor<Component> visitor =  new FLiteSharpComponentsCreatorVisitor();
        Component root = visitor.visit(tree);
        System.out.println("Parsed List:\n" + root.getStringRepresentation() + "\n\n"); // That's just for testing purpose
        System.out.println("The evaluate result is:\n" + root.evaluate().getStringRepresentation());
    }

    public static void main(String[] args) throws IOException {
        CharStream inputStream = null;

        try {
            inputStream = CharStreams.fromFileName(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        processAntlr(inputStream);
    }
}
