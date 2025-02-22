package c2.Customer1;

public class Account {
    int id;
    Customer customer;
    double balance=0.0;
    Account (int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance= balance;
    }
    Account (int id, Customer customer){
        this.id=id;
        this.customer=customer;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected Customer getCustomer() {
        return customer;
    }

    protected void setCustomer(Customer customer) {
        this.customer = customer;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString()+"   balance=$"+balance;
    }
    protected String getCustomerName(){
        return customer.name;
    }
    protected Account desposit(double amount){
        balance+=amount;
        return this;
    }
    protected Account withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Amount withdrawn exceeds the current balance!!");
        }
        return this;
    }


}
