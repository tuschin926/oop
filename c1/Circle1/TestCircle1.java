package c1.Circle1;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c1=new Circle1();
        System.out.println(c1.toString()+" Area :" +c1.getArea()+" ;Cirumference : "+c1.getCircumference());

        Circle1 c2= new Circle1(5);
        System.out.println(c2.toString()+" Area :" + c2.getArea() +" ;Cirumference : "+c2.getCircumference());
    }
}
