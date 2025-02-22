package c1.Employee;

public class Test {
    public static void main(String[] args) {
        Employee e1= new Employee( 23,"Trinh","Tu",2500);
        System.out.println(e1);

        e1.setSalary(999);
        System.out.println(e1);
        System.out.println("tong tien luong: "+e1.AnnualSalary());

        System.out.println("tang luong: "+e1.raiseSalary(10));

    }
}
