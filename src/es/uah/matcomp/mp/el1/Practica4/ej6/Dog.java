package es.uah.matcomp.mp.el1.Practica4.ej6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }
}