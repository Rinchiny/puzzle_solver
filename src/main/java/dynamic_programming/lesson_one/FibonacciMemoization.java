package dynamic_programming.lesson_one;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {


    public long naiveFibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return naiveFibonacci(n-1) + naiveFibonacci(n-2);
    }

    public long memoizationFibonacci(int n, Map<Integer, Long> map) {
        if (map == null) map = new HashMap<>(n);
        if (map.containsKey(n)) return map.get(n);
        if (n == 1 || n == 2) return 1;
        map.put(n, memoizationFibonacci(n-1, map) + memoizationFibonacci(n-2, map));
        return map.get(n);
    }

    public long memoizationFibonacciWithArray(int n, Long[] array) {
        if (n == 1 || n == 2) return 1;
        if (array == null) array = new Long[n+1];
        if (array[n] != null) return array[n];
        array[n] = memoizationFibonacciWithArray(n-1, array) + memoizationFibonacciWithArray(n-2, array);
        return array[n];
     }
}
