package c7.b7_1;

import java.util.Date;

public class Visit {
    public Customer customer;
    public Date date;
    public double serviceExpense;
    public double productExpense;

    public Visit(Customer customer, Date date){
        this.customer= customer;
        this.date=date;
    }
    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        double serviceDiscount = customer.isMember() ? DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0;
        double productDiscount = customer.isMember() ? DiscountRate.getProductDiscountRate(customer.getMemberType()) : 0;
        return (serviceExpense * (1 - serviceDiscount)) + (productExpense * (1 - productDiscount));
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
