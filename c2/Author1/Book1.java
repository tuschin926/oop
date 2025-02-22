package c2.Author1;

import java.util.Arrays;

public class Book1 {
    private String name;
    private Author1[] author;
    private double price;
    private int qty=0;

    Book1 (String name, Author1[] author, double price){
        this.author=author;
        this.price=price;
        this.name=name;
    }
    Book1 (String name, Author1[] author, double price,int qty){
        this.author=author;
        this.price=price;
        this.qty=qty;
        this.name=name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Author1[] getAuthor() {
        return author;
    }

    protected void setAuthor(Author1[] author) {
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
    public String toString(){
        return "Book[name="+name+",author={"+ Arrays.toString(author)+"},price="+price+",qty="+qty+"]";
    }

}
