package c2.MyRectangle;

public class MyPoint {
    public int x=0;
    public int y=0;

    MyPoint(){};

    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }
    protected int[] getXY(){
        return new int[] {x,y};

    }
    protected void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    protected double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    protected double distance(c2.MyPoint.MyPoint another){
        return Math.sqrt(Math.pow(this.x-another.x,2)+Math.pow(this.y-another.y,2));
    }
    protected double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
