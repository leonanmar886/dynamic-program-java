package problems.counthPathsVariations;

import java.util.HashMap;
import java.util.List;

public interface CountPath {
    int countPaths(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY);
    int countPaths(List<List<Integer>> matrix, int x, int y, int destinyX, int destinyY, HashMap<List<Integer>, Integer> map);
}
