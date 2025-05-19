import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n to print the Fibonacci series: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("\nFibonacci Series:");
        getFibonacciSeries(n);
        System.out.println("\nThe " + n + "th Fibonacci value is: " + getFibonacciValue(n));
    }

    public static void getFibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

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
