package es.uah.matcomp.mp.el1.Practica3.ej5;

public class Rectangle extends Shape{
    private double widht = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double widht, double length) {
        this.widht = widht;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double widht, double length) {
        super(color, filled);
        this.widht = widht;
        this.length = length;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return widht*length;
    }
    public double getPerimeter(){
        return 2*(length+widht);
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString()+
                "widht=" + widht + ", length=" + length +'}';
    }
}
