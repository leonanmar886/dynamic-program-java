package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaxPathSum {

    public static int maxPathSum(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY, int amount){
        return maxPathSum(matrix, x, y, destinyX, destinyY, amount, new HashMap<>());
    }
    public static int maxPathSum(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY, int amount, HashMap<List<Integer>, Integer> map){
        if(x == destinyX && y == destinyY){
            return amount + matrix.get(x).get(y);
        }

        if (map.containsKey(Arrays.asList(x, y))) {
            return map.get(Arrays.asList(x, y));
        }

        int right = 0;
        int down = 0;

        if(x < destinyX && y < destinyY){
            right = maxPathSum(matrix, x, y + 1, destinyX, destinyY, amount + matrix.get(x).get(y), map);
            down = maxPathSum(matrix, x + 1, y, destinyX, destinyY, amount + matrix.get(x).get(y), map);
            return Math.max(right, down);
        } else if (x < destinyX) {
            down = maxPathSum(matrix, x + 1, y, destinyX, destinyY, amount + matrix.get(x).get(y), map);
        } else if (y < destinyY) {
            right = maxPathSum(matrix, x, y + 1, destinyX, destinyY, amount + matrix.get(x).get(y), map);
        }

        map.put(Arrays.asList(x, y), Math.max(right, down));

        return Math.max(right, down);
    }
}
