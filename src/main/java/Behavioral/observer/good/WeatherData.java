package Behavioral.observer.good;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private float temp;
    private float humidity;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void noticeObservers() {
        for (Observer observer : observerList) {
            observer.update(temp, humidity);
        }
    }

    public void setMeasurements(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        noticeObservers();
    }
}
