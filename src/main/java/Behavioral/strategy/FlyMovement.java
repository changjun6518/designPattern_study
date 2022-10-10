package Behavioral.strategy;

public class FlyMovement implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("날아서 움직입니다");
    }
}
