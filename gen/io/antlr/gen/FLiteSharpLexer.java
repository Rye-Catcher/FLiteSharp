// Generated from F:/Github repos/CS4215 project/FLiteSharp/src/main/resources/parser\FLiteSharp.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, POW=4, MUL=5, DIV=6, ADD=7, SUB=8, LESSTHAN=9, 
		LESSTHANOREQUAL=10, GREATERTHAN=11, GREATERTHANOREQUAL=12, EQUALPHYS=13, 
		NOTEQUALPHYS=14, OR=15, AND=16, NOT=17, NUMBER=18, WS=19, TOSKIP=20, BOOLEAN=21, 
		SEMICOLON=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", 
			"LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", 
			"NOTEQUALPHYS", "OR", "AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", 
			"SEMICOLON"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", "'not'", null, 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "POW", "MUL", "DIV", "ADD", "SUB", "LESSTHAN", 
			"LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", 
			"NOTEQUALPHYS", "OR", "AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", 
			"SEMICOLON"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\6\23\\\n\23\r\23\16\23]\3"+
		"\23\6\23a\n\23\r\23\16\23b\3\23\6\23f\n\23\r\23\16\23g\3\23\7\23k\n\23"+
		"\f\23\16\23n\13\23\5\23p\n\23\3\24\6\24s\n\24\r\24\16\24t\3\25\6\25x\n"+
		"\25\r\25\16\25y\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0087\n\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2"+
		"\5\3\2\62;\3\2\"\"\4\2\13\f\17\17\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2"+
		"\t\65\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23@\3\2\2"+
		"\2\25B\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33J\3\2\2\2\35M\3\2\2\2\37P\3\2"+
		"\2\2!S\3\2\2\2#V\3\2\2\2%o\3\2\2\2\'r\3\2\2\2)w\3\2\2\2+\u0086\3\2\2\2"+
		"-\u0088\3\2\2\2/\60\7*\2\2\60\4\3\2\2\2\61\62\7+\2\2\62\6\3\2\2\2\63\64"+
		"\7.\2\2\64\b\3\2\2\2\65\66\7,\2\2\66\67\7,\2\2\67\n\3\2\2\289\7,\2\29"+
		"\f\3\2\2\2:;\7\61\2\2;\16\3\2\2\2<=\7-\2\2=\20\3\2\2\2>?\7/\2\2?\22\3"+
		"\2\2\2@A\7>\2\2A\24\3\2\2\2BC\7>\2\2CD\7?\2\2D\26\3\2\2\2EF\7@\2\2F\30"+
		"\3\2\2\2GH\7@\2\2HI\7?\2\2I\32\3\2\2\2JK\7?\2\2KL\7?\2\2L\34\3\2\2\2M"+
		"N\7#\2\2NO\7?\2\2O\36\3\2\2\2PQ\7~\2\2QR\7~\2\2R \3\2\2\2ST\7(\2\2TU\7"+
		"(\2\2U\"\3\2\2\2VW\7p\2\2WX\7q\2\2XY\7v\2\2Y$\3\2\2\2Z\\\t\2\2\2[Z\3\2"+
		"\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^p\3\2\2\2_a\t\2\2\2`_\3\2\2\2ab\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\7\60\2\2ed\3\2\2\2fg\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hl\3\2\2\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2l"+
		"m\3\2\2\2mp\3\2\2\2nl\3\2\2\2o[\3\2\2\2o`\3\2\2\2p&\3\2\2\2qs\t\3\2\2"+
		"rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vx\t\4\2\2wv\3\2\2\2"+
		"xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\25\2\2|*\3\2\2\2}~\7v\2\2"+
		"~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0087\7g\2\2\u0081\u0082\7h\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2"+
		"\u0086}\3\2\2\2\u0086\u0081\3\2\2\2\u0087,\3\2\2\2\u0088\u0089\7=\2\2"+
		"\u0089.\3\2\2\2\13\2]bgloty\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}