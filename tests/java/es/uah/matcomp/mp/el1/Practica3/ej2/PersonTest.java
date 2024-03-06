package es.uah.matcomp.mp.el1.Practica3.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1 = new Person("p","a");

    @Test
    void getName() {
        assertEquals(p1.getName(),"p");

    }

    @Test
    void getAddres() {
        assertEquals(p1.getAddres(),"a");
    }

    @Test
    void setAddres() {
        p1.setAddres("r");
        assertEquals(p1.getAddres(),"r");
    }

    @Test
    void testToString() {
        assertEquals(p1.toString(),"Person{name= p, addres= a}");
    }
}