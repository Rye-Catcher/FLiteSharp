package flitesharp;

import flitesharp.component.Component;

import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import io.antlr.gen.FLiteSharpVisitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class FLiteSharp {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/code.txt";

    private static void processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.start();
        FLiteSharpVisitor<Component> visitor = (FLiteSharpVisitor<Component>) new FLiteSharpComponentsCreatorVisitor();
        Component root = visitor.visit(tree);
        System.out.println("Parsed string:\n" + root.getStringRepresentation()); // That's just for testing purpose
        System.out.println("Evaluate Result:\n" + root.evaluate().getStringRepresentation());
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