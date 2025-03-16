package src.main.java;

abstract class AbstractKeyword {

    abstract void abstractMethod();

    final int num = 10;

    final void printNum() {
        System.out.println(num);
    }

    void display() {
        System.out.println("Concrete Method in Abstract class");
    }

}

class ConcreteClass extends AbstractKeyword {

    @Override
    void abstractMethod() {
        System.out.println("Inside abstractMethod in the ConcreteClass");
        System.out.println(num);
        printNum();
//        num = 100; // Final Variable cannot be reassigned
        display();
    }


// Final Method cannot be overridden
//    final void printNum() {
//        System.out.println(num);
//    }

    public static void main(String[] args) {
        ConcreteClass concrete = new ConcreteClass();
        concrete.abstractMethod();

    }
}