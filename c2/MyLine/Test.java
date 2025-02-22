package c2.MyLine;

public class Test {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1,2);
        MyPoint p2 = new MyPoint(4,6);
        MyLine l1 = new MyLine(5,6,7,8);
        MyLine l2 =new MyLine(p1,p2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println("Lenhth 1 ="+l1.getLength());
        System.out.println("Gradient1 ="+l1.getGradient());

        System.out.println("Lenhth 2 ="+l1.getLength());
        System.out.println("Gradient 2 ="+l2.getGradient());
    }
}
