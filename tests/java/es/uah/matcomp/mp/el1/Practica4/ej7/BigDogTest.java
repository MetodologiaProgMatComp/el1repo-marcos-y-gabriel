package es.uah.matcomp.mp.el1.Practica4.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    BigDog c1 = new BigDog();
    Dog c2 = new Dog();


    @Test
    void greeting() {
        c1.greeting();
    }

    @Test
    void testGreeting() {
        c1.greeting(c2);
    }
}