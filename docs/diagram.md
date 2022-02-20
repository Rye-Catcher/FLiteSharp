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
   - user IO
   - function / lambda expression

task: first 9 expressions;

//by next Monday

-> 5. do a calculator intepreter (split task)

Meeting
1. New objective
   - type inference
   - interpreter in 2 weeks
   - removes IO
2. unify the syntax
3. merge 2 parser
4. split next tasks



```{0}
package flitesharp.component.BlockComponent;
package flitesharp.component.opearations;
package flitesharp.component.literal;
        
Class blockComponent {
        List ctx_lst;
        evalute() {
        for ( in ctx_lst) {
        evalute()
        }
        }
        }
```

```{0}
Map m;
        Component evaluate(Component c) {
        Component cc = m.find(c.name);  //-> application component
        evaluate(cc);

        }

        Hindler
```