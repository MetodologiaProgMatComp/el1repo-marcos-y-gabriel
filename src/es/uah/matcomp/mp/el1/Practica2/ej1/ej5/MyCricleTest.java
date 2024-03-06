package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class MyCricleTest {
    public static void main(String[] args) {
        MyCircle linea1 = new MyCircle(1,4,2);
        MyCircle puntoInicio = new MyCircle();
        MyPoint p1 = new MyPoint();
        p1.setX(8);
        p1.setY(6);
        MyCircle otro = new MyCircle(p1,3);


        System.out.println(linea1);
        linea1.setCenterX(0);
        linea1.setCenterY(0);
        System.out.println(linea1.distance(puntoInicio));
        System.out.println(linea1.getArea());
        System.out.println(linea1.getCircunference());
    }
}
