package c2.MyLine;

public class MyLine{
    MyPoint begin;
    MyPoint end;

    MyLine(int x1, int y1, int x2, int y2 ){
        this.begin= new MyPoint(x1,y1);
        this.end= new MyPoint(x2,y2);
    }
    MyLine(MyPoint begin, MyPoint end){
      this.begin=begin;
      this.end=end;
    }
    public MyPoint getBegin(){
        return begin;
    }
    public void setBegin(MyPoint begin){
        this.begin=begin;
    }
    public MyPoint getEnd(){
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.getY();
    }
    public int[] getBeginXY(int x, int y){
        return begin.getXY();
    }
    public void setBeginXY(int x, int y){
       begin.setXY(x,y);
    }
    public int[] getEndXY(int x, int y){
        return end.getXY();
    }
    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient(){
        int yDiff = getEndY()-getBeginY();
        int xDiff = getEndX()-getBeginX();
        return Math.atan2(yDiff,xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
