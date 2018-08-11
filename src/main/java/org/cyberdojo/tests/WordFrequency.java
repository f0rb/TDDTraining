package org.cyberdojo.tests;

import java.util.*;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


/**
 * WordFrequency
 *
 * @author f0rb on 2018-07-31.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WordFrequency {
    public static String process(String input) {
        String[] words = split(input);
        Map<String, Integer> map = stat(words);
        ArrayList<Map.Entry<String, Integer>> entries = sorting(map);
        return format(entries);
    }

    private static String[] split(String input) {
        return input.split("[ \n]");
    }

    private static Map<String, Integer> stat(String[] strings) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        Arrays.stream(strings).filter(string -> !string.isEmpty()).forEachOrdered(string -> wordMap.put(string, wordMap.getOrDefault(string, 0) + 1));
        return wordMap;
    }

    private static String format(ArrayList<Map.Entry<String, Integer>> entries) {
        StringBuilder sb = new StringBuilder();
        entries.forEach(entry -> sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n"));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private static ArrayList<Map.Entry<String, Integer>> sorting(Map<String, Integer> wordMap) {

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(wordMap.entrySet());
        entries.sort((o1, o2) -> o2.getValue() - o1.getValue());
        return entries;
    }

}
