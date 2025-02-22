package c2.Author;

public class Book {
   private String name;
    private Author author;
    private double price;
    private int qty=0;
    Book (String name, Author author, double price ){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book (String name, Author author, double price , int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Author getAuthor() {
        return author;
    }

    protected void setAuthor(Author author) {
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
    @Override
    public String toString(){
        return "Book[name="+name+","+author.toString()+",price="+price+",qty="+qty+"]";
    }
}
