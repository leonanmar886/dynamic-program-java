package problems;

import java.util.List;

public class MaxPathSum {
    public int maxPathSum(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY, int amount){
        if(x == destinyX && y == destinyY){
            return amount + matrix.get(x).get(y);
        }

        int right = 0;
        int down = 0;

        if(x < destinyX && y < destinyY){
            right = maxPathSum(matrix, x, y + 1, destinyX, destinyY, amount + matrix.get(x).get(y));
            down = maxPathSum(matrix, x + 1, y, destinyX, destinyY, amount + matrix.get(x).get(y));
            return Math.max(right, down);
        } else if (x < destinyX) {
            down = maxPathSum(matrix, x + 1, y, destinyX, destinyY, amount + matrix.get(x).get(y));
        } else if (y < destinyY) {
            right = maxPathSum(matrix, x, y + 1, destinyX, destinyY, amount + matrix.get(x).get(y));
        }

        return Math.max(right, down);
    }
}
