package src.main.java.collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};

        int index = Arrays.binarySearch(a, 4);

        System.out.println(index);

        Arrays.sort(a); //By default uses the quick sort

        Arrays.parallelSort(a); //if more than 8192 elements, then does the merge sort

        Arrays.fill(a, 12); //Fills the whole array with value


    }
}
