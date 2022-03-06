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
		POW=10, MUL=11, DIV=12, ADD=13, SUB=14, LESSTHAN=15, LESSTHANOREQUAL=16, 
		GREATERTHAN=17, GREATERTHANOREQUAL=18, EQUAL=19, NOTEQUAL=20, OR=21, AND=22, 
		NOT=23, TERNARYOP=24, ATTACH=25, CONC=26, NUMBER=27, WS=28, TOSKIP=29, 
		BOOLEAN=30, IF=31, THEN=32, ELSE=33, WHILE=34, DO=35, FOR=36, LET=37, 
		LAMBDADEC=38, VARIABLE=39, COMMENT=40, LINE_COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", 
			"GREATERTHANOREQUAL", "EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", 
			"ATTACH", "CONC", "NUMBER", "WS", "TOSKIP", "BOOLEAN", "IF", "THEN", 
			"ELSE", "WHILE", "DO", "FOR", "LET", "LAMBDADEC", "VARIABLE", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'['", "';'", "']'", "'->'", "'{'", "'}'", 
			"'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'='", 
			"'<>'", "'||'", "'&&'", "'not'", "'?'", "'::'", "'@'", null, null, null, 
			null, "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'let'", 
			"'fun'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "POW", "MUL", 
			"DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", 
			"EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", 
			"NUMBER", "WS", "TOSKIP", "BOOLEAN", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"FOR", "LET", "LAMBDADEC", "VARIABLE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\6\34\u0095\n\34\r\34\16\34\u0096\3\34\6\34\u009a\n\34\r\34\16\34"+
		"\u009b\3\34\6\34\u009f\n\34\r\34\16\34\u00a0\3\34\7\34\u00a4\n\34\f\34"+
		"\16\34\u00a7\13\34\5\34\u00a9\n\34\3\35\6\35\u00ac\n\35\r\35\16\35\u00ad"+
		"\3\36\6\36\u00b1\n\36\r\36\16\36\u00b2\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u00c0\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3(\3(\7(\u00e6\n(\f(\16(\u00e9\13(\3)\3)\3)\3)\7)\u00ef\n"+
		")\f)\16)\u00f2\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\7*\u00fd\n*\f*\16*\u0100"+
		"\13*\3*\3*\3\u00f0\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\b\3\2\62;\4\2\13\13"+
		"\"\"\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\2\u010d\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2"+
		"\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2"+
		"\2\21d\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2"+
		"\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#x\3\2\2\2%z\3\2\2\2\'}\3\2\2\2"+
		")\177\3\2\2\2+\u0082\3\2\2\2-\u0085\3\2\2\2/\u0088\3\2\2\2\61\u008c\3"+
		"\2\2\2\63\u008e\3\2\2\2\65\u0091\3\2\2\2\67\u00a8\3\2\2\29\u00ab\3\2\2"+
		"\2;\u00b0\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c4\3\2\2\2C\u00c9"+
		"\3\2\2\2E\u00ce\3\2\2\2G\u00d4\3\2\2\2I\u00d7\3\2\2\2K\u00db\3\2\2\2M"+
		"\u00df\3\2\2\2O\u00e3\3\2\2\2Q\u00ea\3\2\2\2S\u00f8\3\2\2\2UV\7*\2\2V"+
		"\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7.\2\2Z\b\3\2\2\2[\\\7]\2\2\\\n\3\2\2"+
		"\2]^\7=\2\2^\f\3\2\2\2_`\7_\2\2`\16\3\2\2\2ab\7/\2\2bc\7@\2\2c\20\3\2"+
		"\2\2de\7}\2\2e\22\3\2\2\2fg\7\177\2\2g\24\3\2\2\2hi\7,\2\2ij\7,\2\2j\26"+
		"\3\2\2\2kl\7,\2\2l\30\3\2\2\2mn\7\61\2\2n\32\3\2\2\2op\7-\2\2p\34\3\2"+
		"\2\2qr\7/\2\2r\36\3\2\2\2st\7>\2\2t \3\2\2\2uv\7>\2\2vw\7?\2\2w\"\3\2"+
		"\2\2xy\7@\2\2y$\3\2\2\2z{\7@\2\2{|\7?\2\2|&\3\2\2\2}~\7?\2\2~(\3\2\2\2"+
		"\177\u0080\7>\2\2\u0080\u0081\7@\2\2\u0081*\3\2\2\2\u0082\u0083\7~\2\2"+
		"\u0083\u0084\7~\2\2\u0084,\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\7(\2"+
		"\2\u0087.\3\2\2\2\u0088\u0089\7p\2\2\u0089\u008a\7q\2\2\u008a\u008b\7"+
		"v\2\2\u008b\60\3\2\2\2\u008c\u008d\7A\2\2\u008d\62\3\2\2\2\u008e\u008f"+
		"\7<\2\2\u008f\u0090\7<\2\2\u0090\64\3\2\2\2\u0091\u0092\7B\2\2\u0092\66"+
		"\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a9\3\2\2\2\u0098\u009a\t\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\7\60\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a5\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8\u0099\3\2\2\2\u00a98\3\2\2\2"+
		"\u00aa\u00ac\t\3\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae:\3\2\2\2\u00af\u00b1\t\4\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\36\2\2\u00b5<\3\2\2\2\u00b6\u00b7"+
		"\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9\u00c0\7g\2\2\u00ba"+
		"\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2"+
		"\u00be\u00c0\7g\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0>\3\2"+
		"\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7v\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"B\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7j\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3F\3\2\2\2\u00d4"+
		"\u00d5\7f\2\2\u00d5\u00d6\7q\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00daJ\3\2\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00deL\3\2\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"\u00e1\7w\2\2\u00e1\u00e2\7p\2\2\u00e2N\3\2\2\2\u00e3\u00e7\t\5\2\2\u00e4"+
		"\u00e6\t\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8P\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb"+
		"\7\61\2\2\u00eb\u00ec\7,\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\13\2\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b)\2\2\u00f7R\3\2\2\2"+
		"\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd"+
		"\n\7\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b*"+
		"\2\2\u0102T\3\2\2\2\16\2\u0096\u009b\u00a0\u00a5\u00a8\u00ad\u00b2\u00bf"+
		"\u00e7\u00f0\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}