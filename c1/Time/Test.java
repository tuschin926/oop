package c1.Time;

public class Test {
    public static void main(String[] args) {
        Time t1= new Time(1,2,3);
        System.out.println(t1);
        Time t2=new Time(23,59,58);
        System.out.println(t2);
        System.out.println(t2.nextSecond());
        System.out.println(t2.nextSecond().nextSecond());
    }
}
