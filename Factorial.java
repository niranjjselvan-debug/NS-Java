import java.util.Scanner;

public class Factorial {
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
