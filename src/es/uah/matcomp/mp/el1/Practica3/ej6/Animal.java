package es.uah.matcomp.mp.el1.Practica3.ej6;

public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name  + '}';
    }

}