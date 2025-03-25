package src.main.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

    public static <T> List<T> arrayToList(T[] arr) {
        List<T> arrList = new ArrayList<>();
//        arrList.addAll(List.of(arr));
        for(T element : arr) {
            arrList.add(element);
        }
        return arrList;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        List<Integer> integerList = arrayToList(intArray);
        System.out.println(integerList);

        String[] stringArray = {"A", "B", "C", "D"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println(stringList);

    }
}
