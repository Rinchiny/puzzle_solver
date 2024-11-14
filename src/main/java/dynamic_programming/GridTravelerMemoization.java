package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class GridTravelerMemoization {


    public long naiveGridTraveler(int rows, int columns) {
        if (rows == 0 || columns == 0) return 0;
        if (rows == 1 && columns == 1) return 1;
        return naiveGridTraveler(rows - 1, columns) + naiveGridTraveler(rows, columns -1);
    }

    public long gridTravelerMemoization(int rows, int columns, Map<String, Long> memo) {
        if (rows == 0 || columns == 0) return 0;
        if (rows == 1 && columns == 1) return 1;
        if (memo == null) memo = new HashMap<>();
        String key = String.format("%d, %d", rows, columns);
        if (memo.containsKey(key)) return memo.get(key);
        long value = gridTravelerMemoization(rows - 1, columns, memo) + gridTravelerMemoization(rows, columns -1, memo);
        memo.put(key, value);
        return value;
    }
}
