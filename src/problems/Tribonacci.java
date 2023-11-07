package problems;

import java.util.HashMap;

public class Tribonacci {
    public static long tribonacci(int n){
        HashMap<Integer, Long> map = new HashMap<>();
        return tribonacci(n, map);
    }
    private static long tribonacci(int n, HashMap<Integer, Long> map){
        if (n == 1 || n == 2) return 0;
        if (n == 3) return 1;
        if (map.containsKey(n)) return map.get(n);

        long r = tribonacci(n - 1, map) + tribonacci(n - 2, map) + tribonacci(n - 3, map);

        map.put(n, r);

        return r;
    }

}
