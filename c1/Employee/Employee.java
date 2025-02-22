package c1.Employee;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String lastName, String firstName, int salary) {
        this.id=id;
        this.lastName=lastName;
        this.firstName=firstName;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public  int AnnualSalary(){
        return salary*12;
    }
    public int raiseSalary (int percent){
        return (salary*percent/100)+salary;
    }
    @Override
    public String toString(){
        return "Employee[ id="+id+", name="+ firstName+" "+lastName+" ,salary="+salary+"]";
    }


}
