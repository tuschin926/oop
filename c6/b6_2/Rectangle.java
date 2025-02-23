package c6.b6_2;

public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimenter() {
        return 2*(width+length);
    }
}
