package Behavioral.observer.good;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void noticeObservers();

}
