package dynamic_programming.lesson_one;

import java.util.HashMap;

public class CanSumMemoization {


    public boolean canSumNaive(int sum, int[] array) {
        if (sum == 0) return true;
        if (sum < 0) return false;

        for (int i : array) {
            int remainder = sum - i;
            if (canSumNaive(remainder, array)) return true;
        }
        return false;
    }

    public boolean canSumMemoization(int sum, int[] array, HashMap<Integer, Boolean> memo) {
        if (memo == null) memo = new HashMap<>();
        if (sum == 0) return true;
        if (sum < 0) return false;
        if (memo.containsKey(sum)) return memo.get(sum);

        for (int i : array) {
            int remainder = sum - i;
            if (canSumMemoization(remainder, array, memo)) {
                memo.put(sum, true);
                return true;
            }
        }
        memo.put(sum, false);
        return false;
    }
}
