package ProblemSolving;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacterInString {
    static void main(String[] args) {
        String input = "Niranjj";
        Set<Character> inputSet = new LinkedHashSet<>();

        for (char ch : input.toLowerCase().toCharArray()) {
            inputSet.add(ch);
        }
        System.out.println(inputSet);
    }
}
