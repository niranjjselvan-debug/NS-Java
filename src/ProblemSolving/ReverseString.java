package ProblemSolving;

public class ReverseString {
    static void main(String[] args) {
        String input = "hello";

        // using stringbuilder
        String output = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string is :" + output);

        // Using for loop array
        int length = input.length() - 1;
        String output_01 = "";
        for (int i = length; i >= 0; i--) {
            output_01 += input.charAt(i);
        }
        System.out.println("Output using for loop :" + output_01);

        // Using char array
        int left = 0, right = input.length() - 1;
        char[] chars = input.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String output_03 = new String(chars);
        System.out.println("using 2 pointers:" + output_03);
    }
}
