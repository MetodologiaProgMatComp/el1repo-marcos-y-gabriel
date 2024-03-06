package es.uah.matcomp.mp.el1.Practica4.ej7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal c1 = new Dog();

    @Test
    void greeting() {
        c1.greeting();
    }
}