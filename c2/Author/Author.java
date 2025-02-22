package c2.Author;

public class Author {
    private String name;
    private String email;
    private char gender;
    Author (String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    protected String getName() {
        return name;
    }

    protected String getEmail() {
        return email;
    }

    protected char getGender() {
        return gender;
    }

    public String toString(){
        return "Author[name="+name+",email="+email+",gender="+gender+"]";
    }
}
