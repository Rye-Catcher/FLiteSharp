let rec fact (x : int):int = begin
    if x = 0
    then begin
        1;
    end
    else begin
        x * fact (x - 1);
    end;
end in

fact 6;
// Expected result 720