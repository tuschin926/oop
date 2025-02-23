package c3.b3_6;

public class Test {
    public static void main(String[] args) {
        Ball b1= new Ball(1.3f,5,10,4,3);
        System.out.println(b1);
        b1.move();
        System.out.println(b1);
        b1.reflecHorizontal();
        b1.move();
        System.out.println(b1);
        b1.reflecVertical();
        System.out.println(b1);

        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball
        }
    }
}
