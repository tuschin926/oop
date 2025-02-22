package c1.Circle1;

public class Circle1 {
    double radius=0.1;
    public Circle1(){
    }
    public Circle1( double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double  getArea() {
        return Math.PI*radius*radius;
    }
    double getCircumference(){
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle1[" +
                "radius=" + radius +
                ']';
    }

}
