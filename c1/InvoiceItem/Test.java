package c1.InvoiceItem;

public class Test {
    public static void main(String[] args) {
        InvoiceItem i1= new InvoiceItem("111","sách",999,0.99);
        System.out.println(i1);
        System.out.println("Tong la: "+i1.getTotal());
    }
}
