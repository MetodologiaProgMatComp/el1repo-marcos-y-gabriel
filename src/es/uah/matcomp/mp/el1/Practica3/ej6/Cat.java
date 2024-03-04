package es.uah.matcomp.mp.el1.Practica3.ej6;

public class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    public String toString(){
        return "Cat["+super.toString()+"]";
    }
}
