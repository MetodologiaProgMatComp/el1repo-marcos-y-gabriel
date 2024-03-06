package es.uah.matcomp.mp.el1.Practica4.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c1 = new Cat("p");


    @Test
    void greets() {
        c1.greets();
    }
}