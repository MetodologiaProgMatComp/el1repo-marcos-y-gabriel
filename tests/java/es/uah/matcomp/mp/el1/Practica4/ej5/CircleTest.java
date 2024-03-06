package es.uah.matcomp.mp.el1.Practica4.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle(1);

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Circle[radius=1.0]");
    }

    @Test
    void getArea() {
        assertEquals(c1.getArea(),Math.PI);
    }

    @Test
    void getPerimeter() {
        assertEquals(c1.getPerimeter(),2*Math.PI);
    }
}