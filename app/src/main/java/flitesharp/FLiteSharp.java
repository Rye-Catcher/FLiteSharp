package flitesharp;

import flitesharp.component.Component;

import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.CompilingException;
import flitesharp.type.TypeElement;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import io.antlr.gen.FLiteSharpVisitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class FLiteSharp {

    private static Component processAntlr(CharStream inputStream) {
        ThrowingErrorListener errorListener = ThrowingErrorListener.getInstance();
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.start();
        FLiteSharpVisitor<Component> visitor = new FLiteSharpComponentsCreatorVisitor();

        return visitor.visit(tree);
    }

    private static Component processIO(String fileName) {
        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromStream(
                    Objects.requireNonNull(FLiteSharp.class.getResourceAsStream("/" + fileName)));
            //inputStream = CharStreams.fromFileName(FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return processAntlr(inputStream);
    }

    private static void evaluate(Component root) {

        EnvFrame initEnv = new EnvFrame();

        // System.out.println("Parsed string:\n" + root.getStringRepresentation());
        System.out.println("Evaluate Result:\n" + root.evaluate(initEnv).getStringRepresentation());
    }

    private static void typeCheck(Component root) throws CompilingException {

        EnvFrame initEnv = new EnvFrame(null, new HashMap<>());

        // System.out.println("Parsed string:\n" + root.getStringRepresentation());
        TypeElement type = root.checkType(initEnv);
        // System.out.println("Type Check Result:\n" + type.getStringRepresentation());
    }

    public static void main(String[] args) {
        Component root;
        try {
            root = processIO("type.txt");
        }
        catch (ParseCancellationException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            typeCheck(root);
        }
        catch (CompilingException e) {
            System.out.println(e.getMessage());
            return;
        }
        evaluate(root);
    }
}