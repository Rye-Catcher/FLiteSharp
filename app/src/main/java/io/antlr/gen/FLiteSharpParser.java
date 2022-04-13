// Generated from FLiteSharp.g4 by ANTLR 4.9.3

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
		IF=36, THEN=37, ELSE=38, IN=39, BEGIN=40, END=41, SEMICOLON=42, LET=43, 
		LAMBDADEC=44, RECURSION=45, VARIABLE=46, COMMENT=47, LINE_COMMENT=48;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_parenthesesExpression = 2, RULE_blockExpression = 3, 
		RULE_sequentialExpression = 4, RULE_sequenceLine = 5, RULE_tupleExpression = 6, 
		RULE_listExpression = 7, RULE_lambdaParameters = 8, RULE_lambdaExpression = 9, 
		RULE_recFuncDeclaration = 10, RULE_funcDeclaration = 11, RULE_applyParameters = 12, 
		RULE_funcApplication = 13, RULE_bind = 14, RULE_conditionalExpr = 15, 
		RULE_typeDeclaration = 16, RULE_unitDeclaration = 17, RULE_unitFormula = 18, 
		RULE_unitProduct = 19, RULE_unitElement = 20, RULE_exponent = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "parenthesesExpression", "blockExpression", "sequentialExpression", 
			"sequenceLine", "tupleExpression", "listExpression", "lambdaParameters", 
			"lambdaExpression", "recFuncDeclaration", "funcDeclaration", "applyParameters", 
			"funcApplication", "bind", "conditionalExpr", "typeDeclaration", "unitDeclaration", 
			"unitFormula", "unitProduct", "unitElement", "exponent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'->'", "'list'", "'^'", "'**'", "'*'", "'/'", "'+'", "'-'", 
			"'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'||'", "'&&'", "'not'", 
			"'?'", "'::'", "'@'", null, null, null, null, null, "':'", "'[<Measure>]'", 
			"'type'", null, null, "'('", "')'", "'['", "']'", "'if'", "'then'", "'else'", 
			"'in'", "'begin'", "'end'", "';'", "'let'", "'fun'", "'rec'"
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
			"THEN", "ELSE", "IN", "BEGIN", "END", "SEMICOLON", "LET", "LAMBDADEC", 
			"RECURSION", "VARIABLE", "COMMENT", "LINE_COMMENT"
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
		public TerminalNode EOF() { return getToken(FLiteSharpParser.EOF, 0); }
		public List<SequenceLineContext> sequenceLine() {
			return getRuleContexts(SequenceLineContext.class);
		}
		public SequenceLineContext sequenceLine(int i) {
			return getRuleContext(SequenceLineContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << INTEGER) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << UNIT) | (1L << UNITOFMEASURE) | (1L << WS) | (1L << LEFTPAR) | (1L << LEFTSQPAR) | (1L << IF) | (1L << BEGIN) | (1L << LET) | (1L << LAMBDADEC) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(44);
				sequenceLine();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
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
	public static class UnitContext extends ExpressionContext {
		public TerminalNode UNIT() { return getToken(FLiteSharpParser.UNIT, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public UnitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitUnit(this);
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
	public static class EqualContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(FLiteSharpParser.EQUAL, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListContext extends ExpressionContext {
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public ListContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitList(this);
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
	public static class NotEqualContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOTEQUAL() { return getToken(FLiteSharpParser.NOTEQUAL, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public NotEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionSubtractionContext extends ExpressionContext {
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
		public TerminalNode SUB() { return getToken(FLiteSharpParser.SUB, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public AdditionSubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterAdditionSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitAdditionSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitAdditionSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttachContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ListExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ATTACH() { return getToken(FLiteSharpParser.ATTACH, 0); }
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public AttachContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterAttach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitAttach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitAttach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ConditionalExprContext conditionalExpr() {
			return getRuleContext(ConditionalExprContext.class,0);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitConditionalExpression(this);
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
	public static class MultiplicationDivisionContext extends ExpressionContext {
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
		public TerminalNode DIV() { return getToken(FLiteSharpParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public MultiplicationDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterMultiplicationDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitMultiplicationDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitMultiplicationDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExpressionContext {
		public UnitFormulaContext uom;
		public TerminalNode DOUBLE() { return getToken(FLiteSharpParser.DOUBLE, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode LESSTHAN() { return getToken(FLiteSharpParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(FLiteSharpParser.GREATERTHAN, 0); }
		public UnitFormulaContext unitFormula() {
			return getRuleContext(UnitFormulaContext.class,0);
		}
		public DoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitOfMeasureDeclarationContext extends ExpressionContext {
		public UnitDeclarationContext unitDeclaration() {
			return getRuleContext(UnitDeclarationContext.class,0);
		}
		public UnitOfMeasureDeclarationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterUnitOfMeasureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitUnitOfMeasureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitUnitOfMeasureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExpressionContext {
		public UnitFormulaContext uom;
		public TerminalNode INTEGER() { return getToken(FLiteSharpParser.INTEGER, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode LESSTHAN() { return getToken(FLiteSharpParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(FLiteSharpParser.GREATERTHAN, 0); }
		public UnitFormulaContext unitFormula() {
			return getRuleContext(UnitFormulaContext.class,0);
		}
		public IntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitInteger(this);
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
	public static class ConcatenateContext extends ExpressionContext {
		public ListExpressionContext left;
		public Token operator;
		public ListExpressionContext right;
		public List<ListExpressionContext> listExpression() {
			return getRuleContexts(ListExpressionContext.class);
		}
		public ListExpressionContext listExpression(int i) {
			return getRuleContext(ListExpressionContext.class,i);
		}
		public TerminalNode CONC() { return getToken(FLiteSharpParser.CONC, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ConcatenateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterConcatenate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitConcatenate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitConcatenate(this);
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
	public static class BlockContext extends ExpressionContext {
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public BlockContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				parenthesesExpression();
				}
				break;
			case 2:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				blockExpression();
				}
				break;
			case 3:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(SUB);
				setState(56);
				expression(25);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((NotContext)_localctx).operator = match(NOT);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(58);
					match(WS);
					}
					break;
				}
				setState(61);
				((NotContext)_localctx).argument = expression(16);
				}
				break;
			case 5:
				{
				_localctx = new ConcatenateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((ConcatenateContext)_localctx).left = listExpression();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(63);
					match(WS);
					}
				}

				setState(66);
				((ConcatenateContext)_localctx).operator = match(CONC);
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					match(WS);
					}
					break;
				}
				setState(70);
				((ConcatenateContext)_localctx).right = listExpression();
				}
				break;
			case 6:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				conditionalExpr();
				}
				break;
			case 7:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(73);
					match(WS);
					}
				}

				setState(76);
				match(VARIABLE);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(77);
					match(WS);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new FunctionApplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				funcApplication();
				}
				break;
			case 9:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(81);
					match(WS);
					}
				}

				setState(84);
				match(INTEGER);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(85);
					match(LESSTHAN);
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(86);
						match(WS);
						}
						break;
					}
					setState(89);
					((IntegerContext)_localctx).uom = unitFormula();
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(90);
						match(WS);
						}
					}

					setState(93);
					match(GREATERTHAN);
					}
					break;
				}
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(97);
					match(WS);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(100);
					match(WS);
					}
				}

				setState(103);
				match(DOUBLE);
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(104);
					match(LESSTHAN);
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(105);
						match(WS);
						}
						break;
					}
					setState(108);
					((DoubleContext)_localctx).uom = unitFormula();
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(109);
						match(WS);
						}
					}

					setState(112);
					match(GREATERTHAN);
					}
					break;
				}
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(116);
					match(WS);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(119);
					match(WS);
					}
				}

				setState(122);
				match(BOOLEAN);
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(123);
					match(WS);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new UnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(126);
					match(WS);
					}
				}

				setState(129);
				match(UNIT);
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(130);
					match(WS);
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				tupleExpression();
				}
				break;
			case 14:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				listExpression();
				}
				break;
			case 15:
				{
				_localctx = new LambdaFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				lambdaExpression();
				}
				break;
			case 16:
				{
				_localctx = new UnitOfMeasureDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				unitDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(140);
							match(WS);
							}
						}

						setState(143);
						((PowerContext)_localctx).operator = match(POW);
						setState(145);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(144);
							match(WS);
							}
							break;
						}
						setState(147);
						((PowerContext)_localctx).right = expression(26);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(149);
							match(WS);
							}
						}

						setState(152);
						((MultiplicationDivisionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MultiplicationDivisionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
						case 1:
							{
							setState(153);
							match(WS);
							}
							break;
						}
						setState(156);
						((MultiplicationDivisionContext)_localctx).right = expression(25);
						}
						break;
					case 3:
						{
						_localctx = new AdditionSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(158);
							match(WS);
							}
						}

						setState(161);
						((AdditionSubtractionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditionSubtractionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(162);
							match(WS);
							}
							break;
						}
						setState(165);
						((AdditionSubtractionContext)_localctx).right = expression(24);
						}
						break;
					case 4:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(167);
							match(WS);
							}
						}

						setState(170);
						((LessThanContext)_localctx).operator = match(LESSTHAN);
						setState(172);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(171);
							match(WS);
							}
							break;
						}
						setState(174);
						((LessThanContext)_localctx).right = expression(23);
						}
						break;
					case 5:
						{
						_localctx = new LessThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(176);
							match(WS);
							}
						}

						setState(179);
						((LessThanOrEqualContext)_localctx).operator = match(LESSTHANOREQUAL);
						setState(181);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(180);
							match(WS);
							}
							break;
						}
						setState(183);
						((LessThanOrEqualContext)_localctx).right = expression(22);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(185);
							match(WS);
							}
						}

						setState(188);
						((GreaterThanContext)_localctx).operator = match(GREATERTHAN);
						setState(190);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(189);
							match(WS);
							}
							break;
						}
						setState(192);
						((GreaterThanContext)_localctx).right = expression(21);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(194);
							match(WS);
							}
						}

						setState(197);
						((GreaterThanOrEqualContext)_localctx).operator = match(GREATERTHANOREQUAL);
						setState(199);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(198);
							match(WS);
							}
							break;
						}
						setState(201);
						((GreaterThanOrEqualContext)_localctx).right = expression(20);
						}
						break;
					case 8:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						((EqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(203);
							match(WS);
							}
						}

						setState(206);
						((EqualContext)_localctx).operator = match(EQUAL);
						setState(208);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(207);
							match(WS);
							}
							break;
						}
						setState(210);
						((EqualContext)_localctx).right = expression(19);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(212);
							match(WS);
							}
						}

						setState(215);
						((NotEqualContext)_localctx).operator = match(NOTEQUAL);
						setState(217);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
						case 1:
							{
							setState(216);
							match(WS);
							}
							break;
						}
						setState(219);
						((NotEqualContext)_localctx).right = expression(18);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(221);
							match(WS);
							}
						}

						setState(224);
						((AndContext)_localctx).operator = match(AND);
						setState(226);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(225);
							match(WS);
							}
							break;
						}
						setState(228);
						((AndContext)_localctx).right = expression(16);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(230);
							match(WS);
							}
						}

						setState(233);
						((OrContext)_localctx).operator = match(OR);
						setState(235);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(234);
							match(WS);
							}
							break;
						}
						setState(237);
						((OrContext)_localctx).right = expression(15);
						}
						break;
					case 12:
						{
						_localctx = new AttachContext(new ExpressionContext(_parentctx, _parentState));
						((AttachContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
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
						((AttachContext)_localctx).operator = match(ATTACH);
						setState(244);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
						case 1:
							{
							setState(243);
							match(WS);
							}
							break;
						}
						setState(246);
						((AttachContext)_localctx).right = listExpression();
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public TerminalNode LEFTPAR() { return getToken(FLiteSharpParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(FLiteSharpParser.RIGHTPAR, 0); }
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
		enterRule(_localctx, 4, RULE_parenthesesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(252);
				match(WS);
				}
			}

			setState(255);
			match(LEFTPAR);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(256);
				match(WS);
				}
				break;
			}
			setState(259);
			((ParenthesesExpressionContext)_localctx).inner = expression(0);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(260);
				match(WS);
				}
			}

			setState(263);
			match(RIGHTPAR);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(264);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(FLiteSharpParser.BEGIN, 0); }
		public SequentialExpressionContext sequentialExpression() {
			return getRuleContext(SequentialExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(FLiteSharpParser.END, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(267);
				match(WS);
				}
			}

			setState(270);
			match(BEGIN);
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(271);
				match(WS);
				}
				break;
			}
			setState(274);
			sequentialExpression();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(275);
				match(WS);
				}
			}

			setState(278);
			match(END);
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

	public static class SequentialExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FLiteSharpParser.SEMICOLON, 0); }
		public List<SequenceLineContext> sequenceLine() {
			return getRuleContexts(SequenceLineContext.class);
		}
		public SequenceLineContext sequenceLine(int i) {
			return getRuleContext(SequenceLineContext.class,i);
		}
		public SequentialExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequentialExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterSequentialExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitSequentialExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitSequentialExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequentialExpressionContext sequentialExpression() throws RecognitionException {
		SequentialExpressionContext _localctx = new SequentialExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sequentialExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						sequenceLine();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(286);
				expression(0);
				setState(287);
				match(SEMICOLON);
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

	public static class SequenceLineContext extends ParserRuleContext {
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
		}
		public TerminalNode IN() { return getToken(FLiteSharpParser.IN, 0); }
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public RecFuncDeclarationContext recFuncDeclaration() {
			return getRuleContext(RecFuncDeclarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FLiteSharpParser.SEMICOLON, 0); }
		public SequenceLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterSequenceLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitSequenceLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitSequenceLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceLineContext sequenceLine() throws RecognitionException {
		SequenceLineContext _localctx = new SequenceLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sequenceLine);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				bind();
				setState(292);
				match(IN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				funcDeclaration();
				setState(295);
				match(IN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				recFuncDeclaration();
				setState(298);
				match(IN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				expression(0);
				setState(301);
				match(SEMICOLON);
				}
				break;
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
		public TerminalNode LEFTPAR() { return getToken(FLiteSharpParser.LEFTPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHTPAR() { return getToken(FLiteSharpParser.RIGHTPAR, 0); }
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
		enterRule(_localctx, 12, RULE_tupleExpression);
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
			match(LEFTPAR);
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
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
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(313);
				match(WS);
				}
			}

			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				match(T__0);
				setState(317);
				expression(0);
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(322);
				match(WS);
				}
			}

			setState(325);
			match(RIGHTPAR);
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(326);
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

	public static class ListExpressionContext extends ParserRuleContext {
		public TerminalNode LEFTSQPAR() { return getToken(FLiteSharpParser.LEFTSQPAR, 0); }
		public TerminalNode RIGHTSQPAR() { return getToken(FLiteSharpParser.RIGHTSQPAR, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
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
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(329);
				match(WS);
				}
			}

			setState(332);
			match(LEFTSQPAR);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << INTEGER) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << UNIT) | (1L << UNITOFMEASURE) | (1L << WS) | (1L << LEFTPAR) | (1L << LEFTSQPAR) | (1L << IF) | (1L << BEGIN) | (1L << LAMBDADEC) | (1L << VARIABLE))) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(333);
					match(WS);
					}
					break;
				}
				setState(336);
				expression(0);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(337);
					match(WS);
					}
				}

				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(340);
					match(SEMICOLON);
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(341);
						match(WS);
						}
						break;
					}
					setState(344);
					expression(0);
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(345);
						match(WS);
						}
					}

					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(355);
			match(RIGHTSQPAR);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(356);
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
		public List<TerminalNode> LEFTPAR() { return getTokens(FLiteSharpParser.LEFTPAR); }
		public TerminalNode LEFTPAR(int i) {
			return getToken(FLiteSharpParser.LEFTPAR, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(FLiteSharpParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(FLiteSharpParser.VARIABLE, i);
		}
		public List<TerminalNode> TYPEOP() { return getTokens(FLiteSharpParser.TYPEOP); }
		public TerminalNode TYPEOP(int i) {
			return getToken(FLiteSharpParser.TYPEOP, i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> RIGHTPAR() { return getTokens(FLiteSharpParser.RIGHTPAR); }
		public TerminalNode RIGHTPAR(int i) {
			return getToken(FLiteSharpParser.RIGHTPAR, i);
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
		enterRule(_localctx, 16, RULE_lambdaParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				match(LEFTPAR);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(360);
					match(WS);
					}
				}

				setState(363);
				match(VARIABLE);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(364);
					match(WS);
					}
				}

				setState(367);
				match(TYPEOP);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(368);
					match(WS);
					}
				}

				setState(371);
				typeDeclaration(0);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(372);
					match(WS);
					}
				}

				setState(375);
				match(RIGHTPAR);
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(376);
					match(WS);
					}
					break;
				}
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LEFTPAR );
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
		public TerminalNode LAMBDADEC() { return getToken(FLiteSharpParser.LAMBDADEC, 0); }
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
		enterRule(_localctx, 18, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(383);
				match(WS);
				}
			}

			setState(386);
			match(LAMBDADEC);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(387);
				match(WS);
				}
			}

			setState(390);
			lambdaParameters();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(391);
				match(WS);
				}
			}

			setState(394);
			match(T__1);
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(395);
				match(WS);
				}
				break;
			}
			setState(398);
			((LambdaExpressionContext)_localctx).lambdaBody = expression(0);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(399);
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

	public static class RecFuncDeclarationContext extends ParserRuleContext {
		public Token functionName;
		public LambdaParametersContext params;
		public TypeDeclarationContext type;
		public BlockExpressionContext functionBody;
		public TerminalNode LET() { return getToken(FLiteSharpParser.LET, 0); }
		public TerminalNode RECURSION() { return getToken(FLiteSharpParser.RECURSION, 0); }
		public TerminalNode TYPEOP() { return getToken(FLiteSharpParser.TYPEOP, 0); }
		public TerminalNode EQUAL() { return getToken(FLiteSharpParser.EQUAL, 0); }
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public RecFuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recFuncDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterRecFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitRecFuncDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitRecFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecFuncDeclarationContext recFuncDeclaration() throws RecognitionException {
		RecFuncDeclarationContext _localctx = new RecFuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recFuncDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(402);
				match(WS);
				}
			}

			setState(405);
			match(LET);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(406);
				match(WS);
				}
			}

			setState(409);
			match(RECURSION);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(410);
				match(WS);
				}
			}

			setState(413);
			((RecFuncDeclarationContext)_localctx).functionName = match(VARIABLE);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(414);
				match(WS);
				}
			}

			setState(417);
			((RecFuncDeclarationContext)_localctx).params = lambdaParameters();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(418);
				match(WS);
				}
			}

			setState(421);
			match(TYPEOP);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(422);
				match(WS);
				}
			}

			setState(425);
			((RecFuncDeclarationContext)_localctx).type = typeDeclaration(0);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(426);
				match(WS);
				}
			}

			setState(429);
			match(EQUAL);
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(430);
				match(WS);
				}
				break;
			}
			setState(433);
			((RecFuncDeclarationContext)_localctx).functionBody = blockExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(434);
				match(WS);
				}
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

	public static class FuncDeclarationContext extends ParserRuleContext {
		public Token functionName;
		public LambdaParametersContext params;
		public TypeDeclarationContext type;
		public BlockExpressionContext functionBody;
		public TerminalNode LET() { return getToken(FLiteSharpParser.LET, 0); }
		public TerminalNode TYPEOP() { return getToken(FLiteSharpParser.TYPEOP, 0); }
		public TerminalNode EQUAL() { return getToken(FLiteSharpParser.EQUAL, 0); }
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFuncDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFuncDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFuncDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(437);
				match(WS);
				}
			}

			setState(440);
			match(LET);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(441);
				match(WS);
				}
			}

			setState(444);
			((FuncDeclarationContext)_localctx).functionName = match(VARIABLE);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(445);
				match(WS);
				}
			}

			setState(448);
			((FuncDeclarationContext)_localctx).params = lambdaParameters();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(449);
				match(WS);
				}
			}

			setState(452);
			match(TYPEOP);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(453);
				match(WS);
				}
			}

			setState(456);
			((FuncDeclarationContext)_localctx).type = typeDeclaration(0);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(457);
				match(WS);
				}
			}

			setState(460);
			match(EQUAL);
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(461);
				match(WS);
				}
				break;
			}
			setState(464);
			((FuncDeclarationContext)_localctx).functionBody = blockExpression();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(465);
				match(WS);
				}
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
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 24, RULE_applyParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(468);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(471); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(474); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(473);
					expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(476); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class FuncApplicationContext extends ParserRuleContext {
		public Token name;
		public ApplyParametersContext applyParameters() {
			return getRuleContext(ApplyParametersContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
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
		enterRule(_localctx, 26, RULE_funcApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(478);
				match(WS);
				}
			}

			setState(481);
			((FuncApplicationContext)_localctx).name = match(VARIABLE);
			setState(482);
			applyParameters();
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(483);
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

	public static class BindContext extends ParserRuleContext {
		public Token name;
		public TypeDeclarationContext type;
		public TerminalNode LET() { return getToken(FLiteSharpParser.LET, 0); }
		public TerminalNode TYPEOP() { return getToken(FLiteSharpParser.TYPEOP, 0); }
		public TerminalNode EQUAL() { return getToken(FLiteSharpParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitBind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(486);
				match(WS);
				}
			}

			setState(489);
			match(LET);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(490);
				match(WS);
				}
			}

			setState(493);
			((BindContext)_localctx).name = match(VARIABLE);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(494);
				match(WS);
				}
			}

			setState(497);
			match(TYPEOP);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(498);
				match(WS);
				}
			}

			setState(501);
			((BindContext)_localctx).type = typeDeclaration(0);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(502);
				match(WS);
				}
			}

			setState(505);
			match(EQUAL);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(506);
				match(WS);
				}
				break;
			}
			setState(509);
			expression(0);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(510);
				match(WS);
				}
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

	public static class ConditionalExprContext extends ParserRuleContext {
		public ExpressionContext test;
		public BlockExpressionContext consequent;
		public BlockExpressionContext alternate;
		public TerminalNode IF() { return getToken(FLiteSharpParser.IF, 0); }
		public TerminalNode THEN() { return getToken(FLiteSharpParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode ELSE() { return getToken(FLiteSharpParser.ELSE, 0); }
		public ConditionalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitConditionalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExprContext conditionalExpr() throws RecognitionException {
		ConditionalExprContext _localctx = new ConditionalExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(513);
				match(WS);
				}
			}

			setState(516);
			match(IF);
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(517);
				match(WS);
				}
				break;
			}
			setState(520);
			((ConditionalExprContext)_localctx).test = expression(0);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(521);
				match(WS);
				}
			}

			setState(524);
			match(THEN);
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(525);
				match(WS);
				}
				break;
			}
			setState(528);
			((ConditionalExprContext)_localctx).consequent = blockExpression();
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(529);
				match(WS);
				}
				break;
			}
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(532);
					match(WS);
					}
				}

				setState(535);
				match(ELSE);
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(536);
					match(WS);
					}
					break;
				}
				setState(539);
				((ConditionalExprContext)_localctx).alternate = blockExpression();
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(540);
					match(WS);
					}
					break;
				}
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	 
		public TypeDeclarationContext() { }
		public void copyFrom(TypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionTypeContext extends TypeDeclarationContext {
		public TypeDeclarationContext left;
		public TypeDeclarationContext right;
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public FunctionTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListTypeContext extends TypeDeclarationContext {
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode WS() { return getToken(FLiteSharpParser.WS, 0); }
		public ListTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesTypeContext extends TypeDeclarationContext {
		public TerminalNode LEFTPAR() { return getToken(FLiteSharpParser.LEFTPAR, 0); }
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(FLiteSharpParser.RIGHTPAR, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ParenthesesTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterParenthesesType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitParenthesesType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitParenthesesType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleTypeContext extends TypeDeclarationContext {
		public TypeDeclarationContext left;
		public TypeDeclarationContext right;
		public TerminalNode MUL() { return getToken(FLiteSharpParser.MUL, 0); }
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TupleTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveTypeContext extends TypeDeclarationContext {
		public UnitFormulaContext uom;
		public TerminalNode TYPE() { return getToken(FLiteSharpParser.TYPE, 0); }
		public TerminalNode LESSTHAN() { return getToken(FLiteSharpParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(FLiteSharpParser.GREATERTHAN, 0); }
		public UnitFormulaContext unitFormula() {
			return getRuleContext(UnitFormulaContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public PrimitiveTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		return typeDeclaration(0);
	}

	private TypeDeclarationContext typeDeclaration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, _parentState);
		TypeDeclarationContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_typeDeclaration, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPAR:
				{
				_localctx = new ParenthesesTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(546);
				match(LEFTPAR);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(547);
					match(WS);
					}
				}

				setState(550);
				typeDeclaration(0);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(551);
					match(WS);
					}
				}

				setState(554);
				match(RIGHTPAR);
				}
				break;
			case TYPE:
				{
				_localctx = new PrimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				match(TYPE);
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(557);
					match(LESSTHAN);
					setState(559);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(558);
						match(WS);
						}
						break;
					}
					setState(561);
					((PrimitiveTypeContext)_localctx).uom = unitFormula();
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(562);
						match(WS);
						}
					}

					setState(565);
					match(GREATERTHAN);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(596);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						_localctx = new TupleTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						((TupleTypeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(571);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(573);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(572);
							match(WS);
							}
						}

						setState(575);
						match(MUL);
						setState(577);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(576);
							match(WS);
							}
						}

						setState(579);
						((TupleTypeContext)_localctx).right = typeDeclaration(3);
						}
						break;
					case 2:
						{
						_localctx = new FunctionTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						((FunctionTypeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(580);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(582);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(581);
							match(WS);
							}
						}

						setState(584);
						match(T__1);
						setState(586);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(585);
							match(WS);
							}
						}

						setState(588);
						((FunctionTypeContext)_localctx).right = typeDeclaration(2);
						}
						break;
					case 3:
						{
						_localctx = new ListTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(589);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(591);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(590);
							match(WS);
							}
						}

						setState(593);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(598);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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

	public static class UnitDeclarationContext extends ParserRuleContext {
		public Token name;
		public UnitFormulaContext formula;
		public TerminalNode UNITOFMEASURE() { return getToken(FLiteSharpParser.UNITOFMEASURE, 0); }
		public TerminalNode TYPEKEYWORD() { return getToken(FLiteSharpParser.TYPEKEYWORD, 0); }
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode EQUAL() { return getToken(FLiteSharpParser.EQUAL, 0); }
		public UnitFormulaContext unitFormula() {
			return getRuleContext(UnitFormulaContext.class,0);
		}
		public UnitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterUnitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitUnitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitUnitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitDeclarationContext unitDeclaration() throws RecognitionException {
		UnitDeclarationContext _localctx = new UnitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unitDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(599);
				match(WS);
				}
			}

			setState(602);
			match(UNITOFMEASURE);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(603);
				match(WS);
				}
			}

			setState(606);
			match(TYPEKEYWORD);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(607);
				match(WS);
				}
			}

			setState(610);
			((UnitDeclarationContext)_localctx).name = match(VARIABLE);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(611);
				match(WS);
				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(614);
				match(EQUAL);
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(615);
					match(WS);
					}
					break;
				}
				setState(618);
				((UnitDeclarationContext)_localctx).formula = unitFormula();
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(619);
					match(WS);
					}
					break;
				}
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

	public static class UnitFormulaContext extends ParserRuleContext {
		public Token operator;
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public List<UnitElementContext> unitElement() {
			return getRuleContexts(UnitElementContext.class);
		}
		public UnitElementContext unitElement(int i) {
			return getRuleContext(UnitElementContext.class,i);
		}
		public List<UnitProductContext> unitProduct() {
			return getRuleContexts(UnitProductContext.class);
		}
		public UnitProductContext unitProduct(int i) {
			return getRuleContext(UnitProductContext.class,i);
		}
		public TerminalNode DIV() { return getToken(FLiteSharpParser.DIV, 0); }
		public UnitFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitFormula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterUnitFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitUnitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitUnitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitFormulaContext unitFormula() throws RecognitionException {
		UnitFormulaContext _localctx = new UnitFormulaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unitFormula);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV) {
				{
				setState(624);
				((UnitFormulaContext)_localctx).operator = match(DIV);
				}
			}

			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(627);
				match(WS);
				}
			}

			setState(634); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(630);
					unitElement(0);
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(631);
						match(WS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(636); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(638);
				match(WS);
				}
				break;
			}
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(641);
					unitProduct();
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(647);
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

	public static class UnitProductContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode MUL() { return getToken(FLiteSharpParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FLiteSharpParser.DIV, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public List<UnitElementContext> unitElement() {
			return getRuleContexts(UnitElementContext.class);
		}
		public UnitElementContext unitElement(int i) {
			return getRuleContext(UnitElementContext.class,i);
		}
		public UnitProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterUnitProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitUnitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitUnitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitProductContext unitProduct() throws RecognitionException {
		UnitProductContext _localctx = new UnitProductContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unitProduct);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(650);
				match(WS);
				}
			}

			setState(653);
			((UnitProductContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==DIV) ) {
				((UnitProductContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(654);
				match(WS);
				}
			}

			setState(661); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(657);
					unitElement(0);
					setState(659);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(658);
						match(WS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(665);
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

	public static class UnitElementContext extends ParserRuleContext {
		public UnitElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitElement; }
	 
		public UnitElementContext() { }
		public void copyFrom(UnitElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OneUnitContext extends UnitElementContext {
		public TerminalNode INTEGER() { return getToken(FLiteSharpParser.INTEGER, 0); }
		public OneUnitContext(UnitElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterOneUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitOneUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitOneUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisUnitContext extends UnitElementContext {
		public TerminalNode LEFTPAR() { return getToken(FLiteSharpParser.LEFTPAR, 0); }
		public UnitFormulaContext unitFormula() {
			return getRuleContext(UnitFormulaContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(FLiteSharpParser.RIGHTPAR, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ParenthesisUnitContext(UnitElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterParenthesisUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitParenthesisUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitParenthesisUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentialUnitContext extends UnitElementContext {
		public UnitElementContext argument;
		public Token operator;
		public ExponentContext exp;
		public UnitElementContext unitElement() {
			return getRuleContext(UnitElementContext.class,0);
		}
		public ExponentContext exponent() {
			return getRuleContext(ExponentContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public ExponentialUnitContext(UnitElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterExponentialUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitExponentialUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitExponentialUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleUnitContext extends UnitElementContext {
		public TerminalNode VARIABLE() { return getToken(FLiteSharpParser.VARIABLE, 0); }
		public SingleUnitContext(UnitElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterSingleUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitSingleUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitSingleUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitElementContext unitElement() throws RecognitionException {
		return unitElement(0);
	}

	private UnitElementContext unitElement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnitElementContext _localctx = new UnitElementContext(_ctx, _parentState);
		UnitElementContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_unitElement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new OneUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(669);
				match(INTEGER);
				}
				break;
			case VARIABLE:
				{
				_localctx = new SingleUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(670);
				match(VARIABLE);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new ParenthesisUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(671);
				match(LEFTPAR);
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(672);
					match(WS);
					}
					break;
				}
				setState(675);
				unitFormula();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(676);
					match(WS);
					}
				}

				setState(679);
				match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentialUnitContext(new UnitElementContext(_parentctx, _parentState));
					((ExponentialUnitContext)_localctx).argument = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unitElement);
					setState(683);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(684);
						match(WS);
						}
					}

					setState(687);
					((ExponentialUnitContext)_localctx).operator = match(T__3);
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(688);
						match(WS);
						}
					}

					setState(691);
					((ExponentialUnitContext)_localctx).exp = exponent();
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,156,_ctx);
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

	public static class ExponentContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(FLiteSharpParser.INTEGER, 0); }
		public TerminalNode SUB() { return getToken(FLiteSharpParser.SUB, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode LEFTPAR() { return getToken(FLiteSharpParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(FLiteSharpParser.RIGHTPAR, 0); }
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exponent);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				match(SUB);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(699);
					match(WS);
					}
				}

				setState(702);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(703);
				match(LEFTPAR);
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(704);
					match(WS);
					}
				}

				setState(707);
				match(INTEGER);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(708);
					match(WS);
					}
				}

				setState(711);
				match(RIGHTPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				match(LEFTPAR);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(713);
					match(WS);
					}
				}

				setState(716);
				match(SUB);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(717);
					match(WS);
					}
				}

				setState(720);
				match(INTEGER);
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(721);
					match(WS);
					}
				}

				setState(724);
				match(RIGHTPAR);
				}
				break;
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return typeDeclaration_sempred((TypeDeclarationContext)_localctx, predIndex);
		case 20:
			return unitElement_sempred((UnitElementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean typeDeclaration_sempred(TypeDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean unitElement_sempred(UnitElementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u02da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\5\3Q\n\3\3"+
		"\3\3\3\5\3U\n\3\3\3\3\3\3\3\5\3Z\n\3\3\3\3\3\5\3^\n\3\3\3\3\3\5\3b\n\3"+
		"\3\3\5\3e\n\3\3\3\5\3h\n\3\3\3\3\3\3\3\5\3m\n\3\3\3\3\3\5\3q\n\3\3\3\3"+
		"\3\5\3u\n\3\3\3\5\3x\n\3\3\3\5\3{\n\3\3\3\3\3\5\3\177\n\3\3\3\5\3\u0082"+
		"\n\3\3\3\3\3\5\3\u0086\n\3\3\3\3\3\3\3\3\3\5\3\u008c\n\3\3\3\3\3\5\3\u0090"+
		"\n\3\3\3\3\3\5\3\u0094\n\3\3\3\3\3\3\3\5\3\u0099\n\3\3\3\3\3\5\3\u009d"+
		"\n\3\3\3\3\3\3\3\5\3\u00a2\n\3\3\3\3\3\5\3\u00a6\n\3\3\3\3\3\3\3\5\3\u00ab"+
		"\n\3\3\3\3\3\5\3\u00af\n\3\3\3\3\3\3\3\5\3\u00b4\n\3\3\3\3\3\5\3\u00b8"+
		"\n\3\3\3\3\3\3\3\5\3\u00bd\n\3\3\3\3\3\5\3\u00c1\n\3\3\3\3\3\3\3\5\3\u00c6"+
		"\n\3\3\3\3\3\5\3\u00ca\n\3\3\3\3\3\3\3\5\3\u00cf\n\3\3\3\3\3\5\3\u00d3"+
		"\n\3\3\3\3\3\3\3\5\3\u00d8\n\3\3\3\3\3\5\3\u00dc\n\3\3\3\3\3\3\3\5\3\u00e1"+
		"\n\3\3\3\3\3\5\3\u00e5\n\3\3\3\3\3\3\3\5\3\u00ea\n\3\3\3\3\3\5\3\u00ee"+
		"\n\3\3\3\3\3\3\3\5\3\u00f3\n\3\3\3\3\3\5\3\u00f7\n\3\3\3\7\3\u00fa\n\3"+
		"\f\3\16\3\u00fd\13\3\3\4\5\4\u0100\n\4\3\4\3\4\5\4\u0104\n\4\3\4\3\4\5"+
		"\4\u0108\n\4\3\4\3\4\5\4\u010c\n\4\3\5\5\5\u010f\n\5\3\5\3\5\5\5\u0113"+
		"\n\5\3\5\3\5\5\5\u0117\n\5\3\5\3\5\3\6\7\6\u011c\n\6\f\6\16\6\u011f\13"+
		"\6\3\6\3\6\3\6\5\6\u0124\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0132\n\7\3\b\5\b\u0135\n\b\3\b\3\b\5\b\u0139\n\b\3\b\3\b\5"+
		"\b\u013d\n\b\3\b\3\b\6\b\u0141\n\b\r\b\16\b\u0142\3\b\5\b\u0146\n\b\3"+
		"\b\3\b\5\b\u014a\n\b\3\t\5\t\u014d\n\t\3\t\3\t\5\t\u0151\n\t\3\t\3\t\5"+
		"\t\u0155\n\t\3\t\3\t\5\t\u0159\n\t\3\t\3\t\5\t\u015d\n\t\7\t\u015f\n\t"+
		"\f\t\16\t\u0162\13\t\5\t\u0164\n\t\3\t\3\t\5\t\u0168\n\t\3\n\3\n\5\n\u016c"+
		"\n\n\3\n\3\n\5\n\u0170\n\n\3\n\3\n\5\n\u0174\n\n\3\n\3\n\5\n\u0178\n\n"+
		"\3\n\3\n\5\n\u017c\n\n\6\n\u017e\n\n\r\n\16\n\u017f\3\13\5\13\u0183\n"+
		"\13\3\13\3\13\5\13\u0187\n\13\3\13\3\13\5\13\u018b\n\13\3\13\3\13\5\13"+
		"\u018f\n\13\3\13\3\13\5\13\u0193\n\13\3\f\5\f\u0196\n\f\3\f\3\f\5\f\u019a"+
		"\n\f\3\f\3\f\5\f\u019e\n\f\3\f\3\f\5\f\u01a2\n\f\3\f\3\f\5\f\u01a6\n\f"+
		"\3\f\3\f\5\f\u01aa\n\f\3\f\3\f\5\f\u01ae\n\f\3\f\3\f\5\f\u01b2\n\f\3\f"+
		"\3\f\5\f\u01b6\n\f\3\r\5\r\u01b9\n\r\3\r\3\r\5\r\u01bd\n\r\3\r\3\r\5\r"+
		"\u01c1\n\r\3\r\3\r\5\r\u01c5\n\r\3\r\3\r\5\r\u01c9\n\r\3\r\3\r\5\r\u01cd"+
		"\n\r\3\r\3\r\5\r\u01d1\n\r\3\r\3\r\5\r\u01d5\n\r\3\16\6\16\u01d8\n\16"+
		"\r\16\16\16\u01d9\3\16\6\16\u01dd\n\16\r\16\16\16\u01de\3\17\5\17\u01e2"+
		"\n\17\3\17\3\17\3\17\5\17\u01e7\n\17\3\20\5\20\u01ea\n\20\3\20\3\20\5"+
		"\20\u01ee\n\20\3\20\3\20\5\20\u01f2\n\20\3\20\3\20\5\20\u01f6\n\20\3\20"+
		"\3\20\5\20\u01fa\n\20\3\20\3\20\5\20\u01fe\n\20\3\20\3\20\5\20\u0202\n"+
		"\20\3\21\5\21\u0205\n\21\3\21\3\21\5\21\u0209\n\21\3\21\3\21\5\21\u020d"+
		"\n\21\3\21\3\21\5\21\u0211\n\21\3\21\3\21\5\21\u0215\n\21\3\21\5\21\u0218"+
		"\n\21\3\21\3\21\5\21\u021c\n\21\3\21\3\21\5\21\u0220\n\21\5\21\u0222\n"+
		"\21\3\22\3\22\3\22\5\22\u0227\n\22\3\22\3\22\5\22\u022b\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0232\n\22\3\22\3\22\5\22\u0236\n\22\3\22\3\22\5"+
		"\22\u023a\n\22\5\22\u023c\n\22\3\22\3\22\5\22\u0240\n\22\3\22\3\22\5\22"+
		"\u0244\n\22\3\22\3\22\3\22\5\22\u0249\n\22\3\22\3\22\5\22\u024d\n\22\3"+
		"\22\3\22\3\22\5\22\u0252\n\22\3\22\7\22\u0255\n\22\f\22\16\22\u0258\13"+
		"\22\3\23\5\23\u025b\n\23\3\23\3\23\5\23\u025f\n\23\3\23\3\23\5\23\u0263"+
		"\n\23\3\23\3\23\5\23\u0267\n\23\3\23\3\23\5\23\u026b\n\23\3\23\3\23\5"+
		"\23\u026f\n\23\5\23\u0271\n\23\3\24\5\24\u0274\n\24\3\24\5\24\u0277\n"+
		"\24\3\24\3\24\5\24\u027b\n\24\6\24\u027d\n\24\r\24\16\24\u027e\3\24\5"+
		"\24\u0282\n\24\3\24\7\24\u0285\n\24\f\24\16\24\u0288\13\24\3\24\5\24\u028b"+
		"\n\24\3\25\5\25\u028e\n\25\3\25\3\25\5\25\u0292\n\25\3\25\3\25\5\25\u0296"+
		"\n\25\6\25\u0298\n\25\r\25\16\25\u0299\3\25\5\25\u029d\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u02a4\n\26\3\26\3\26\5\26\u02a8\n\26\3\26\3\26\5"+
		"\26\u02ac\n\26\3\26\3\26\5\26\u02b0\n\26\3\26\3\26\5\26\u02b4\n\26\3\26"+
		"\7\26\u02b7\n\26\f\26\16\26\u02ba\13\26\3\27\3\27\3\27\5\27\u02bf\n\27"+
		"\3\27\3\27\3\27\5\27\u02c4\n\27\3\27\3\27\5\27\u02c8\n\27\3\27\3\27\3"+
		"\27\5\27\u02cd\n\27\3\27\3\27\5\27\u02d1\n\27\3\27\3\27\5\27\u02d5\n\27"+
		"\3\27\5\27\u02d8\n\27\3\27\2\5\4\"*\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\4\3\2\b\t\3\2\n\13\2\u0385\2\61\3\2\2\2\4\u008b\3\2\2"+
		"\2\6\u00ff\3\2\2\2\b\u010e\3\2\2\2\n\u0123\3\2\2\2\f\u0131\3\2\2\2\16"+
		"\u0134\3\2\2\2\20\u014c\3\2\2\2\22\u017d\3\2\2\2\24\u0182\3\2\2\2\26\u0195"+
		"\3\2\2\2\30\u01b8\3\2\2\2\32\u01d7\3\2\2\2\34\u01e1\3\2\2\2\36\u01e9\3"+
		"\2\2\2 \u0204\3\2\2\2\"\u023b\3\2\2\2$\u025a\3\2\2\2&\u0273\3\2\2\2(\u028d"+
		"\3\2\2\2*\u02ab\3\2\2\2,\u02d7\3\2\2\2.\60\5\f\7\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2"+
		"\3\65\3\3\2\2\2\66\67\b\3\1\2\67\u008c\5\6\4\28\u008c\5\b\5\29:\7\13\2"+
		"\2:\u008c\5\4\3\33;=\7\24\2\2<>\7 \2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?"+
		"\u008c\5\4\3\22@B\5\20\t\2AC\7 \2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7"+
		"\27\2\2EG\7 \2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\5\20\t\2I\u008c\3\2\2"+
		"\2J\u008c\5 \21\2KM\7 \2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\60\2\2OQ"+
		"\7 \2\2PO\3\2\2\2PQ\3\2\2\2Q\u008c\3\2\2\2R\u008c\5\34\17\2SU\7 \2\2T"+
		"S\3\2\2\2TU\3\2\2\2UV\3\2\2\2Va\7\30\2\2WY\7\f\2\2XZ\7 \2\2YX\3\2\2\2"+
		"YZ\3\2\2\2Z[\3\2\2\2[]\5&\24\2\\^\7 \2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2"+
		"\2_`\7\16\2\2`b\3\2\2\2aW\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\7 \2\2dc\3\2\2"+
		"\2de\3\2\2\2e\u008c\3\2\2\2fh\7 \2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2it\7"+
		"\31\2\2jl\7\f\2\2km\7 \2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\5&\24\2oq\7"+
		" \2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\16\2\2su\3\2\2\2tj\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vx\7 \2\2wv\3\2\2\2wx\3\2\2\2x\u008c\3\2\2\2y{\7 \2\2"+
		"zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\32\2\2}\177\7 \2\2~}\3\2\2\2~\177\3"+
		"\2\2\2\177\u008c\3\2\2\2\u0080\u0082\7 \2\2\u0081\u0080\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\7\33\2\2\u0084\u0086\7"+
		" \2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008c\3\2\2\2\u0087"+
		"\u008c\5\16\b\2\u0088\u008c\5\20\t\2\u0089\u008c\5\24\13\2\u008a\u008c"+
		"\5$\23\2\u008b\66\3\2\2\2\u008b8\3\2\2\2\u008b9\3\2\2\2\u008b;\3\2\2\2"+
		"\u008b@\3\2\2\2\u008bJ\3\2\2\2\u008bL\3\2\2\2\u008bR\3\2\2\2\u008bT\3"+
		"\2\2\2\u008bg\3\2\2\2\u008bz\3\2\2\2\u008b\u0081\3\2\2\2\u008b\u0087\3"+
		"\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u00fb\3\2\2\2\u008d\u008f\f\34\2\2\u008e\u0090\7 \2\2\u008f\u008e\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\7\2\2\u0092"+
		"\u0094\7 \2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u00fa\5\4\3\34\u0096\u0098\f\32\2\2\u0097\u0099\7 \2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\t\2"+
		"\2\2\u009b\u009d\7 \2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00fa\5\4\3\33\u009f\u00a1\f\31\2\2\u00a0\u00a2\7"+
		" \2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\t\3\2\2\u00a4\u00a6\7 \2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00fa\5\4\3\32\u00a8\u00aa\f\30\2\2\u00a9"+
		"\u00ab\7 \2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\7\f\2\2\u00ad\u00af\7 \2\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00fa\5\4\3\31\u00b1\u00b3\f"+
		"\27\2\2\u00b2\u00b4\7 \2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\7\r\2\2\u00b6\u00b8\7 \2\2\u00b7\u00b6\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00fa\5\4\3\30\u00ba"+
		"\u00bc\f\26\2\2\u00bb\u00bd\7 \2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\7\16\2\2\u00bf\u00c1\7 \2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00fa\5\4"+
		"\3\27\u00c3\u00c5\f\25\2\2\u00c4\u00c6\7 \2\2\u00c5\u00c4\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7\17\2\2\u00c8\u00ca\7"+
		" \2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00fa\5\4\3\26\u00cc\u00ce\f\24\2\2\u00cd\u00cf\7 \2\2\u00ce\u00cd\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\20\2\2\u00d1"+
		"\u00d3\7 \2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00fa\5\4\3\25\u00d5\u00d7\f\23\2\2\u00d6\u00d8\7 \2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\21"+
		"\2\2\u00da\u00dc\7 \2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00fa\5\4\3\24\u00de\u00e0\f\21\2\2\u00df\u00e1\7"+
		" \2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\7\23\2\2\u00e3\u00e5\7 \2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00fa\5\4\3\22\u00e7\u00e9\f\20\2\2\u00e8"+
		"\u00ea\7 \2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\7\22\2\2\u00ec\u00ee\7 \2\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00fa\5\4\3\21\u00f0\u00f2\f"+
		"\17\2\2\u00f1\u00f3\7 \2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\7\26\2\2\u00f5\u00f7\7 \2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\5\20\t\2\u00f9"+
		"\u008d\3\2\2\2\u00f9\u0096\3\2\2\2\u00f9\u009f\3\2\2\2\u00f9\u00a8\3\2"+
		"\2\2\u00f9\u00b1\3\2\2\2\u00f9\u00ba\3\2\2\2\u00f9\u00c3\3\2\2\2\u00f9"+
		"\u00cc\3\2\2\2\u00f9\u00d5\3\2\2\2\u00f9\u00de\3\2\2\2\u00f9\u00e7\3\2"+
		"\2\2\u00f9\u00f0\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\5\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\7 \2\2"+
		"\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\7\"\2\2\u0102\u0104\7 \2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\5\4\3\2\u0106\u0108\7 \2\2\u0107\u0106\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\7#\2\2\u010a"+
		"\u010c\7 \2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\7\3\2\2\2"+
		"\u010d\u010f\7 \2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0112\7*\2\2\u0111\u0113\7 \2\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5\n\6\2\u0115\u0117\7 "+
		"\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\7+\2\2\u0119\t\3\2\2\2\u011a\u011c\5\f\7\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7,\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0124\3\2\2\2\u0124\13\3\2\2"+
		"\2\u0125\u0126\5\36\20\2\u0126\u0127\7)\2\2\u0127\u0132\3\2\2\2\u0128"+
		"\u0129\5\30\r\2\u0129\u012a\7)\2\2\u012a\u0132\3\2\2\2\u012b\u012c\5\26"+
		"\f\2\u012c\u012d\7)\2\2\u012d\u0132\3\2\2\2\u012e\u012f\5\4\3\2\u012f"+
		"\u0130\7,\2\2\u0130\u0132\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0128\3\2"+
		"\2\2\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0132\r\3\2\2\2\u0133\u0135"+
		"\7 \2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\7\"\2\2\u0137\u0139\7 \2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\5\4\3\2\u013b\u013d\7 \2\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013f\7\3"+
		"\2\2\u013f\u0141\5\4\3\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\7 "+
		"\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\7#\2\2\u0148\u014a\7 \2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\17\3\2\2\2\u014b\u014d\7 \2\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0163\7$\2\2\u014f\u0151\7 \2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5\4"+
		"\3\2\u0153\u0155\7 \2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0160\3\2\2\2\u0156\u0158\7,\2\2\u0157\u0159\7 \2\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\5\4\3\2\u015b\u015d"+
		"\7 \2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0156\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0150\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7%\2\2\u0166\u0168\7 \2"+
		"\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\21\3\2\2\2\u0169\u016b"+
		"\7\"\2\2\u016a\u016c\7 \2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\7\60\2\2\u016e\u0170\7 \2\2\u016f\u016e\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\7\35\2\2\u0172"+
		"\u0174\7 \2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0177\5\"\22\2\u0176\u0178\7 \2\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7#\2\2\u017a\u017c\7 \2"+
		"\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0169"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\23\3\2\2\2\u0181\u0183\7 \2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\u0186\7.\2\2\u0185\u0187\7 \2\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\5\22\n\2"+
		"\u0189\u018b\7 \2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u018e\7\4\2\2\u018d\u018f\7 \2\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\5\4\3\2\u0191\u0193\7 "+
		"\2\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\25\3\2\2\2\u0194\u0196"+
		"\7 \2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\7-\2\2\u0198\u019a\7 \2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2"+
		"\2\u019a\u019b\3\2\2\2\u019b\u019d\7/\2\2\u019c\u019e\7 \2\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7\60\2\2"+
		"\u01a0\u01a2\7 \2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3\u01a5\5\22\n\2\u01a4\u01a6\7 \2\2\u01a5\u01a4\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\7\35\2\2\u01a8\u01aa\7"+
		" \2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\5\"\22\2\u01ac\u01ae\7 \2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7\20\2\2\u01b0\u01b2\7 \2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\5\b"+
		"\5\2\u01b4\u01b6\7 \2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\27\3\2\2\2\u01b7\u01b9\7 \2\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2"+
		"\u01b9\u01ba\3\2\2\2\u01ba\u01bc\7-\2\2\u01bb\u01bd\7 \2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\7\60\2\2"+
		"\u01bf\u01c1\7 \2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c4\5\22\n\2\u01c3\u01c5\7 \2\2\u01c4\u01c3\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\7\35\2\2\u01c7\u01c9\7"+
		" \2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01cc\5\"\22\2\u01cb\u01cd\7 \2\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\7\20\2\2\u01cf\u01d1\7 \2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\5\b"+
		"\5\2\u01d3\u01d5\7 \2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\31\3\2\2\2\u01d6\u01d8\7 \2\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd"+
		"\5\4\3\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\33\3\2\2\2\u01e0\u01e2\7 \2\2\u01e1\u01e0\3\2\2\2"+
		"\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\60\2\2\u01e4\u01e6"+
		"\5\32\16\2\u01e5\u01e7\7 \2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2"+
		"\u01e7\35\3\2\2\2\u01e8\u01ea\7 \2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3"+
		"\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\7-\2\2\u01ec\u01ee\7 \2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\7\60"+
		"\2\2\u01f0\u01f2\7 \2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\7\35\2\2\u01f4\u01f6\7 \2\2\u01f5\u01f4\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\5\"\22\2\u01f8"+
		"\u01fa\7 \2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fd\7\20\2\2\u01fc\u01fe\7 \2\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\5\4\3\2\u0200\u0202\7 "+
		"\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\37\3\2\2\2\u0203\u0205"+
		"\7 \2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\7&\2\2\u0207\u0209\7 \2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2"+
		"\2\u0209\u020a\3\2\2\2\u020a\u020c\5\4\3\2\u020b\u020d\7 \2\2\u020c\u020b"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7\'\2\2\u020f"+
		"\u0211\7 \2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\5\b\5\2\u0213\u0215\7 \2\2\u0214\u0213\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0221\3\2\2\2\u0216\u0218\7 \2\2\u0217\u0216\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\7(\2\2\u021a"+
		"\u021c\7 \2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u021f\5\b\5\2\u021e\u0220\7 \2\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0217\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222!\3\2\2\2\u0223\u0224\b\22\1\2\u0224\u0226\7\"\2\2\u0225\u0227"+
		"\7 \2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\5\"\22\2\u0229\u022b\7 \2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7#\2\2\u022d\u023c\3\2\2\2\u022e"+
		"\u0239\7\34\2\2\u022f\u0231\7\f\2\2\u0230\u0232\7 \2\2\u0231\u0230\3\2"+
		"\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\5&\24\2\u0234"+
		"\u0236\7 \2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0238\7\16\2\2\u0238\u023a\3\2\2\2\u0239\u022f\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0223\3\2\2\2\u023b\u022e\3\2"+
		"\2\2\u023c\u0256\3\2\2\2\u023d\u023f\f\4\2\2\u023e\u0240\7 \2\2\u023f"+
		"\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\7\b"+
		"\2\2\u0242\u0244\7 \2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0255\5\"\22\5\u0246\u0248\f\3\2\2\u0247\u0249\7"+
		" \2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024c\7\4\2\2\u024b\u024d\7 \2\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024e\3\2\2\2\u024e\u0255\5\"\22\4\u024f\u0251\f\5\2\2\u0250"+
		"\u0252\7 \2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0255\7\5\2\2\u0254\u023d\3\2\2\2\u0254\u0246\3\2\2\2\u0254"+
		"\u024f\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2"+
		"\2\2\u0257#\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025b\7 \2\2\u025a\u0259"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\7\36\2\2"+
		"\u025d\u025f\7 \2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\7\37\2\2\u0261\u0263\7 \2\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\7\60\2\2\u0265\u0267\7"+
		" \2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0270\3\2\2\2\u0268"+
		"\u026a\7\20\2\2\u0269\u026b\7 \2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026e\5&\24\2\u026d\u026f\7 \2\2\u026e"+
		"\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u0268\3\2"+
		"\2\2\u0270\u0271\3\2\2\2\u0271%\3\2\2\2\u0272\u0274\7\t\2\2\u0273\u0272"+
		"\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0277\7 \2\2\u0276"+
		"\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027c\3\2\2\2\u0278\u027a\5*"+
		"\26\2\u0279\u027b\7 \2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u0278\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u0282\7 \2\2\u0281"+
		"\u0280\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0286\3\2\2\2\u0283\u0285\5("+
		"\25\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028b\7 "+
		"\2\2\u028a\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\'\3\2\2\2\u028c\u028e"+
		"\7 \2\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\t\2\2\2\u0290\u0292\7 \2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292\u0297\3\2\2\2\u0293\u0295\5*\26\2\u0294\u0296\7 \2\2\u0295"+
		"\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0293\3\2"+
		"\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u029d\7 \2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2"+
		"\2\2\u029d)\3\2\2\2\u029e\u029f\b\26\1\2\u029f\u02ac\7\30\2\2\u02a0\u02ac"+
		"\7\60\2\2\u02a1\u02a3\7\"\2\2\u02a2\u02a4\7 \2\2\u02a3\u02a2\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\5&\24\2\u02a6\u02a8\7 "+
		"\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\7#\2\2\u02aa\u02ac\3\2\2\2\u02ab\u029e\3\2\2\2\u02ab\u02a0\3\2"+
		"\2\2\u02ab\u02a1\3\2\2\2\u02ac\u02b8\3\2\2\2\u02ad\u02af\f\3\2\2\u02ae"+
		"\u02b0\7 \2\2\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b3\7\6\2\2\u02b2\u02b4\7 \2\2\u02b3\u02b2\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\5,\27\2\u02b6\u02ad\3\2"+
		"\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"+\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02d8\7\30\2\2\u02bc\u02be\7\13\2"+
		"\2\u02bd\u02bf\7 \2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02d8\7\30\2\2\u02c1\u02c3\7\"\2\2\u02c2\u02c4\7 \2\2\u02c3"+
		"\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\7\30"+
		"\2\2\u02c6\u02c8\7 \2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02d8\7#\2\2\u02ca\u02cc\7\"\2\2\u02cb\u02cd\7 \2"+
		"\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0"+
		"\7\13\2\2\u02cf\u02d1\7 \2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d4\7\30\2\2\u02d3\u02d5\7 \2\2\u02d4\u02d3\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\7#\2\2\u02d7"+
		"\u02bb\3\2\2\2\u02d7\u02bc\3\2\2\2\u02d7\u02c1\3\2\2\2\u02d7\u02ca\3\2"+
		"\2\2\u02d8-\3\2\2\2\u00a6\61=BFLPTY]adglptwz~\u0081\u0085\u008b\u008f"+
		"\u0093\u0098\u009c\u00a1\u00a5\u00aa\u00ae\u00b3\u00b7\u00bc\u00c0\u00c5"+
		"\u00c9\u00ce\u00d2\u00d7\u00db\u00e0\u00e4\u00e9\u00ed\u00f2\u00f6\u00f9"+
		"\u00fb\u00ff\u0103\u0107\u010b\u010e\u0112\u0116\u011d\u0123\u0131\u0134"+
		"\u0138\u013c\u0142\u0145\u0149\u014c\u0150\u0154\u0158\u015c\u0160\u0163"+
		"\u0167\u016b\u016f\u0173\u0177\u017b\u017f\u0182\u0186\u018a\u018e\u0192"+
		"\u0195\u0199\u019d\u01a1\u01a5\u01a9\u01ad\u01b1\u01b5\u01b8\u01bc\u01c0"+
		"\u01c4\u01c8\u01cc\u01d0\u01d4\u01d9\u01de\u01e1\u01e6\u01e9\u01ed\u01f1"+
		"\u01f5\u01f9\u01fd\u0201\u0204\u0208\u020c\u0210\u0214\u0217\u021b\u021f"+
		"\u0221\u0226\u022a\u0231\u0235\u0239\u023b\u023f\u0243\u0248\u024c\u0251"+
		"\u0254\u0256\u025a\u025e\u0262\u0266\u026a\u026e\u0270\u0273\u0276\u027a"+
		"\u027e\u0281\u0286\u028a\u028d\u0291\u0295\u0299\u029c\u02a3\u02a7\u02ab"+
		"\u02af\u02b3\u02b8\u02be\u02c3\u02c7\u02cc\u02d0\u02d4\u02d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}