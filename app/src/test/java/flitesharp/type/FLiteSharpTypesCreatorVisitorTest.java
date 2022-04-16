package flitesharp.type;

import flitesharp.FLiteSharp;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Objects;

import static org.junit.Assert.*;

public class FLiteSharpTypesCreatorVisitorTest {
    private FLiteSharpTypesCreatorVisitor visitor;

    private ParseTree getTree(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        return parser.typeDeclaration();
    }

    private String getExpectedResult(String path) {
        InputStream inputStream = Objects.requireNonNull(FLiteSharp.class.getResourceAsStream(path));
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        try {
            return br.readLine();
        } catch (IOException e) {
            fail();
        }
        return "";
    }

    @Before
    public void setUp() {
        visitor = new FLiteSharpTypesCreatorVisitor();
    }

    @Test
    public void extensiveTesting() {
        int testNumber = 4;
        String path = "/type/test";
        for(int i=1; i<=testNumber; i++) {
            String expected = getExpectedResult(path + i + ".txt");
            String result = getTree(expected).accept(visitor).getStringRepresentation();
            assertEquals(result, expected);
        }
    }
}
