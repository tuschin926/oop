package c2.MyRectangle;

public class Test {
    public static void main(String[] args) {
        MyPoint m1=new MyPoint(4,5);
        MyPoint m2= new MyPoint(6,7);
        MyRectangle r1=new MyRectangle(m1,m2);
        System.out.println(r1);
        System.out.println(r1.getPerimeter());
    }
}
