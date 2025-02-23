package c6.b6_3;

public class Test {
    public static void main(String[] args) {
        MovablePoint p1= new MovablePoint(1,2,3,4);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
    }
}
