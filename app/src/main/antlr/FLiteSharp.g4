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

NUMBER: [0-9]+ | [0-9]+ '.' +[0-9]*;
WS: [ \t]+;
TOSKIP: [\r\n\t]+ -> skip;
BOOLEAN: 'true' | 'false';

SEMICOLON: ';';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
RETURN: 'return';

LET: 'let';
LAMBDADEC: 'fun';
VARIABLE
    : [a-zA-Z] [a-zA-Z0-9]*
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;
LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;


start
    : block EOF
;

block
    : (blockLine)+
;

blockLine
    : instructionWithBlock | instructionWithoutBlock SEMICOLON | expression SEMICOLON
;

instructionWithBlock
    : conditionalStmt                            # ConditionalStatement
    | whileStatement                             # WhileLoop
    | forStatement                               # ForLoop
    | funcDeclaration                            # FunctionDeclaration
;

instructionWithoutBlock
    : returnStmt                                 # Return
    | bind                                       # Binding
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
    | test=expression WS? operator=TERNARYOP WS? consequent=expression WS? ':' WS? alternate=expression  # ConditionalExpression
    | funcApplication                            # FunctionApplication
    | WS? VARIABLE WS?                                    # Variable
    | WS? NUMBER WS?                                      # Number
    | WS? BOOLEAN WS?                                     # Boolean
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
    : (VARIABLE WS?)+
    | '(' WS? (VARIABLE WS?)* WS? ')'
;

lambdaExpression
    : WS? LAMBDADEC WS? lambdaParameters WS? '->' WS? lambdaBody=expression WS?
;

funcDeclaration
    : WS? LET WS? functionName=VARIABLE WS? params=lambdaParameters WS? '=' WS? functionBody=curlyBlock WS?
;

returnStmt
    : WS? RETURN WS? returnBody=expression WS?
;

applyParameters
    : WS? '(' WS? (expression WS? (',' expression)*)? WS? ')' WS?
;

funcApplication
    : WS? name=VARIABLE applyParameters WS?
;

bind
    : WS? LET WS? name=VARIABLE WS? EQUAL WS? expression WS?
;

conditionalStmt
    : WS? IF WS? test=parenthesesExpression WS? consequent=curlyBlock WS? (WS? ELSE WS? alternate=curlyBlock WS?)?
;

whileStatement
    : WS? WHILE WS? test=parenthesesExpression WS? body=curlyBlock WS?
;

forStatement
    : WS? FOR WS? '(' WS? init=bind WS? ';' WS? test=expression WS? ';' WS? increment=expression WS? ')' WS? body=curlyBlock WS?
;

curlyBlock
    : WS? '{' WS? (sequence=block)? WS? '}' WS?
;