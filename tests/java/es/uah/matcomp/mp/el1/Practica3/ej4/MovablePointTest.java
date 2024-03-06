package es.uah.matcomp.mp.el1.Practica3.ej4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint m1 = new MovablePoint();
    MovablePoint m2 = new MovablePoint(1,1,1,1);
    MovablePoint m3 = new MovablePoint(1,1);


    @Test
    void getxSpeed() {
        assertEquals(m2.getxSpeed(),1);
    }

    @Test
    void setxSpeed() {
        m2.setxSpeed(2);
        assertEquals(m2.getxSpeed(),2);

    }

    @Test
    void getySpeed() {
        assertEquals(m2.getySpeed(),1);
    }

    @Test
    void setySpeed() {
        m2.setySpeed(2);
        assertEquals(m2.getySpeed(),2);
    }

    @Test
    void setSpeed() {
        m2.setSpeed(2,2);
        float[] res = {2,2};
        float[] pro = m2.getSpeed();
        for (int i = 1;i<3;i++){
            assertEquals(pro[i-1],res[i-1]);
        }
    }

    @Test
    void getSpeed() {
        float[] res = {1,1};
        float[] pro = m2.getSpeed();
        for (int i = 1;i<3;i++){
            assertEquals(pro[i-1],res[i-1]);
        }
    }

    @Test
    void testToString() {
        assertEquals(m2.toString(),"(1.0,1.0),speed=(1.0,1.0)");
    }

    @Test
    void move() {
        m2.move();
        MovablePoint m1 = new MovablePoint(1,1,1,1);
        assertEquals(m2.toString(),m1.toString());
    }
}