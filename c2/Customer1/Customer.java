package c2.Customer1;

public class Customer {
    int id;
    String name;
    char gender;
    Customer(int id, String name,char gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }
    int getid(){
        return id;
    }
    String getName(){
        return name;
    }
    char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return name+"("+id+")";
    }


}
