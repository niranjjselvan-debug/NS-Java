package ProblemSolving;

import java.util.*;

public class Anagram {
    static void main(String[] args) {
        List<String> words = List.of("tea", "tan", "eat", "ate", "nat", "bat");
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] input = word.toCharArray();
            Arrays.sort(input);
            String key = new String(input);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
