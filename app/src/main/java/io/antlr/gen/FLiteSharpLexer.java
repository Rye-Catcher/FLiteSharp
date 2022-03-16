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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, POW=8, MUL=9, 
		DIV=10, ADD=11, SUB=12, LESSTHAN=13, LESSTHANOREQUAL=14, GREATERTHAN=15, 
		GREATERTHANOREQUAL=16, EQUAL=17, NOTEQUAL=18, OR=19, AND=20, NOT=21, TERNARYOP=22, 
		ATTACH=23, CONC=24, INTEGER=25, DOUBLE=26, BOOLEAN=27, UNIT=28, TYPE=29, 
		TYPEOP=30, WS=31, TOSKIP=32, IF=33, THEN=34, ELSE=35, WHILE=36, DO=37, 
		FOR=38, TO=39, DOWNTO=40, IN=41, RANGEOP=42, BEGIN=43, END=44, DONE=45, 
		SEMICOLON=46, LET=47, LAMBDADEC=48, RECURSION=49, VARIABLE=50, COMMENT=51, 
		LINE_COMMENT=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "POW", "MUL", 
			"DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", 
			"EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", 
			"INTEGER", "DOUBLE", "BOOLEAN", "UNIT", "TYPE", "TYPEOP", "WS", "TOSKIP", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", "IN", "RANGEOP", 
			"BEGIN", "END", "DONE", "SEMICOLON", "LET", "LAMBDADEC", "RECURSION", 
			"VARIABLE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'['", "']'", "'->'", "'list'", "'**'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'||'", 
			"'&&'", "'not'", "'?'", "'::'", "'@'", null, null, null, null, null, 
			"':'", null, null, "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'downto'", "'in'", "'..'", "'begin'", "'end'", "'done'", "';'", 
			"'let'", "'fun'", "'rec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "POW", "MUL", "DIV", 
			"ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", 
			"EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", 
			"INTEGER", "DOUBLE", "BOOLEAN", "UNIT", "TYPE", "TYPEOP", "WS", "TOSKIP", 
			"IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "TO", "DOWNTO", "IN", "RANGEOP", 
			"BEGIN", "END", "DONE", "SEMICOLON", "LET", "LAMBDADEC", "RECURSION", 
			"VARIABLE", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\6\32\u00aa\n\32\r\32\16\32\u00ab\3\33\6\33\u00af"+
		"\n\33\r\33\16\33\u00b0\3\33\3\33\6\33\u00b5\n\33\r\33\16\33\u00b6\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00c2\n\34\3\35\3\35\7\35"+
		"\u00c6\n\35\f\35\16\35\u00c9\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00de"+
		"\n\36\3\37\3\37\3 \6 \u00e3\n \r \16 \u00e4\3!\6!\u00e8\n!\r!\16!\u00e9"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0137\n\63"+
		"\f\63\16\63\u013a\13\63\3\64\3\64\3\64\3\64\7\64\u0140\n\64\f\64\16\64"+
		"\u0143\13\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u014e\n"+
		"\65\f\65\16\65\u0151\13\65\3\65\3\65\3\u0141\2\66\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\b\3\2\62;\4\2\13\13\"\""+
		"\4\2\13\f\17\17\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\2\u0160\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2"+
		"\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17x\3\2\2\2\21}\3\2\2\2\23\u0080"+
		"\3\2\2\2\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3"+
		"\2\2\2\35\u008a\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0092\3\2\2\2"+
		"%\u0094\3\2\2\2\'\u0097\3\2\2\2)\u009a\3\2\2\2+\u009d\3\2\2\2-\u00a1\3"+
		"\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9\3\2\2\2\65\u00ae\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00dd\3\2\2\2=\u00df\3\2\2\2?\u00e2"+
		"\3\2\2\2A\u00e7\3\2\2\2C\u00ed\3\2\2\2E\u00f0\3\2\2\2G\u00f5\3\2\2\2I"+
		"\u00fa\3\2\2\2K\u0100\3\2\2\2M\u0103\3\2\2\2O\u0107\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u0111\3\2\2\2U\u0114\3\2\2\2W\u0117\3\2\2\2Y\u011d\3\2\2\2[\u0121"+
		"\3\2\2\2]\u0126\3\2\2\2_\u0128\3\2\2\2a\u012c\3\2\2\2c\u0130\3\2\2\2e"+
		"\u0134\3\2\2\2g\u013b\3\2\2\2i\u0149\3\2\2\2kl\7*\2\2l\4\3\2\2\2mn\7+"+
		"\2\2n\6\3\2\2\2op\7.\2\2p\b\3\2\2\2qr\7]\2\2r\n\3\2\2\2st\7_\2\2t\f\3"+
		"\2\2\2uv\7/\2\2vw\7@\2\2w\16\3\2\2\2xy\7n\2\2yz\7k\2\2z{\7u\2\2{|\7v\2"+
		"\2|\20\3\2\2\2}~\7,\2\2~\177\7,\2\2\177\22\3\2\2\2\u0080\u0081\7,\2\2"+
		"\u0081\24\3\2\2\2\u0082\u0083\7\61\2\2\u0083\26\3\2\2\2\u0084\u0085\7"+
		"-\2\2\u0085\30\3\2\2\2\u0086\u0087\7/\2\2\u0087\32\3\2\2\2\u0088\u0089"+
		"\7>\2\2\u0089\34\3\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c\36"+
		"\3\2\2\2\u008d\u008e\7@\2\2\u008e \3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091"+
		"\7?\2\2\u0091\"\3\2\2\2\u0092\u0093\7?\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7>\2\2\u0095\u0096\7@\2\2\u0096&\3\2\2\2\u0097\u0098\7~\2\2\u0098\u0099"+
		"\7~\2\2\u0099(\3\2\2\2\u009a\u009b\7(\2\2\u009b\u009c\7(\2\2\u009c*\3"+
		"\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7v\2\2\u00a0"+
		",\3\2\2\2\u00a1\u00a2\7A\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7<\2\2\u00a4\u00a5"+
		"\7<\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7B\2\2\u00a7\62\3\2\2\2\u00a8\u00aa"+
		"\t\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\64\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\7\60\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\66"+
		"\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00c2\7g\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bc"+
		"\3\2\2\2\u00c28\3\2\2\2\u00c3\u00c7\7*\2\2\u00c4\u00c6\5? \2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb:\3\2\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00de\7v\2\2\u00cf\u00d0\7f\2\2"+
		"\u00d0\u00d1\7q\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4"+
		"\7n\2\2\u00d4\u00de\7g\2\2\u00d5\u00d6\7d\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7q\2\2\u00d8\u00de\7n\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7k\2\2\u00dc\u00de\7v\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00cf"+
		"\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de<\3\2\2\2\u00df"+
		"\u00e0\7<\2\2\u00e0>\3\2\2\2\u00e1\u00e3\t\3\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5@\3\2\2\2"+
		"\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b!\2\2\u00ec"+
		"B\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7h\2\2\u00efD\3\2\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1\u00f2\7j\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"F\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7j\2\2\u00fc"+
		"\u00fd\7k\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ffJ\3\2\2\2\u0100"+
		"\u0101\7f\2\2\u0101\u0102\7q\2\2\u0102L\3\2\2\2\u0103\u0104\7h\2\2\u0104"+
		"\u0105\7q\2\2\u0105\u0106\7t\2\2\u0106N\3\2\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7q\2\2\u0109P\3\2\2\2\u010a\u010b\7f\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7y\2\2\u010d\u010e\7p\2\2\u010e\u010f\7v\2\2\u010f\u0110\7q\2\2"+
		"\u0110R\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113T\3\2\2\2\u0114"+
		"\u0115\7\60\2\2\u0115\u0116\7\60\2\2\u0116V\3\2\2\2\u0117\u0118\7d\2\2"+
		"\u0118\u0119\7g\2\2\u0119\u011a\7i\2\2\u011a\u011b\7k\2\2\u011b\u011c"+
		"\7p\2\2\u011cX\3\2\2\2\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f\u0120"+
		"\7f\2\2\u0120Z\3\2\2\2\u0121\u0122\7f\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7p\2\2\u0124\u0125\7g\2\2\u0125\\\3\2\2\2\u0126\u0127\7=\2\2\u0127^\3"+
		"\2\2\2\u0128\u0129\7n\2\2\u0129\u012a\7g\2\2\u012a\u012b\7v\2\2\u012b"+
		"`\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7w\2\2\u012e\u012f\7p\2\2\u012f"+
		"b\3\2\2\2\u0130\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132\u0133\7e\2\2\u0133"+
		"d\3\2\2\2\u0134\u0138\t\5\2\2\u0135\u0137\t\6\2\2\u0136\u0135\3\2\2\2"+
		"\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139f\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7*\2\2\u013c\u013d\7,\2\2\u013d"+
		"\u0141\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\7,\2\2\u0145\u0146\7+\2\2\u0146\u0147\3\2\2"+
		"\2\u0147\u0148\b\64\2\2\u0148h\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b"+
		"\7\61\2\2\u014b\u014f\3\2\2\2\u014c\u014e\n\7\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\65\2\2\u0153j\3\2\2\2\16\2"+
		"\u00ab\u00b0\u00b6\u00c1\u00c7\u00dd\u00e4\u00e9\u0138\u0141\u014f\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}