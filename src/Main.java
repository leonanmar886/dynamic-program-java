import problems.MinTermsSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {7, 2, 1, 5, 9, 8};
        int n = MinTermsSum.minTermsSum(24, Arrays.asList(arr));
        System.out.println(n);
    }
}