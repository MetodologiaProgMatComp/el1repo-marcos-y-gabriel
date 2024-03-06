package es.uah.matcomp.mp.el1.Practica2.ej5;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint p1 = new MyPoint(2,4);
    MyPoint p2 = new MyPoint(6,7);

    @Test
    void getX() {
        assertEquals(p1.getX(),2);
    }

    @Test
    void setX() {
        p1.setX(4);
        assertEquals(p1.getX(),4);
    }

    @Test
    void getY() {
        assertEquals(p1.getY(),4);
    }

    @Test
    void setY() {
        p1.setY(6);
        assertEquals(p1.getY(),6);
    }

    @Test
    void setXY() {
        p1.setXY(2,2);
        int[] res = {2,2};
        int[] cont = p1.getXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void getXY() {
        int[] res = {2,4};
        int[] cont = p1.getXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void testToString() {
        assertEquals(p1.toString(),"MyPoint[x=2, y=4]");
    }

    @Test
    void distance() {
        assertEquals(p1.distance(6,7),5);
    }

    @Test
    void testDistance() {
        assertEquals(p1.distance(p2),5);
    }

    @Test
    void testDistance1() {
        MyPoint p3 = new MyPoint(4,3);
        assertEquals(p3.distance(),5);
    }
}