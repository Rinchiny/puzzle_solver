package code_wars.fifth_kyu;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class IntegerPartitions {

    public String part(long n) {
        var partitions = partition((int) n);
        var products = partitions.stream()
                .map(par -> par.stream().reduce(1, (a,b) -> a * b))
                .sorted()
                .distinct()
                .mapToInt(x -> x)
                .toArray();
        var range = products[products.length -1] - products[0];
        var average = IntStream.of(products).average().getAsDouble();
        var median = products.length % 2 == 0
                ? ((double)products[products.length/2] + (double)products[products.length/2 - 1])/2
                : (double) products[products.length/2];

        return String.format(Locale.US, "Range: %d Average: %.2f Median: %.2f", range, average, median);
    }


    private List<List<Integer>> partition(int n) {
        var accum = new ArrayList<List<Integer>>();
        var list = new ArrayList<Integer>();
        partition(n, n, list, accum);
        return accum;
    }

    private void partition(int n, int max, List<Integer> partList, List<List<Integer>> accum) {
        if (n == 0) {
            accum.add(partList);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            var copy = new ArrayList<>(partList);
            copy.add(i);
            partition(n-i, i, copy, accum);
        }
    }
}
