package es.uah.matcomp.mp.el1.Practica3.ej5;

public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){}
    double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){

        return pi*radius*radius;
    }
    public String toString(){
        return "Circle["+super.toString()+", radius="+radius+"]";
    }

}
