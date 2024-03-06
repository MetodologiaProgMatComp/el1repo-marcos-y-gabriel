package es.uah.matcomp.mp.el1.Practica2.ej5;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyCircle;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyPoint p1 = new MyPoint(2,4);
    MyCircle c1 = new MyCircle(p1,5);
    MyPoint p2 = new MyPoint(6,7);
    MyCircle c2 = new MyCircle(p2,5);

    @Test
    void getCenter() {
        assertEquals(c1.getCenter(),p1);
    }

    @Test
    void setCenter() {
        c1.setCenter(p2);
        assertEquals(c1.getCenter(),p2);

    }

    @Test
    void getRadius() {
        assertEquals(c1.getRadius(),5);
    }

    @Test
    void setRadius() {
        c1.setRadius(7);
        assertEquals(c1.getRadius(),7);
    }

    @Test
    void getCenterX() {
        assertEquals(c1.getCenterX(),2);
    }

    @Test
    void setCenterX() {
        c1.setCenterX(7);
        assertEquals(c1.getCenterX(),7);
    }

    @Test
    void getCenterY() {
        assertEquals(c1.getCenterY(),p1.getY());
    }

    @Test
    void setCenterY() {
        c1.setCenterY(8);
        assertEquals(c1.getCenterY(),8);
    }

    @Test
    void getCenterXY() {
        int[] res = {2,4};
        int[] cont = c1.getCenterXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void setCenterXY() {
        c1.setCenterXY(2,1);
        int[] res = {2,1};
        int[] cont = c1.getCenterXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"MyCircle{center=(2,4), radius=5}");
    }

    @Test
    void getArea() {
        assertEquals(c1.getArea(),157.07963267948966);
    }

    @Test
    void getCircunference() {
        assertEquals(c1.getCircunference(),31.41592653589793);
    }

    @Test
    void distance() {
        assertEquals(c1.distance(c2),5);
    }
}