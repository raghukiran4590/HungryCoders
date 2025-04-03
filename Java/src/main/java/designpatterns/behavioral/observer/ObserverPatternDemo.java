package src.main.java.designpatterns.behavioral.observer;

import java.util.Observer;

// Step 5: Client Code to Demonstrate the Observer Pattern
public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", subject);

        subject.setState("State 1");
        subject.setState("State 2");

        subject.detach((Observer) observer1);

        subject.setState("State 3");

        // Output:
        // Observer Observer 1 notified. New state is: State 1
        // Observer Observer 2 notified. New state is: State 1
        // Observer Observer 1 notified. New state is: State 2
        // Observer Observer 2 notified. New state is: State 2
        // Observer Observer 2 notified. New state is: State 3
    }
}
