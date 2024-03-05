package es.uah.matcomp.mp.el1.Practica4.ej3;

public class Main {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(2,4,5,5);
        System.out.println(p1.toString());
        p1.moveUp();
        System.out.println(p1.toString());
        p1.moveDown();
        System.out.println(p1.toString());
        p1.moveLeft();
        System.out.println(p1.toString());
        p1.moveRight();
        System.out.println(p1.toString());
    }
}
