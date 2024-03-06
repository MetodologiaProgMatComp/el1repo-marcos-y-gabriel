package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class MyCircle {
    private MyPoint center= new MyPoint(0,0);
    private int radius= 1;

    public MyCircle() {
    }

    public MyCircle(int x,int y,int radius){
        center.setXY(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }


    public String toString() {
        return "MyCircle{" +
                "center=(" + center.getX() + ","+center.getY()+"), radius=" + radius + '}';
    }
    public double getArea(){
        return 2*Math.PI*Math.pow(radius,2);
    }
    public double getCircunference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
       int y = another.getCenterY();
       int x = another.getCenterX();
        return center.distance(x,y);
    }
}
