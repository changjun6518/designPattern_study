package Behavioral.strategy;

public class WalkMovement implements MovementStrategy {

    @Override
    public void move() {
        System.out.println("걸어서 움직입니다");
    }
}
