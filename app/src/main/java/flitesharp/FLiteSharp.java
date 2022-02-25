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
import java.util.ArrayList;
import java.util.Arrays;

public class FLiteSharp {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/code.txt";

    private static String unparse(String res) {
        ArrayList<String> lst = new ArrayList<>();

        lst = new ArrayList<String>(Arrays.asList(res.trim().substring(1, res.length() - 1).split(",")));

        return lst.get(1);
    }

    private static void processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.start();
        FLiteSharpVisitor<Component> visitor = new FLiteSharpComponentsCreatorVisitor();
        Component root = visitor.visit(tree);
        System.out.println("Parsed string:\n" + root.getStringRepresentation());
        System.out.println("\nEvaluation Result:\n" + unparse(root.evaluate().getStringRepresentation()));
    }

    public static void main(String[] args) throws IOException {
        CharStream inputStream = null;

        try {
            inputStream = CharStreams.fromStream(FLiteSharp.class.getResourceAsStream("/" + args[0]));
            //inputStream = CharStreams.fromStream(FLiteSharp.class.getResourceAsStream("/code.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        processAntlr(inputStream);
    }
}