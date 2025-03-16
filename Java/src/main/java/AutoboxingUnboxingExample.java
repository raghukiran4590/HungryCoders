package src.main.java;

import java.util.ArrayList;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: converting int to Integer
        int primitiveInt = 42;
        Integer wrapperInt = primitiveInt;

        // Unboxing: converting Integer to int
        Integer wrapperInt2 = 50;
        int primitiveInt2 = wrapperInt2;

        // Autoboxing in collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Autoboxing
        list.add(2); // Autoboxing

        // Unboxing from collections
        int first = list.get(0); // Unboxing
        int second = list.get(1); // Unboxing

        System.out.println("Autoboxing: " + wrapperInt); // Autoboxing: 42
        System.out.println("Unboxing: " + primitiveInt2); // Unboxing: 50
        System.out.println("Autoboxing in collection: " + list); // Autoboxing in collection: [1, 2]
        System.out.println("Unboxing from collection: " + first + ", " + second); // Unboxing from collection: 1, 2
    }
}
