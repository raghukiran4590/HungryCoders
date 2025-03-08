package src.main.java;

public class StaticKeyword {

    static String name = "Raghu";

    static void staticMethod() {
        System.out.println("This is a static method with name : "+name);
    }

    public static void main(String[] args) {
        System.out.println(StaticKeyword.name);
        staticMethod();
    }
}


