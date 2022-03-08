grammar FLiteSharp;
@header {
    package io.antlr.gen;
}
/*
 * Tokens (terminal)
 */

POW: '**';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
LESSTHAN: '<';
LESSTHANOREQUAL: '<=';
GREATERTHAN: '>';
GREATERTHANOREQUAL: '>=';
EQUAL: '=';
NOTEQUAL: '<>';
OR: '||';
AND: '&&';
NOT: 'not';
TERNARYOP: '?';
ATTACH: '::';
CONC: '@';

INTEGER: [0-9]+;
DOUBLE: [0-9]+ '.' [0-9]+;
BOOLEAN: 'true' | 'false';
UNIT: '(' WS* ')';

TYPE: 'int' | 'double' | 'bool' | 'unit';
TYPEOP: ':';

WS: [ \t]+;
TOSKIP: [ \t]+ -> skip;
NEWLINE: [\r\n];

IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
TO: 'to';
DOWNTO: 'downto';
IN: 'in';
RANGEOP: '..';

LET: 'let';
LAMBDADEC: 'fun';
RECURSION: 'rec';
VARIABLE
    : [a-zA-Z] [a-zA-Z0-9]*
    ;

COMMENT
    : '(*' .*? '*)' -> skip
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;


start
    : blockLine* EOF
;

/*
block
    : (blockLine)* expression
;
*/
block
    : (blockLine)* expression NEWLINE*
;
blockLine
    : (bind | expression) NEWLINE     # Stmt
    | NEWLINE                         # BlankLine
;

expression
    : parenthesesExpression                     # Parentheses
    | <assoc=right> left=expression WS? operator=POW WS? right=expression       # Power
    | SUB expression # Negative
    | left=expression WS? operator=MUL WS? right=expression    # Multiplication
    | left=expression WS? operator=DIV WS? right=expression    # Division
    | left=expression WS? operator=ADD WS? right=expression    # Addition
    | left=expression WS? operator=SUB WS? right=expression    # Subtraction
    | left=expression WS? operator=LESSTHAN WS? right=expression  # LessThan
    | left=expression WS? operator=LESSTHANOREQUAL WS? right=expression # LessThanOrEqual
    | left=expression WS? operator=GREATERTHAN WS? right=expression # GreaterThan
    | left=expression WS? operator=GREATERTHANOREQUAL WS? right=expression  # GreaterThanOrEqual
    | left=expression WS? operator=EQUAL WS? right=expression  # Equal
    | left=expression WS? operator=NOTEQUAL WS? right=expression  # NotEqual
    | operator=NOT WS? argument=expression  # Not
    | left=expression WS? operator=AND WS? right=expression  # And
    | left=expression WS? operator=OR WS? right=expression  # Or
    | left=expression WS? operator=ATTACH WS? right=listExpression      #Attach
    | left=listExpression WS? operator=CONC WS? right=listExpression    #Concatenate
    | conditionalExpr                           # ConditionalExpression
    | whileExpr                                 # WhileLoop
    | forInExpr                                 # ForInExpression
    | forToExpr                                 # ForToExpression
    | recFuncDeclaration                        # RecFunctionDeclaration
    | funcDeclaration                           # FunctionDeclaration
    | WS? VARIABLE WS?                                    # Variable
    | WS? INTEGER WS?                                     # Integer
    | WS? DOUBLE WS?                                      # Double
    | WS? BOOLEAN WS?                                     # Boolean
    | WS? UNIT WS?                                        # Unit
    | funcApplication                           # FunctionApplication
    | tupleExpression                            # Tuple
    | listExpression                             # List
    | lambdaExpression                           # LambdaFunction
;

parenthesesExpression
    : WS? '(' WS? inner=expression WS? ')' WS?
;

tupleExpression
    : WS? '(' WS? expression WS? (',' expression)+ WS? ')' WS?
;

listExpression
    : WS? '[' (WS? expression WS? (';' WS? expression WS?)*)? ']' WS?
;

lambdaParameters
    : ('(' WS? VARIABLE WS? TYPEOP WS? typeDeclaration WS? ')' WS?)+
//    | '(' WS? ')'
;

lambdaExpression
    : WS? LAMBDADEC WS? lambdaParameters WS? '->' WS? lambdaBody=expression WS?
;

recFuncDeclaration
    : WS? LET WS? RECURSION WS? functionName=VARIABLE WS? params=lambdaParameters WS? '=' WS? functionBody=curlyBlock WS?
;

funcDeclaration
    : WS? LET WS? functionName=VARIABLE WS? params=lambdaParameters WS? TYPEOP WS? type=typeDeclaration WS?
      '=' WS? functionBody=curlyBlock WS?
;

applyParameters
    : <assoc=left>WS+ expression+
//    : WS? '(' WS? (expression WS? (',' expression)*)? WS? ')' WS?
;

funcApplication
    : WS? name=VARIABLE applyParameters WS?
;

bind
    : WS? LET WS? name=VARIABLE WS? TYPEOP WS? type=typeDeclaration WS? EQUAL WS? expression WS?
;

conditionalExpr
    : WS? IF WS? test=expression WS? NEWLINE*
        THEN WS? consequent=curlyBlock WS? NEWLINE*
        (WS? ELSE WS? alternate=curlyBlock WS? NEWLINE*)?
;

whileExpr
    : WS? WHILE WS? test=expression WS?  NEWLINE*
        DO WS? body=curlyBlock WS?
;

forInExpr
    : WS? FOR WS? identifier=VARIABLE WS? IN WS?
      (enumerable=expression | starting=expression WS? RANGEOP (WS? increment=expression WS? RANGEOP)? WS? ending=expression)
      WS? DO WS? body=curlyBlock WS?
;

forToExpr
    : WS? FOR WS? identifier=VARIABLE WS? EQUAL WS? starting=expression WS? (TO | DOWNTO) WS? ending=expression WS? DO
      WS? body=curlyBlock WS?
;

curlyBlock
    : WS? '{' WS? (sequence=block)? WS? '}' WS?
;

typeDeclaration
    : TYPE                                                  # PrimitiveType
    | typeDeclaration WS? 'list'                            # ListType
    | typeDeclaration (WS? '*' WS? typeDeclaration)+        # TupleType
    | typeDeclaration (WS? '->' WS? typeDeclaration)+       # FunctionType
    | '(' WS? typeDeclaration WS? ')'                       # ParenthesesType
;