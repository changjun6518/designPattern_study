package Behavioral.observer.bad;

public class WeatherData {

    public WeatherData(CurrentConditionDisplay currentConditionDisplay, StatisticsDisplay statisticsDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.statisticsDisplay = statisticsDisplay;
    }

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;

    public void measurementsChanged(float temp, float humidity) {
        currentConditionDisplay.update(temp, humidity);
        statisticsDisplay.update(temp, humidity);
    }

}
