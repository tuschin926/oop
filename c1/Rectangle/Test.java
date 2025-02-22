package c1.Rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle();
        System.out.println(a1.toString()+" ,Area="+ a1.getArea()+" ,Perimeter="+ a1.getPerimeter());

        Rectangle a2 = new Rectangle(0.2f,4.2f);
        System.out.println(a2.toString()+" ,Area="+ a2.getArea()+" ,Perimeter="+ a2.getPerimeter());

    }
}
