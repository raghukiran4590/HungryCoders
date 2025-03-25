package src.main.java.java8;

import java.util.Collection;
import java.util.Collections;

interface Calculator {
    void switchOn();
//    void sum(int input);
}

public class CalculatorImpl {
    public static void main(String[] args) {
        Calculator calculator = () -> System.out.println("Switch On");
        calculator.switchOn();
    }
}
