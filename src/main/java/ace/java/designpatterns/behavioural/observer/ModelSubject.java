package ace.java.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ModelSubject implements Subject {
    private List<Observer> observers;
    private int value;

    public ModelSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        value++;
        observers.forEach(observer -> observer.update(value));
    }

}
