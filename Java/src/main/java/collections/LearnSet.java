package src.main.java.collections;

import java.util.*;

public class LearnSet {

    //Set does not have duplicate elements

    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>(); //Set stores elements in random order
//        Set<Integer> set = new LinkedHashSet<>(); // Set stores elements in the order they are added
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder()); // Set stores the elements in the sorted order (increasing or decreasing)

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

/*


        System.out.println(set);

        set.add(65);

        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.contains(21));

        System.out.println(set.remove(54));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();

*/


        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Raghu", 542));
        studentSet.add(new Student("Rohit", 555));
        studentSet.add(new Student("Subhash", 553));
        studentSet.add(new Student("Shyam", 542));

        System.out.println(studentSet);

    }
}
