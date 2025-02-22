package c2.Author2;

public class Book2 {
    protected String isbn;
    protected String name;
    protected Author2 author;
    protected double price;
    protected int qty=0;

    Book2(String isbn, String name, Author2 author, double price){
        this.author=author;
        this.name=name;
        this.isbn=isbn;
        this.price=price;
    }
    Book2(String isbn, String name, Author2 author, double price, int qty){
        this.author=author;
        this.name=name;
        this.isbn=isbn;
        this.price=price;
        this.qty=qty;
    }

    protected String getIsbn() {
        return isbn;
    }

    protected void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Author2 getAuthor() {
        return author;
    }

    protected void setAuthor(Author2 author) {
        this.author = author;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getQty() {
        return qty;
    }

    protected void setQty(int qty) {
        this.qty = qty;
    }
    protected String getAuthorName(){
        return  author.name;
    }

    @Override
    public String toString() {
        return "Book[" +
                "isbn=" + isbn +
                ", name=" + name +
                ", Author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
