package es.uah.matcomp.mp.el1.ejercicioclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
    Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);

    @Test
    void getIsbn() {
        assertEquals(b1.getIsbn(),"12345");
    }

    @Test
    void getName() {
        assertEquals(b1.getName(),"Java for dummies");
    }

    @Test
    void getAuthor() {
        assertEquals(b1.getAuthor(),a1);

    }

    @Test
    void getPrice() {
        assertEquals(b1.getPrice(),8.8);
    }

    @Test
    void setPrice() {
        b1.setPrice(10);
        assertEquals(b1.getPrice(),10);
    }

    @Test
    void getQty() {
        assertEquals(b1.getQty(),88);
    }

    @Test
    void setQty() {
        b1.setQty(90);
        assertEquals(b1.getQty(),90);
    }

    @Test
    void getAuthorName() {

        assertEquals(b1.getAuthorName(),"Tan Ah Teck");
    }

    @Test
    void testToString() {
        assertEquals(b1.toString(),"Book[isbn= 12345 name=Java for dummiesAuthor[name= Tan Ah Teck email= ahteck@nowhere.com ] price=8.8 qty=88]");
    }
}