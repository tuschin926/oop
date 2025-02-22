package c7.b7_1;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer("ai");
        c1.setMember(true);
        c1.setMemberType("Premium");
        System.out.println(c1);

        Visit v1= new Visit(c1, new Date());
        v1.setProductExpense(100);
        v1.setServiceExpense(50);
        System.out.println(v1);
        System.out.println("Total "+ v1.getTotalExpense());
    }
}
