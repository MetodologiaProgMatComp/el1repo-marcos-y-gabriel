package es.uah.matcomp.mp.el1.Practica3.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(1);
    Circle s1 = new Circle(1,"c");
    Cylinder c3 = new Cylinder(s1,1);

    @Test
    void getHeight() {
        assertEquals(c3.getHeight(),1);
    }

    @Test
    void getVolume() {
        assertEquals(c3.getVolume(),4*Math.PI);
    }

    @Test
    void testToString() {
        assertEquals(c3.toString(),"Cylinder Circle[radius= 1.0 color=c] height=1.0");
    }
}