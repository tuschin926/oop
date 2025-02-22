package c6.b6_6;

public class Test {
    public static void main(String[] args) {
        Cat c1= new Cat("mi");
        Dog d1= new Dog("den");
        Dog d2= new Dog("vang");
        BigDog b1= new BigDog("ki");
        BigDog b2 =new BigDog("lu");
        Animal a1=new Cat("dieu");
        a1.greets();

        c1.greets();
        d1.greets();
        d1.greets(d2);
        b1.greets(b2);
        b1.greets(d1);
    }
}
