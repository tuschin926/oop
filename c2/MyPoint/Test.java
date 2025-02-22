package c2.MyPoint;

public class Test {
    public static void main(String[] args) {
        MyPoint m1=new MyPoint();
        MyPoint m2=new MyPoint(2,3);

        System.out.println(m1.distance(m2));
        System.out.println(m1.distance(6,7));
        System.out.println(m2.distance());
    }
}
