package problems.counthPathsVariations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BasicCountPaths implements CountPath{

    @Override
    public int countPaths(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY){
        return countPaths(matrix, x, y, destinyX, destinyY, new HashMap<>());
    }

    @Override
    public int countPaths(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY, HashMap<List<Integer>, Integer> map){
        if (x == destinyX && y == destinyY){
            return 1;
        }

        List<Integer> key = Arrays.asList(x, y);

        if (map.containsKey(key)){
            return map.get(key);
        }

        int paths = 0;
        if (x < destinyX && y < destinyY){
            paths += countPaths(matrix, x + 1, y, destinyX, destinyY, map);
            paths += countPaths(matrix, x, y + 1, destinyX, destinyY, map);
        } else if (x < destinyX){
            paths += countPaths(matrix, x + 1, y, destinyX, destinyY, map);
        }
        else if (y < destinyY){
            paths += countPaths(matrix, x, y + 1, destinyX, destinyY, map);
        }

        map.put(key, paths);

        return paths;

    }
}
