package es.uah.matcomp.mp.el1.Practica3.ej1.ej1;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double newRadius){
        radius=newRadius;
    }
    public Circle(double radius, String color){
        this.color= color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getCircunference(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle[radius= "+radius+" color= " + color+"]";
    }
}
