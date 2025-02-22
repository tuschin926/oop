package c2.Customer;

public class Invoice {
    int id;
    Customer customer;
    double amount;
    Invoice(int id,Customer customer,double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return customer.id;
    }
    public String CustomerName(){
        return customer.name;
    }
    public int getCustomerDiscount(){
        return customer.discount;
    }
    public double getAmountAfterDiscount(){
        return amount-amount*customer.discount/100;
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                '}';
    }
}
