package src.main.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);

        numbers.put("Two", 23); //The key - value will be overridden

        if(!numbers.containsKey("Two"))
            numbers.put("Two", 23);


        numbers.putIfAbsent("Two", 23); //Same if condition ob0ve can


        System.out.println(numbers);

        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: numbers.keySet()) {
            System.out.println(key);
        }

        for(Integer value: numbers.values()) {
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

        numbers.clear();
    }
}
