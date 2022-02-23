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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, POW=6, MUL=7, DIV=8, ADD=9, SUB=10, 
		LESSTHAN=11, LESSTHANOREQUAL=12, GREATERTHAN=13, GREATERTHANOREQUAL=14, 
		EQUALPHYS=15, NOTEQUALPHYS=16, OR=17, AND=18, NOT=19, NUMBER=20, WS=21, 
		TOSKIP=22, BOOLEAN=23, SEMICOLON=24, VARIABLE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "POW", "MUL", "DIV", "ADD", "SUB", 
			"LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", 
			"NOTEQUALPHYS", "OR", "AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", 
			"SEMICOLON", "VARIABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'fun'", "'->'", "'**'", "'*'", "'/'", "'+'", 
			"'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'||'", "'&&'", 
			"'not'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "POW", "MUL", "DIV", "ADD", "SUB", 
			"LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", "GREATERTHANOREQUAL", "EQUALPHYS", 
			"NOTEQUALPHYS", "OR", "AND", "NOT", "NUMBER", "WS", "TOSKIP", "BOOLEAN", 
			"SEMICOLON", "VARIABLE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25i\n\25\r\25\16\25j\3\25\6\25n"+
		"\n\25\r\25\16\25o\3\25\6\25s\n\25\r\25\16\25t\3\25\7\25x\n\25\f\25\16"+
		"\25{\13\25\5\25}\n\25\3\26\6\26\u0080\n\26\r\26\16\26\u0081\3\27\6\27"+
		"\u0085\n\27\r\27\16\27\u0086\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0094\n\30\3\31\3\31\3\32\3\32\7\32\u009a\n\32\f\32"+
		"\16\32\u009d\13\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\7\3\2\62;\3\2\"\"\4\2\13\f\17\17\3\2c|\5\2\62;C\\c|\2\u00a6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2\t;\3"+
		"\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K"+
		"\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!"+
		"Z\3\2\2\2#]\3\2\2\2%`\3\2\2\2\'c\3\2\2\2)|\3\2\2\2+\177\3\2\2\2-\u0084"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\66\7*\2\2"+
		"\66\4\3\2\2\2\678\7+\2\28\6\3\2\2\29:\7.\2\2:\b\3\2\2\2;<\7h\2\2<=\7w"+
		"\2\2=>\7p\2\2>\n\3\2\2\2?@\7/\2\2@A\7@\2\2A\f\3\2\2\2BC\7,\2\2CD\7,\2"+
		"\2D\16\3\2\2\2EF\7,\2\2F\20\3\2\2\2GH\7\61\2\2H\22\3\2\2\2IJ\7-\2\2J\24"+
		"\3\2\2\2KL\7/\2\2L\26\3\2\2\2MN\7>\2\2N\30\3\2\2\2OP\7>\2\2PQ\7?\2\2Q"+
		"\32\3\2\2\2RS\7@\2\2S\34\3\2\2\2TU\7@\2\2UV\7?\2\2V\36\3\2\2\2WX\7?\2"+
		"\2XY\7?\2\2Y \3\2\2\2Z[\7#\2\2[\\\7?\2\2\\\"\3\2\2\2]^\7~\2\2^_\7~\2\2"+
		"_$\3\2\2\2`a\7(\2\2ab\7(\2\2b&\3\2\2\2cd\7p\2\2de\7q\2\2ef\7v\2\2f(\3"+
		"\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k}\3\2\2\2ln\t"+
		"\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\60\2\2rq"+
		"\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3\2\2\2vx\t\2\2\2wv\3\2\2\2x"+
		"{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|h\3\2\2\2|m\3\2\2\2"+
		"}*\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082,\3\2\2\2\u0083\u0085\t\4\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\b\27\2\2\u0089.\3\2\2\2\u008a\u008b\7v\2\2"+
		"\u008b\u008c\7t\2\2\u008c\u008d\7w\2\2\u008d\u0094\7g\2\2\u008e\u008f"+
		"\7h\2\2\u008f\u0090\7c\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0094\7g\2\2\u0093\u008a\3\2\2\2\u0093\u008e\3\2\2\2\u0094\60\3\2\2\2"+
		"\u0095\u0096\7=\2\2\u0096\62\3\2\2\2\u0097\u009b\t\5\2\2\u0098\u009a\t"+
		"\6\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\64\3\2\2\2\u009d\u009b\3\2\2\2\f\2joty|\u0081\u0086"+
		"\u0093\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}