package es.uah.matcomp.mp.el1.Practica3.ej7;



public class Cylinder{ // Save as "Cylinder.java"
    private Circle base; // private variable
    private double height;
    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(Circle base, double height) {
        this.base = base; // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getCircunference()*(base.getRadius()+height);
    }


public String toString() { // in Cylinder class
    return "Cylinder Circle[radius= "+base.getRadius()+" color="+ base.getColor()+"]"+// use Circle's toString()
            " height=" + height;
}}