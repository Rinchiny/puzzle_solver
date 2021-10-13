package code_wars.fourth_kyu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/strings-mix/train/java">here</a>
 */
public class StringsMix {


    public String mix(String s1, String s2) {

        var charArray1 = convertToCharArray(s1);
        var charArray2 = convertToCharArray(s2);

        var semiResult1 = convertToFilteredSortedList(charArray1);
        var semiResult2 = convertToFilteredSortedList(charArray2);

        var rawMap1 = convertToFilteredMap(semiResult1);
        var rawMap2 = convertToFilteredMap(semiResult2);

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

    private static Character[] convertToCharArray(String s) {
        char[] charArray = s.toCharArray();
        Character[] characterArray = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characterArray[i] = charArray[i];
        }
        return characterArray;
    }

    private static List<Character> convertToFilteredSortedList(Character[] charArray) {
        return Arrays.stream(charArray)
                .filter(Character::isLetter)
                .filter(Character::isLowerCase)
                .sorted()
                .collect(Collectors.toList());
    }

    private static Map<Character, Integer> convertToFilteredMap(List<Character> list) {
        Map<Character, Integer> numberOfOccurrences = new HashMap<>();
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
        for (Map.Entry<Character, String> entry : rawMap.entrySet()) {
            rawMap.put(entry.getKey(), String.valueOf(stringNumber)+":"+entry.getValue()+"/");
        }

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
        Collections.sort(nonOrderedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(nonOrderedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(),o1.length());
            }
        });
        return nonOrderedList;
    }
}
