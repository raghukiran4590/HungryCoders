package src.main.java.generics;

public class Printer<T> {

    public void doPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        Printer<Cat> catPrinter = new Printer<>();
        catPrinter.doPrint(new Cat("White"));
//        catPrinter.doPrint(new Dog("Black"));
    }

}
