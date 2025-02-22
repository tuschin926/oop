package c7.b7_1;

public class Customer {
    public  String name;
    public boolean member= false;
    public String memberType;

    public Customer(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
