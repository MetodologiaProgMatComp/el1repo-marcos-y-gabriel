package es.uah.matcomp.mp.el1.Practica3.ej1;

import es.uah.matcomp.mp.el1.Practica3.ej1.ej1.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(3);
    Cylinder c3 = new Cylinder(1,3);

    @Test
    void getHeight() {
        assertEquals(c1.getHeight(),1);
    }

    @Test
    void getVolume() {
        assertEquals(c1.getVolume(),Math.PI*1);
    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Cylinder: subclass of Circle[radius= 1.0 color= red] height=1.0");
    }
}