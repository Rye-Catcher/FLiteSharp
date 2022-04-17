[<Measure>] type m

let max  (x : int<m> list) : int<m>  = begin
match x with
| [var1; var2] when var1 > var2 -> var1
| [var1; var2] when var1 < var2 -> var2
| [var1; var2] -> var1;
end in
max [123<m>; 456<m>];
// Exprected result 456