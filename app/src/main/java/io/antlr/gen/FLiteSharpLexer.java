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
		T__9=10, POW=11, MUL=12, DIV=13, ADD=14, SUB=15, LESSTHAN=16, LESSTHANOREQUAL=17, 
		GREATERTHAN=18, GREATERTHANOREQUAL=19, EQUAL=20, NOTEQUAL=21, OR=22, AND=23, 
		NOT=24, TERNARYOP=25, ATTACH=26, CONC=27, INTEGER=28, DOUBLE=29, BOOLEAN=30, 
		TYPE=31, TYPEOP=32, WS=33, TOSKIP=34, IF=35, THEN=36, ELSE=37, WHILE=38, 
		DO=39, FOR=40, TO=41, DOWNTO=42, IN=43, RANGEOP=44, LET=45, LAMBDADEC=46, 
		VARIABLE=47, COMMENT=48, LINE_COMMENT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", 
			"GREATERTHAN", "GREATERTHANOREQUAL", "EQUAL", "NOTEQUAL", "OR", "AND", 
			"NOT", "TERNARYOP", "ATTACH", "CONC", "INTEGER", "DOUBLE", "BOOLEAN", 
			"TYPE", "TYPEOP", "WS", "TOSKIP", "IF", "THEN", "ELSE", "WHILE", "DO", 
			"FOR", "TO", "DOWNTO", "IN", "RANGEOP", "LET", "LAMBDADEC", "VARIABLE", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'['", "';'", "']'", "'->'", "'{'", "'}'", 
			"'list'", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", 
			"'='", "'<>'", "'||'", "'&&'", "'not'", "'?'", "'::'", "'@'", null, null, 
			null, null, "':'", null, null, "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'to'", "'downto'", "'in'", "'..'", "'let'", "'fun'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "POW", 
			"MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", 
			"GREATERTHANOREQUAL", "EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", 
			"ATTACH", "CONC", "INTEGER", "DOUBLE", "BOOLEAN", "TYPE", "TYPEOP", "WS", 
			"TOSKIP", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", 
			"IN", "RANGEOP", "LET", "LAMBDADEC", "VARIABLE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\6\35\u00aa\n\35\r\35\16\35\u00ab\3\36\6\36\u00af"+
		"\n\36\r\36\16\36\u00b0\3\36\3\36\6\36\u00b5\n\36\r\36\16\36\u00b6\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00c2\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d5\n \3!\3!\3\"\6\"\u00da"+
		"\n\"\r\"\16\"\u00db\3#\6#\u00df\n#\r#\16#\u00e0\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3"+
		"/\3\60\3\60\7\60\u0119\n\60\f\60\16\60\u011c\13\60\3\61\3\61\3\61\3\61"+
		"\7\61\u0122\n\61\f\61\16\61\u0125\13\61\3\61\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\7\62\u0130\n\62\f\62\16\62\u0133\13\62\3\62\3\62\3\u0123"+
		"\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\b\3\2\62;\4"+
		"\2\13\13\"\"\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\2\u0141"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2"+
		"\2\2\ro\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27}\3"+
		"\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2\2\2\35\u0084\3\2\2\2\37\u0086\3\2"+
		"\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0092"+
		"\3\2\2\2+\u0094\3\2\2\2-\u0097\3\2\2\2/\u009a\3\2\2\2\61\u009d\3\2\2\2"+
		"\63\u00a1\3\2\2\2\65\u00a3\3\2\2\2\67\u00a6\3\2\2\29\u00a9\3\2\2\2;\u00ae"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00d4\3\2\2\2A\u00d6\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u00de\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K\u00ec\3\2\2\2M\u00f1\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fa\3\2\2\2S\u00fe\3\2\2\2U\u0101\3\2\2\2W\u0108"+
		"\3\2\2\2Y\u010b\3\2\2\2[\u010e\3\2\2\2]\u0112\3\2\2\2_\u0116\3\2\2\2a"+
		"\u011d\3\2\2\2c\u012b\3\2\2\2ef\7*\2\2f\4\3\2\2\2gh\7+\2\2h\6\3\2\2\2"+
		"ij\7.\2\2j\b\3\2\2\2kl\7]\2\2l\n\3\2\2\2mn\7=\2\2n\f\3\2\2\2op\7_\2\2"+
		"p\16\3\2\2\2qr\7/\2\2rs\7@\2\2s\20\3\2\2\2tu\7}\2\2u\22\3\2\2\2vw\7\177"+
		"\2\2w\24\3\2\2\2xy\7n\2\2yz\7k\2\2z{\7u\2\2{|\7v\2\2|\26\3\2\2\2}~\7,"+
		"\2\2~\177\7,\2\2\177\30\3\2\2\2\u0080\u0081\7,\2\2\u0081\32\3\2\2\2\u0082"+
		"\u0083\7\61\2\2\u0083\34\3\2\2\2\u0084\u0085\7-\2\2\u0085\36\3\2\2\2\u0086"+
		"\u0087\7/\2\2\u0087 \3\2\2\2\u0088\u0089\7>\2\2\u0089\"\3\2\2\2\u008a"+
		"\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c$\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"&\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7?\2\2\u0093*\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7@\2\2\u0096,\3"+
		"\2\2\2\u0097\u0098\7~\2\2\u0098\u0099\7~\2\2\u0099.\3\2\2\2\u009a\u009b"+
		"\7(\2\2\u009b\u009c\7(\2\2\u009c\60\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7v\2\2\u00a0\62\3\2\2\2\u00a1\u00a2\7A\2\2\u00a2\64"+
		"\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5\7<\2\2\u00a5\66\3\2\2\2\u00a6"+
		"\u00a7\7B\2\2\u00a78\3\2\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac:\3\2\2\2"+
		"\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\60\2\2"+
		"\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7w\2\2\u00bb\u00c2\7g\2\2\u00bc\u00bd\7h\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2"+
		"\u00c1\u00b8\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7"+
		"k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00d5\7v\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8"+
		"\7q\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00d5\7g\2\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7q\2\2"+
		"\u00cf\u00d5\7n\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d5\7v\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4"+
		"\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5@\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7"+
		"B\3\2\2\2\u00d8\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcD\3\2\2\2\u00dd\u00df\t"+
		"\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\b#\2\2\u00e3F\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7h\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7j\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00ebJ\3\2\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0L\3\2\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7k\2"+
		"\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7"+
		"f\2\2\u00f8\u00f9\7q\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7t\2\2\u00fdR\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7q\2\2\u0100T\3\2\2\2\u0101\u0102\7f\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7y\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106\u0107\7q\2\2\u0107"+
		"V\3\2\2\2\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2\u010aX\3\2\2\2\u010b\u010c"+
		"\7\60\2\2\u010c\u010d\7\60\2\2\u010dZ\3\2\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7g\2\2\u0110\u0111\7v\2\2\u0111\\\3\2\2\2\u0112\u0113\7h\2\2\u0113"+
		"\u0114\7w\2\2\u0114\u0115\7p\2\2\u0115^\3\2\2\2\u0116\u011a\t\5\2\2\u0117"+
		"\u0119\t\6\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b`\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e"+
		"\7*\2\2\u011e\u011f\7,\2\2\u011f\u0123\3\2\2\2\u0120\u0122\13\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0124\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7,\2\2\u0127"+
		"\u0128\7+\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\61\2\2\u012ab\3\2\2\2"+
		"\u012b\u012c\7\61\2\2\u012c\u012d\7\61\2\2\u012d\u0131\3\2\2\2\u012e\u0130"+
		"\n\7\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\b\62"+
		"\2\2\u0135d\3\2\2\2\r\2\u00ab\u00b0\u00b6\u00c1\u00d4\u00db\u00e0\u011a"+
		"\u0123\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}