// Generated from C:/Users/mzzsm/Desktop/Programming Language Implementation/Project/FLiteSharp/src/main/resources/parser\FLiteSharp.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, POW=12, MUL=13, DIV=14, ADD=15, SUB=16, LESSTHAN=17, 
		LESSTHANOREQUAL=18, GREATERTHAN=19, GREATERTHANOREQUAL=20, EQUALPHYS=21, 
		NOTEQUALPHYS=22, OR=23, AND=24, NOT=25, TERNARYOP=26, NUMBER=27, WS=28, 
		TOSKIP=29, BOOLEAN=30, SEMICOLON=31, IF=32, ELSE=33, VARIABLE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", 
			"GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", 
			"AND", "NOT", "TERNARYOP", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON", 
			"IF", "ELSE", "VARIABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'fun'", "'->'", "'let'", "'='", "'{'", 
			"'}'", "'return'", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "'not'", "'?'", null, 
			null, null, null, "';'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", 
			"GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", "AND", "NOT", 
			"TERNARYOP", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON", "IF", 
			"ELSE", "VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\6\34"+
		"\u0090\n\34\r\34\16\34\u0091\3\34\6\34\u0095\n\34\r\34\16\34\u0096\3\34"+
		"\6\34\u009a\n\34\r\34\16\34\u009b\3\34\7\34\u009f\n\34\f\34\16\34\u00a2"+
		"\13\34\5\34\u00a4\n\34\3\35\6\35\u00a7\n\35\r\35\16\35\u00a8\3\36\6\36"+
		"\u00ac\n\36\r\36\16\36\u00ad\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u00bb\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\7#\u00c9\n#\f#\16#\u00cc\13#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\7\3\2\62;\4\2\13\13"+
		"\"\"\4\2\13\f\17\17\3\2c|\5\2\62;C\\c|\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2"+
		"\tM\3\2\2\2\13O\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2"+
		"\2\25^\3\2\2\2\27`\3\2\2\2\31g\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2"+
		"\2\2!p\3\2\2\2#r\3\2\2\2%t\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+|\3\2\2\2-\177"+
		"\3\2\2\2/\u0082\3\2\2\2\61\u0085\3\2\2\2\63\u0088\3\2\2\2\65\u008c\3\2"+
		"\2\2\67\u00a3\3\2\2\29\u00a6\3\2\2\2;\u00ab\3\2\2\2=\u00ba\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00be\3\2\2\2C\u00c1\3\2\2\2E\u00c6\3\2\2\2GH\7<\2\2H\4\3\2"+
		"\2\2IJ\7*\2\2J\6\3\2\2\2KL\7+\2\2L\b\3\2\2\2MN\7.\2\2N\n\3\2\2\2OP\7h"+
		"\2\2PQ\7w\2\2QR\7p\2\2R\f\3\2\2\2ST\7/\2\2TU\7@\2\2U\16\3\2\2\2VW\7n\2"+
		"\2WX\7g\2\2XY\7v\2\2Y\20\3\2\2\2Z[\7?\2\2[\22\3\2\2\2\\]\7}\2\2]\24\3"+
		"\2\2\2^_\7\177\2\2_\26\3\2\2\2`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7w\2\2de\7"+
		"t\2\2ef\7p\2\2f\30\3\2\2\2gh\7,\2\2hi\7,\2\2i\32\3\2\2\2jk\7,\2\2k\34"+
		"\3\2\2\2lm\7\61\2\2m\36\3\2\2\2no\7-\2\2o \3\2\2\2pq\7/\2\2q\"\3\2\2\2"+
		"rs\7>\2\2s$\3\2\2\2tu\7>\2\2uv\7?\2\2v&\3\2\2\2wx\7@\2\2x(\3\2\2\2yz\7"+
		"@\2\2z{\7?\2\2{*\3\2\2\2|}\7?\2\2}~\7?\2\2~,\3\2\2\2\177\u0080\7#\2\2"+
		"\u0080\u0081\7?\2\2\u0081.\3\2\2\2\u0082\u0083\7~\2\2\u0083\u0084\7~\2"+
		"\2\u0084\60\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\7(\2\2\u0087\62\3\2"+
		"\2\2\u0088\u0089\7p\2\2\u0089\u008a\7q\2\2\u008a\u008b\7v\2\2\u008b\64"+
		"\3\2\2\2\u008c\u008d\7A\2\2\u008d\66\3\2\2\2\u008e\u0090\t\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u00a4\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u009a\7\60\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\t\2"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u008f\3\2"+
		"\2\2\u00a3\u0094\3\2\2\2\u00a48\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		":\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\b\36\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7w\2\2\u00b4\u00bb\7g\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9\u00bb\7g\2\2\u00ba\u00b1\3\2\2"+
		"\2\u00ba\u00b5\3\2\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7=\2\2\u00bd@\3\2\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0B\3\2\2\2\u00c1\u00c2\7"+
		"g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5D"+
		"\3\2\2\2\u00c6\u00ca\t\5\2\2\u00c7\u00c9\t\6\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbF\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\f\2\u0091\u0096\u009b\u00a0\u00a3\u00a8\u00ad\u00ba"+
		"\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}