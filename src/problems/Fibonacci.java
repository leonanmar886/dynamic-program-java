package problems;

import java.util.HashMap;

public class Fibonacci {
    public static int fib(int n){
//        if(n == 0 || n == 1){
//            return n;
//        }
//
//        return fib(n-1) + fib(n-2);

        return fib(n, new HashMap<>());
    }
    public static int fib(int n, HashMap<Integer, Integer> memo){
        if(n == 0 || n == 1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1, memo) + fib(n-2, memo);

        memo.put(n, result);
        return result;
    }
}
