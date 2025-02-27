package c7.b7_2;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[] {x,y};
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distance(Point another){
        return Math.sqrt(Math.pow(x-another.x,2)+(Math.pow(y- another.y,2)));
    }
}
