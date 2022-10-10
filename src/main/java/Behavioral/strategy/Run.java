package Behavioral.strategy;

public class Run {

    public static void main(String[] args) {
        Human human = new Human();

        // 도서관 갈때는 걸어서
        human.setMovementStrategy(new WalkMovement());
        System.out.print("도서관 갈때는 ");
        human.move();

        // 여행 갈때는 날아서
        human.setMovementStrategy(new FlyMovement());
        System.out.print("여행 갈때는 ");
        human.move();

    }
}
