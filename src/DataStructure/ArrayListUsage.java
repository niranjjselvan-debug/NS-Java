package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListUsage {
    static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pear");
        fruits.add("Strawberry");
        fruits.add("Mango");

        System.out.println(fruits);
        fruits.addFirst("Avocado");
        fruits.addLast("Sapota");
        System.out.println(fruits);
        fruits.add(4, "Custard apple");
        System.out.println(fruits);
        System.out.println(fruits.get(2));
        fruits.set(0, "Custard apple");
        System.out.println(fruits);
//        fruits.clear();
        System.out.println("First index of Custard apple is : " + fruits.indexOf("Custard apple"));
        System.out.println("Last index of Custard apple is : " + fruits.lastIndexOf("Custard apple"));
        System.out.println(fruits);
        System.out.println("Size of the Fruits ArrayList is : " + fruits.size());
        System.out.println("Does fruits contains watermelon? : " + fruits.contains("Watermelon"));
        System.out.println("Is Fruits arraylist is empty? : " + fruits.isEmpty());

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println("Iterating.." + it.next());
        }
        Collections.sort(fruits);
        System.out.println("Sorted arraylist is : " + fruits);
        fruits.remove(1);
        System.out.println("After removing 1st item :" + fruits);
    }
}
