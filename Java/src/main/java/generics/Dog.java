package src.main.java.generics;

public class Dog {
    String color;

    public Dog(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }
}
