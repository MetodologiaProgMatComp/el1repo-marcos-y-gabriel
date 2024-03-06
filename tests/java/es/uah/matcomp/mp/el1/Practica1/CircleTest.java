package es.uah.matcomp.mp.el1.Practica1;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
Circle c=new Circle();
    @org.junit.jupiter.api.Test
    void getRadius() {
        assertEquals(c.getRadius(),1.0);

    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        c.setRadius(1.0);
        assertEquals(c.getRadius(),1.0);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        assertEquals(c.getArea(),Math.PI*Math.pow(1.0,2));

    }

    @org.junit.jupiter.api.Test
    void getCircunference() {
        assertEquals(c.getCircunference(),Math.PI*2*1.0);
    }
}