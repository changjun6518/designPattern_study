package Behavioral.observer.bad;

public class CurrentConditionDisplay {

    private float temp;
    private float humidity;

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
