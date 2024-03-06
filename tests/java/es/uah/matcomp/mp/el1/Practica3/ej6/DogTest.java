package es.uah.matcomp.mp.el1.Practica3.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d1 = new Dog("d");
    Dog d2 = new Dog("d");

    @Test
    void greets() {
        d1.greets();
    }

    @Test
    void testGreets() {
        d1.greets(d2);

    }

    @Test
    void testToString() {
        assertEquals(d1.toString(),"Dog[Mammal[Animal{name=d}]]");
    }
}