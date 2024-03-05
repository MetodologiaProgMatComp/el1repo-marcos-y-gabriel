package es.uah.matcomp.mp.el1.Practica4.ej5;



public class Main {
    public static void main(String[] args) {
        GeometricObject s1 = new Circle(5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?

        Resizable s2 = new ResizableCircle(5.5); // Upcast Circle to Shape
        System.out.println(s2); // which version?
        s2.resize(34); // which version?
        System.out.println(s2); // which version?
    }
}
