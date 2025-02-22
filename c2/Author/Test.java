package c2.Author;

public class Test {
    public static void main(String[] args) {
        Author a1=new Author("Trinh","123abc@gmail",'m');
        Book b1= new Book("Java",a1,5.5,3);

        System.out.println(a1);
        System.out.println(b1);
    }
}
