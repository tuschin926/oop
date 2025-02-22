package c6.b6_6;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
        this.name=name;
    }
    public void greets(){
        System.out.println("Meow");
    }
}
