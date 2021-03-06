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
		IF=36, THEN=37, ELSE=38, IN=39, BEGIN=40, END=41, MATCH=42, WITH=43, ARROW=44, 
		PATTERN_CONDITION=45, SEMICOLON=46, LET=47, LAMBDADEC=48, RECURSION=49, 
		VARIABLE=50, COMMENT=51, LINE_COMMENT=52;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_parenthesesExpression = 2, RULE_blockExpression = 3, 
		RULE_sequentialExpression = 4, RULE_sequenceLine = 5, RULE_patternMatching = 6, 
		RULE_patternBranch = 7, RULE_tupleExpression = 8, RULE_listExpression = 9, 
		RULE_lambdaParameters = 10, RULE_lambdaExpression = 11, RULE_recFuncDeclaration = 12, 
		RULE_funcDeclaration = 13, RULE_applyParameters = 14, RULE_funcApplication = 15, 
		RULE_bind = 16, RULE_conditionalExpr = 17, RULE_typeDeclaration = 18, 
		RULE_unitDeclaration = 19, RULE_unitFormula = 20, RULE_unitProduct = 21, 
		RULE_unitElement = 22, RULE_exponent = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "parenthesesExpression", "blockExpression", "sequentialExpression", 
			"sequenceLine", "patternMatching", "patternBranch", "tupleExpression", 
			"listExpression", "lambdaParameters", "lambdaExpression", "recFuncDeclaration", 
			"funcDeclaration", "applyParameters", "funcApplication", "bind", "conditionalExpr", 
			"typeDeclaration", "unitDeclaration", "unitFormula", "unitProduct", "unitElement", 
			"exponent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "','", "'list'", "'^'", "'**'", "'*'", "'/'", "'+'", "'-'", 
			"'<'", "'<='", "'>'", "'>='", "'='", "'<>'", "'||'", "'&&'", "'not'", 
			"'?'", "'::'", "'@'", null, null, null, null, null, "':'", "'[<Measure>]'", 
			"'type'", null, null, "'('", "')'", "'['", "']'", "'if'", "'then'", "'else'", 
			"'in'", "'begin'", "'end'", "'match'", "'with'", "'->'", "'when'", "';'", 
			"'let'", "'fun'", "'rec'"
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
			"THEN", "ELSE", "IN", "BEGIN", "END", "MATCH", "WITH", "ARROW", "PATTERN_CONDITION", 
			"SEMICOLON", "LET", "LAMBDADEC", "RECURSION", "VARIABLE", "COMMENT", 
			"LINE_COMMENT"
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
		public List<UnitDeclarationContext> unitDeclaration() {
			return getRuleContexts(UnitDeclarationContext.class);
		}
		public UnitDeclarationContext unitDeclaration(int i) {
			return getRuleContext(UnitDeclarationContext.class,i);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << INTEGER) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << UNIT) | (1L << UNITOFMEASURE) | (1L << WS) | (1L << LEFTPAR) | (1L << LEFTSQPAR) | (1L << IF) | (1L << BEGIN) | (1L << MATCH) | (1L << LET) | (1L << LAMBDADEC) | (1L << VARIABLE))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(48);
					sequenceLine();
					}
					break;
				case 2:
					{
					setState(49);
					unitDeclaration();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
	public static class PatternMatchingExpressionContext extends ExpressionContext {
		public PatternMatchingContext patternMatching() {
			return getRuleContext(PatternMatchingContext.class,0);
		}
		public PatternMatchingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterPatternMatchingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitPatternMatchingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitPatternMatchingExpression(this);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				parenthesesExpression();
				}
				break;
			case 2:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				blockExpression();
				}
				break;
			case 3:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(SUB);
				setState(61);
				expression(25);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((NotContext)_localctx).operator = match(NOT);
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(63);
					match(WS);
					}
					break;
				}
				setState(66);
				((NotContext)_localctx).argument = expression(16);
				}
				break;
			case 5:
				{
				_localctx = new ConcatenateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				((ConcatenateContext)_localctx).left = listExpression();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(68);
					match(WS);
					}
				}

				setState(71);
				((ConcatenateContext)_localctx).operator = match(CONC);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(72);
					match(WS);
					}
					break;
				}
				setState(75);
				((ConcatenateContext)_localctx).right = listExpression();
				}
				break;
			case 6:
				{
				_localctx = new PatternMatchingExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				patternMatching();
				}
				break;
			case 7:
				{
				_localctx = new ConditionalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				conditionalExpr();
				}
				break;
			case 8:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(79);
					match(WS);
					}
				}

				setState(82);
				match(VARIABLE);
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(83);
					match(WS);
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new FunctionApplicationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				funcApplication();
				}
				break;
			case 10:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(87);
					match(WS);
					}
				}

				setState(90);
				match(INTEGER);
				setState(101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(91);
					match(LESSTHAN);
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(92);
						match(WS);
						}
						break;
					}
					setState(95);
					((IntegerContext)_localctx).uom = unitFormula();
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(96);
						match(WS);
						}
					}

					setState(99);
					match(GREATERTHAN);
					}
					break;
				}
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(103);
					match(WS);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(106);
					match(WS);
					}
				}

				setState(109);
				match(DOUBLE);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(110);
					match(LESSTHAN);
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(111);
						match(WS);
						}
						break;
					}
					setState(114);
					((DoubleContext)_localctx).uom = unitFormula();
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(115);
						match(WS);
						}
					}

					setState(118);
					match(GREATERTHAN);
					}
					break;
				}
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(122);
					match(WS);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
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
				match(BOOLEAN);
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(129);
					match(WS);
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new UnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(132);
					match(WS);
					}
				}

				setState(135);
				match(UNIT);
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(136);
					match(WS);
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				tupleExpression();
				}
				break;
			case 15:
				{
				_localctx = new ListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				listExpression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				lambdaExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpressionContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(145);
							match(WS);
							}
						}

						setState(148);
						((PowerContext)_localctx).operator = match(POW);
						setState(150);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(149);
							match(WS);
							}
							break;
						}
						setState(152);
						((PowerContext)_localctx).right = expression(26);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationDivisionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicationDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(154);
							match(WS);
							}
						}

						setState(157);
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
						setState(159);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(158);
							match(WS);
							}
							break;
						}
						setState(161);
						((MultiplicationDivisionContext)_localctx).right = expression(25);
						}
						break;
					case 3:
						{
						_localctx = new AdditionSubtractionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditionSubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(163);
							match(WS);
							}
						}

						setState(166);
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
						setState(168);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(167);
							match(WS);
							}
							break;
						}
						setState(170);
						((AdditionSubtractionContext)_localctx).right = expression(24);
						}
						break;
					case 4:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(172);
							match(WS);
							}
						}

						setState(175);
						((LessThanContext)_localctx).operator = match(LESSTHAN);
						setState(177);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(176);
							match(WS);
							}
							break;
						}
						setState(179);
						((LessThanContext)_localctx).right = expression(23);
						}
						break;
					case 5:
						{
						_localctx = new LessThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((LessThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(181);
							match(WS);
							}
						}

						setState(184);
						((LessThanOrEqualContext)_localctx).operator = match(LESSTHANOREQUAL);
						setState(186);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(185);
							match(WS);
							}
							break;
						}
						setState(188);
						((LessThanOrEqualContext)_localctx).right = expression(22);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(190);
							match(WS);
							}
						}

						setState(193);
						((GreaterThanContext)_localctx).operator = match(GREATERTHAN);
						setState(195);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
						case 1:
							{
							setState(194);
							match(WS);
							}
							break;
						}
						setState(197);
						((GreaterThanContext)_localctx).right = expression(21);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpressionContext(_parentctx, _parentState));
						((GreaterThanOrEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(199);
							match(WS);
							}
						}

						setState(202);
						((GreaterThanOrEqualContext)_localctx).operator = match(GREATERTHANOREQUAL);
						setState(204);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
						case 1:
							{
							setState(203);
							match(WS);
							}
							break;
						}
						setState(206);
						((GreaterThanOrEqualContext)_localctx).right = expression(20);
						}
						break;
					case 8:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						((EqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(208);
							match(WS);
							}
						}

						setState(211);
						((EqualContext)_localctx).operator = match(EQUAL);
						setState(213);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
						case 1:
							{
							setState(212);
							match(WS);
							}
							break;
						}
						setState(215);
						((EqualContext)_localctx).right = expression(19);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualContext(new ExpressionContext(_parentctx, _parentState));
						((NotEqualContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(217);
							match(WS);
							}
						}

						setState(220);
						((NotEqualContext)_localctx).operator = match(NOTEQUAL);
						setState(222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(221);
							match(WS);
							}
							break;
						}
						setState(224);
						((NotEqualContext)_localctx).right = expression(18);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(227);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(226);
							match(WS);
							}
						}

						setState(229);
						((AndContext)_localctx).operator = match(AND);
						setState(231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(230);
							match(WS);
							}
							break;
						}
						setState(233);
						((AndContext)_localctx).right = expression(16);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(235);
							match(WS);
							}
						}

						setState(238);
						((OrContext)_localctx).operator = match(OR);
						setState(240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
						case 1:
							{
							setState(239);
							match(WS);
							}
							break;
						}
						setState(242);
						((OrContext)_localctx).right = expression(15);
						}
						break;
					case 12:
						{
						_localctx = new AttachContext(new ExpressionContext(_parentctx, _parentState));
						((AttachContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(245);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(244);
							match(WS);
							}
						}

						setState(247);
						((AttachContext)_localctx).operator = match(ATTACH);
						setState(249);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(248);
							match(WS);
							}
							break;
						}
						setState(251);
						((AttachContext)_localctx).right = listExpression();
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(257);
				match(WS);
				}
			}

			setState(260);
			match(LEFTPAR);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(261);
				match(WS);
				}
				break;
			}
			setState(264);
			((ParenthesesExpressionContext)_localctx).inner = expression(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(265);
				match(WS);
				}
			}

			setState(268);
			match(RIGHTPAR);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(269);
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
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(272);
				match(WS);
				}
			}

			setState(275);
			match(BEGIN);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(276);
				match(WS);
				}
				break;
			}
			setState(279);
			sequentialExpression();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(280);
				match(WS);
				}
			}

			setState(283);
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						sequenceLine();
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(291);
				expression(0);
				setState(292);
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
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
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
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				bind();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(297);
					match(WS);
					}
				}

				setState(300);
				match(IN);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(301);
					match(WS);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				funcDeclaration();
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
				match(IN);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(309);
					match(WS);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				recFuncDeclaration();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(313);
					match(WS);
					}
				}

				setState(316);
				match(IN);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(317);
					match(WS);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				expression(0);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(321);
					match(WS);
					}
				}

				setState(324);
				match(SEMICOLON);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(325);
					match(WS);
					}
					break;
				}
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

	public static class PatternMatchingContext extends ParserRuleContext {
		public ExpressionContext subject;
		public TerminalNode MATCH() { return getToken(FLiteSharpParser.MATCH, 0); }
		public List<TerminalNode> WS() { return getTokens(FLiteSharpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(FLiteSharpParser.WS, i);
		}
		public TerminalNode WITH() { return getToken(FLiteSharpParser.WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<PatternBranchContext> patternBranch() {
			return getRuleContexts(PatternBranchContext.class);
		}
		public PatternBranchContext patternBranch(int i) {
			return getRuleContext(PatternBranchContext.class,i);
		}
		public PatternMatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternMatching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterPatternMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitPatternMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitPatternMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternMatchingContext patternMatching() throws RecognitionException {
		PatternMatchingContext _localctx = new PatternMatchingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_patternMatching);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(MATCH);
			setState(331);
			match(WS);
			setState(332);
			((PatternMatchingContext)_localctx).subject = expression(0);
			setState(333);
			match(WS);
			setState(334);
			match(WITH);
			setState(336); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(335);
					patternBranch();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(338); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class PatternBranchContext extends ParserRuleContext {
		public ExpressionContext pattern;
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode ARROW() { return getToken(FLiteSharpParser.ARROW, 0); }
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
		public TerminalNode PATTERN_CONDITION() { return getToken(FLiteSharpParser.PATTERN_CONDITION, 0); }
		public PatternBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).enterPatternBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLiteSharpListener ) ((FLiteSharpListener)listener).exitPatternBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLiteSharpVisitor ) return ((FLiteSharpVisitor<? extends T>)visitor).visitPatternBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternBranchContext patternBranch() throws RecognitionException {
		PatternBranchContext _localctx = new PatternBranchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_patternBranch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(340);
				match(WS);
				}
			}

			setState(343);
			match(T__0);
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(344);
				match(WS);
				}
				break;
			}
			setState(347);
			((PatternBranchContext)_localctx).pattern = expression(0);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(348);
				match(WS);
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATTERN_CONDITION) {
				{
				setState(351);
				match(PATTERN_CONDITION);
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(352);
					match(WS);
					}
					break;
				}
				setState(355);
				((PatternBranchContext)_localctx).condition = expression(0);
				}
			}

			setState(358);
			match(ARROW);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(359);
				match(WS);
				}
				break;
			}
			setState(362);
			((PatternBranchContext)_localctx).result = expression(0);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(363);
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
		enterRule(_localctx, 16, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(366);
				match(WS);
				}
			}

			setState(369);
			match(LEFTPAR);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(370);
				match(WS);
				}
				break;
			}
			setState(373);
			expression(0);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(374);
				match(WS);
				}
			}

			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				match(T__1);
				setState(378);
				expression(0);
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
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
			match(RIGHTPAR);
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(387);
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
		enterRule(_localctx, 18, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(390);
				match(WS);
				}
			}

			setState(393);
			match(LEFTSQPAR);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << INTEGER) | (1L << DOUBLE) | (1L << BOOLEAN) | (1L << UNIT) | (1L << WS) | (1L << LEFTPAR) | (1L << LEFTSQPAR) | (1L << IF) | (1L << BEGIN) | (1L << MATCH) | (1L << LAMBDADEC) | (1L << VARIABLE))) != 0)) {
				{
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(394);
					match(WS);
					}
					break;
				}
				setState(397);
				expression(0);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(398);
					match(WS);
					}
				}

				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(401);
					match(SEMICOLON);
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(402);
						match(WS);
						}
						break;
					}
					setState(405);
					expression(0);
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(406);
						match(WS);
						}
					}

					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(416);
			match(RIGHTSQPAR);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(417);
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
		public TerminalNode UNIT() { return getToken(FLiteSharpParser.UNIT, 0); }
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
		enterRule(_localctx, 20, RULE_lambdaParameters);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(UNIT);
				}
				break;
			case LEFTPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(421);
					match(LEFTPAR);
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
					match(VARIABLE);
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
					match(TYPEOP);
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(430);
						match(WS);
						}
					}

					setState(433);
					typeDeclaration(0);
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(434);
						match(WS);
						}
					}

					setState(437);
					match(RIGHTPAR);
					setState(439);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(438);
						match(WS);
						}
						break;
					}
					}
					}
					setState(443); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LEFTPAR );
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode ARROW() { return getToken(FLiteSharpParser.ARROW, 0); }
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
		enterRule(_localctx, 22, RULE_lambdaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(447);
				match(WS);
				}
			}

			setState(450);
			match(LAMBDADEC);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(451);
				match(WS);
				}
			}

			setState(454);
			lambdaParameters();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(455);
				match(WS);
				}
			}

			setState(458);
			match(ARROW);
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(459);
				match(WS);
				}
				break;
			}
			setState(462);
			((LambdaExpressionContext)_localctx).lambdaBody = expression(0);
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(463);
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
		enterRule(_localctx, 24, RULE_recFuncDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(466);
				match(WS);
				}
			}

			setState(469);
			match(LET);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(470);
				match(WS);
				}
			}

			setState(473);
			match(RECURSION);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(474);
				match(WS);
				}
			}

			setState(477);
			((RecFuncDeclarationContext)_localctx).functionName = match(VARIABLE);
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
			((RecFuncDeclarationContext)_localctx).params = lambdaParameters();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(482);
				match(WS);
				}
			}

			setState(485);
			match(TYPEOP);
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
			((RecFuncDeclarationContext)_localctx).type = typeDeclaration(0);
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
			match(EQUAL);
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(494);
				match(WS);
				}
				break;
			}
			setState(497);
			((RecFuncDeclarationContext)_localctx).functionBody = blockExpression();
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(498);
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
		enterRule(_localctx, 26, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(501);
				match(WS);
				}
			}

			setState(504);
			match(LET);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(505);
				match(WS);
				}
			}

			setState(508);
			((FuncDeclarationContext)_localctx).functionName = match(VARIABLE);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(509);
				match(WS);
				}
			}

			setState(512);
			((FuncDeclarationContext)_localctx).params = lambdaParameters();
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
			match(TYPEOP);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(517);
				match(WS);
				}
			}

			setState(520);
			((FuncDeclarationContext)_localctx).type = typeDeclaration(0);
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
			match(EQUAL);
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(525);
				match(WS);
				}
				break;
			}
			setState(528);
			((FuncDeclarationContext)_localctx).functionBody = blockExpression();
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(529);
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
		enterRule(_localctx, 28, RULE_applyParameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(532);
					match(WS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(538); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(537);
					expression(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(540); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		enterRule(_localctx, 30, RULE_funcApplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(542);
				match(WS);
				}
			}

			setState(545);
			((FuncApplicationContext)_localctx).name = match(VARIABLE);
			setState(546);
			applyParameters();
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(547);
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
		enterRule(_localctx, 32, RULE_bind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(550);
				match(WS);
				}
			}

			setState(553);
			match(LET);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(554);
				match(WS);
				}
			}

			setState(557);
			((BindContext)_localctx).name = match(VARIABLE);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(558);
				match(WS);
				}
			}

			setState(561);
			match(TYPEOP);
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
			((BindContext)_localctx).type = typeDeclaration(0);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(566);
				match(WS);
				}
			}

			setState(569);
			match(EQUAL);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(570);
				match(WS);
				}
				break;
			}
			setState(573);
			expression(0);
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(574);
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
		enterRule(_localctx, 34, RULE_conditionalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(577);
				match(WS);
				}
			}

			setState(580);
			match(IF);
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(581);
				match(WS);
				}
				break;
			}
			setState(584);
			((ConditionalExprContext)_localctx).test = expression(0);
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
			match(THEN);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(589);
				match(WS);
				}
				break;
			}
			setState(592);
			((ConditionalExprContext)_localctx).consequent = blockExpression();
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(593);
				match(WS);
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(596);
					match(WS);
					}
				}

				setState(599);
				match(ELSE);
				setState(601);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(600);
					match(WS);
					}
					break;
				}
				setState(603);
				((ConditionalExprContext)_localctx).alternate = blockExpression();
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(604);
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
		public TerminalNode ARROW() { return getToken(FLiteSharpParser.ARROW, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_typeDeclaration, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPAR:
				{
				_localctx = new ParenthesesTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(610);
				match(LEFTPAR);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(611);
					match(WS);
					}
				}

				setState(614);
				typeDeclaration(0);
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(615);
					match(WS);
					}
				}

				setState(618);
				match(RIGHTPAR);
				}
				break;
			case TYPE:
				{
				_localctx = new PrimitiveTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				match(TYPE);
				setState(631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(621);
					match(LESSTHAN);
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						setState(622);
						match(WS);
						}
						break;
					}
					setState(625);
					((PrimitiveTypeContext)_localctx).uom = unitFormula();
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(626);
						match(WS);
						}
					}

					setState(629);
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
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(658);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						_localctx = new TupleTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						((TupleTypeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(635);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(637);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(636);
							match(WS);
							}
						}

						setState(639);
						match(MUL);
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(640);
							match(WS);
							}
						}

						setState(643);
						((TupleTypeContext)_localctx).right = typeDeclaration(3);
						}
						break;
					case 2:
						{
						_localctx = new FunctionTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						((FunctionTypeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(644);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(646);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(645);
							match(WS);
							}
						}

						setState(648);
						match(ARROW);
						setState(650);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(649);
							match(WS);
							}
						}

						setState(652);
						((FunctionTypeContext)_localctx).right = typeDeclaration(2);
						}
						break;
					case 3:
						{
						_localctx = new ListTypeContext(new TypeDeclarationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_typeDeclaration);
						setState(653);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(654);
							match(WS);
							}
						}

						setState(657);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		enterRule(_localctx, 38, RULE_unitDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(663);
				match(WS);
				}
			}

			setState(666);
			match(UNITOFMEASURE);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(667);
				match(WS);
				}
			}

			setState(670);
			match(TYPEKEYWORD);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(671);
				match(WS);
				}
			}

			setState(674);
			((UnitDeclarationContext)_localctx).name = match(VARIABLE);
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(675);
				match(WS);
				}
				break;
			}
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(678);
				match(EQUAL);
				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(679);
					match(WS);
					}
					break;
				}
				setState(682);
				((UnitDeclarationContext)_localctx).formula = unitFormula();
				setState(684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(683);
					match(WS);
					}
					break;
				}
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
		enterRule(_localctx, 40, RULE_unitFormula);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIV) {
				{
				setState(688);
				((UnitFormulaContext)_localctx).operator = match(DIV);
				}
			}

			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(691);
				match(WS);
				}
			}

			setState(698); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(694);
					unitElement(0);
					setState(696);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(695);
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
				setState(700); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(702);
				match(WS);
				}
				break;
			}
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					unitProduct();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(711);
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
		enterRule(_localctx, 42, RULE_unitProduct);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(714);
				match(WS);
				}
			}

			setState(717);
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
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(718);
				match(WS);
				}
			}

			setState(725); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(721);
					unitElement(0);
					setState(723);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						setState(722);
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
				setState(727); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(729);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_unitElement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new OneUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(733);
				match(INTEGER);
				}
				break;
			case VARIABLE:
				{
				_localctx = new SingleUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(734);
				match(VARIABLE);
				}
				break;
			case LEFTPAR:
				{
				_localctx = new ParenthesisUnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(735);
				match(LEFTPAR);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(736);
					match(WS);
					}
					break;
				}
				setState(739);
				unitFormula();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(740);
					match(WS);
					}
				}

				setState(743);
				match(RIGHTPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExponentialUnitContext(new UnitElementContext(_parentctx, _parentState));
					((ExponentialUnitContext)_localctx).argument = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unitElement);
					setState(747);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(748);
						match(WS);
						}
					}

					setState(751);
					((ExponentialUnitContext)_localctx).operator = match(T__3);
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(752);
						match(WS);
						}
					}

					setState(755);
					((ExponentialUnitContext)_localctx).exp = exponent();
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
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
		enterRule(_localctx, 46, RULE_exponent);
		int _la;
		try {
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(SUB);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(763);
					match(WS);
					}
				}

				setState(766);
				match(INTEGER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(767);
				match(LEFTPAR);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(768);
					match(WS);
					}
				}

				setState(771);
				match(INTEGER);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(772);
					match(WS);
					}
				}

				setState(775);
				match(RIGHTPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				match(LEFTPAR);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(777);
					match(WS);
					}
				}

				setState(780);
				match(SUB);
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(781);
					match(WS);
					}
				}

				setState(784);
				match(INTEGER);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(785);
					match(WS);
					}
				}

				setState(788);
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
		case 18:
			return typeDeclaration_sempred((TypeDeclarationContext)_localctx, predIndex);
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u031a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3C\n\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3S\n\3\3\3\3\3\5\3W\n\3\3\3\3\3\5\3[\n\3\3\3\3\3\3\3\5\3`\n\3\3\3\3\3"+
		"\5\3d\n\3\3\3\3\3\5\3h\n\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\3\3\3\3\5\3s"+
		"\n\3\3\3\3\3\5\3w\n\3\3\3\3\3\5\3{\n\3\3\3\5\3~\n\3\3\3\5\3\u0081\n\3"+
		"\3\3\3\3\5\3\u0085\n\3\3\3\5\3\u0088\n\3\3\3\3\3\5\3\u008c\n\3\3\3\3\3"+
		"\3\3\5\3\u0091\n\3\3\3\3\3\5\3\u0095\n\3\3\3\3\3\5\3\u0099\n\3\3\3\3\3"+
		"\3\3\5\3\u009e\n\3\3\3\3\3\5\3\u00a2\n\3\3\3\3\3\3\3\5\3\u00a7\n\3\3\3"+
		"\3\3\5\3\u00ab\n\3\3\3\3\3\3\3\5\3\u00b0\n\3\3\3\3\3\5\3\u00b4\n\3\3\3"+
		"\3\3\3\3\5\3\u00b9\n\3\3\3\3\3\5\3\u00bd\n\3\3\3\3\3\3\3\5\3\u00c2\n\3"+
		"\3\3\3\3\5\3\u00c6\n\3\3\3\3\3\3\3\5\3\u00cb\n\3\3\3\3\3\5\3\u00cf\n\3"+
		"\3\3\3\3\3\3\5\3\u00d4\n\3\3\3\3\3\5\3\u00d8\n\3\3\3\3\3\3\3\5\3\u00dd"+
		"\n\3\3\3\3\3\5\3\u00e1\n\3\3\3\3\3\3\3\5\3\u00e6\n\3\3\3\3\3\5\3\u00ea"+
		"\n\3\3\3\3\3\3\3\5\3\u00ef\n\3\3\3\3\3\5\3\u00f3\n\3\3\3\3\3\3\3\5\3\u00f8"+
		"\n\3\3\3\3\3\5\3\u00fc\n\3\3\3\7\3\u00ff\n\3\f\3\16\3\u0102\13\3\3\4\5"+
		"\4\u0105\n\4\3\4\3\4\5\4\u0109\n\4\3\4\3\4\5\4\u010d\n\4\3\4\3\4\5\4\u0111"+
		"\n\4\3\5\5\5\u0114\n\5\3\5\3\5\5\5\u0118\n\5\3\5\3\5\5\5\u011c\n\5\3\5"+
		"\3\5\3\6\7\6\u0121\n\6\f\6\16\6\u0124\13\6\3\6\3\6\3\6\5\6\u0129\n\6\3"+
		"\7\3\7\5\7\u012d\n\7\3\7\3\7\5\7\u0131\n\7\3\7\3\7\5\7\u0135\n\7\3\7\3"+
		"\7\5\7\u0139\n\7\3\7\3\7\5\7\u013d\n\7\3\7\3\7\5\7\u0141\n\7\3\7\3\7\5"+
		"\7\u0145\n\7\3\7\3\7\5\7\u0149\n\7\5\7\u014b\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\6\b\u0153\n\b\r\b\16\b\u0154\3\t\5\t\u0158\n\t\3\t\3\t\5\t\u015c\n"+
		"\t\3\t\3\t\5\t\u0160\n\t\3\t\3\t\5\t\u0164\n\t\3\t\5\t\u0167\n\t\3\t\3"+
		"\t\5\t\u016b\n\t\3\t\3\t\5\t\u016f\n\t\3\n\5\n\u0172\n\n\3\n\3\n\5\n\u0176"+
		"\n\n\3\n\3\n\5\n\u017a\n\n\3\n\3\n\6\n\u017e\n\n\r\n\16\n\u017f\3\n\5"+
		"\n\u0183\n\n\3\n\3\n\5\n\u0187\n\n\3\13\5\13\u018a\n\13\3\13\3\13\5\13"+
		"\u018e\n\13\3\13\3\13\5\13\u0192\n\13\3\13\3\13\5\13\u0196\n\13\3\13\3"+
		"\13\5\13\u019a\n\13\7\13\u019c\n\13\f\13\16\13\u019f\13\13\5\13\u01a1"+
		"\n\13\3\13\3\13\5\13\u01a5\n\13\3\f\3\f\3\f\5\f\u01aa\n\f\3\f\3\f\5\f"+
		"\u01ae\n\f\3\f\3\f\5\f\u01b2\n\f\3\f\3\f\5\f\u01b6\n\f\3\f\3\f\5\f\u01ba"+
		"\n\f\6\f\u01bc\n\f\r\f\16\f\u01bd\5\f\u01c0\n\f\3\r\5\r\u01c3\n\r\3\r"+
		"\3\r\5\r\u01c7\n\r\3\r\3\r\5\r\u01cb\n\r\3\r\3\r\5\r\u01cf\n\r\3\r\3\r"+
		"\5\r\u01d3\n\r\3\16\5\16\u01d6\n\16\3\16\3\16\5\16\u01da\n\16\3\16\3\16"+
		"\5\16\u01de\n\16\3\16\3\16\5\16\u01e2\n\16\3\16\3\16\5\16\u01e6\n\16\3"+
		"\16\3\16\5\16\u01ea\n\16\3\16\3\16\5\16\u01ee\n\16\3\16\3\16\5\16\u01f2"+
		"\n\16\3\16\3\16\5\16\u01f6\n\16\3\17\5\17\u01f9\n\17\3\17\3\17\5\17\u01fd"+
		"\n\17\3\17\3\17\5\17\u0201\n\17\3\17\3\17\5\17\u0205\n\17\3\17\3\17\5"+
		"\17\u0209\n\17\3\17\3\17\5\17\u020d\n\17\3\17\3\17\5\17\u0211\n\17\3\17"+
		"\3\17\5\17\u0215\n\17\3\20\6\20\u0218\n\20\r\20\16\20\u0219\3\20\6\20"+
		"\u021d\n\20\r\20\16\20\u021e\3\21\5\21\u0222\n\21\3\21\3\21\3\21\5\21"+
		"\u0227\n\21\3\22\5\22\u022a\n\22\3\22\3\22\5\22\u022e\n\22\3\22\3\22\5"+
		"\22\u0232\n\22\3\22\3\22\5\22\u0236\n\22\3\22\3\22\5\22\u023a\n\22\3\22"+
		"\3\22\5\22\u023e\n\22\3\22\3\22\5\22\u0242\n\22\3\23\5\23\u0245\n\23\3"+
		"\23\3\23\5\23\u0249\n\23\3\23\3\23\5\23\u024d\n\23\3\23\3\23\5\23\u0251"+
		"\n\23\3\23\3\23\5\23\u0255\n\23\3\23\5\23\u0258\n\23\3\23\3\23\5\23\u025c"+
		"\n\23\3\23\3\23\5\23\u0260\n\23\5\23\u0262\n\23\3\24\3\24\3\24\5\24\u0267"+
		"\n\24\3\24\3\24\5\24\u026b\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0272\n"+
		"\24\3\24\3\24\5\24\u0276\n\24\3\24\3\24\5\24\u027a\n\24\5\24\u027c\n\24"+
		"\3\24\3\24\5\24\u0280\n\24\3\24\3\24\5\24\u0284\n\24\3\24\3\24\3\24\5"+
		"\24\u0289\n\24\3\24\3\24\5\24\u028d\n\24\3\24\3\24\3\24\5\24\u0292\n\24"+
		"\3\24\7\24\u0295\n\24\f\24\16\24\u0298\13\24\3\25\5\25\u029b\n\25\3\25"+
		"\3\25\5\25\u029f\n\25\3\25\3\25\5\25\u02a3\n\25\3\25\3\25\5\25\u02a7\n"+
		"\25\3\25\3\25\5\25\u02ab\n\25\3\25\3\25\5\25\u02af\n\25\5\25\u02b1\n\25"+
		"\3\26\5\26\u02b4\n\26\3\26\5\26\u02b7\n\26\3\26\3\26\5\26\u02bb\n\26\6"+
		"\26\u02bd\n\26\r\26\16\26\u02be\3\26\5\26\u02c2\n\26\3\26\7\26\u02c5\n"+
		"\26\f\26\16\26\u02c8\13\26\3\26\5\26\u02cb\n\26\3\27\5\27\u02ce\n\27\3"+
		"\27\3\27\5\27\u02d2\n\27\3\27\3\27\5\27\u02d6\n\27\6\27\u02d8\n\27\r\27"+
		"\16\27\u02d9\3\27\5\27\u02dd\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u02e4"+
		"\n\30\3\30\3\30\5\30\u02e8\n\30\3\30\3\30\5\30\u02ec\n\30\3\30\3\30\5"+
		"\30\u02f0\n\30\3\30\3\30\5\30\u02f4\n\30\3\30\7\30\u02f7\n\30\f\30\16"+
		"\30\u02fa\13\30\3\31\3\31\3\31\5\31\u02ff\n\31\3\31\3\31\3\31\5\31\u0304"+
		"\n\31\3\31\3\31\5\31\u0308\n\31\3\31\3\31\3\31\5\31\u030d\n\31\3\31\3"+
		"\31\5\31\u0311\n\31\3\31\3\31\5\31\u0315\n\31\3\31\5\31\u0318\n\31\3\31"+
		"\2\5\4&.\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2"+
		"\b\t\3\2\n\13\2\u03d5\2\66\3\2\2\2\4\u0090\3\2\2\2\6\u0104\3\2\2\2\b\u0113"+
		"\3\2\2\2\n\u0128\3\2\2\2\f\u014a\3\2\2\2\16\u014c\3\2\2\2\20\u0157\3\2"+
		"\2\2\22\u0171\3\2\2\2\24\u0189\3\2\2\2\26\u01bf\3\2\2\2\30\u01c2\3\2\2"+
		"\2\32\u01d5\3\2\2\2\34\u01f8\3\2\2\2\36\u0217\3\2\2\2 \u0221\3\2\2\2\""+
		"\u0229\3\2\2\2$\u0244\3\2\2\2&\u027b\3\2\2\2(\u029a\3\2\2\2*\u02b3\3\2"+
		"\2\2,\u02cd\3\2\2\2.\u02eb\3\2\2\2\60\u0317\3\2\2\2\62\65\5\f\7\2\63\65"+
		"\5(\25\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\b\3\1\2<\u0091\5"+
		"\6\4\2=\u0091\5\b\5\2>?\7\13\2\2?\u0091\5\4\3\33@B\7\24\2\2AC\7 \2\2B"+
		"A\3\2\2\2BC\3\2\2\2CD\3\2\2\2D\u0091\5\4\3\22EG\5\24\13\2FH\7 \2\2GF\3"+
		"\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7\27\2\2JL\7 \2\2KJ\3\2\2\2KL\3\2\2\2LM\3"+
		"\2\2\2MN\5\24\13\2N\u0091\3\2\2\2O\u0091\5\16\b\2P\u0091\5$\23\2QS\7 "+
		"\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\64\2\2UW\7 \2\2VU\3\2\2\2VW\3\2"+
		"\2\2W\u0091\3\2\2\2X\u0091\5 \21\2Y[\7 \2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\g\7\30\2\2]_\7\f\2\2^`\7 \2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\5"+
		"*\26\2bd\7 \2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\16\2\2fh\3\2\2\2g]\3"+
		"\2\2\2gh\3\2\2\2hj\3\2\2\2ik\7 \2\2ji\3\2\2\2jk\3\2\2\2k\u0091\3\2\2\2"+
		"ln\7 \2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oz\7\31\2\2pr\7\f\2\2qs\7 \2\2"+
		"rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\5*\26\2uw\7 \2\2vu\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\7\16\2\2y{\3\2\2\2zp\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\7 \2\2"+
		"}|\3\2\2\2}~\3\2\2\2~\u0091\3\2\2\2\177\u0081\7 \2\2\u0080\177\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\7\32\2\2\u0083\u0085"+
		"\7 \2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0091\3\2\2\2\u0086"+
		"\u0088\7 \2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008b\7\33\2\2\u008a\u008c\7 \2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u0091\5\22\n\2\u008e\u0091\5"+
		"\24\13\2\u008f\u0091\5\30\r\2\u0090;\3\2\2\2\u0090=\3\2\2\2\u0090>\3\2"+
		"\2\2\u0090@\3\2\2\2\u0090E\3\2\2\2\u0090O\3\2\2\2\u0090P\3\2\2\2\u0090"+
		"R\3\2\2\2\u0090X\3\2\2\2\u0090Z\3\2\2\2\u0090m\3\2\2\2\u0090\u0080\3\2"+
		"\2\2\u0090\u0087\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0100\3\2\2\2\u0092\u0094\f\34\2\2\u0093\u0095\7"+
		" \2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\7\7\2\2\u0097\u0099\7 \2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u00ff\5\4\3\34\u009b\u009d\f\32\2\2\u009c"+
		"\u009e\7 \2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\t\2\2\2\u00a0\u00a2\7 \2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ff\5\4\3\33\u00a4\u00a6\f"+
		"\31\2\2\u00a5\u00a7\7 \2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\t\3\2\2\u00a9\u00ab\7 \2\2\u00aa\u00a9\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ff\5\4\3\32\u00ad"+
		"\u00af\f\30\2\2\u00ae\u00b0\7 \2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\f\2\2\u00b2\u00b4\7 \2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ff\5\4"+
		"\3\31\u00b6\u00b8\f\27\2\2\u00b7\u00b9\7 \2\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\7\r\2\2\u00bb\u00bd\7 "+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00ff\5\4\3\30\u00bf\u00c1\f\26\2\2\u00c0\u00c2\7 \2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\7\16\2\2\u00c4"+
		"\u00c6\7 \2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00ff\5\4\3\27\u00c8\u00ca\f\25\2\2\u00c9\u00cb\7 \2\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\17"+
		"\2\2\u00cd\u00cf\7 \2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ff\5\4\3\26\u00d1\u00d3\f\24\2\2\u00d2\u00d4\7"+
		" \2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\7\20\2\2\u00d6\u00d8\7 \2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00ff\5\4\3\25\u00da\u00dc\f\23\2\2\u00db"+
		"\u00dd\7 \2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e0\7\21\2\2\u00df\u00e1\7 \2\2\u00e0\u00df\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ff\5\4\3\24\u00e3\u00e5\f"+
		"\21\2\2\u00e4\u00e6\7 \2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\7\23\2\2\u00e8\u00ea\7 \2\2\u00e9\u00e8\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ff\5\4\3\22\u00ec"+
		"\u00ee\f\20\2\2\u00ed\u00ef\7 \2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7\22\2\2\u00f1\u00f3\7 \2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00ff\5\4"+
		"\3\21\u00f5\u00f7\f\17\2\2\u00f6\u00f8\7 \2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\26\2\2\u00fa\u00fc\7"+
		" \2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\5\24\13\2\u00fe\u0092\3\2\2\2\u00fe\u009b\3\2\2\2\u00fe\u00a4\3"+
		"\2\2\2\u00fe\u00ad\3\2\2\2\u00fe\u00b6\3\2\2\2\u00fe\u00bf\3\2\2\2\u00fe"+
		"\u00c8\3\2\2\2\u00fe\u00d1\3\2\2\2\u00fe\u00da\3\2\2\2\u00fe\u00e3\3\2"+
		"\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00f5\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\5\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0105\7 \2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\7\"\2\2\u0107\u0109\7 \2\2\u0108\u0107\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\5\4\3\2\u010b\u010d\7 "+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\7#\2\2\u010f\u0111\7 \2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2"+
		"\2\u0111\7\3\2\2\2\u0112\u0114\7 \2\2\u0113\u0112\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7*\2\2\u0116\u0118\7 \2\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\5\n"+
		"\6\2\u011a\u011c\7 \2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\7+\2\2\u011e\t\3\2\2\2\u011f\u0121\5\f\7\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5\4\3\2\u0126"+
		"\u0127\7\60\2\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\13\3\2\2\2\u012a\u012c\5\"\22\2\u012b\u012d\7 \2\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\7)"+
		"\2\2\u012f\u0131\7 \2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u014b\3\2\2\2\u0132\u0134\5\34\17\2\u0133\u0135\7 \2\2\u0134\u0133\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\7)\2\2\u0137"+
		"\u0139\7 \2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u014b\3\2"+
		"\2\2\u013a\u013c\5\32\16\2\u013b\u013d\7 \2\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7)\2\2\u013f\u0141\7 \2"+
		"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014b\3\2\2\2\u0142\u0144"+
		"\5\4\3\2\u0143\u0145\7 \2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\7\60\2\2\u0147\u0149\7 \2\2\u0148\u0147\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u012a\3\2\2\2\u014a"+
		"\u0132\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u0142\3\2\2\2\u014b\r\3\2\2\2"+
		"\u014c\u014d\7,\2\2\u014d\u014e\7 \2\2\u014e\u014f\5\4\3\2\u014f\u0150"+
		"\7 \2\2\u0150\u0152\7-\2\2\u0151\u0153\5\20\t\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\17\3\2\2"+
		"\2\u0156\u0158\7 \2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\7\3\2\2\u015a\u015c\7 \2\2\u015b\u015a\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\5\4\3\2\u015e\u0160\7 "+
		"\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0166\3\2\2\2\u0161"+
		"\u0163\7/\2\2\u0162\u0164\7 \2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2"+
		"\2\u0164\u0165\3\2\2\2\u0165\u0167\5\4\3\2\u0166\u0161\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\7.\2\2\u0169\u016b\7 \2\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\5\4"+
		"\3\2\u016d\u016f\7 \2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\21\3\2\2\2\u0170\u0172\7 \2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0175\7\"\2\2\u0174\u0176\7 \2\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\5\4\3\2\u0178"+
		"\u017a\7 \2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u017c\7\4\2\2\u017c\u017e\5\4\3\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2"+
		"\2\2\u0181\u0183\7 \2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\7#\2\2\u0185\u0187\7 \2\2\u0186\u0185\3\2\2"+
		"\2\u0186\u0187\3\2\2\2\u0187\23\3\2\2\2\u0188\u018a\7 \2\2\u0189\u0188"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u01a0\7$\2\2\u018c"+
		"\u018e\7 \2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0191\5\4\3\2\u0190\u0192\7 \2\2\u0191\u0190\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u019d\3\2\2\2\u0193\u0195\7\60\2\2\u0194\u0196\7"+
		" \2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\5\4\3\2\u0198\u019a\7 \2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0193\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u018d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\7%\2\2\u01a3\u01a5\7 \2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\25\3\2\2\2\u01a6\u01c0\7\33\2\2\u01a7\u01a9\7\"\2\2\u01a8\u01aa"+
		"\7 \2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\7\64\2\2\u01ac\u01ae\7 \2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7\35\2\2\u01b0\u01b2\7 \2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\5&"+
		"\24\2\u01b4\u01b6\7 \2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\7#\2\2\u01b8\u01ba\7 \2\2\u01b9\u01b8\3\2\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01a7\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01a6\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0\27\3\2\2\2\u01c1\u01c3\7 \2\2"+
		"\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6"+
		"\7\62\2\2\u01c5\u01c7\7 \2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\5\26\f\2\u01c9\u01cb\7 \2\2\u01ca\u01c9\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\7.\2\2\u01cd"+
		"\u01cf\7 \2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d2\5\4\3\2\u01d1\u01d3\7 \2\2\u01d2\u01d1\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\31\3\2\2\2\u01d4\u01d6\7 \2\2\u01d5\u01d4\3\2\2\2"+
		"\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\7\61\2\2\u01d8\u01da"+
		"\7 \2\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dd\7\63\2\2\u01dc\u01de\7 \2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\7\64\2\2\u01e0\u01e2\7 \2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\5\26"+
		"\f\2\u01e4\u01e6\7 \2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e9\7\35\2\2\u01e8\u01ea\7 \2\2\u01e9\u01e8\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\5&\24\2\u01ec"+
		"\u01ee\7 \2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f1\7\20\2\2\u01f0\u01f2\7 \2\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5\b\5\2\u01f4\u01f6\7 "+
		"\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\33\3\2\2\2\u01f7\u01f9"+
		"\7 \2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fc\7\61\2\2\u01fb\u01fd\7 \2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\7\64\2\2\u01ff\u0201\7 \2\2\u0200"+
		"\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\5\26"+
		"\f\2\u0203\u0205\7 \2\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0208\7\35\2\2\u0207\u0209\7 \2\2\u0208\u0207\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\5&\24\2\u020b"+
		"\u020d\7 \2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0210\7\20\2\2\u020f\u0211\7 \2\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\5\b\5\2\u0213\u0215\7 "+
		"\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\35\3\2\2\2\u0216\u0218"+
		"\7 \2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5\4\3\2\u021c\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\37\3\2\2\2\u0220\u0222\7 \2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2"+
		"\u0222\u0223\3\2\2\2\u0223\u0224\7\64\2\2\u0224\u0226\5\36\20\2\u0225"+
		"\u0227\7 \2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227!\3\2\2\2\u0228"+
		"\u022a\7 \2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022d\7\61\2\2\u022c\u022e\7 \2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\7\64\2\2\u0230\u0232\7"+
		" \2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0235\7\35\2\2\u0234\u0236\7 \2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0239\5&\24\2\u0238\u023a\7 \2\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\7\20"+
		"\2\2\u023c\u023e\7 \2\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\5\4\3\2\u0240\u0242\7 \2\2\u0241\u0240\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242#\3\2\2\2\u0243\u0245\7 \2\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\7&\2\2\u0247"+
		"\u0249\7 \2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024c\5\4\3\2\u024b\u024d\7 \2\2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\7\'\2\2\u024f\u0251\7 "+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0254\5\b\5\2\u0253\u0255\7 \2\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0261\3\2\2\2\u0256\u0258\7 \2\2\u0257\u0256\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\7(\2\2\u025a\u025c\7 \2"+
		"\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f"+
		"\5\b\5\2\u025e\u0260\7 \2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0262\3\2\2\2\u0261\u0257\3\2\2\2\u0261\u0262\3\2\2\2\u0262%\3\2\2\2"+
		"\u0263\u0264\b\24\1\2\u0264\u0266\7\"\2\2\u0265\u0267\7 \2\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\5&\24\2\u0269"+
		"\u026b\7 \2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u026d\7#\2\2\u026d\u027c\3\2\2\2\u026e\u0279\7\34\2\2\u026f"+
		"\u0271\7\f\2\2\u0270\u0272\7 \2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\3\2\2\2\u0273\u0275\5*\26\2\u0274\u0276\7 \2\2\u0275"+
		"\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\16"+
		"\2\2\u0278\u027a\3\2\2\2\u0279\u026f\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0263\3\2\2\2\u027b\u026e\3\2\2\2\u027c\u0296\3\2"+
		"\2\2\u027d\u027f\f\4\2\2\u027e\u0280\7 \2\2\u027f\u027e\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\7\b\2\2\u0282\u0284\7 "+
		"\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0295\5&\24\5\u0286\u0288\f\3\2\2\u0287\u0289\7 \2\2\u0288\u0287\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\7.\2\2\u028b"+
		"\u028d\7 \2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0295\5&\24\4\u028f\u0291\f\5\2\2\u0290\u0292\7 \2\2\u0291"+
		"\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0295\7\5"+
		"\2\2\u0294\u027d\3\2\2\2\u0294\u0286\3\2\2\2\u0294\u028f\3\2\2\2\u0295"+
		"\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\'\3\2\2\2"+
		"\u0298\u0296\3\2\2\2\u0299\u029b\7 \2\2\u029a\u0299\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\7\36\2\2\u029d\u029f\7 \2\2\u029e"+
		"\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\7\37"+
		"\2\2\u02a1\u02a3\7 \2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a6\7\64\2\2\u02a5\u02a7\7 \2\2\u02a6\u02a5\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02b0\3\2\2\2\u02a8\u02aa\7\20\2\2\u02a9"+
		"\u02ab\7 \2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02ae\5*\26\2\u02ad\u02af\7 \2\2\u02ae\u02ad\3\2\2\2\u02ae"+
		"\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1)\3\2\2\2\u02b2\u02b4\7\t\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b7\7 \2\2\u02b6\u02b5\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02bc\3\2\2\2\u02b8\u02ba\5.\30\2\u02b9\u02bb\7 "+
		"\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02b8\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\7 \2\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c5\5,\27\2\u02c4\u02c3\3\2"+
		"\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\7 \2\2\u02ca\u02c9\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb+\3\2\2\2\u02cc\u02ce\7 \2\2\u02cd\u02cc"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\t\2\2\2\u02d0"+
		"\u02d2\7 \2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d7\3\2"+
		"\2\2\u02d3\u02d5\5.\30\2\u02d4\u02d6\7 \2\2\u02d5\u02d4\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db"+
		"\u02dd\7 \2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd-\3\2\2\2\u02de"+
		"\u02df\b\30\1\2\u02df\u02ec\7\30\2\2\u02e0\u02ec\7\64\2\2\u02e1\u02e3"+
		"\7\"\2\2\u02e2\u02e4\7 \2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e7\5*\26\2\u02e6\u02e8\7 \2\2\u02e7\u02e6\3\2"+
		"\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\7#\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02de\3\2\2\2\u02eb\u02e0\3\2\2\2\u02eb\u02e1\3\2"+
		"\2\2\u02ec\u02f8\3\2\2\2\u02ed\u02ef\f\3\2\2\u02ee\u02f0\7 \2\2\u02ef"+
		"\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\7\6"+
		"\2\2\u02f2\u02f4\7 \2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f7\5\60\31\2\u02f6\u02ed\3\2\2\2\u02f7\u02fa\3"+
		"\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9/\3\2\2\2\u02fa\u02f8"+
		"\3\2\2\2\u02fb\u0318\7\30\2\2\u02fc\u02fe\7\13\2\2\u02fd\u02ff\7 \2\2"+
		"\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0318"+
		"\7\30\2\2\u0301\u0303\7\"\2\2\u0302\u0304\7 \2\2\u0303\u0302\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\7\30\2\2\u0306\u0308\7"+
		" \2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u0318\7#\2\2\u030a\u030c\7\"\2\2\u030b\u030d\7 \2\2\u030c\u030b\3\2\2"+
		"\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\7\13\2\2\u030f"+
		"\u0311\7 \2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0314\7\30\2\2\u0313\u0315\7 \2\2\u0314\u0313\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0318\7#\2\2\u0317\u02fb\3\2"+
		"\2\2\u0317\u02fc\3\2\2\2\u0317\u0301\3\2\2\2\u0317\u030a\3\2\2\2\u0318"+
		"\61\3\2\2\2\u00b8\64\66BGKRVZ_cgjmrvz}\u0080\u0084\u0087\u008b\u0090\u0094"+
		"\u0098\u009d\u00a1\u00a6\u00aa\u00af\u00b3\u00b8\u00bc\u00c1\u00c5\u00ca"+
		"\u00ce\u00d3\u00d7\u00dc\u00e0\u00e5\u00e9\u00ee\u00f2\u00f7\u00fb\u00fe"+
		"\u0100\u0104\u0108\u010c\u0110\u0113\u0117\u011b\u0122\u0128\u012c\u0130"+
		"\u0134\u0138\u013c\u0140\u0144\u0148\u014a\u0154\u0157\u015b\u015f\u0163"+
		"\u0166\u016a\u016e\u0171\u0175\u0179\u017f\u0182\u0186\u0189\u018d\u0191"+
		"\u0195\u0199\u019d\u01a0\u01a4\u01a9\u01ad\u01b1\u01b5\u01b9\u01bd\u01bf"+
		"\u01c2\u01c6\u01ca\u01ce\u01d2\u01d5\u01d9\u01dd\u01e1\u01e5\u01e9\u01ed"+
		"\u01f1\u01f5\u01f8\u01fc\u0200\u0204\u0208\u020c\u0210\u0214\u0219\u021e"+
		"\u0221\u0226\u0229\u022d\u0231\u0235\u0239\u023d\u0241\u0244\u0248\u024c"+
		"\u0250\u0254\u0257\u025b\u025f\u0261\u0266\u026a\u0271\u0275\u0279\u027b"+
		"\u027f\u0283\u0288\u028c\u0291\u0294\u0296\u029a\u029e\u02a2\u02a6\u02aa"+
		"\u02ae\u02b0\u02b3\u02b6\u02ba\u02be\u02c1\u02c6\u02ca\u02cd\u02d1\u02d5"+
		"\u02d9\u02dc\u02e3\u02e7\u02eb\u02ef\u02f3\u02f8\u02fe\u0303\u0307\u030c"+
		"\u0310\u0314\u0317";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}