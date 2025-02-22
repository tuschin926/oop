package c2.Author2;

public class Test {
    public static void main(String[] args) {
        Author2 a1 = new Author2("Trinh", "123abc@");
        Book2 b1 = new Book2("123", "Java", a1, 8.8, 88);
        System.out.println(b1);
    }
}
