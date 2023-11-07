package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static boolean sumPossible(int[] arr, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean r = sumPossible(arr, sum, new HashMap<Integer, Boolean>(), list);
        System.out.println("List: " + list);
        return r;
    }

    public static boolean sumPossible(int[] arr, int sum, HashMap<Integer, Boolean> map, List<Integer> list){
        if (sum == 0) return true;
        if (sum < 0) return false;
        if (map.containsKey(sum)) return map.get(sum);

        for (int i=0; i < arr.length; i++){
            if (sumPossible(arr, sum - arr[i], map, list)) {
                list.add(arr[i]);
                map.put(sum, true);
                return true;
            }
        }
        map.put(sum, false);
        return false;
    }
}
