package Behavioral.observer.bad;

public class Run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentConditionDisplay(), new StatisticsDisplay());
        weatherData.measurementsChanged(1, 2333);
        System.out.println("-------------------");
        weatherData.measurementsChanged(10, 22);
        System.out.println("-------------------");
        weatherData.measurementsChanged(11, 23);
    }
}
