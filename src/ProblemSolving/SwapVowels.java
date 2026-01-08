package ProblemSolving;

import java.util.Scanner;

public class SwapVowels {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String input = scan.nextLine();
        scan.close();
        System.out.println("After swapping : " + swappedVowels(input));
    }

    private static String swappedVowels(String input) {
        int left = 0, right = input.length() - 1;
        char[] c = input.toCharArray();
        while (left < right) {
            while (left < right && !isVowel(c[left])) {
                left++;
            }
            while (left < right && !isVowel(c[right])) {
                right--;
            }
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
        return new String(c);
    }

    private static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}