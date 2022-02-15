// Generated from /Users/xiaoteng/Codes/CS4215/FLiteSharp/src/main/resources/parser/FLiteSharp.g4 by ANTLR 4.9.2
package io.antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FLiteSharpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, POW=3, MUL=4, DIV=5, ADD=6, SUB=7, LESSTHAN=8, LESSTHANOREQUAL=9, 
		GREATERTHAN=10, GREATERTHANOREQUAL=11, EQUALPHYS=12, NOTEQUALPHYS=13, 
		OR=14, AND=15, NOT=16, NUMBER=17, WS=18, TOSKIP=19, BOOLEAN=20, SEMICOLON=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", 
			"GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", 
			"AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "'not'", null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", 
			"GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", 
			"AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FLiteSharpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FLiteSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\6\22X\n\22\r\22\16\22Y\3\22\5\22]\n\22\3\22\6\22"+
		"`\n\22\r\22\16\22a\3\22\6\22e\n\22\r\22\16\22f\3\22\7\22j\n\22\f\22\16"+
		"\22m\13\22\5\22o\n\22\3\23\6\23r\n\23\r\23\16\23s\3\24\6\24w\n\24\r\24"+
		"\16\24x\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0086"+
		"\n\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\5\3\2\62;\3\2"+
		"\"\"\4\2\13\f\17\17\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r"+
		"8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2"+
		"\31F\3\2\2\2\33I\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!R\3\2\2\2#n\3\2\2\2%"+
		"q\3\2\2\2\'v\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-.\7*\2\2.\4\3\2\2\2"+
		"/\60\7+\2\2\60\6\3\2\2\2\61\62\7,\2\2\62\63\7,\2\2\63\b\3\2\2\2\64\65"+
		"\7,\2\2\65\n\3\2\2\2\66\67\7\61\2\2\67\f\3\2\2\289\7-\2\29\16\3\2\2\2"+
		":;\7/\2\2;\20\3\2\2\2<=\7>\2\2=\22\3\2\2\2>?\7>\2\2?@\7?\2\2@\24\3\2\2"+
		"\2AB\7@\2\2B\26\3\2\2\2CD\7@\2\2DE\7?\2\2E\30\3\2\2\2FG\7?\2\2GH\7?\2"+
		"\2H\32\3\2\2\2IJ\7#\2\2JK\7?\2\2K\34\3\2\2\2LM\7~\2\2MN\7~\2\2N\36\3\2"+
		"\2\2OP\7(\2\2PQ\7(\2\2Q \3\2\2\2RS\7p\2\2ST\7q\2\2TU\7v\2\2U\"\3\2\2\2"+
		"VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zo\3\2\2\2[]\7/\2\2"+
		"\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2bd\3\2\2\2ce\7\60\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gk\3\2\2\2hj\t\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2"+
		"\2\2mk\3\2\2\2nW\3\2\2\2n\\\3\2\2\2o$\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3"+
		"\2\2\2sq\3\2\2\2st\3\2\2\2t&\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2xv\3"+
		"\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\24\2\2{(\3\2\2\2|}\7v\2\2}~\7t\2\2~\177"+
		"\7w\2\2\177\u0086\7g\2\2\u0080\u0081\7h\2\2\u0081\u0082\7c\2\2\u0082\u0083"+
		"\7n\2\2\u0083\u0084\7u\2\2\u0084\u0086\7g\2\2\u0085|\3\2\2\2\u0085\u0080"+
		"\3\2\2\2\u0086*\3\2\2\2\u0087\u0088\7=\2\2\u0088,\3\2\2\2\f\2Y\\afkns"+
		"x\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}