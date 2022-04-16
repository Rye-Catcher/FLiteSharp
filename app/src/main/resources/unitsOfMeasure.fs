[<Measure>] type m
[<Measure>] type kg
[<Measure>] type s

[<Measure>] type N = m kg / s^2

let computeWeight (mass : double<kg>)(a : double<m / s^2>) : double<N> = begin
    mass * a;
end in

computeWeight 2.0<kg> 9.81<m / s^2>;