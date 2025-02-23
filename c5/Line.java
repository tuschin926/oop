package c5;

import c7.b7_2.Point;

import java.util.ArrayList;
import java.util.List;

public class Line extends Point {
   Point begin;
   Point end;
   public Line(int x1, int y1, int x2, int y2){
       super(x1,y1);
       this.begin= new Point(x1,y1);
       this.end = new Point(x2, y2);
   }
   public Line(Point begin, Point end){
       super(begin.getX(), begin.getY());
       this.begin=begin;
       this.end=end;
   }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    public Point getBegin() { return new Point(getX(), getY()); }
    public Point getEnd() { return end; }
    public void setBegin(Point begin) { setXY(begin.getX(), begin.getY()); }
    public void setEnd(Point end) { this.end = end; }

    public int getBeginX() { return getX(); }
    public int getBeginY() { return getY(); }
    public int getEndX() { return end.getX(); }
    public int getEndY() { return end.getY(); }

    public void setBeginX(int x) { setX(x); }
    public void setBeginY(int y) { setY(y); }
    public void setBeginXY(int x, int y) { setXY(x, y); }
    public void setEndX(int x) { end.setX(x); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }


}
