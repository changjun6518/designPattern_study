package Behavioral.observer.good;

public class StatisticsDisplay implements Observer {
    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("통계 display 입니다 !" + temp + humidity);
    }

}
