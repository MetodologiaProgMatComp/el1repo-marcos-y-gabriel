package es.uah.matcomp.mp.el1.Practica1;

public class TestMain {
 public static void main(String[] args) {
 // Test Constructors and toString()
 Circle c1 = new Circle();
 System.out.println(c1); // toString()
 Circle c2 = new Circle(); // default constructor
 System.out.println(c2);
 // Test setter and getter
 c1.setRadius(2.2);
 System.out.println(c1); // toString()
 System.out.println("radius is: " + c1.getRadius());
 // Test getArea() and getCircumference()
 System.out.printf("area is: %.2f%n", c1.getArea());

}}