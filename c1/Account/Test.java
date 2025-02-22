package c1.Account;

public class Test {
    public static void main(String[] args) {
        Account a1= new Account("123","Trinh",1000);
        System.out.println(a1);
        a1.credit(50);
        System.out.println(a1);
        a1.debit(100);
        System.out.println(a1);
        Account a2= new Account("456","Tu",500);
        a1.transferTo(a2,400);
        System.out.println(a1);
        System.out.println(a2);
    }
}
