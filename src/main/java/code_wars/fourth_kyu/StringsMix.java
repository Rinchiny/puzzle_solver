package code_wars.fourth_kyu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/strings-mix/train/java">here</a>
 */
public class StringsMix {


    public String mix(String s1, String s2) {
        var stringAsFilteredSortedList1 = convertToFilteredSortedList(s1);
        var stringAsFilteredSortedList2 = convertToFilteredSortedList(s2);

        var rawMap1 = convertToFilteredMap(stringAsFilteredSortedList1);
        var rawMap2 = convertToFilteredMap(stringAsFilteredSortedList2);

        var editMap1 = convertToStringMap(rawMap1);
        var editMap2 = convertToStringMap(rawMap2);

        var editExtendedMap1 = addSymbolsToMap(editMap1,1);
        var editExtendedMap2 = addSymbolsToMap(editMap2,2);

        var sortedMap1 = convertToSortedMap(editExtendedMap1);
        var sortedMap2 = convertToSortedMap(editExtendedMap2);

        var unitedMap = mergeMaps(sortedMap1, sortedMap2);

        var listFromUnitedMap = new ArrayList<>(unitedMap.values());
        var orderedList = lexicographicOrder(listFromUnitedMap);

        var sb = new StringBuilder();
        orderedList.forEach(sb::append);
        var result = sb.toString();
        if (result.endsWith("/"))
            result = result.substring(0, result.length()-1);
        return result;
    }

    private static List<Character> convertToFilteredSortedList(String string) {
        return string.chars()
                .mapToObj(i -> (char)i)
                .filter(Character::isLetter)
                .filter(Character::isLowerCase)
                .sorted()
                .collect(Collectors.toList());
    }

    private static Map<Character, Integer> convertToFilteredMap(List<Character> list) {
        var numberOfOccurrences = new HashMap<Character, Integer>();
        list.forEach(character -> {
            int occurrences = Collections.frequency(list,character);
            numberOfOccurrences.put(character,occurrences);
        });
        return numberOfOccurrences.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .distinct()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static Map<Character, String> convertToStringMap(Map<Character, Integer> rawMap) {
        Map<Character, String> stringMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : rawMap.entrySet()) {
            stringMap.put(entry.getKey(), new String(new char[entry.getValue()]).replace("\0",entry.getKey().toString()));
        }
        return stringMap;
    }

    private static Map<Character, String> addSymbolsToMap(Map<Character, String> rawMap, int stringNumber) {
        rawMap.replaceAll((k, v) -> stringNumber + ":" + v + "/");
        return rawMap;
    }

    private static Map<Character, String> convertToSortedMap(Map<Character, String> rawMap) {
        Map<Character, String> treeMap = new LinkedHashMap<>();
        rawMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(c -> treeMap.put(c.getKey(), c.getValue()));
        return treeMap;
    }

    private static Map<Character, String> mergeMaps(Map<Character, String> rawMap1, Map<Character, String> rawMap2) {
        rawMap2.forEach(
                (key,value) -> rawMap1.merge(key,value,(v1,v2) -> {
                    if (v1.length() == v2.length()) {
                        StringBuilder goal = new StringBuilder(v1);
                        goal.setCharAt(0,'=');
                        return new String(goal);
                    } else if (v1.length() > v2.length()) {
                        return v1;
                    } else
                        return v2;
                })
        );
        return rawMap1;
    }

    private static List<String> lexicographicOrder(List<String> nonOrderedList) {
        nonOrderedList.sort(String::compareTo);
        nonOrderedList.sort((o1, o2) -> Integer.compare(o2.length(), o1.length()));
        return nonOrderedList;
    }
}
