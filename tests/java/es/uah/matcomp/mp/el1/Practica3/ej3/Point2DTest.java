package es.uah.matcomp.mp.el1.Practica3.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D p1 = new Point2D(1,1);

    @Test
    void getX() {
        assertEquals(p1.getX(),1);
    }

    @Test
    void setX() {
        p1.setX(3);
        assertEquals(p1.getX(),3);
    }

    @Test
    void getY() {
        assertEquals(p1.getY(),1);
    }

    @Test
    void setY() {
        p1.setY(2);
        assertEquals(p1.getY(),2);
    }

    @Test
    void setXY() {
        p1.setXY(3,4);
        float[] res = {3,4};
        float[] pro = p1.getXY();
        for(int i = 1;i<3;i++) {
            assertEquals(pro[i - 1], res[i - 1]);
        }
    }

    @Test
    void getXY() {
        float[] res = {1,1};
        float[] pro = p1.getXY();
        for(int i = 1;i<3;i++) {
            assertEquals(pro[i - 1], res[i - 1]);
        }

    }

    @Test
    void testToString() {
        assertEquals(p1.toString(),"(1.0,1.0)");
    }
}