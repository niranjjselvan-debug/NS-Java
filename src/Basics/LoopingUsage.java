package Basics;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopingUsage {
    static void main(String[] args) {
        // Do while
        int i = 5;
        do {
            System.out.println("Hello World");
            i--;
        } while (i > 0);
        System.out.println("-------------");
        // while
        int j = 5;
        while (j > 0) {
            System.out.println("Hello Niranjj");
            j--;
        }
        System.out.println("-------------");
        // for
        for (int k = 0; k < 5; k++) {
            System.out.println("Hello ");
        }
        System.out.println("-------------");
        //for each
        int[] numbers = {2, 3, 4, 5, 6};
        for (int x : numbers) {
            System.out.println(x);
        }
        System.out.println("-------------");
        //Iterator
        ArrayList<String> input = new ArrayList<>();
        input.add("Chennai");
        input.add("Mumbai");
        input.add("Bengaluru");
        Iterator<String> it = input.iterator();
        while (it.hasNext()) {
            System.out.println("Next City is : " + it.next());
        }
    }
}
