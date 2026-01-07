package Basics;

import java.util.Arrays;

public class ArraysUsage {
    public static void main(String[] args) {
        int[] array_01 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array_02 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array_03 = {1, 2, 3, 4, 9, 6, 7, 8};
        char[] spell_01 = {'h', 'e', 'l', 'l', 'o'};
        String[] word_01 = {"Niranjj", "Nivejaa", "Geetha", "Selvan"};

        Arrays.sort(array_03);

        System.out.println("The length of the array_01 is : " + array_01.length);
        System.out.println("array_01 to String : " + Arrays.toString(array_01));
        System.out.println("Comparing array_01 and array_02: " + Arrays.compare(array_01, array_02));
        System.out.println("Using equals to see if both arrays are equal or not: " + Arrays.equals(array_01, array_02));
        System.out.println("Using sort to sort the array_03 : " + Arrays.toString(array_03));

        Arrays.fill(array_03, 2, 6, 99);
        System.out.println("Using fill in the array: " + Arrays.toString(array_03));

        System.out.println(Arrays.toString(spell_01));
        System.out.println(Arrays.asList(word_01));


    }
}
