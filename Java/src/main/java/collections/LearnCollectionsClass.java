package src.main.java.collections;

import java.util.*;

public class LearnCollectionsClass {

    public static void main(String[] args) {
        //Collection - parent interface of collection interfaces like List, Set, Queue, Map, etc
        //Collections Framework - Framework that has all the collection interfaces and classes
        //Collections Class - Utility functions to be applies on the collections

        List<Student> list2 = new ArrayList<>();

        list2.add(new Student("Anuj", 2));
        list2.add(new Student("Ramesh", 4));
        list2.add(new Student("Shivam", 3));
        list2.add(new Student("Rohit", 1));

       Collections.sort(list2);

       System.out.println(list2);

       Collections.sort(list2, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.name.compareTo(o2.name);
           }
       });

        System.out.println(list2);

        Collections.sort(list2, ((o1, o2) -> o1.name.compareTo(o2.name)));

        System.out.println(list2);

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(22);
        list.add(44);
        list.add(12);
        list.add(21);
        list.add(9);
        list.add(56);
        list.add(14);
        list.add(88);
        list.add(67);


        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 9));

        Collections.sort(list, Comparator.reverseOrder());

    }
}
