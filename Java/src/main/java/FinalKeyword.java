package src.main.java;

final class FinalKeyword {

    int num1 = 10;
    int num2 = 20;

    void addNumbers() {
        System.out.println("Sum is : "+(num1+num2));
    }
}

//class ConcreteFinal extends FinalKeyword {} // Cannot Inherit from final class
