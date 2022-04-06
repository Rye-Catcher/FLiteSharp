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

UNITOFMEASURE: '[<Measure>]';
TYPEKEYWORD: 'type';

WS: [ \t]+;
TOSKIP: [\r\n\t]+ -> skip;

LEFTPAR: '(';
RIGHTPAR: ')';
LEFTSQPAR: '[';
RIGHTSQPAR: ']';

IF: 'if';
THEN: 'then';
ELSE: 'else';
IN: 'in';
BEGIN: 'begin';
END: 'end';

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
    : parenthesesExpression                                                     # Parentheses
    | blockExpression                                                           # Block
    | <assoc=right> left=expression WS? operator=POW WS? right=expression       # Power
    | SUB expression                                                            # Negative
    | left=expression WS? operator=(MUL | DIV) WS? right=expression             # MultiplicationDivision
    | left=expression WS? operator=(ADD | SUB) WS? right=expression             # AdditionSubtraction
    | left=expression WS? operator=LESSTHAN WS? right=expression                # LessThan
    | left=expression WS? operator=LESSTHANOREQUAL WS? right=expression         # LessThanOrEqual
    | left=expression WS? operator=GREATERTHAN WS? right=expression             # GreaterThan
    | left=expression WS? operator=GREATERTHANOREQUAL WS? right=expression      # GreaterThanOrEqual
    | left=expression WS? operator=EQUAL WS? right=expression                   # Equal
    | left=expression WS? operator=NOTEQUAL WS? right=expression                # NotEqual
    | operator=NOT WS? argument=expression                                      # Not
    | left=expression WS? operator=AND WS? right=expression                     # And
    | left=expression WS? operator=OR WS? right=expression                      # Or
    | left=expression WS? operator=ATTACH WS? right=listExpression              # Attach
    | left=listExpression WS? operator=CONC WS? right=listExpression            # Concatenate
    | conditionalExpr                                                           # ConditionalExpression
    | recFuncDeclaration                                                        # RecFunctionDeclaration
    | funcDeclaration                                                           # FunctionDeclaration
    | WS? VARIABLE WS?                                                          # Variable
    | funcApplication                                                           # FunctionApplication
    | WS? INTEGER ('<' WS? uom=unitFormula WS? '>')? WS?                        # Integer
    | WS? DOUBLE ('<' WS? uom=unitFormula WS? '>')? WS?                         # Double
    | WS? BOOLEAN WS?                                                           # Boolean
    | WS? UNIT WS?                                                              # Unit
    | tupleExpression                                                           # Tuple
    | listExpression                                                            # List
    | lambdaExpression                                                          # LambdaFunction
    | unitDeclaration                                                           # UnitOfMeasureDeclaration
;

parenthesesExpression
    : WS? LEFTPAR WS? inner=expression WS? RIGHTPAR WS?
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
    : WS? LEFTPAR WS? expression WS? (',' expression)+ WS? RIGHTPAR WS?
;

listExpression
    : WS? LEFTSQPAR (WS? expression WS? (';' WS? expression WS?)*)? RIGHTSQPAR WS?
;

lambdaParameters
    : (LEFTPAR WS? VARIABLE WS? TYPEOP WS? typeDeclaration WS? RIGHTPAR WS?)+
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

typeDeclaration
    : LEFTPAR WS? typeDeclaration WS? RIGHTPAR                          # ParenthesesType
    | TYPE ('<' WS? uom=unitFormula WS? '>')?                           # PrimitiveType
    | typeDeclaration WS? 'list'                                        # ListType
    | left=typeDeclaration WS? '*' WS? right=typeDeclaration            # TupleType
    | left=typeDeclaration WS? '->' WS? right=typeDeclaration           # FunctionType
;

unitDeclaration
    : WS? UNITOFMEASURE WS? TYPEKEYWORD WS? name=VARIABLE WS? (EQUAL WS? formula=unitFormula WS?)?
;

unitFormula
    : (operator=DIV)? WS? (unitElement WS?)+ WS? (unitProduct)* WS?
;

unitProduct
    :  WS? operator=(MUL | DIV) WS? (unitElement WS?)+ WS?
;

unitElement
    : INTEGER /*Should be only 1*/                                      # OneUnit
    | VARIABLE                                                          # SingleUnit
    | LEFTPAR WS? unitFormula WS? RIGHTPAR                              # ParenthesisUnit
    | argument=unitElement WS? operator='^' WS? exp=exponent            # ExponentialUnit
;

exponent
    : INTEGER
    | SUB WS? INTEGER
    | LEFTPAR WS? INTEGER WS? RIGHTPAR
    | LEFTPAR WS? SUB WS? INTEGER WS? RIGHTPAR
;