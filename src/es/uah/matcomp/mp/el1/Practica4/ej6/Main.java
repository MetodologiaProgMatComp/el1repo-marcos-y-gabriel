package es.uah.matcomp.mp.el1.Practica4.ej6;

public class Main {
    public static void main(String[] args) {
        Animal gatete = new Cat("Paquito");
        gatete.greets();
        Animal perrete = new Dog("El nano");
        perrete.greets();
        Dog otroPerrete = new Dog("Nanito");
        ((Dog)perrete).greets(otroPerrete);
        Dog perrote = new BigDog("Grandote");
        BigDog perrote2 = new BigDog("Guapete");
        perrote.greets();
        perrote.greets(otroPerrete);
        perrote.greets(perrote2);



    }
}
