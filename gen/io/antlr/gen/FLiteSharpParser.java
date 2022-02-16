// Generated from /Users/xiaoteng/Codes/CS4215/FLiteSharp/src/main/resources/parser/FLiteSharp.g4 by ANTLR 4.9.2
package io.antlr.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FLiteSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, POW=3, MUL=4, DIV=5, ADD=6, SUB=7, LESSTHAN=8, LESSTHANOREQUAL=9, 
		GREATERTHAN=10, GREATERTHANOREQUAL=11, EQUALPHYS=12, NOTEQUALPHYS=13, 
		OR=14, AND=15, NOT=16, NUMBER=17, WS=18, TOSKIP=19, BOOLEAN=20, SEMICOLON=21;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_expression = 2, RULE_parenthesesExpression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "expression", "parenthesesExpression"
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

	@Override
	public String getGrammarFileName() { return "FLiteSharp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FLiteSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				expression(0);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NOT) | (1L << NUMBER) | (1L << WS) | (1L << BOOLEAN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(FLiteSharpParser.MUL, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(FLiteSharpParser.ADD, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(FLiteSharpParser.OR, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSTHANOREQUAL() { return getToken(FLiteSharpParser.LESSTHANOREQUAL, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public LessThanOrEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATERTHANOREQUAL() { return getToken(FLiteSharpParser.GREATERTHANOREQUAL, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public GreaterThanOrEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext argument;
		public TerminalNode NOT() { return getToken(FLiteSharpParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WS() { return getToken(FLiteSharpParser.WS, 0); }
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESSTHAN() { return getToken(FLiteSharpParser.LESSTHAN, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public LessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualPhysicalContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALPHYS() { return getToken(FLiteSharpParser.EQUALPHYS, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public EqualPhysicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterEqualPhysical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitEqualPhysical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitEqualPhysical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(FLiteSharpParser.SUB, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(FLiteSharpParser.NUMBER, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(FLiteSharpParser.GREATERTHAN, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public GreaterThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualPhysicalContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUALPHYS() { return getToken(FLiteSharpParser.NOTEQUALPHYS, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public NotEqualPhysicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterNotEqualPhysical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitNotEqualPhysical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitNotEqualPhysical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(FLiteSharpParser.AND, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(FLiteSharpParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(FLiteSharpParser.BOOLEAN, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public BooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public ParenthesesExpressionContext parenthesesExpression() {
			return getRuleContext(ParenthesesExpressionContext.class,0);
		}
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(FLiteSharpParser.POW, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public PowerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(16);
					match(WS);
					}
				}

				setState(19);
				match(NUMBER);
				setState(21);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(20);
					match(WS);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(23);
					match(WS);
					}
				}

				setState(26);
				match(BOOLEAN);
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(27);
					match(WS);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				parenthesesExpression();
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				((NotContext)_localctx).operator = match(NOT);
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(32);
					match(WS);
					}
					break;
				}
				setState(35);
				((NotContext)_localctx).argument = expression(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(38);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(40);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(39);
							match(WS);
							}
						}

						setState(42);
						((PowerContext)_localctx).operator = match(POW);
						setState(44);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(43);
							match(WS);
							}
							break;
						}
						setState(46);
						((PowerContext)_localctx).right = expression(14);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(48);
							match(WS);
							}
						}

						setState(51);
						((MultiplicationContext)_localctx).operator = match(MUL);
						setState(53);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(52);
							match(WS);
							}
							break;
						}
						setState(55);
						((MultiplicationContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(58);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(57);
							match(WS);
							}
						}

						setState(60);
						((DivisionContext)_localctx).operator = match(DIV);
						setState(62);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(61);
							match(WS);
							}
							break;
						}
						setState(64);
						((DivisionContext)_localctx).right = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(66);
							match(WS);
							}
						}

						setState(69);
						((AdditionContext)_localctx).operator = match(ADD);
						setState(71);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(70);
							match(WS);
							}
							break;
						}
						setState(73);
						((AdditionContext)_localctx).right = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(75);
							match(WS);
							}
						}

						setState(78);
						((SubtractionContext)_localctx).operator = match(SUB);
						setState(80);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(79);
							match(WS);
							}
							break;
						}
						setState(82);
						((SubtractionContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(85);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(84);
							match(WS);
							}
						}

						setState(87);
						((LessThanContext)_localctx).operator = match(LESSTHAN);
						setState(89);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(88);
							match(WS);
							}
							break;
						}
						setState(91);
						((LessThanContext)_localctx).right = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(93);
							match(WS);
							}
						}

						setState(96);
						((LessThanOrEqualContext)_localctx).operator = match(LESSTHANOREQUAL);
						setState(98);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(97);
							match(WS);
							}
							break;
						}
						setState(100);
						((LessThanOrEqualContext)_localctx).right = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(102);
							match(WS);
							}
						}

						setState(105);
						((GreaterThanContext)_localctx).operator = match(GREATERTHAN);
						setState(107);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(106);
							match(WS);
							}
							break;
						}
						setState(109);
						((GreaterThanContext)_localctx).right = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(112);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(111);
							match(WS);
							}
						}

						setState(114);
						((GreaterThanOrEqualContext)_localctx).operator = match(GREATERTHANOREQUAL);
						setState(116);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(115);
							match(WS);
							}
							break;
						}
						setState(118);
						((GreaterThanOrEqualContext)_localctx).right = expression(7);
						}
						break;
					case 10:
						{
						_localctx = new EqualPhysicalContext(new ExpressionContext(_parentctx, _parentState));
						((EqualPhysicalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(120);
							match(WS);
							}
						}

						setState(123);
						((EqualPhysicalContext)_localctx).operator = match(EQUALPHYS);
						setState(125);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(124);
							match(WS);
							}
							break;
						}
						setState(127);
						((EqualPhysicalContext)_localctx).right = expression(6);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualPhysicalContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualPhysicalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(130);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(129);
							match(WS);
							}
						}

						setState(132);
						((NotEqualPhysicalContext)_localctx).operator = match(NOTEQUALPHYS);
						setState(134);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(133);
							match(WS);
							}
							break;
						}
						setState(136);
						((NotEqualPhysicalContext)_localctx).right = expression(5);
						}
						break;
					case 12:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(138);
							match(WS);
							}
						}

						setState(141);
						((AndContext)_localctx).operator = match(AND);
						setState(143);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(142);
							match(WS);
							}
							break;
						}
						setState(145);
						((AndContext)_localctx).right = expression(3);
						}
						break;
					case 13:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(147);
							match(WS);
							}
						}

						setState(150);
						((OrContext)_localctx).operator = match(OR);
						setState(152);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(151);
							match(WS);
							}
							break;
						}
						setState(154);
						((OrContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParenthesesExpressionContext extends ParserRuleContext {
		public ExpressionContext inner;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ParenthesesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterParenthesesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitParenthesesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitParenthesesExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesesExpressionContext parenthesesExpression() throws RecognitionException {
		ParenthesesExpressionContext _localctx = new ParenthesesExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parenthesesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(160);
				match(WS);
				}
			}

			setState(163);
			match(T__0);
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(164);
				match(WS);
				}
				break;
			}
			setState(167);
			((ParenthesesExpressionContext)_localctx).inner = expression(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168);
				match(WS);
				}
			}

			setState(171);
			match(T__1);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(172);
				match(WS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\6\3\16\n\3\r\3\16\3\17\3\4\3\4\5"+
		"\4\24\n\4\3\4\3\4\5\4\30\n\4\3\4\5\4\33\n\4\3\4\3\4\5\4\37\n\4\3\4\3\4"+
		"\3\4\5\4$\n\4\3\4\5\4\'\n\4\3\4\3\4\5\4+\n\4\3\4\3\4\5\4/\n\4\3\4\3\4"+
		"\3\4\5\4\64\n\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\5\4A\n\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4\5"+
		"\4S\n\4\3\4\3\4\3\4\5\4X\n\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\5\4a\n\4\3"+
		"\4\3\4\5\4e\n\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\4\5\4"+
		"s\n\4\3\4\3\4\5\4w\n\4\3\4\3\4\3\4\5\4|\n\4\3\4\3\4\5\4\u0080\n\4\3\4"+
		"\3\4\3\4\5\4\u0085\n\4\3\4\3\4\5\4\u0089\n\4\3\4\3\4\3\4\5\4\u008e\n\4"+
		"\3\4\3\4\5\4\u0092\n\4\3\4\3\4\3\4\5\4\u0097\n\4\3\4\3\4\5\4\u009b\n\4"+
		"\3\4\7\4\u009e\n\4\f\4\16\4\u00a1\13\4\3\5\5\5\u00a4\n\5\3\5\3\5\5\5\u00a8"+
		"\n\5\3\5\3\5\5\5\u00ac\n\5\3\5\3\5\5\5\u00b0\n\5\3\5\2\3\6\6\2\4\6\b\2"+
		"\2\2\u00e1\2\n\3\2\2\2\4\r\3\2\2\2\6&\3\2\2\2\b\u00a3\3\2\2\2\n\13\5\4"+
		"\3\2\13\3\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2"+
		"\17\20\3\2\2\2\20\5\3\2\2\2\21\23\b\4\1\2\22\24\7\24\2\2\23\22\3\2\2\2"+
		"\23\24\3\2\2\2\24\25\3\2\2\2\25\27\7\23\2\2\26\30\7\24\2\2\27\26\3\2\2"+
		"\2\27\30\3\2\2\2\30\'\3\2\2\2\31\33\7\24\2\2\32\31\3\2\2\2\32\33\3\2\2"+
		"\2\33\34\3\2\2\2\34\36\7\26\2\2\35\37\7\24\2\2\36\35\3\2\2\2\36\37\3\2"+
		"\2\2\37\'\3\2\2\2 \'\5\b\5\2!#\7\22\2\2\"$\7\24\2\2#\"\3\2\2\2#$\3\2\2"+
		"\2$%\3\2\2\2%\'\5\6\4\5&\21\3\2\2\2&\32\3\2\2\2& \3\2\2\2&!\3\2\2\2\'"+
		"\u009f\3\2\2\2(*\f\20\2\2)+\7\24\2\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7"+
		"\5\2\2-/\7\24\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\u009e\5\6\4\20\61"+
		"\63\f\17\2\2\62\64\7\24\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\67\7\6\2\2\668\7\24\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29\u009e"+
		"\5\6\4\20:<\f\16\2\2;=\7\24\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>@\7\7\2"+
		"\2?A\7\24\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2B\u009e\5\6\4\17CE\f\r\2\2"+
		"DF\7\24\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7\b\2\2HJ\7\24\2\2IH\3\2\2"+
		"\2IJ\3\2\2\2JK\3\2\2\2K\u009e\5\6\4\16LN\f\f\2\2MO\7\24\2\2NM\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PR\7\t\2\2QS\7\24\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2T\u009e\5\6\4\rUW\f\13\2\2VX\7\24\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2"+
		"Y[\7\n\2\2Z\\\7\24\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]\u009e\5\6\4\f"+
		"^`\f\n\2\2_a\7\24\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\13\2\2ce\7\24"+
		"\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2f\u009e\5\6\4\13gi\f\t\2\2hj\7\24\2"+
		"\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\f\2\2ln\7\24\2\2ml\3\2\2\2mn\3\2"+
		"\2\2no\3\2\2\2o\u009e\5\6\4\npr\f\b\2\2qs\7\24\2\2rq\3\2\2\2rs\3\2\2\2"+
		"st\3\2\2\2tv\7\r\2\2uw\7\24\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u009e\5"+
		"\6\4\ty{\f\7\2\2z|\7\24\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\16\2"+
		"\2~\u0080\7\24\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\u009e\5\6\4\b\u0082\u0084\f\6\2\2\u0083\u0085\7\24\2\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\17\2\2"+
		"\u0087\u0089\7\24\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u009e\5\6\4\7\u008b\u008d\f\4\2\2\u008c\u008e\7\24\2\2"+
		"\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
		"\7\21\2\2\u0090\u0092\7\24\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u009e\5\6\4\5\u0094\u0096\f\3\2\2\u0095\u0097"+
		"\7\24\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\u009a\7\20\2\2\u0099\u009b\7\24\2\2\u009a\u0099\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\5\6\4\4\u009d(\3\2\2\2\u009d"+
		"\61\3\2\2\2\u009d:\3\2\2\2\u009dC\3\2\2\2\u009dL\3\2\2\2\u009dU\3\2\2"+
		"\2\u009d^\3\2\2\2\u009dg\3\2\2\2\u009dp\3\2\2\2\u009dy\3\2\2\2\u009d\u0082"+
		"\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0094\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a2\u00a4\7\24\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\7\3\2\2\u00a6\u00a8\7\24\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\5\6\4\2\u00aa\u00ac"+
		"\7\24\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00af\7\4\2\2\u00ae\u00b0\7\24\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\t\3\2\2\2)\17\23\27\32\36#&*.\63\67<@EINRW[`dimrv{\177"+
		"\u0084\u0088\u008d\u0091\u0096\u009a\u009d\u009f\u00a3\u00a7\u00ab\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}