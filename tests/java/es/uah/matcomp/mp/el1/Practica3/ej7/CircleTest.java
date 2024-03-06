package es.uah.matcomp.mp.el1.Practica3.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(3);
    Circle c3 = new Circle(1,"c");

    @Test
    void getRadius() {
        assertEquals(c3.getRadius(),1);
    }

    @Test
    void setRadius() {
        c3.setRadius(3);
        assertEquals(c3.getRadius(),3);
    }

    @Test
    void getColor() {
        assertEquals(c3.getColor(),"c");
    }

    @Test
    void setColor() {
        c3.setColor("t");
        assertEquals(c3.getColor(),"t");
    }

    @Test
    void getArea() {
        assertEquals(c3.getArea(),Math.PI);
    }

    @Test
    void getCircunference() {
        assertEquals(c3.getCircunference(),2*Math.PI);
    }

    @Test
    void testToString() {
        assertEquals(c3.toString(),"Circle[radius= 1.0 color= c]");
    }
}