package c2.Customer1;

public class Test {
    public static void main(String[] args) {
        Customer c1= new Customer(1456,"Trinh",'f');
        Account a1= new Account(123,c1,100.0);
        System.out.println(a1);
        a1.desposit(50);
        System.out.println(a1);
        a1.withdraw(100);
        System.out.println(a1);
    }
}
