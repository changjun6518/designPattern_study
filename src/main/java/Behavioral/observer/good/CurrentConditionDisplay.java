package Behavioral.observer.good;

public class CurrentConditionDisplay implements Observer{

    private float temp;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
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
        System.out.println("현재 온도는 " + temp);
        System.out.println("현재 습도는 " + humidity);
    }
}
