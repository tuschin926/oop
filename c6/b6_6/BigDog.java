package c6.b6_6;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
        this.name=name;
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooooooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooooooooooooooooooow");
    }
}
