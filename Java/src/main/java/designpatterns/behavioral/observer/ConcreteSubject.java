package src.main.java.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ConcreteSubject implements Subject {

    private String state;
    private List<Observer> observers = new ArrayList<>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.notify();
        }
    }
}
