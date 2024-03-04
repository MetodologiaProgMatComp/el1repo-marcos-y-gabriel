package es.uah.matcomp.mp.el1.Practica3.ej6;

public class Main {
    public static void main(String[] args) {
        Cat paco = new Cat("Paquito");
        paco.greets();
        System.out.println(paco);
        Dog nano = new Dog("nano");
        nano.greets();
        nano.greets(nano);
        System.out.println(nano);
    }
}
