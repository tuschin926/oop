package c6.b6_5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
        this.radius=radius;
    }

    @Override
    public void resize(int percent) {
        radius*=percent/100.0;
    }

    @Override
    public String toString() {
        return "ResizableCricle["+super.toString()+']';
    }
}
