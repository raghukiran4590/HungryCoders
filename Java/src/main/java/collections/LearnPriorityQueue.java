package src.main.java.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

//        Queue<Integer> priorityQ = new PriorityQueue<>();
//        Priority Queue sets the priority of the elements based on the increasing order
//        Smallest element gets the first priority; peek gives the smallest of all
//        poll removes the smallest element
//        PriorityQueue<Integer> priorityQ = new PriorityQueue<>(); // Default is the Min Heal implementation
        PriorityQueue<Integer> priorityQ = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap Implementation
        priorityQ.offer(40);
        priorityQ.offer(12);
        priorityQ.offer(24);
        priorityQ.offer(36);

        System.out.println(priorityQ); //Returns all the elements in the priority based on the increasing order

        System.out.println(priorityQ.peek()); // Returns the smallest element which has the highest priority

        System.out.println(priorityQ.poll()); // Removes the smallest element which has the highest priority

        System.out.println(priorityQ); //Returns the remaining elements in the priority based on the increasing order


    }
}
