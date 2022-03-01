// Generated from FLiteSharp.g4 by ANTLR 4.9.3

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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, POW=12, MUL=13, DIV=14, ADD=15, SUB=16, LESSTHAN=17, 
		LESSTHANOREQUAL=18, GREATERTHAN=19, GREATERTHANOREQUAL=20, EQUALPHYS=21, 
		NOTEQUALPHYS=22, OR=23, AND=24, NOT=25, TERNARYOP=26, NUMBER=27, WS=28, 
		TOSKIP=29, BOOLEAN=30, SEMICOLON=31, IF=32, ELSE=33, WHILE=34, FOR=35, 
		VARIABLEDEC=36, LAMBDADEC=37, VARIABLE=38;
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
			"IF", "ELSE", "WHILE", "FOR", "VARIABLEDEC", "LAMBDADEC", "VARIABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'['", "']'", "'->'", "'='", "'{'", 
			"'}'", "'return'", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "'not'", "'?'", null, 
			null, null, null, "';'", "'if'", "'else'", "'while'", "'for'", "'let'", 
			"'fun'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", 
			"GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", "AND", "NOT", 
			"TERNARYOP", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON", "IF", 
			"ELSE", "WHILE", "FOR", "VARIABLEDEC", "LAMBDADEC", "VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\6\34\u0094\n\34\r\34\16\34\u0095\3\34\6\34\u0099\n\34\r\34\16\34"+
		"\u009a\3\34\6\34\u009e\n\34\r\34\16\34\u009f\3\34\7\34\u00a3\n\34\f\34"+
		"\16\34\u00a6\13\34\5\34\u00a8\n\34\3\35\6\35\u00ab\n\35\r\35\16\35\u00ac"+
		"\3\36\6\36\u00b0\n\36\r\36\16\36\u00b1\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u00bf\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\7\'"+
		"\u00df\n\'\f\'\16\'\u00e2\13\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\7\3\2\62"+
		";\4\2\13\13\"\"\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\2\u00eb\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13"+
		"W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27"+
		"d\3\2\2\2\31k\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v"+
		"\3\2\2\2%x\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\u0080\3\2\2\2-\u0083\3\2\2\2"+
		"/\u0086\3\2\2\2\61\u0089\3\2\2\2\63\u008c\3\2\2\2\65\u0090\3\2\2\2\67"+
		"\u00a7\3\2\2\29\u00aa\3\2\2\2;\u00af\3\2\2\2=\u00be\3\2\2\2?\u00c0\3\2"+
		"\2\2A\u00c2\3\2\2\2C\u00c5\3\2\2\2E\u00ca\3\2\2\2G\u00d0\3\2\2\2I\u00d4"+
		"\3\2\2\2K\u00d8\3\2\2\2M\u00dc\3\2\2\2OP\7<\2\2P\4\3\2\2\2QR\7*\2\2R\6"+
		"\3\2\2\2ST\7+\2\2T\b\3\2\2\2UV\7.\2\2V\n\3\2\2\2WX\7]\2\2X\f\3\2\2\2Y"+
		"Z\7_\2\2Z\16\3\2\2\2[\\\7/\2\2\\]\7@\2\2]\20\3\2\2\2^_\7?\2\2_\22\3\2"+
		"\2\2`a\7}\2\2a\24\3\2\2\2bc\7\177\2\2c\26\3\2\2\2de\7t\2\2ef\7g\2\2fg"+
		"\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2j\30\3\2\2\2kl\7,\2\2lm\7,\2\2m\32\3"+
		"\2\2\2no\7,\2\2o\34\3\2\2\2pq\7\61\2\2q\36\3\2\2\2rs\7-\2\2s \3\2\2\2"+
		"tu\7/\2\2u\"\3\2\2\2vw\7>\2\2w$\3\2\2\2xy\7>\2\2yz\7?\2\2z&\3\2\2\2{|"+
		"\7@\2\2|(\3\2\2\2}~\7@\2\2~\177\7?\2\2\177*\3\2\2\2\u0080\u0081\7?\2\2"+
		"\u0081\u0082\7?\2\2\u0082,\3\2\2\2\u0083\u0084\7#\2\2\u0084\u0085\7?\2"+
		"\2\u0085.\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088\7~\2\2\u0088\60\3\2\2"+
		"\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b\62\3\2\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7q\2\2\u008e\u008f\7v\2\2\u008f\64\3\2\2\2\u0090\u0091"+
		"\7A\2\2\u0091\66\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a8\3\2"+
		"\2\2\u0097\u0099\t\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7\60"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0098\3\2"+
		"\2\2\u00a88\3\2\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad:\3\2\2\2\u00ae"+
		"\u00b0\t\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\36\2\2\u00b4"+
		"<\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8"+
		"\u00bf\7g\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2"+
		"\u00bc\u00bd\7u\2\2\u00bd\u00bf\7g\2\2\u00be\u00b5\3\2\2\2\u00be\u00b9"+
		"\3\2\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1@\3\2\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7h\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9D\3\2\2\2\u00ca\u00cb"+
		"\7y\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7q\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7J\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7p\2\2\u00dbL\3\2\2\2\u00dc\u00e0\t\5\2\2\u00dd\u00df\t\6\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1N\3\2\2\2\u00e2\u00e0\3\2\2\2\f\2\u0095\u009a\u009f\u00a4\u00a7"+
		"\u00ac\u00b1\u00be\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}