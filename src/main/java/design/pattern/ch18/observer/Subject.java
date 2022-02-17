package design.pattern.ch18.observer;

public interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserver();
}
