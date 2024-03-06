package es.uah.matcomp.mp.el1.Practica3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    Mammal m1 = new Mammal("m");
    @Test
    void testToString() {
        assertEquals(m1.toString(),"Mammal[Animal{name=m}]");
    }

}