package ProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeStringNoAdjacent {
    static void main() {
        System.out.println(rearrange("aaabbbcc"));
        System.out.println(rearrange("aaab"));
    }

    public static String rearrange(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxheap.addAll(map.keySet());

        StringBuilder result = new StringBuilder();
        Character previous = null;

        while (!maxheap.isEmpty()) {
            char current = maxheap.poll();

            result.append(current);
            map.put(current, map.get(current) - 1);

            if (previous != null && map.get(previous) > 0) {
                maxheap.offer(previous);
            }
            previous = current;
        }

        if (result.length() != input.length())
            return "Not Possible";

        return result.toString();
    }
}
