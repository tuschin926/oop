package c7.b7_2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine(){
        points = new ArrayList<>();
    }
    public PolyLine(List<Point> points){
        this.points=points;
    }
    public void appendPoint(int x, int y){
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }
    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(Point aPoint : points){
            sb.append(aPoint.toString());
        }
        sb.append("}");
        return sb.toString();
    }
    public double getLength(){
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return length;
    }
}
