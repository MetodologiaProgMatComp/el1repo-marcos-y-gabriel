package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1,2,3,4,5,6);
        MyPoint p1 = new MyPoint(2,4);
        MyPoint p2 = new MyPoint(6,9);
        MyPoint p3 = new MyPoint(90,34);
        Triangle t2 = new Triangle(p1,p2,p3);
        System.out.println(t2);
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());

    }
}
