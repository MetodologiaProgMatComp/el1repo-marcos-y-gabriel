package es.uah.matcomp.mp.el1.Practica4.ej4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
MovablePoint p1 = new MovablePoint(0,0,1,1);

    @Test
    void testToString() {
        assertEquals(p1.toString(),"(0,0) speed=(1,1)");
    }

    @Test
    void moveUp() {
        p1.moveUp();
    }

    @Test
    void moveDown() {
        p1.moveDown();
    }

    @Test
    void moveLeft() {
        p1.moveLeft();
    }

    @Test
    void moveRight() {
        p1.moveRight();
    }
}