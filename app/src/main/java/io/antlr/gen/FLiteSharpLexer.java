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
		T__0=1, T__1=2, T__2=3, T__3=4, POW=5, MUL=6, DIV=7, ADD=8, SUB=9, LESSTHAN=10, 
		LESSTHANOREQUAL=11, GREATERTHAN=12, GREATERTHANOREQUAL=13, EQUAL=14, NOTEQUAL=15, 
		OR=16, AND=17, NOT=18, TERNARYOP=19, ATTACH=20, CONC=21, INTEGER=22, DOUBLE=23, 
		BOOLEAN=24, UNIT=25, TYPE=26, TYPEOP=27, UNITOFMEASURE=28, TYPEKEYWORD=29, 
		WS=30, TOSKIP=31, LEFTPAR=32, RIGHTPAR=33, LEFTSQPAR=34, RIGHTSQPAR=35, 
		IF=36, THEN=37, ELSE=38, IN=39, BEGIN=40, END=41, MATCH=42, WITH=43, ARROW=44, 
		SEMICOLON=45, LET=46, LAMBDADEC=47, RECURSION=48, VARIABLE=49, COMMENT=50, 
		LINE_COMMENT=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", 
			"LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUAL", "NOTEQUAL", 
			"OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", "INTEGER", "DOUBLE", 
			"BOOLEAN", "UNIT", "TYPE", "TYPEOP", "UNITOFMEASURE", "TYPEKEYWORD", 
			"WS", "TOSKIP", "LEFTPAR", "RIGHTPAR", "LEFTSQPAR", "RIGHTSQPAR", "IF", 
			"THEN", "ELSE", "IN", "BEGIN", "END", "MATCH", "WITH", "ARROW", "SEMICOLON", 
			"LET", "LAMBDADEC", "RECURSION", "VARIABLE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "','", "'list'", "'^'", "'**'", "'*'", "'/'", "'+'", "'-'", 
			"'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'||'", "'&&'", "'not'", 
			"'?'", "'::'", "'@'", null, null, null, null, null, "':'", "'[<Measure>]'", 
			"'type'", null, null, "'('", "')'", "'['", "']'", "'if'", "'then'", "'else'", 
			"'in'", "'begin'", "'end'", "'match'", "'with'", "'->'", "';'", "'let'", 
			"'fun'", "'rec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", 
			"LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUAL", "NOTEQUAL", 
			"OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", "INTEGER", "DOUBLE", 
			"BOOLEAN", "UNIT", "TYPE", "TYPEOP", "UNITOFMEASURE", "TYPEKEYWORD", 
			"WS", "TOSKIP", "LEFTPAR", "RIGHTPAR", "LEFTSQPAR", "RIGHTSQPAR", "IF", 
			"THEN", "ELSE", "IN", "BEGIN", "END", "MATCH", "WITH", "ARROW", "SEMICOLON", 
			"LET", "LAMBDADEC", "RECURSION", "VARIABLE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0153\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u00a1\n\27\r\27\16"+
		"\27\u00a2\3\30\6\30\u00a6\n\30\r\30\16\30\u00a7\3\30\3\30\6\30\u00ac\n"+
		"\30\r\30\16\30\u00ad\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00b9\n\31\3\32\3\32\7\32\u00bd\n\32\f\32\16\32\u00c0\13\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00d5\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00eb"+
		"\n\37\r\37\16\37\u00ec\3 \6 \u00f0\n \r \16 \u00f1\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\7\62"+
		"\u0136\n\62\f\62\16\62\u0139\13\62\3\63\3\63\3\63\3\63\7\63\u013f\n\63"+
		"\f\63\16\63\u0142\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7"+
		"\64\u014d\n\64\f\64\16\64\u0150\13\64\3\64\3\64\3\u0140\2\65\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\b\3\2\62;\4\2\13"+
		"\13\"\"\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\2\u015f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\t"+
		"r\3\2\2\2\13t\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25"+
		"\177\3\2\2\2\27\u0081\3\2\2\2\31\u0084\3\2\2\2\33\u0086\3\2\2\2\35\u0089"+
		"\3\2\2\2\37\u008b\3\2\2\2!\u008e\3\2\2\2#\u0091\3\2\2\2%\u0094\3\2\2\2"+
		"\'\u0098\3\2\2\2)\u009a\3\2\2\2+\u009d\3\2\2\2-\u00a0\3\2\2\2/\u00a5\3"+
		"\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00d4\3\2\2\2\67\u00d6\3\2"+
		"\2\29\u00d8\3\2\2\2;\u00e4\3\2\2\2=\u00ea\3\2\2\2?\u00ef\3\2\2\2A\u00f5"+
		"\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K"+
		"\u0100\3\2\2\2M\u0105\3\2\2\2O\u010a\3\2\2\2Q\u010d\3\2\2\2S\u0113\3\2"+
		"\2\2U\u0117\3\2\2\2W\u011d\3\2\2\2Y\u0122\3\2\2\2[\u0125\3\2\2\2]\u0127"+
		"\3\2\2\2_\u012b\3\2\2\2a\u012f\3\2\2\2c\u0133\3\2\2\2e\u013a\3\2\2\2g"+
		"\u0148\3\2\2\2ij\7~\2\2j\4\3\2\2\2kl\7.\2\2l\6\3\2\2\2mn\7n\2\2no\7k\2"+
		"\2op\7u\2\2pq\7v\2\2q\b\3\2\2\2rs\7`\2\2s\n\3\2\2\2tu\7,\2\2uv\7,\2\2"+
		"v\f\3\2\2\2wx\7,\2\2x\16\3\2\2\2yz\7\61\2\2z\20\3\2\2\2{|\7-\2\2|\22\3"+
		"\2\2\2}~\7/\2\2~\24\3\2\2\2\177\u0080\7>\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7>\2\2\u0082\u0083\7?\2\2\u0083\30\3\2\2\2\u0084\u0085\7@\2\2\u0085\32"+
		"\3\2\2\2\u0086\u0087\7@\2\2\u0087\u0088\7?\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\7?\2\2\u008a\36\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7@\2\2\u008d"+
		" \3\2\2\2\u008e\u008f\7~\2\2\u008f\u0090\7~\2\2\u0090\"\3\2\2\2\u0091"+
		"\u0092\7(\2\2\u0092\u0093\7(\2\2\u0093$\3\2\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7q\2\2\u0096\u0097\7v\2\2\u0097&\3\2\2\2\u0098\u0099\7A\2\2\u0099"+
		"(\3\2\2\2\u009a\u009b\7<\2\2\u009b\u009c\7<\2\2\u009c*\3\2\2\2\u009d\u009e"+
		"\7B\2\2\u009e,\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3.\3\2\2\2\u00a4"+
		"\u00a6\t\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\60\2\2\u00aa"+
		"\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b9\7g\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b9\7g\2\2"+
		"\u00b8\u00af\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9\62\3\2\2\2\u00ba\u00be"+
		"\7*\2\2\u00bb\u00bd\5=\37\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c2\7+\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00d5\7v\2\2\u00c6\u00c7\7f\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7n\2\2\u00cb\u00d5\7g\2\2"+
		"\u00cc\u00cd\7d\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d5"+
		"\7n\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d5\7v\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00cc\3\2"+
		"\2\2\u00d4\u00d0\3\2\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7<\2\2\u00d78\3"+
		"\2\2\2\u00d8\u00d9\7]\2\2\u00d9\u00da\7>\2\2\u00da\u00db\7O\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7w\2\2"+
		"\u00df\u00e0\7t\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3"+
		"\7_\2\2\u00e3:\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7{\2\2\u00e6\u00e7"+
		"\7r\2\2\u00e7\u00e8\7g\2\2\u00e8<\3\2\2\2\u00e9\u00eb\t\3\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		">\3\2\2\2\u00ee\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\b \2\2\u00f4@\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7"+
		"+\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7]\2\2\u00faF\3\2\2\2\u00fb\u00fc\7_"+
		"\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7h\2\2\u00ffJ\3\2\2"+
		"\2\u0100\u0101\7v\2\2\u0101\u0102\7j\2\2\u0102\u0103\7g\2\2\u0103\u0104"+
		"\7p\2\2\u0104L\3\2\2\2\u0105\u0106\7g\2\2\u0106\u0107\7n\2\2\u0107\u0108"+
		"\7u\2\2\u0108\u0109\7g\2\2\u0109N\3\2\2\2\u010a\u010b\7k\2\2\u010b\u010c"+
		"\7p\2\2\u010cP\3\2\2\2\u010d\u010e\7d\2\2\u010e\u010f\7g\2\2\u010f\u0110"+
		"\7i\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112R\3\2\2\2\u0113\u0114"+
		"\7g\2\2\u0114\u0115\7p\2\2\u0115\u0116\7f\2\2\u0116T\3\2\2\2\u0117\u0118"+
		"\7o\2\2\u0118\u0119\7c\2\2\u0119\u011a\7v\2\2\u011a\u011b\7e\2\2\u011b"+
		"\u011c\7j\2\2\u011cV\3\2\2\2\u011d\u011e\7y\2\2\u011e\u011f\7k\2\2\u011f"+
		"\u0120\7v\2\2\u0120\u0121\7j\2\2\u0121X\3\2\2\2\u0122\u0123\7/\2\2\u0123"+
		"\u0124\7@\2\2\u0124Z\3\2\2\2\u0125\u0126\7=\2\2\u0126\\\3\2\2\2\u0127"+
		"\u0128\7n\2\2\u0128\u0129\7g\2\2\u0129\u012a\7v\2\2\u012a^\3\2\2\2\u012b"+
		"\u012c\7h\2\2\u012c\u012d\7w\2\2\u012d\u012e\7p\2\2\u012e`\3\2\2\2\u012f"+
		"\u0130\7t\2\2\u0130\u0131\7g\2\2\u0131\u0132\7e\2\2\u0132b\3\2\2\2\u0133"+
		"\u0137\t\5\2\2\u0134\u0136\t\6\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138d\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\7*\2\2\u013b\u013c\7,\2\2\u013c\u0140\3\2\2\2\u013d"+
		"\u013f\13\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\7,\2\2\u0144\u0145\7+\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\63"+
		"\2\2\u0147f\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014a\7\61\2\2\u014a\u014e"+
		"\3\2\2\2\u014b\u014d\n\7\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0152\b\64\2\2\u0152h\3\2\2\2\16\2\u00a2\u00a7\u00ad\u00b8"+
		"\u00be\u00d4\u00ec\u00f1\u0137\u0140\u014e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}