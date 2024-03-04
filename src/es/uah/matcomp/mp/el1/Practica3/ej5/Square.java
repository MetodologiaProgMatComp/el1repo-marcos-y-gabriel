package es.uah.matcomp.mp.el1.Practica3.ej5;

public class Square extends Rectangle{

    public Square(){}
    public Square(double side){
        super(side,side);
    }

    public Square( double side,String color, boolean filled) {
        super(color, filled, side,side);

    }
    public double getSide(){
        return super.getWidht();
    }
    public void setSide(double side){
        super.setWidht(side);
        super.setLength(side);
    }
    public void setWidht(double side){
        super.setWidht(side);
        super.setLength(side);
    }
    public void setLength(double side){
        super.setLength(side);
        super.setWidht(side);
    }
    public String toString(){
        return "Square["+ super.toString() +']';
    }
}
