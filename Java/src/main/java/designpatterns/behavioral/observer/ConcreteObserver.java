package src.main.java.designpatterns.behavioral.observer;

public class ConcreteObserver implements Observer{
    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.attach((java.util.Observer) this);
    }

    @Override
    public void update() {
        System.out.println("Observer " + name + " notified. New state is: " + subject.getState());
    }
}
