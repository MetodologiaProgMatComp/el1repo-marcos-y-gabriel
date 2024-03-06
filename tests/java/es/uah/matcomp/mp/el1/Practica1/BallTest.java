package es.uah.matcomp.mp.el1.Practica1;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    Ball bola = new Ball(3, 4, 5, 3, 8);

    @org.junit.jupiter.api.Test
    void getX() {
        assertEquals(bola.getX(), 3);
    }

    @org.junit.jupiter.api.Test
    void setX() {
        bola.setX(3);
        assertEquals(bola.getX(), 3);
    }

    @org.junit.jupiter.api.Test
    void getY() {
        assertEquals(bola.getY(), 4);
    }

    @org.junit.jupiter.api.Test
    void setY() {
        bola.setY(4);
        assertEquals(bola.getY(), 4);
    }

    @org.junit.jupiter.api.Test
    void getRadius() {
        assertEquals(bola.getRadius(), 5);
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        bola.setRadius(5);
        assertEquals(bola.getRadius(), 5);
    }

    @org.junit.jupiter.api.Test
    void getxDelta() {
        assertEquals(bola.getxDelta(), 3);
    }

    @org.junit.jupiter.api.Test
    void setxDelta() {
        bola.setxDelta(3);
        assertEquals(bola.getxDelta(), 3);
    }

    @org.junit.jupiter.api.Test
    void getyDelta() {
        assertEquals(bola.getyDelta(), 8);
    }

    @org.junit.jupiter.api.Test
    void setyDelta() {
        bola.setyDelta(8);
        assertEquals(bola.getyDelta(), 8);
    }

    @org.junit.jupiter.api.Test
    void move() {
        bola.setyDelta(8);
        bola.setX(3);
        bola.setY(4);
        bola.setxDelta(3);
        bola.setRadius(5);
        bola.move();
    }

    @org.junit.jupiter.api.Test
    void reflectHorizontal() {
        bola.setxDelta(3);
        bola.setyDelta(8);
    }
}