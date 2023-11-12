package problems;

import java.util.HashMap;
import java.util.List;

public class MinTermsSum {

    public static int minTermsSum(int amount, List<Integer> list){
        return minTermsSum(amount, list, new HashMap<Integer, Integer>());
    }
    public static int minTermsSum(int amount, List<Integer> list, HashMap<Integer, Integer> map){
        if(amount == 0) return 0;

        if (amount < 0) return -1;

        if (map.containsKey(amount)) return map.get(amount);

        int minTerms = -1;
        for (int number : list) {
            int subAmount = amount - number;
            int subCoins = minTermsSum(subAmount, list);
            if (subCoins != -1) {
                int numCoins = 1 + subCoins;
                if (numCoins < minTerms || minTerms == -1) {
                    minTerms = numCoins;
                }
            }
        }

        map.put(amount, minTerms);
        return minTerms;
    }
}