package src.main.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {
        //Queue can be implemented using ArrayList, LinkedList and PriorityQueue

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); //Add elements in the queue
        queue.offer(36);
        queue.offer(48);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.peek();
    }
}
