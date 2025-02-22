package c2.Customer;

public class Customer {
    int id;
    String name;
    int discount;
    Customer (int id, String name, int discount){
        this.discount=discount;
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString(){
        return name+"("+id+")("+discount+"%)";
    }


}
