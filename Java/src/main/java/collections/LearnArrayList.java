package src.main.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> studentsList = new ArrayList<>();
        studentsList.add(1);
        studentsList.add(2);
        studentsList.add(0,0);

//        System.out.println(studentsList);

        List<Integer> newStudentsList = new ArrayList<>();

        newStudentsList.addAll(studentsList);

//        System.out.println(newStudentsList);

        newStudentsList.get(1);

        studentsList.remove(1);

        newStudentsList.remove(Integer.valueOf(2));

//        System.out.println(newStudentsList);

        newStudentsList.clear();

        newStudentsList.set(0,100);

        boolean contains = newStudentsList.contains(50);


        for(int i=0; i<newStudentsList.size(); i++) {
            System.out.println(newStudentsList.get(i));
        }

        for(Integer ele : newStudentsList) {
            System.out.println(ele);
        }

        Iterator<Integer> iterator = newStudentsList.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
