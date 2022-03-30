package flitesharp.unitOfMeasure;

import flitesharp.FLiteSharp;
import io.antlr.gen.FLiteSharpLexer;
import io.antlr.gen.FLiteSharpParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FLiteSharpUnitsOfMeasureCreatorVisitorTest {
    private FLiteSharpUnitsOfMeasureCreatorVisitor visitor;

    private ParseTree getTree(String input) {
        CharStream inputStream = CharStreams.fromString(input);
        FLiteSharpLexer lexer = new FLiteSharpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FLiteSharpParser parser = new FLiteSharpParser(tokens);
        return parser.unitFormula();
    }

    private String getStringFromFile(String path) {
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
        visitor = new FLiteSharpUnitsOfMeasureCreatorVisitor();
    }

    @Test
    public void extensiveTesting() {
        int testNumber = 0;
        String path = "/unitOfMeasure/";
        for(int i=1; i<=testNumber; i++) {
            String input = getStringFromFile(path + "test" + i + ".txt");
            String expectedOutput = getStringFromFile(path + "sol" + i + ".txt");
            String result = getTree(input).accept(visitor).getStringRepresentation();
            assertEquals(expectedOutput, result);
        }
    }
}
