package ProblemSolving;

public class ReverWordsInString {
    static void main(String[] args) {
        String input = "Java is a powerful programming language.";
        String[] words = input.toLowerCase().split("[ ,\\.]+");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                output.append(word.charAt(i));
            }
            output.append(" ");
        }
        System.out.println(output.toString());
    }
}
