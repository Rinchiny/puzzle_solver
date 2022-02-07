package code_wars.fifth_kyu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa">here</a>
 */
public class BestTravel {


    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        return buildGraph(k, ls)
                .stream()
                .map(list -> list
                        .stream()
                        .reduce(0, Integer::sum))
                .filter(sum -> sum <= t)
                .max(Comparator.naturalOrder())
                .orElse(null);
    }

    private static List<List<Integer>> buildGraph(int k, List<Integer> ls) {
        if (k == 1) {
            return ls.stream()
                    .map(el -> new ArrayList<Integer>() {{ add(el);}})
                    .collect(Collectors.toList());
        }
        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < ls.size()-1; i++) {
            var element = ls.get(i);
            var sublist = ls.subList(i+1, ls.size());
            var setOfLists = buildGraph(k-1, sublist);
            setOfLists.forEach(el -> el.add(0, element));
            result.addAll(setOfLists);
        }
        return result;
    }

}
