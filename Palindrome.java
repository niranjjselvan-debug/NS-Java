import java.util.Scanner;

class Palindrome {
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