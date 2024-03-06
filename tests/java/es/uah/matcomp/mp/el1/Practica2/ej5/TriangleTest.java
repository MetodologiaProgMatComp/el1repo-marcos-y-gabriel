package es.uah.matcomp.mp.el1.Practica2.ej5;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyPoint;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    MyPoint p1 = new MyPoint(2,4);
    MyPoint p2 = new MyPoint(6,7);
    MyPoint p3 = new MyPoint(1,1);
    Triangle t1 = new Triangle(p1,p2,p3);

    @Test
    void testToString() {
        assertEquals(t1.toString(),"Triangle[v1=(2,4),v1=(6,7),v3=(1,1)");
    }

    @Test
    void getPerimeter() {
        assertEquals(t1.getPerimeter(),15.972527336075034);
    }

    @Test
    void getType() {
        assertEquals(t1.getType(),"Escaleno");
    }
}