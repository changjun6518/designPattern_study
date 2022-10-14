package Behavioral.observer.bad;

public class StatisticsDisplay {
    private float temp;
    private float humidity;
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("통계 display 입니다 !" + temp + humidity);
    }

}
