import java.util.Scanner;

public class PrimeNumberChecker {
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

