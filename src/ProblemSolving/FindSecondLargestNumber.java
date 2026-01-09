package ProblemSolving;

public class FindSecondLargestNumber {
    static void main(String[] args) {
        int[] input_int = {2, 4, 5, 1, 0, 9, 4, 6};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : input_int) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n < largest && n > secondLargest) {
                secondLargest = n;
            }
        }
        System.out.println("second largest number is : " + secondLargest);
    }
}
