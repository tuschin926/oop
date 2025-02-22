package c6.b6_8;

public class Test {
    public static void main(String[] args) {
        Movable m1= new MovablePoint(1,2,3,4);
        Movable m2= new MovableCircle(6,7,8,9,20);
        System.out.println(m1);
        m1.moveDown();
        m1.moveLeft();
        System.out.println(m1);

        System.out.println(m2);
        m2.moveUp();
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(1,2,3,4,5,6);
        System.out.println(m3);
        m3.moveRight();
        m3.moveUp();
        System.out.println(m3);


    }
}
