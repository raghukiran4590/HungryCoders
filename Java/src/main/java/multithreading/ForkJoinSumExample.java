package src.main.java.multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumExample {

    static class SumTask extends RecursiveTask<Integer> {

        static final int THRESHOLD = 10; //number of concurrent tasks to performed
        private int[] arr;
        private int start, end;

        public SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if(end-start <= THRESHOLD) {
                System.out.println("If Condition");
                int sum = 0;
                for (int i=start; i<end; i++) {
                    sum += arr[i];
                }
                return sum;
            } else {
                System.out.println("else Condition");
                int mid = (start+end)/2;
                SumTask leftSumTask = new SumTask(arr, start, mid);
                SumTask rightSumTask = new SumTask(arr, mid, end);

                leftSumTask.fork();
                rightSumTask.fork();

                return  leftSumTask.join() + rightSumTask.join();
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14, 15};

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        Integer result = forkJoinPool.invoke(new SumTask(array, 0, array.length));

        System.out.println("Sum : "+result);


    }

}