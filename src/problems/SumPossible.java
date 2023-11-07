package problems;

import java.util.HashMap;

public class SumPossible {
    public static boolean sumPossible(int[] arr, int sum) {
        return sumPossible(arr, sum, new HashMap<Integer, Boolean>());
    }

    public static boolean sumPossible(int[] arr, int sum, HashMap<Integer, Boolean> map){
        if (sum == 0) return true;
        if (sum < 0) return false;
        if (map.containsKey(sum)) return map.get(sum);

        for (int i=0; i < arr.length; i++){
            if (sumPossible(arr, sum - arr[i], map)){
                map.put(sum, true);
                return true;
            }
        }
        map.put(sum, false);
        return false;
    }
}
