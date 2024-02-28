package es.uah.matcomp.mp.el1.ejercicioclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
    @Test
    void getName() {
        assertEquals(a1.getName(),"Tan Ah Teck");

    }

    @Test
    void getEmail() {
        assertEquals(a1.getEmail(),"ahteck@nowhere.com");
    }

    @Test
    void setEmail() {
        a1.setEmail("@gmail");
        assertEquals(a1.getEmail(),"@gmail");
    }

    @Test
    void testToString() {
        assertEquals(a1.toString(),"Author[name= Tan Ah Teck email= ahteck@nowhere.com ]");
    }
}