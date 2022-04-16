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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FLiteSharp is the main class of the interpreter. It reads the input, parses it and does the type checking and
 * evaluation. It also manages the exceptions thrown by visitors and components.
 */
public class FLiteSharp {

    /**
     * Parses the source code and creates the tree of components representing the program.
     * @param inputStream the stream of characters containing the input to parse
     * @return the root of the components' tree if no error occurs; null otherwise
     */
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

    /**
     * Reads and parses the source code and creates the tree of components representing the program.
     * @param fileName the path of the file containing the source code
     * @return the root of the components' tree if no error occurs while reading or parsing; null otherwise. It also
     * returns null if the given input file is not found
     */
    private static Component processIO(String fileName) {
        CharStream inputStream;
        //ClassLoader classLoader = FLiteSharp.class.getClassLoader();
        //File file = new File(classLoader.getResource(fileName).getFile());
        try {
            inputStream = CharStreams.fromStream(new FileInputStream(fileName));
            //inputStream = CharStreams.fromStream(new FileInputStream(file));
        } catch (IOException | NullPointerException e) {
            System.err.println("Unable to read input file");
            return null;
        }
        return processAntlr(inputStream);
    }

    /**
     * Evaluates the program and prints its result.
     * @param root the root of the components' tree representing the program
     */
    private static void evaluate(Component root) {
        EnvFrame initEnv = new EnvFrame();
        System.out.println("Evaluated Result:");
        root.evaluate(initEnv).prettyPrint();
        System.out.println();
    }

    /**
     * Performs the type checking of the program.
     * @param root the root of the components' tree representing the program
     */
    private static void typeCheck(Component root) throws CompilingException {
        EnvFrame initEnv = new EnvFrame();
        root.checkType(initEnv);
    }

    /**
     * The main method to be run by the jar. It coordinates the phases of the interpreter and manages exceptions.
     * @param args the standard main arguments. Expects the first argument to be the path to the input file
     */
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