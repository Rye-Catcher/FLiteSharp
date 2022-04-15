package flitesharp;

import flitesharp.component.Component;

import flitesharp.component.environment.EnvFrame;
import flitesharp.exception.compilingException.CompilingException;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import io.antlr.gen.FLiteSharpVisitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

public class FLiteSharp {

    private static Component processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.start();
        if(parser.getNumberOfSyntaxErrors() > 0) {
            return null;
        }
        FLiteSharpVisitor<Component> visitor = new FLiteSharpComponentsCreatorVisitor();
        return visitor.visit(tree);
    }

    private static Component processIO(String fileName) {
        CharStream inputStream;
        try {
            inputStream = CharStreams.fromStream(new FileInputStream(fileName));
        } catch (IOException | NullPointerException e) {
            System.err.println("Unable to read input file");
            return null;
        }
        return processAntlr(inputStream);
    }

    private static void evaluate(Component root) {
        EnvFrame initEnv = new EnvFrame();
        System.out.println("Evaluate Result:\n" + root.evaluate(initEnv).getStringRepresentation());
    }

    private static void typeCheck(Component root) throws CompilingException {
        EnvFrame initEnv = new EnvFrame();
        root.checkType(initEnv);
    }

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Missing source file! Please specify an input file");
            return;
        }
        String path = args[0];
        Component root;
        try {
            root = processIO(path);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            return;
        }
        if(root == null)
            return;
        try {
            typeCheck(root);
        } catch (CompilingException e) {
            System.err.println(e.getMessage());
            return;
        }
        try {
            evaluate(root);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}