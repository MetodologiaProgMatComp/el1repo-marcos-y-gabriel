package es.uah.matcomp.mp.el1.Practica2.ej1.ej5;

public class Main {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? MYpint another
        System.out.println(p2.distance(p1)); // which version? MyPoint another
        System.out.println(p1.distance(5, 6)); // which version? this distancia x,y dados
        System.out.println(p1.distance()); // which version? distancia desde 0,0


        MyPoint[] puntos = new MyPoint[10];
        for (int i = 0; i<10; i++){
            puntos[i]= new MyPoint(i+1,i+1);
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                double dist = puntos[i].distance(puntos[j]);
                System.out.println(dist+" \n");
            }

        }  }


}
