package es.uah.matcomp.mp.el1.ej1;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    Author autor1=new Author("Juan", "juan@email", 'm');
    @org.junit.jupiter.api.Test
    void getName() {

       assertEquals(autor1.getName(),"Juan");
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(autor1.getEmail(), "juan@email");
    }

    @org.junit.jupiter.api.Test
    void setEmail() {
        autor1.setEmail("juan@hotmail");
        assertEquals(autor1.getEmail(),"juan@hotmail");
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        assertEquals(autor1.getGender(),'m');
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(autor1.toString(),"Author[name= Juan email= juan@email gender= m]");
    }
}