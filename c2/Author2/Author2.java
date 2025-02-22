package c2.Author2;

public class Author2 {
    protected String name;
    protected String email;
    Author2(String name, String email){
        this.name=name;
        this.email=email;
    }

    protected String getName() {
        return name;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name +
                ", email='" + email +
                ']';
    }
}
