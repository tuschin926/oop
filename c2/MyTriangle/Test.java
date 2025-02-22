package c2.MyTriangle;

import c2.MyPoint.MyPoint;

public class Test {
    public static void main(String[] args) {
        MyPoint m1=new MyPoint(1,2);
        MyPoint m6=new MyPoint(7,2);
        MyPoint m7=new MyPoint(1,8);
        MyTriangle v1= new MyTriangle(1,2,3,4,5,6);
        MyTriangle m2= new MyTriangle(7,8,9,5,6,2);

        System.out.println(m2);
        System.out.println("Chu vi ="+m2.getPerimeter());
        System.out.println(v1.getType());
    }
}
