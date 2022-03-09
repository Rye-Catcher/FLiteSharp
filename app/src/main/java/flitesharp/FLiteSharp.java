package flitesharp;

import flitesharp.component.Component;

import flitesharp.component.environment.EnvFrame;
import flitesharp.primitive.PrimitiveValue;
import flitesharp.type.exception.IllegalTypeException;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import io.antlr.gen.FLiteSharpVisitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class FLiteSharp {
    private static final String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/code.txt";

    private static Component processAntlr(CharStream inputStream) {
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        ParseTree tree = parser.start();
        FLiteSharpVisitor<Component> visitor = new FLiteSharpComponentsCreatorVisitor();
        Component root = visitor.visit(tree);

        return root;
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

    private static void evaluate() {
        Component root = processIO("code.txt");

        EnvFrame initEnv = new EnvFrame(null, new HashMap<>());
        PrimitiveValue.loadPrimitiveVals();
        initEnv.loadBindings(PrimitiveValue.getPrimitiveVals());

        System.out.println("Parsed string:\n" + root.getStringRepresentation());
        System.out.println("Evaluate Result:\n" + root.evaluate(initEnv).getStringRepresentation());
    }

    private static void typeCheck() throws IllegalTypeException {
        Component root = processIO("type.txt");

        EnvFrame initEnv = new EnvFrame(null, new HashMap<>());
        PrimitiveValue.loadPrimitiveVals();
        initEnv.loadBindings(PrimitiveValue.getPrimitiveVals());

        System.out.println("Parsed string:\n" + root.getStringRepresentation());
        System.out.println("Evaluate Result:\n" + root.checkType(initEnv).getName());
    }

    public static void main(String[] args) throws IOException, IllegalTypeException {
        //evaluate();
        typeCheck();
    }
}