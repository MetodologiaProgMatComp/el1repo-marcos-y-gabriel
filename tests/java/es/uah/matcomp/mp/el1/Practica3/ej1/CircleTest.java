package es.uah.matcomp.mp.el1.Practica3.ej1;

import es.uah.matcomp.mp.el1.Practica3.ej1.ej1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(3);
    Circle c3 = new Circle(3,"re");

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
    void getColor() {
        assertEquals(c1.getColor(),"red");
    }

    @Test
    void setColor() {
        c1.setColor("azul");
        assertEquals(c1.getColor(),"azul");
    }

    @Test
    void getArea() {
        assertEquals(c1.getArea(),Math.PI);
    }

    @Test
    void getCircunference() {
        assertEquals(c1.getCircunference(),2*Math.PI);
    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Circle[radius= 1.0 color= red]");
    }
}