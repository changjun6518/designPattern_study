package Behavioral.observer.good;

public class Run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(11, 15);
        System.out.println("-------------------");
        weatherData.setMeasurements(22, 60);
        System.out.println("-------------------");
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(28, 50);
    }

}
