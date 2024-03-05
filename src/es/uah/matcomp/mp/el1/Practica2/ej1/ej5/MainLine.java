package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class MainLine {
    public static void main(String[] args) {
        MyLine linea1 = new MyLine(1,4,2,6);
        MyPoint puntoInicio = new MyPoint(1,2);
        MyPoint puntoFinal = new MyPoint(3,4);
        MyLine linea2 = new MyLine(puntoInicio,puntoFinal);
        System.out.println(linea1);
        System.out.println(linea2);
        linea1.setBeginX(0);
        linea1.setEndY(0);
        System.out.println(linea2.getLength());
        System.out.println(linea2.getGradient());
    }
}
