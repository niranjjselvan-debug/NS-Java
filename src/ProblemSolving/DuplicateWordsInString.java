package ProblemSolving;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordsInString {
    static void main(String[] args) {
        String input = "Java, is powerful. Java is powerful.";
        Set<String> uniqueWords = new LinkedHashSet<>();
        String[] words = input.toLowerCase().split("[ ,\\.]+");

        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);
    }
}
