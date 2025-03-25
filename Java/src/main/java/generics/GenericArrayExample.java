package src.main.java.generics;

import java.awt.image.ImageProducer;
import java.util.*;

public class GenericArrayExample {

    public <T> void print(T[] ts) {
        for(T ele : ts) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        String[] strArray = new String[]{"Hello", "World"};
        GenericArrayExample genericArrayExample = new GenericArrayExample();
        genericArrayExample.print(strArray);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(5);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        Map<Integer, Map<String, String>> books = new HashMap<>();

    }
}
