package c2.MyRectangle;

public class MyRectangle {
    MyPoint topLeft;
    MyPoint bottomRinght;

    public MyRectangle(int x1, int y1, int x2, int y2){
        topLeft= new MyPoint(x1,y2);
        bottomRinght=new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRinght){
        this.topLeft=topLeft;
        this.bottomRinght=bottomRinght;
    }

    public double getPerimeter(){
        return (Math.sqrt(Math.pow(topLeft.y-bottomRinght.y,2))+ Math.sqrt(Math.pow(topLeft.x-bottomRinght.x,2)))*2;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRinght=" + bottomRinght +
                '}';
    }
}
