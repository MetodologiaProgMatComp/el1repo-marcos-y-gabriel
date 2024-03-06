package es.uah.matcomp.mp.el1.Practica3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal a1 = new Animal("e");

    @Test
    void testToString() {
        assertEquals(a1.toString(),"Animal{name=e}");
    }
}