package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class Triangle {
    private MyPoint v1=new MyPoint(0,0);
    private MyPoint v2=new MyPoint(0,0);
    private MyPoint v3=new MyPoint(0,0);
    public Triangle(int x1, int y1, int x2, int y2,int x3, int y3){
        v1.setXY(x1,y1);
        v2.setXY(x2,y2);
        v3.setXY(x3,y3);
    }

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "Triangle[v1=(" +v1.getX() + ","+v1.getY()+"),v1=("
                +v2.getX() + ","+v2.getY()+"),v3=("
                +v3.getX() + ","+v3.getY()+")";
    }
    public double getPerimeter(){
        double l1 = v1.distance(v2);
        double l2 = v1.distance(v3);
        double l3 = v2.distance(v3);
        return l1+l2+l3;
    }
    public String getType() {
        double l1 = v1.distance(v2);
        double l2 = v1.distance(v3);
        double l3 = v2.distance(v3);
        String cadena = "";
        if (l1 == l2 && l3 == l2) {
            cadena = "Equelatero";
        } else if (l1 == l2 || l3 == l2) {
            cadena = "isosteles";
        } else {
            cadena = "Escaleno";
        }
        return cadena;

    }
}
