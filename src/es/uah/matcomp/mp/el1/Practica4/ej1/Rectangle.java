package es.uah.matcomp.mp.el1.Practica4.ej1;

public class Rectangle extends Shape {
    protected double widht = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double widht, double length) {
        this.widht = widht;
        this.length = length;
    }

    public Rectangle(double widht, double length,String color, boolean filled) {
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

    @Override
    public double getArea(){
        return widht*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+widht);
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString()+
                "widht=" + widht + ", length=" + length +'}';
    }
}
