import problems.Fibonacci;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int n = Fibonacci.fib(50);
        long end = System.nanoTime();
        long finala = end - start;
        double a = finala/0.000000001;
        System.out.println(a);
    }
}