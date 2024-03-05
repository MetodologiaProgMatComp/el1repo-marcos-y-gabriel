package es.uah.matcomp.mp.el1.Practica4.ej5;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle["+super.toString()+"]";
    }
    public void resize(int percent){
        radius *= percent/100.0;
    }
}
