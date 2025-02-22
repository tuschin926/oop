package c2.Customer;

public class Test {
    public static void main(String[] args) {
        Customer c1= new Customer(123,"Trinh",8);
        Invoice i1= new Invoice(890,c1,999.9);

        System.out.println("Amount after discount = "+i1.getAmountAfterDiscount() );
        System.out.println(i1);
    }
}
