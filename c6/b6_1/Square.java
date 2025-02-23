package c6.b6_1;

public class Square extends Rectangle{
    public Square(){};
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }
    public  Square(double side){
        super(side,side);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
