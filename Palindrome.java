import java.util.Scanner;

/**
 * A utility class to check if a given string is a palindrome.
 */
class Palindrome {
    /**
     * The main method to run the palindrome checker program.
     * Prompts the user for input and displays whether the string is a palindrome.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Enter the string to find if it is a palindrome or not: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        if (isPalindrome(input))
            System.out.println("It is a palindrome!");
        else
            System.out.println("It is not a palindrome!");
    }

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
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