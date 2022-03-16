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
TOSKIP: [\r\n\t]+ -> skip;

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

BEGIN: 'begin';
END: 'end';
DONE: 'done';

SEMICOLON: ';';

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
    : sequenceLine* EOF
;

expression
    : parenthesesExpression                     # Parentheses
    | blockExpression                           # Block
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
    | funcApplication                           # FunctionApplication
    | WS? INTEGER WS?                                     # Integer
    | WS? DOUBLE WS?                                      # Double
    | WS? BOOLEAN WS?                                     # Boolean
    | WS? UNIT WS?                                        # Unit
    | tupleExpression                            # Tuple
    | listExpression                             # List
    | lambdaExpression                           # LambdaFunction
;

parenthesesExpression
    : WS? '(' WS? inner=expression WS? ')' WS?
;

blockExpression
    : WS? BEGIN WS? sequentialExpression WS? END
;

sequentialExpression
    : ((sequenceLine)* expression SEMICOLON)?
;

sequenceLine
    : bind IN | expression SEMICOLON
;

tupleExpression
    : WS? '(' WS? expression WS? (',' expression)+ WS? ')' WS?
;

listExpression
    : WS? '[' (WS? expression WS? (';' WS? expression WS?)*)? ']' WS?
;

lambdaParameters
    : ('(' WS? VARIABLE WS? TYPEOP WS? typeDeclaration WS? ')' WS?)+
;

lambdaExpression
    : WS? LAMBDADEC WS? lambdaParameters WS? '->' WS? lambdaBody=expression WS?
;

recFuncDeclaration
    : WS? LET WS? RECURSION WS? functionName=VARIABLE WS? params=lambdaParameters WS? TYPEOP WS? type=typeDeclaration WS?
     '=' WS? functionBody=blockExpression WS?
;

funcDeclaration
    : WS? LET WS? functionName=VARIABLE WS? params=lambdaParameters WS? TYPEOP WS? type=typeDeclaration WS?
      '=' WS? functionBody=blockExpression WS?
;

applyParameters
    : <assoc=left>WS+ expression+
;

funcApplication
    : WS? name=VARIABLE applyParameters WS?
;

bind
    : WS? LET WS? name=VARIABLE WS? TYPEOP WS? type=typeDeclaration WS? EQUAL WS? expression WS?
;

conditionalExpr
    : WS? IF WS? test=expression WS? THEN WS? consequent=blockExpression WS? (WS? ELSE WS? alternate=blockExpression WS?)?
;

whileExpr
    : WS? WHILE WS? test=expression WS? DO WS? body=sequentialExpression WS? DONE? WS?
;

forInExpr
    : WS? FOR WS? identifier=VARIABLE WS? IN WS?
      (enumerable=expression | starting=expression WS? RANGEOP (WS? increment=expression WS? RANGEOP)? WS? ending=expression)
      WS? DO WS? body=sequentialExpression WS? DONE? WS?
;

forToExpr
    : WS? FOR WS? identifier=VARIABLE WS? EQUAL WS? starting=expression WS? (TO | DOWNTO) WS? ending=expression WS? DO
      WS? body=sequentialExpression WS? DONE WS?
;


typeDeclaration
    : '(' WS? typeDeclaration WS? ')'                                   # ParenthesesType
    | TYPE                                                              # PrimitiveType
    | typeDeclaration WS? 'list'                                        # ListType
    | left=typeDeclaration WS? '*' WS? right=typeDeclaration            # TupleType
    | left=typeDeclaration WS? '->' WS? right=typeDeclaration           # FunctionType
;