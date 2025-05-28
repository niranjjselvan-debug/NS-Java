/**
 * A utility class to print various star patterns to the console.
 * Includes methods to print a right-angled triangle, a centered triangle, and a rhombus.
 */
public class Patttern {
    /**
     * The main method to run the pattern printing program.
     * Calls methods to print different star patterns.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        rightAngle();
        centeredTriangle();
        rhombus();
    }

    /**
     * Prints a right-angled triangle pattern of stars to the console.
     * The triangle has a fixed height of 5.
     */
    public static void rightAngle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Prints a centered triangle pattern of stars to the console.
     * The triangle is centered and has a fixed height of 5.
     */
    public static void centeredTriangle() {
        int n = 5; // height of the triangle
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a rhombus pattern of stars to the console.
     * The rhombus consists of an upper and lower triangle, both centered.
     * The height of the rhombus is fixed at 5.
     */
    public static void rhombus() {
        int n = 5; // height of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}