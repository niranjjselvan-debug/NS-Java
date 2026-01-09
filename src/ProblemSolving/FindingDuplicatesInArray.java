package ProblemSolving;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicatesInArray {
    static void main(String[] args) {
        int[] input = {2, 3, 4, 2, 5, 3, 6};
        Set<Integer> set = new HashSet<>();

        for (int n : input) {
            if (!set.add(n))
                System.out.println("Duplicate:" + n);
        }
    }
}
