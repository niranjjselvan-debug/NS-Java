package Basics;

import java.util.LinkedList;

public class LinkedListUsage {
    static void main(String[] args) {
        LinkedList<String> fruitsList = new LinkedList<>();
        fruitsList.add("apple");
        fruitsList.add("orange");
        fruitsList.addFirst("pear");
        fruitsList.add("grape");
        fruitsList.add("lemon");
        fruitsList.addLast("grape");
        fruitsList.add("watermelon");

        fruitsList.set(0, "jackfruit");
        System.out.println("FruitsList has : " + fruitsList);
        System.out.println("Does fruitsList contains lemon? : " + fruitsList.contains("lemon"));

        System.out.println(fruitsList.get(2));
        System.out.println(fruitsList.getFirst());
        System.out.println(fruitsList.getLast());
        System.out.println("FruitsList has :" + fruitsList);
        System.out.println(fruitsList.removeFirst());
        System.out.println(fruitsList.removeLast());
        System.out.println("FruitsList has :" + fruitsList);
        fruitsList.remove("apple");


    }
}

