package es.uah.matcomp.mp.el1.Practica4.ej2;

public class Rectangle implements GeometricObject{
    private double widht;
    private double length;

    public Rectangle(double widht, double length) {
        this.widht = widht;
        this.length = length;
    }

    public String toString() {
        return "Rectangle[ widht=" + widht + ", length=" + length +
                ']';
    }
    public double getArea(){
        return widht*length;
    }
    public double getPerimeter(){
        return 2*(widht+length);
    }

}
