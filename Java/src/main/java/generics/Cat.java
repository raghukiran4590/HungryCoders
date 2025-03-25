package src.main.java.generics;

public class Cat {
    String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
