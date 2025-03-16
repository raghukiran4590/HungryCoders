package src.main.java;

public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(); // Calling with no arguments
    }

    public static void printNumbers(int... numbers) {
        System.out.println("Printing numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Output
// Printing numbers:
// 1
// 2
// 3
// 4
// 5
// Printing numbers:
}
