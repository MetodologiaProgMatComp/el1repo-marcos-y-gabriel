package es.uah.matcomp.mp.el1.Practica4.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    BigDog c1 = new BigDog("e");
    Dog c2 = new Dog("t");
    BigDog c3 = new BigDog("w");

    @Test
    void greets() {
        c1.greets();
    }

    @Test
    void testGreets() {
        c1.greets(c2);
    }

    @Test
    void testGreets1() {
        c1.greets(c3);
    }
}