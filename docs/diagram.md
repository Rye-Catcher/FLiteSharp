```{0}
class component{
   string name;

   component evaluate();
}

class operator_combination_to_application extend component{
   component evaluate(){
        ...
   }
}


class engine() {
   environment
           tokenized_input

   dispatch(tokenized_input).evaluate();
}
```

//before the lab
1. think of the class/object diagram of the interpreter
2. figure out antlr outputs


//by next Monday (discuss in next meeting)
3. think of more syntax:
    - binding
    - control flow (condition, loop)
    - list, turple
    - function / lambda expression

task: first 9 expressions;

//by next Monday

-> 5. do a calculator intepreter (split task)

Week 6: Meeting
1. New objective
    - type inference
    - interpreter in 2 weeks
    - removes IO
2. unify the syntax
3. merge 2 parser
4. split next tasks

Recess 
To-do
Merge
 - syntax
 - parser

ListComponent
TupleComponent
Package: ControlFlow
    ConditionalComponent
    ForComponent
PrimitiveFunctions


Environment
Declaration
    scan()
    evaluate()
Name
    search()
LambdaExpression
Application
Exceptions
PrimitiveValues


Code
x = 1;
x + 1;

Addition[[Name, 'x'], [Number, 1]]


```{0}

Exceptions


Environment
   list of bindings
      String -> functions/objects
   
   extend()
   getPreviousRef()

ApplyComponent
    search the name in environment
        - primitive things
        - Component
    
    evaluate all parameters
    
    evaluate the body
        spawn a new block(environment) with parameter bindings
        evaluate the block
    
    return 

ListPrimitiveFuncComponent
   Component getFirst(ListComponent)
      return 1st expr of the list
   
ListComponent
   list of elements
   
   #Primitive function implementation
   getFirstEle()
   ...
   
FunctionComponent
   
```



Week 7

merge 

S: fix grammar: separate stmts and exprs

L: funcs applis JUnit


Current Issue:

blocks will automatics returns the last expr if no return
Need add exceptions in casting types (control flow and operation package)



