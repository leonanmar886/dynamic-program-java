package problems;

import java.util.List;

public class MinTermsSum {
    public static int minTermsSum(int amount, List<Integer> list){
        if(amount == 0) return 0;

        if (amount < 0) return -1;

        int minTermsSum = -1;
        for(int number : list){
            int result = minTermsSum(amount - number, list);
            if(result != -1 || minTermsSum == -1){
                int numTerms = result + 1;
                if (numTerms < minTermsSum || minTermsSum == -1)
                    minTermsSum = numTerms;
            }
        }

        return minTermsSum;
    }
}