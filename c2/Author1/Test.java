package c2.Author1;

public class Test {
    public static void main(String[] args) {
        Author1[] a1=new Author1[2];
        a1[0] = new Author1("trinh", "abca@",'m');
        a1[1] = new Author1("Tu","bcd@",'f');
        Book1 b1= new Book1("Java",a1,5.6,2);
        System.out.println(b1);
    }
}
