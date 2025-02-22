package c7.b7_2;

public class Test {
    public static void main(String[] args) {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(1, 2);
        polyline.appendPoint(3, 4);
        polyline.appendPoint(5, 6);

        System.out.println("Polyline: " + polyline);
        System.out.println("Length: " + polyline.getLength());
    }
}
