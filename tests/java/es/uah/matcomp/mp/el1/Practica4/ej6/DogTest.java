package es.uah.matcomp.mp.el1.Practica4.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog c1 = new Dog("e");
    Dog c2 = new Dog("t");

    @Test
    void greets() {
        c1.greets();
    }

    @Test
    void testGreets() {
        c1.greets(c2);
    }
}