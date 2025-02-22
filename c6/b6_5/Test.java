package c6.b6_5;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println(resizableCircle);
        resizableCircle.resize(50);
        System.out.println("After resizing (50%): " + resizableCircle);
    }
}
