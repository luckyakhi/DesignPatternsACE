package ace.java.designpatterns.behavioural.observer;

public interface Subject {
    void registerObserver(Observer observer);
    void deRegisterObserver(Observer observer);
    void notifyObservers();
}
