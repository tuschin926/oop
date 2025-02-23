package c6.b6_1;

public class Test {
    public static void main(String[] args) {
        Shape s1=new Circle(3,"red",true);
        Shape s2= new Square(4);
        Shape s3= new Rectangle(3,4,"yellow",false);

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPertmeter());

        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPertmeter());

        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPertmeter());
    }
}
