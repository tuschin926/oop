package c3.b3_5;

public class Test {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012,2,12);
        System.out.println(d1);
        System.out.println(d1.nextDay());

        MyDate d2= new MyDate(2012,1,2);
        System.out.println(d2);
        System.out.println(d1.previousDay());
        System.out.println(d1.previousMonth());
        System.out.println(d1.previousYear());
    }
}
