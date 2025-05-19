import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the value of n to find the factorial: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println("The factorial of " + n + " is " + getFactorial(n));
    }

    public static int getFactorial(int n) {
        if (n < 0)
            return -1;
        else if (n == 0 || n == 1)
            return 1;
        int output = 1;
        while (n > 1) {
            output *= n;
            n--;
        }
        return output;
    }
}
