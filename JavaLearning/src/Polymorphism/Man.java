package Polymorphism;

public class Man extends Person{
    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("Man eat");
    }

    public void walk() {
        System.out.println("Man walk");
    }

    public void earnMoney(){
        System.out.println("Man Earn Money");
    }
}
