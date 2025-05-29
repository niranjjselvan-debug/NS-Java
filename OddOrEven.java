import java.util.Scanner;

/**
 * A utility class to check whether a given integer is odd or even.
 */
public class OddOrEven {
    /**
     * The main method to run the odd or even checker program.
     * Prompts the user for input and displays whether the number is odd or even.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Enter the number to check if it is odd or even: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        if (isOdd(input))
            System.out.println("It is an odd number!");
        else
            System.out.println("It is an even number!");
    }

    /**
     * Determines if the given integer is odd.
     *
     * @param input the integer to check
     * @return true if the number is odd, false if it is even
     */
    public static boolean isOdd(int input) {
        if(input%2==0)
            return false; // Even number
        else
            return true; // Odd number
    }
}