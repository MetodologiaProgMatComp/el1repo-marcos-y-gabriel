package es.uah.matcomp.mp.el1.Practica4.ej2;



public class Main {
    public static void main(String[] args) {
        GeometricObject s1 = new Circle(5.5); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?


        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());


        GeometricObject s3 = new Rectangle(1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());//en estas tres instrucciones hay polimorfismos porque utilizan los metodos abstractos
        System.out.println(s3.getPerimeter());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());



    }
}
