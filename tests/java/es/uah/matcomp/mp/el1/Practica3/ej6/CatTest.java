package es.uah.matcomp.mp.el1.Practica3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c1 = new Cat("g");

    @Test
    void greets() {
        c1.greets();

    }

    @Test
    void testToString() {
        assertEquals(c1.toString(),"Cat[Mammal[Animal{name=g}]]");
    }
}