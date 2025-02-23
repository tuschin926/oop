package c3.b3_4;

public class Test {
    public static void main(String[] args) {
        MyTime t1=new MyTime(2,30,13);
        System.out.println(t1);
        t1.nextMinute().nextHour();
        System.out.println(t1);
    }
}
