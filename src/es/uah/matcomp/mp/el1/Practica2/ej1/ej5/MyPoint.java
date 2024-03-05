package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class MyPoint {
    private int x= 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void  setXY(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int[] getXY(){
        int[] XY = {x,y};
        return  XY;}

    public String toString() {
        return "MyPoint]x=" + x +", y=" + y + ']';
    }
    public double distance(int x, int y){
        double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
        return dist;
    }
    public double distance(MyPoint another){
        double dist = Math.sqrt(Math.pow(another.getX()-x,2)+Math.pow(another.getY()-y,2));
        return dist;
    }
    public double distance(){
        double dist = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return dist;
    }


}
