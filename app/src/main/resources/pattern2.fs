let ex1  (x : int) : int  = begin
let a : int = 0 in
match x with
| a -> 0
| var1 when var1 > 0 -> 1
| var1 -> -1;
end in
ex1 13;
// Expected result: 0


let ex2  (x : bool) : int  = begin
match x with
| true when false -> 1
| false -> -1
| true -> 0;
end in
ex2 true;
//  Expected result: 0


let ex3  (x : int) : int  = begin
match x with
| 4 when false -> 1
| 1 -> -1
| 4 -> 0;
end in
ex3 4;
//  Expected result: 0


let ex4  (x : unit) : int  = begin
    match x with
    | () when false -> 1
    | () -> 0;
    end in
ex4 ();
//  Expected result: 0


let ex5  (x : int list) : int  = begin
let a : int = 0 in
match x with
| [a; 2] when a > 0 -> 0
| [var1; var2] -> 1;
end in
ex5 [1; 2];
// Expected result: 0


let ex6  (x : unit list) : int  = begin
match x with
| [(); ()] -> 0
| [var1; var2] -> 1;
end in
ex6 [(); ()];
// Expected result: 0

let ex7 (x : int list) : int  = begin
match x with
| [a; 2] when a > 0 -> 1
| [var1; var2] -> -1
| [] -> 0
| [var1] -> 40;
end in
ex7 [];
// Expected result: 0

