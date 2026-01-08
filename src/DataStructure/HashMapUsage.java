package DataStructure;

import java.util.HashMap;

public class HashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("orange", 2);
        map.put("pear", 3);
        map.put("grape", 4);
        map.put("banana", 1);
        map.put("kiwi", 7);

        System.out.println("Here is the map:" + map);
        System.out.println(map.get("grape"));
//        map.clear();
//        System.out.println("Here is the map:" + map);

        HashMap<String, Integer> map_02 = (HashMap<String, Integer>) map.clone();
        map_02.remove("apple");
        System.out.println("Here is the map:" + map_02);
        System.out.println("Here is the map:" + map);
        map_02.compute("orange", (k, v) -> v == null ? 1 : v + 1);
        map_02.compute("Chikku", (k, v) -> v == null ? 1 : v + 1);
        System.out.println("Here is the map:" + map_02);
    }
}
