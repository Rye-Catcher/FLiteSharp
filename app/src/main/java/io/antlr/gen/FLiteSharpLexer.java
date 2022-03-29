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
		ATTACH=23, CONC=24, INTEGER=25, DOUBLE=26, BOOLEAN=27, UNIT=28, MATCH=29, 
		WITH=30, ARROW=31, TYPE=32, TYPEOP=33, WS=34, TOSKIP=35, IF=36, THEN=37, 
		ELSE=38, WHILE=39, DO=40, FOR=41, TO=42, DOWNTO=43, IN=44, RANGEOP=45, 
		BEGIN=46, END=47, DONE=48, SEMICOLON=49, LET=50, LAMBDADEC=51, RECURSION=52, 
		VARIABLE=53, COMMENT=54, LINE_COMMENT=55;
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
			"INTEGER", "DOUBLE", "BOOLEAN", "UNIT", "MATCH", "WITH", "ARROW", "TYPE", 
			"TYPEOP", "WS", "TOSKIP", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", 
			"TO", "DOWNTO", "IN", "RANGEOP", "BEGIN", "END", "DONE", "SEMICOLON", 
			"LET", "LAMBDADEC", "RECURSION", "VARIABLE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'|'", "','", "'['", "']'", "'list'", "'**'", "'*'", 
			"'/'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'||'", 
			"'&&'", "'not'", "'?'", "'::'", "'@'", null, null, null, null, "'match'", 
			"'with'", "'->'", null, "':'", null, null, "'if'", "'then'", "'else'", 
			"'while'", "'do'", "'for'", "'to'", "'downto'", "'in'", "'..'", "'begin'", 
			"'end'", "'done'", "';'", "'let'", "'fun'", "'rec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "POW", "MUL", "DIV", 
			"ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", 
			"EQUAL", "NOTEQUAL", "OR", "AND", "NOT", "TERNARYOP", "ATTACH", "CONC", 
			"INTEGER", "DOUBLE", "BOOLEAN", "UNIT", "MATCH", "WITH", "ARROW", "TYPE", 
			"TYPEOP", "WS", "TOSKIP", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", 
			"TO", "DOWNTO", "IN", "RANGEOP", "BEGIN", "END", "DONE", "SEMICOLON", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0167\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\6\32\u00af\n\32\r\32\16\32\u00b0"+
		"\3\33\6\33\u00b4\n\33\r\33\16\33\u00b5\3\33\3\33\6\33\u00ba\n\33\r\33"+
		"\16\33\u00bb\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00c7\n"+
		"\34\3\35\3\35\7\35\u00cb\n\35\f\35\16\35\u00ce\13\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00f1\n!\3\"\3\"\3#\6#\u00f6"+
		"\n#\r#\16#\u00f7\3$\6$\u00fb\n$\r$\16$\u00fc\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u014a\n\66\f\66\16"+
		"\66\u014d\13\66\3\67\3\67\3\67\3\67\7\67\u0153\n\67\f\67\16\67\u0156\13"+
		"\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\78\u0161\n8\f8\168\u0164\138"+
		"\38\38\3\u0154\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9\3\2\b\3\2\62;\4\2\13\13\"\"\4\2\13\f\17\17\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2\f\f\17\17\2\u0173\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7"+
		"u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r{\3\2\2\2\17}\3\2\2\2\21\u0082\3\2\2"+
		"\2\23\u0085\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0097"+
		"\3\2\2\2%\u0099\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2"+
		"-\u00a6\3\2\2\2/\u00a8\3\2\2\2\61\u00ab\3\2\2\2\63\u00ae\3\2\2\2\65\u00b3"+
		"\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00d1\3\2\2\2=\u00d7\3\2\2\2"+
		"?\u00dc\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f5\3\2\2\2G\u00fa\3"+
		"\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0108\3\2\2\2O\u010d\3\2\2\2Q\u0113"+
		"\3\2\2\2S\u0116\3\2\2\2U\u011a\3\2\2\2W\u011d\3\2\2\2Y\u0124\3\2\2\2["+
		"\u0127\3\2\2\2]\u012a\3\2\2\2_\u0130\3\2\2\2a\u0134\3\2\2\2c\u0139\3\2"+
		"\2\2e\u013b\3\2\2\2g\u013f\3\2\2\2i\u0143\3\2\2\2k\u0147\3\2\2\2m\u014e"+
		"\3\2\2\2o\u015c\3\2\2\2qr\7*\2\2r\4\3\2\2\2st\7+\2\2t\6\3\2\2\2uv\7~\2"+
		"\2v\b\3\2\2\2wx\7.\2\2x\n\3\2\2\2yz\7]\2\2z\f\3\2\2\2{|\7_\2\2|\16\3\2"+
		"\2\2}~\7n\2\2~\177\7k\2\2\177\u0080\7u\2\2\u0080\u0081\7v\2\2\u0081\20"+
		"\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0084\7,\2\2\u0084\22\3\2\2\2\u0085"+
		"\u0086\7,\2\2\u0086\24\3\2\2\2\u0087\u0088\7\61\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\7-\2\2\u008a\30\3\2\2\2\u008b\u008c\7/\2\2\u008c\32\3\2\2\2\u008d"+
		"\u008e\7>\2\2\u008e\34\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7?\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7@\2\2\u0093 \3\2\2\2\u0094\u0095\7@\2\2\u0095"+
		"\u0096\7?\2\2\u0096\"\3\2\2\2\u0097\u0098\7?\2\2\u0098$\3\2\2\2\u0099"+
		"\u009a\7>\2\2\u009a\u009b\7@\2\2\u009b&\3\2\2\2\u009c\u009d\7~\2\2\u009d"+
		"\u009e\7~\2\2\u009e(\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\7(\2\2\u00a1"+
		"*\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		",\3\2\2\2\u00a6\u00a7\7A\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa"+
		"\7<\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7B\2\2\u00ac\62\3\2\2\2\u00ad\u00af"+
		"\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\64\3\2\2\2\u00b2\u00b4\t\2\2\2\u00b3\u00b2\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\7\60\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\66"+
		"\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0"+
		"\u00c7\7g\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4\u00c5\7u\2\2\u00c5\u00c7\7g\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1"+
		"\3\2\2\2\u00c78\3\2\2\2\u00c8\u00cc\7*\2\2\u00c9\u00cb\5E#\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0:\3\2\2\2\u00d1"+
		"\u00d2\7o\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7e\2\2"+
		"\u00d5\u00d6\7j\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9\7k\2"+
		"\2\u00d9\u00da\7v\2\2\u00da\u00db\7j\2\2\u00db>\3\2\2\2\u00dc\u00dd\7"+
		"/\2\2\u00dd\u00de\7@\2\2\u00de@\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00f1\7v\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7q\2\2\u00e4"+
		"\u00e5\7w\2\2\u00e5\u00e6\7d\2\2\u00e6\u00e7\7n\2\2\u00e7\u00f1\7g\2\2"+
		"\u00e8\u00e9\7d\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7q\2\2\u00eb\u00f1"+
		"\7n\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7k\2\2\u00ef"+
		"\u00f1\7v\2\2\u00f0\u00df\3\2\2\2\u00f0\u00e2\3\2\2\2\u00f0\u00e8\3\2"+
		"\2\2\u00f0\u00ec\3\2\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3D\3\2"+
		"\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8F\3\2\2\2\u00f9\u00fb\t\4\2\2"+
		"\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b$\2\2\u00ffH\3\2\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7h\2\2\u0102J\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105"+
		"\7j\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107L\3\2\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7n\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2\u010c"+
		"N\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f\7j\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112P\3\2\2\2\u0113\u0114\7f\2\2\u0114"+
		"\u0115\7q\2\2\u0115R\3\2\2\2\u0116\u0117\7h\2\2\u0117\u0118\7q\2\2\u0118"+
		"\u0119\7t\2\2\u0119T\3\2\2\2\u011a\u011b\7v\2\2\u011b\u011c\7q\2\2\u011c"+
		"V\3\2\2\2\u011d\u011e\7f\2\2\u011e\u011f\7q\2\2\u011f\u0120\7y\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7v\2\2\u0122\u0123\7q\2\2\u0123X\3\2\2\2\u0124"+
		"\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126Z\3\2\2\2\u0127\u0128\7\60\2\2\u0128"+
		"\u0129\7\60\2\2\u0129\\\3\2\2\2\u012a\u012b\7d\2\2\u012b\u012c\7g\2\2"+
		"\u012c\u012d\7i\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012f^\3\2\2"+
		"\2\u0130\u0131\7g\2\2\u0131\u0132\7p\2\2\u0132\u0133\7f\2\2\u0133`\3\2"+
		"\2\2\u0134\u0135\7f\2\2\u0135\u0136\7q\2\2\u0136\u0137\7p\2\2\u0137\u0138"+
		"\7g\2\2\u0138b\3\2\2\2\u0139\u013a\7=\2\2\u013ad\3\2\2\2\u013b\u013c\7"+
		"n\2\2\u013c\u013d\7g\2\2\u013d\u013e\7v\2\2\u013ef\3\2\2\2\u013f\u0140"+
		"\7h\2\2\u0140\u0141\7w\2\2\u0141\u0142\7p\2\2\u0142h\3\2\2\2\u0143\u0144"+
		"\7t\2\2\u0144\u0145\7g\2\2\u0145\u0146\7e\2\2\u0146j\3\2\2\2\u0147\u014b"+
		"\t\5\2\2\u0148\u014a\t\6\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cl\3\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014e\u014f\7*\2\2\u014f\u0150\7,\2\2\u0150\u0154\3\2\2\2\u0151\u0153"+
		"\13\2\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158"+
		"\7,\2\2\u0158\u0159\7+\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b\67\2\2\u015b"+
		"n\3\2\2\2\u015c\u015d\7\61\2\2\u015d\u015e\7\61\2\2\u015e\u0162\3\2\2"+
		"\2\u015f\u0161\n\7\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\b8\2\2\u0166p\3\2\2\2\16\2\u00b0\u00b5\u00bb\u00c6\u00cc\u00f0"+
		"\u00f7\u00fc\u014b\u0154\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}