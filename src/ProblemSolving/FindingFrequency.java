package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class FindingFrequency {
    static void main(String[] args) {
        int[] input_int = {2, 3, 4, 5, 2, 4, 6, 2, 7};
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : input_int) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
