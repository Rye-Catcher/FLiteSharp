// Generated from F:/Github repos/CS4215 project/FLiteSharp/src/main/resources/parser\FLiteSharp.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, POW=11, MUL=12, DIV=13, ADD=14, SUB=15, LESSTHAN=16, LESSTHANOREQUAL=17, 
		GREATERTHAN=18, GREATERTHANOREQUAL=19, EQUALPHYS=20, NOTEQUALPHYS=21, 
		OR=22, AND=23, NOT=24, NUMBER=25, WS=26, TOSKIP=27, BOOLEAN=28, SEMICOLON=29, 
		VARIABLE=30;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_expression = 2, RULE_parenthesesExpression = 3, 
		RULE_tupleExpression = 4, RULE_lambdaParameters = 5, RULE_lambdaExpression = 6, 
		RULE_funcDeclration = 7, RULE_suite = 8, RULE_returnStmt = 9, RULE_applyParameters = 10, 
		RULE_funcApplication = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "expression", "parenthesesExpression", "tupleExpression", 
			"lambdaParameters", "lambdaExpression", "funcDeclration", "suite", "returnStmt", 
			"applyParameters", "funcApplication"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'fun'", "'->'", "'let'", "'='", "'{'", "'}'", 
			"'return'", "'**'", "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'||'", "'&&'", "'not'", null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "POW", 
			"MUL", "DIV", "ADD", "SUB", "LESSTHAN", "LESSTHANOREQUAL", "GREATERTHAN", 
			"GREATERTHANOREQUAL", "EQUALPHYS", "NOTEQUALPHYS", "OR", "AND", "NOT", 
			"NUMBER", "WS", "TOSKIP", "BOOLEAN", "SEMICOLON", "VARIABLE"
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
			setState(24);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(FLiteSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(FLiteSharpParser.SEMICOLON, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(26);
					expression(0);
					setState(27);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class FunctionReturnContext extends ExpressionContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public FunctionReturnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
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
	public static class VariableContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitVariable(this);
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
	public static class FunctionApplicationContext extends ExpressionContext {
		public FuncApplicationContext funcApplication() {
			return getRuleContext(FuncApplicationContext.class,0);
		}
		public FunctionApplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFunctionApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFunctionApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFunctionApplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public LambdaFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitLambdaFunction(this);
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
	public static class FunctionDeclarationContext extends ExpressionContext {
		public FuncDeclrationContext funcDeclration() {
			return getRuleContext(FuncDeclrationContext.class,0);
		}
		public FunctionDeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
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
	public static class NegativeContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(FLiteSharpParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitNegative(this);
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
	public static class TupleContext extends ExpressionContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitTuple(this);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				parenthesesExpression();
				}
				break;
			case 2:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(SUB);
				setState(36);
				expression(22);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				((NotContext)_localctx).operator = match(NOT);
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(38);
					match(WS);
					}
					break;
				}
				setState(41);
				((NotContext)_localctx).argument = expression(11);
				}
				break;
			case 4:
				{
				_localctx = new FunctionApplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				funcApplication();
				}
				break;
			case 5:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(43);
					match(WS);
					}
				}

				setState(46);
				match(VARIABLE);
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(47);
					match(WS);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(50);
					match(WS);
					}
				}

				setState(53);
				match(NUMBER);
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(54);
					match(WS);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
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
				match(BOOLEAN);
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(61);
					match(WS);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				tupleExpression();
				}
				break;
			case 9:
				{
				_localctx = new LambdaFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				lambdaExpression();
				}
				break;
			case 10:
				{
				_localctx = new FunctionDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				funcDeclration();
				}
				break;
			case 11:
				{
				_localctx = new FunctionReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				returnStmt();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(72);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(71);
							match(WS);
							}
						}

						setState(74);
						((PowerContext)_localctx).operator = match(POW);
						setState(76);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(75);
							match(WS);
							}
							break;
						}
						setState(78);
						((PowerContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(80);
							match(WS);
							}
						}

						setState(83);
						((MultiplicationContext)_localctx).operator = match(MUL);
						setState(85);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(84);
							match(WS);
							}
							break;
						}
						setState(87);
						((MultiplicationContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(89);
							match(WS);
							}
						}

						setState(92);
						((DivisionContext)_localctx).operator = match(DIV);
						setState(94);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(93);
							match(WS);
							}
							break;
						}
						setState(96);
						((DivisionContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(98);
							match(WS);
							}
						}

						setState(101);
						((AdditionContext)_localctx).operator = match(ADD);
						setState(103);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(102);
							match(WS);
							}
							break;
						}
						setState(105);
						((AdditionContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(107);
							match(WS);
							}
						}

						setState(110);
						((SubtractionContext)_localctx).operator = match(SUB);
						setState(112);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(111);
							match(WS);
							}
							break;
						}
						setState(114);
						((SubtractionContext)_localctx).right = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(115);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(116);
							match(WS);
							}
						}

						setState(119);
						((LessThanContext)_localctx).operator = match(LESSTHAN);
						setState(121);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(120);
							match(WS);
							}
							break;
						}
						setState(123);
						((LessThanContext)_localctx).right = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new LessThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(125);
							match(WS);
							}
						}

						setState(128);
						((LessThanOrEqualContext)_localctx).operator = match(LESSTHANOREQUAL);
						setState(130);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(129);
							match(WS);
							}
							break;
						}
						setState(132);
						((LessThanOrEqualContext)_localctx).right = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(134);
							match(WS);
							}
						}

						setState(137);
						((GreaterThanContext)_localctx).operator = match(GREATERTHAN);
						setState(139);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(138);
							match(WS);
							}
							break;
						}
						setState(141);
						((GreaterThanContext)_localctx).right = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(143);
							match(WS);
							}
						}

						setState(146);
						((GreaterThanOrEqualContext)_localctx).operator = match(GREATERTHANOREQUAL);
						setState(148);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(147);
							match(WS);
							}
							break;
						}
						setState(150);
						((GreaterThanOrEqualContext)_localctx).right = expression(15);
						}
						break;
					case 10:
						{
						_localctx = new EqualPhysicalContext(new ExpressionContext(_parentctx, _parentState));
						((EqualPhysicalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(152);
							match(WS);
							}
						}

						setState(155);
						((EqualPhysicalContext)_localctx).operator = match(EQUALPHYS);
						setState(157);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(156);
							match(WS);
							}
							break;
						}
						setState(159);
						((EqualPhysicalContext)_localctx).right = expression(14);
						}
						break;
					case 11:
						{
						_localctx = new NotEqualPhysicalContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualPhysicalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(161);
							match(WS);
							}
						}

						setState(164);
						((NotEqualPhysicalContext)_localctx).operator = match(NOTEQUALPHYS);
						setState(166);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(165);
							match(WS);
							}
							break;
						}
						setState(168);
						((NotEqualPhysicalContext)_localctx).right = expression(13);
						}
						break;
					case 12:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(170);
							match(WS);
							}
						}

						setState(173);
						((AndContext)_localctx).operator = match(AND);
						setState(175);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(174);
							match(WS);
							}
							break;
						}
						setState(177);
						((AndContext)_localctx).right = expression(11);
						}
						break;
					case 13:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(179);
							match(WS);
							}
						}

						setState(182);
						((OrContext)_localctx).operator = match(OR);
						setState(184);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(183);
							match(WS);
							}
							break;
						}
						setState(186);
						((OrContext)_localctx).right = expression(10);
						}
						break;
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(192);
				match(WS);
				}
			}

			setState(195);
			match(T__0);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(196);
				match(WS);
				}
				break;
			}
			setState(199);
			((ParenthesesExpressionContext)_localctx).inner = expression(0);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200);
				match(WS);
				}
			}

			setState(203);
			match(T__1);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(204);
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(207);
				match(WS);
				}
			}

			setState(210);
			match(T__0);
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(211);
				match(WS);
				}
				break;
			}
			setState(214);
			expression(0);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(215);
				match(WS);
				}
			}

			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(T__2);
				setState(219);
				expression(0);
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(224);
				match(WS);
				}
			}

			setState(227);
			match(T__1);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(228);
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(FLiteSharpParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(FLiteSharpParser.VARIABLE, i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambdaParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(VARIABLE);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(232);
					match(WS);
					}
					break;
				}
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
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

	public static class LambdaExpressionContext extends ParserRuleContext {
		public ExpressionContext lambdaBody;
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(239);
				match(WS);
				}
			}

			setState(242);
			match(T__3);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(243);
				match(WS);
				}
			}

			setState(246);
			lambdaParameters();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(247);
				match(WS);
				}
			}

			setState(250);
			match(T__4);
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(251);
				match(WS);
				}
				break;
			}
			setState(254);
			((LambdaExpressionContext)_localctx).lambdaBody = expression(0);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(255);
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

	public static class FuncDeclrationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public FuncDeclrationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFuncDeclration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFuncDeclration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFuncDeclration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclrationContext funcDeclration() throws RecognitionException {
		FuncDeclrationContext _localctx = new FuncDeclrationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcDeclration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(258);
				match(WS);
				}
			}

			setState(261);
			match(T__5);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(262);
				match(WS);
				}
			}

			setState(265);
			match(VARIABLE);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(266);
				match(WS);
				}
			}

			setState(269);
			lambdaParameters();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(270);
				match(WS);
				}
			}

			setState(273);
			match(T__6);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(274);
				match(WS);
				}
				break;
			}
			setState(277);
			suite();
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(278);
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

	public static class SuiteContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(281);
				match(WS);
				}
			}

			setState(284);
			match(T__7);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(285);
				match(WS);
				}
				break;
			}
			setState(288);
			block();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(289);
				match(WS);
				}
			}

			setState(292);
			match(T__8);
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public ExpressionContext returnBody;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(294);
				match(WS);
				}
			}

			setState(297);
			match(T__9);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(298);
				match(WS);
				}
				break;
			}
			setState(301);
			((ReturnStmtContext)_localctx).returnBody = expression(0);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(302);
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

	public static class ApplyParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ApplyParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterApplyParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitApplyParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitApplyParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApplyParametersContext applyParameters() throws RecognitionException {
		ApplyParametersContext _localctx = new ApplyParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_applyParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(305);
				match(WS);
				}
			}

			setState(308);
			match(T__0);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(309);
				match(WS);
				}
				break;
			}
			setState(312);
			expression(0);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(313);
				match(WS);
				}
				break;
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(316);
				match(T__2);
				setState(317);
				expression(0);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(323);
				match(WS);
				}
			}

			setState(326);
			match(T__1);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(327);
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

	public static class FuncApplicationContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public ApplyParametersContext applyParameters() {
			return getRuleContext(ApplyParametersContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public FuncApplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcApplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFuncApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFuncApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFuncApplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncApplicationContext funcApplication() throws RecognitionException {
		FuncApplicationContext _localctx = new FuncApplicationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(330);
				match(WS);
				}
			}

			setState(333);
			match(VARIABLE);
			setState(334);
			applyParameters();
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(335);
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
			return precpred(_ctx, 23);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4*\n\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\5\4\63\n\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\5\4:\n\4\3\4\5\4=\n\4\3\4\3\4\5\4A\n\4\3\4\3\4\3\4\3\4"+
		"\5\4G\n\4\3\4\3\4\5\4K\n\4\3\4\3\4\5\4O\n\4\3\4\3\4\3\4\5\4T\n\4\3\4\3"+
		"\4\5\4X\n\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\5\4f\n\4"+
		"\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\5\4s\n\4\3\4\3\4\3\4\5"+
		"\4x\n\4\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\5\4\u0081\n\4\3\4\3\4\5\4\u0085\n"+
		"\4\3\4\3\4\3\4\5\4\u008a\n\4\3\4\3\4\5\4\u008e\n\4\3\4\3\4\3\4\5\4\u0093"+
		"\n\4\3\4\3\4\5\4\u0097\n\4\3\4\3\4\3\4\5\4\u009c\n\4\3\4\3\4\5\4\u00a0"+
		"\n\4\3\4\3\4\3\4\5\4\u00a5\n\4\3\4\3\4\5\4\u00a9\n\4\3\4\3\4\3\4\5\4\u00ae"+
		"\n\4\3\4\3\4\5\4\u00b2\n\4\3\4\3\4\3\4\5\4\u00b7\n\4\3\4\3\4\5\4\u00bb"+
		"\n\4\3\4\7\4\u00be\n\4\f\4\16\4\u00c1\13\4\3\5\5\5\u00c4\n\5\3\5\3\5\5"+
		"\5\u00c8\n\5\3\5\3\5\5\5\u00cc\n\5\3\5\3\5\5\5\u00d0\n\5\3\6\5\6\u00d3"+
		"\n\6\3\6\3\6\5\6\u00d7\n\6\3\6\3\6\5\6\u00db\n\6\3\6\3\6\6\6\u00df\n\6"+
		"\r\6\16\6\u00e0\3\6\5\6\u00e4\n\6\3\6\3\6\5\6\u00e8\n\6\3\7\3\7\5\7\u00ec"+
		"\n\7\6\7\u00ee\n\7\r\7\16\7\u00ef\3\b\5\b\u00f3\n\b\3\b\3\b\5\b\u00f7"+
		"\n\b\3\b\3\b\5\b\u00fb\n\b\3\b\3\b\5\b\u00ff\n\b\3\b\3\b\5\b\u0103\n\b"+
		"\3\t\5\t\u0106\n\t\3\t\3\t\5\t\u010a\n\t\3\t\3\t\5\t\u010e\n\t\3\t\3\t"+
		"\5\t\u0112\n\t\3\t\3\t\5\t\u0116\n\t\3\t\3\t\5\t\u011a\n\t\3\n\5\n\u011d"+
		"\n\n\3\n\3\n\5\n\u0121\n\n\3\n\3\n\5\n\u0125\n\n\3\n\3\n\3\13\5\13\u012a"+
		"\n\13\3\13\3\13\5\13\u012e\n\13\3\13\3\13\5\13\u0132\n\13\3\f\5\f\u0135"+
		"\n\f\3\f\3\f\5\f\u0139\n\f\3\f\3\f\5\f\u013d\n\f\3\f\3\f\7\f\u0141\n\f"+
		"\f\f\16\f\u0144\13\f\3\f\5\f\u0147\n\f\3\f\3\f\5\f\u014b\n\f\3\r\5\r\u014e"+
		"\n\r\3\r\3\r\3\r\5\r\u0153\n\r\3\r\2\3\6\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\2\2\u01a6\2\32\3\2\2\2\4\37\3\2\2\2\6F\3\2\2\2\b\u00c3\3\2\2\2\n"+
		"\u00d2\3\2\2\2\f\u00ed\3\2\2\2\16\u00f2\3\2\2\2\20\u0105\3\2\2\2\22\u011c"+
		"\3\2\2\2\24\u0129\3\2\2\2\26\u0134\3\2\2\2\30\u014d\3\2\2\2\32\33\5\4"+
		"\3\2\33\3\3\2\2\2\34\35\5\6\4\2\35\36\7\37\2\2\36 \3\2\2\2\37\34\3\2\2"+
		"\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#$\b\4\1\2$G\5\b\5\2%&"+
		"\7\21\2\2&G\5\6\4\30\')\7\32\2\2(*\7\34\2\2)(\3\2\2\2)*\3\2\2\2*+\3\2"+
		"\2\2+G\5\6\4\r,G\5\30\r\2-/\7\34\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60"+
		"\62\7 \2\2\61\63\7\34\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63G\3\2\2\2\64\66"+
		"\7\34\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7\33\2\28:\7\34"+
		"\2\298\3\2\2\29:\3\2\2\2:G\3\2\2\2;=\7\34\2\2<;\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>@\7\36\2\2?A\7\34\2\2@?\3\2\2\2@A\3\2\2\2AG\3\2\2\2BG\5\n\6\2C"+
		"G\5\16\b\2DG\5\20\t\2EG\5\24\13\2F#\3\2\2\2F%\3\2\2\2F\'\3\2\2\2F,\3\2"+
		"\2\2F.\3\2\2\2F\65\3\2\2\2F<\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3"+
		"\2\2\2G\u00bf\3\2\2\2HJ\f\31\2\2IK\7\34\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2"+
		"\2\2LN\7\r\2\2MO\7\34\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2P\u00be\5\6\4\31"+
		"QS\f\27\2\2RT\7\34\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\16\2\2VX\7\34"+
		"\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y\u00be\5\6\4\30Z\\\f\26\2\2[]\7\34"+
		"\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\7\17\2\2_a\7\34\2\2`_\3\2\2\2`"+
		"a\3\2\2\2ab\3\2\2\2b\u00be\5\6\4\27ce\f\25\2\2df\7\34\2\2ed\3\2\2\2ef"+
		"\3\2\2\2fg\3\2\2\2gi\7\20\2\2hj\7\34\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2"+
		"k\u00be\5\6\4\26ln\f\24\2\2mo\7\34\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2p"+
		"r\7\21\2\2qs\7\34\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2t\u00be\5\6\4\25uw"+
		"\f\23\2\2vx\7\34\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7\22\2\2z|\7\34\2"+
		"\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u00be\5\6\4\24~\u0080\f\22\2\2\177\u0081"+
		"\7\34\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\7\23\2\2\u0083\u0085\7\34\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u00be\5\6\4\23\u0087\u0089\f\21\2\2\u0088"+
		"\u008a\7\34\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008d\7\24\2\2\u008c\u008e\7\34\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u00be\5\6\4\22\u0090\u0092\f"+
		"\20\2\2\u0091\u0093\7\34\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\7\25\2\2\u0095\u0097\7\34\2\2\u0096\u0095\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00be\5\6\4\21\u0099"+
		"\u009b\f\17\2\2\u009a\u009c\7\34\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\26\2\2\u009e\u00a0\7\34\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00be\5\6"+
		"\4\20\u00a2\u00a4\f\16\2\2\u00a3\u00a5\7\34\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\27\2\2\u00a7\u00a9\7"+
		"\34\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00be\5\6\4\17\u00ab\u00ad\f\f\2\2\u00ac\u00ae\7\34\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\7\31\2\2\u00b0"+
		"\u00b2\7\34\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00be\5\6\4\r\u00b4\u00b6\f\13\2\2\u00b5\u00b7\7\34\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\30"+
		"\2\2\u00b9\u00bb\7\34\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\5\6\4\f\u00bdH\3\2\2\2\u00bdQ\3\2\2\2\u00bd"+
		"Z\3\2\2\2\u00bdc\3\2\2\2\u00bdl\3\2\2\2\u00bdu\3\2\2\2\u00bd~\3\2\2\2"+
		"\u00bd\u0087\3\2\2\2\u00bd\u0090\3\2\2\2\u00bd\u0099\3\2\2\2\u00bd\u00a2"+
		"\3\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00b4\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\7\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c4\7\34\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c7\7\3\2\2\u00c6\u00c8\7\34\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\5\6\4\2\u00ca\u00cc"+
		"\7\34\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cf\7\4\2\2\u00ce\u00d0\7\34\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\t\3\2\2\2\u00d1\u00d3\7\34\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\3\2\2\u00d5\u00d7\7\34"+
		"\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\5\6\4\2\u00d9\u00db\7\34\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3"+
		"\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00dd\7\5\2\2\u00dd\u00df\5\6\4\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\7\34\2\2\u00e3\u00e2\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\4\2\2\u00e6\u00e8\7\34"+
		"\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\13\3\2\2\2\u00e9\u00eb"+
		"\7 \2\2\u00ea\u00ec\7\34\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\r\3\2\2\2\u00f1\u00f3\7\34\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\7\6\2\2\u00f5"+
		"\u00f7\7\34\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3"+
		"\2\2\2\u00f8\u00fa\5\f\7\2\u00f9\u00fb\7\34\2\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7\7\2\2\u00fd\u00ff\7\34"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0102\5\6\4\2\u0101\u0103\7\34\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\17\3\2\2\2\u0104\u0106\7\34\2\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\7\b\2\2\u0108\u010a\7\34"+
		"\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\7 \2\2\u010c\u010e\7\34\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5\f\7\2\u0110\u0112\7\34\2\2\u0111"+
		"\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\7\t"+
		"\2\2\u0114\u0116\7\34\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\5\22\n\2\u0118\u011a\7\34\2\2\u0119\u0118\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\21\3\2\2\2\u011b\u011d\7\34\2\2\u011c"+
		"\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\7\n"+
		"\2\2\u011f\u0121\7\34\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\5\4\3\2\u0123\u0125\7\34\2\2\u0124\u0123\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7\13\2\2\u0127"+
		"\23\3\2\2\2\u0128\u012a\7\34\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012d\7\f\2\2\u012c\u012e\7\34\2\2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\5\6"+
		"\4\2\u0130\u0132\7\34\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\25\3\2\2\2\u0133\u0135\7\34\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0138\7\3\2\2\u0137\u0139\7\34\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\5\6"+
		"\4\2\u013b\u013d\7\34\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0142\3\2\2\2\u013e\u013f\7\5\2\2\u013f\u0141\5\6\4\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\7\34\2\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7\4\2\2\u0149"+
		"\u014b\7\34\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\27\3\2\2"+
		"\2\u014c\u014e\7\34\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7 \2\2\u0150\u0152\5\26\f\2\u0151\u0153\7\34"+
		"\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\31\3\2\2\2L!).\62\65"+
		"9<@FJNSW\\`einrw{\u0080\u0084\u0089\u008d\u0092\u0096\u009b\u009f\u00a4"+
		"\u00a8\u00ad\u00b1\u00b6\u00ba\u00bd\u00bf\u00c3\u00c7\u00cb\u00cf\u00d2"+
		"\u00d6\u00da\u00e0\u00e3\u00e7\u00eb\u00ef\u00f2\u00f6\u00fa\u00fe\u0102"+
		"\u0105\u0109\u010d\u0111\u0115\u0119\u011c\u0120\u0124\u0129\u012d\u0131"+
		"\u0134\u0138\u013c\u0142\u0146\u014a\u014d\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}