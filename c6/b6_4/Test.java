package c6.b6_4;

import c6.b6_3.MovablePoint;

public class Test {
    public static void main(String[] args) {
        MovablePoint p1= new MovablePoint(1,2,3,4);
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        MovableCircle p2 = new MovableCircle(6,7,8,9,3);
        System.out.println(p2);
        p2.moveDown();
        p2.moveRight();
        System.out.println(p2);
    }
}
