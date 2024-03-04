package es.uah.matcomp.mp.el1.Practica2.ej1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro = new Book("gato con botas", autor1 , 145);
        assertEquals(libro.getName(), "gato con botas");
    }

    @Test
    void getAuthor() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145);
        String author = String.valueOf(libro1.getAuthor());
        assertEquals(author,"Author[name= Juan email= juan@email gender= m]");
    }

    @Test
    void getPrice() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145);
        assertEquals(libro1.getPrice(),145);
    }

    @Test
    void setPrice() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145);
        libro1.setPrice(30);
        assertEquals(libro1.getPrice(),30);
    }

    @Test
    void getQty() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        assertEquals(libro1.getQty(),89);
    }

    @Test
    void setQty() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        libro1.setQty(36);
        assertEquals(libro1.getQty(),36);

    }

    @Test
    void testToString() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        assertEquals(libro1.toString(),"Book[name=gato con botasAuthor[name= " +
                "Juan email= juan@email gender= m] price=145.0 qty=89]");
    }

    @Test
    void getAuthorName() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        assertEquals(libro1.getAuthorName(),"Juan");

    }

    @Test
    void getAuthorEmail() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        assertEquals(libro1.getAuthorEmail(),"juan@email");

    }

    @Test
    void getAuthorGender() {
        Author autor1=new Author("Juan", "juan@email", 'm');
        Book libro1 = new Book("gato con botas", autor1 , 145,89);
        assertEquals(libro1.getAuthorGender(),'m');

    }
}