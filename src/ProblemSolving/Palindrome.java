package ProblemSolving;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input : ");
        String input = scan.next();
        scan.close();
        if (isPalindrome(input))
            System.out.println(input + " is a palindrome");
        else
            System.out.println(input + " is not a palindrome");
    }

    private static boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
