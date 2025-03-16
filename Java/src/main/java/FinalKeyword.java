package src.main.java;

class FinalKeyword {

    int num1 = 10;
    int num2 = 20;

    final void addNumbers() {
        System.out.println("Sum is : "+(num1+num2));
    }
}

// Cannot Inherit from final class if the parent class is final
class ConcreteFinal extends FinalKeyword {

    void addNumbers(double a, double b) {
        System.out.println("Inherited Method");
    }

    public static void main(String[] args) {
        ConcreteFinal cf = new ConcreteFinal();
        cf.addNumbers(5.5, 6.7);
        cf.addNumbers();
    }

}
