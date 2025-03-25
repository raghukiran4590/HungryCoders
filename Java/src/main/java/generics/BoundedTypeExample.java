package src.main.java.generics;

import java.util.List;

public class BoundedTypeExample {

    private static <T extends Comparable<T>> void findMax(List<T> tList) {
        if(tList.isEmpty() || tList == null) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }
        T max = tList.get(0);

        for(int i=0; i<tList.size(); i++) {
            if(tList.get(i).compareTo(max) > 0) {
                max = tList.get(i);
            }
        }

        System.out.println("Max Element is : "+max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
//        bd.findMax(integerList);
        findMax(integerList);
        List<Double> doubleList = List.of(1.1,2.2,3.3,4.4,5.5,6.6,7.5,8.1,9.2);
        findMax(doubleList);
//        bd.findMax(doubleList);
    }
}
