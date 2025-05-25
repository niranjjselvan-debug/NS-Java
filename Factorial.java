import java.util.Scanner;

/**
 * A utility class to compute the factorial of a given non-negative integer.
 */
public class Factorial {
    /**
     * The main method to run the factorial program.
     * Prompts the user for input and displays the factorial result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n to find the factorial: ");
        int n = scan.nextInt();
        scan.close();

        int result = getFactorial(n);
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + n + " is " + result);
        }
    }

    /**
     * Computes the factorial of a non-negative integer.
     *
     * @param n the integer for which to compute the factorial
     * @return the factorial of n, or -1 if n is negative
     */
    public static int getFactorial(int n) {
        if (n < 0)
            return -1;
        int output = 1;
        for (int i = 2; i <= n; i++) {
            output *= i;
        }
        return output;
    }
}