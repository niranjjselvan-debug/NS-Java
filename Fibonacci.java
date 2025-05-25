import java.util.Scanner;

/**
 * A utility class to generate and display the Fibonacci series and compute the nth Fibonacci value.
 */
public class Fibonacci {
    /**
     * The main method to run the Fibonacci program.
     * Prompts the user for input and displays the Fibonacci series and the nth Fibonacci value.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n to print the Fibonacci series: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("\nFibonacci Series:");
        getFibonacciSeries(n);
        System.out.println("\nThe " + n + "th Fibonacci value is: " + getFibonacciValue(n));
    }

    /**
     * Prints the Fibonacci series up to the nth value (inclusive).
     *
     * @param n the number of terms in the Fibonacci series to print
     */
    public static void getFibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    /**
     * Computes the nth Fibonacci value.
     *
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int getFibonacciValue(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, next = 0;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}