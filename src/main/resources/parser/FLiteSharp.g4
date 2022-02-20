grammar FLiteSharp;
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
EQUALPHYS: '==';
NOTEQUALPHYS: '!=';
OR: '||';
AND: '&&';
NOT: 'not';

NUMBER: [0-9]+ | [0-9]+ '.' +[0-9]*;
WS: [ ]+;
TOSKIP: [\r\n\t]+ -> skip;
BOOLEAN: 'true' | 'false';

SEMICOLON: ';';

VARIABLE
    : [a-z] [a-zA-Z0-9]*
    ;

start : block;


block
 : (expression SEMICOLON)+
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
   | left=expression WS? operator=EQUALPHYS WS? right=expression  # EqualPhysical
   | left=expression WS? operator=NOTEQUALPHYS WS? right=expression  # NotEqualPhysical
   | operator=NOT WS? argument=expression  # Not
   | left=expression WS? operator=AND WS? right=expression  # And
   | left=expression WS? operator=OR WS? right=expression  # Or
   | WS? NUMBER WS?                                      # Number
   | WS? BOOLEAN WS?                                       # Boolean
   | tupleExpression                            # Tuple
   | lambdaExpression                           # LambdaFunction
   ;

    parenthesesExpression
   : WS? '(' WS? inner=expression WS? ')' WS? 
   ;
    tupleExpression
   : WS? '(' WS? expression WS? (',' expression) + WS? ')' WS?;

    lambdaParameter
   : (VARIABLE WS?)+
   ;
    lambdaBody
   : expression
   ;
    lambdaExpression
   : WS? 'fun' WS? lambdaParameter WS? '->' WS? lambdaBody WS?
   ;