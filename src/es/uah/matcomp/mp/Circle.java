package programacion;

public class Circle {
private double radius;
public Circle() {
    radius = 1.0;
}
public void Circle( double newRadius){
    radius=newRadius;
}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
    return Math.PI*Math.pow(radius,2);
    }
    public double getCircunference(){
    return 2*radius*Math.PI;
    }
    public String toString(){
    return "programacion.Circle[radius="+radius+"]";
    }
}




