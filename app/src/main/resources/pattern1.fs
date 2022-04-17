let xx : int = 1
in
let yy : int =
match xx with
| 1 -> 1
| 2 -> 2 in
yy;
// Expected result 1


let f (x : int) : int = begin
x + 1;
end in
let g (x : int) : int = begin
x * 2;
end in
let h (x : int) : int = begin
match x with
| 1 -> f x
| 2 -> g x;
end in
h 2;
// Expected result 4


let tt : bool = true
in
let ff : int =
match tt with
| true when 1 < 2 -> 1
| false -> 2 in
ff;
// Expected result 1


let nn : int = 1
in let mm : int =
match nn with
| xx -> 1
| var1 -> 2 in
mm;
// Expected result 1


let ll : int list = [1 ; 2; 3]
in let ss : int =
match ll with
| [1 ; 2; 4] -> 1
| [1 ; 2; var1] -> 2
| var2 -> 3 in
ss;
// Expected result 2


let lst : int list = [1 ; 2; 3]
in let num : int =
match lst with
| [0 ; var1; var2] -> var1 + var2
| [1 ; var1; var2] when var1 > var2 -> var1 * var2
| other -> 3 in
num;
// Expected result 3


let ll : int list = [1 ; 2; 3]
in let ss : int =
match ll with
| [1 ; 2; 4] -> 1
| [var1 ; var2; var3] when var1 > var2 -> 2
| [var1 ; var2; var3] when var2 < var3 -> 3
| var1 -> 4 in
ss;
// Expected result 3


let max  (x : int list) : int  = begin
match x with
| [var1; var2] when var1 > var2 -> var1
| [var1; var2] when var1 < var2 -> var2
| [var1; var2] -> var1;
end in
max [123; 456];
// Expected result 456


match ([123] @ [456]) with
| [var1; var2] when var1 > var2 -> var1
| [var1; var2] when var1 < var2 -> var2
| [var1; var2] -> var1;
// Expected result 456