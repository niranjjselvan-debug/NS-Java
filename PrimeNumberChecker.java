import java.util.Scanner;

/**
 * A utility class to check if a number is a prime number.
 */
public class PrimeNumberChecker {
    /**
     * The main method to run the prime number checker program.
     * Prompts the user for input and displays whether the number is prime.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Enter the number to check if it is a prime number or not: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.close();
        if (isPrimeNumber(input))
            System.out.println("Yes, it is a prime number!");
        else
            System.out.println("No, it is not a prime number");
    }

    /**
     * Checks if the given integer is a prime number.
     *
     * @param input the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrimeNumber(int input) {
        if (input < 1)
            return false;
        for (int i = 2; i < input; i++) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

}