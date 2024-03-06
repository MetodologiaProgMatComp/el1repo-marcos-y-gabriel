package es.uah.matcomp.mp.el1.Practica3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(2);

    @Test
    void getRadius() {
        assertEquals(c1.getRadius(),1);

    }

    @Test
    void setRadius() {
        c1.setRadius(2);
        assertEquals(c1.getRadius(),2);
    }

    @Test
    void getArea() {
        assertEquals(c1.getRadius(),1);
    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Circle[Shape[color='red, filled=true], radius=1.0]");
    }
}