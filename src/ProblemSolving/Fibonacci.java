package ProblemSolving;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scan.nextInt();
        scan.close();
        generateFibonacci(n);
    }

    private static void generateFibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 1; i < n; i++) {
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
