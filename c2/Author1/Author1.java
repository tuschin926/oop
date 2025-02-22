package c2.Author1;

public class Author1 {
    protected String name;
    protected String email;
    protected char gender;

    Author1(String name, String email, char gender){
        this.email=email;
        this.gender=gender;
        this.name=name;
    }

    protected  String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected char getGender() {
        return gender;
    }

    protected void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return "Author[name="+name+",email="+email+",gender="+gender+"]";
    }

}
