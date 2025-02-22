package c2.MyTriangle;

public class MyPoint {
    public int x;
    public int y;

    MyPoint(){};

    MyPoint(int x,int y){
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
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(this.x-another.x,2)+Math.pow(this.y-another.y,2));
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
