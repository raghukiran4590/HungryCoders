package src.main.java.collections;

import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Monkey");

        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.peek());



    }
}
