```java
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
     - user UI
     - function / lambda expression


//by next Monday
-> 5. do a calculator intepreter (split task)