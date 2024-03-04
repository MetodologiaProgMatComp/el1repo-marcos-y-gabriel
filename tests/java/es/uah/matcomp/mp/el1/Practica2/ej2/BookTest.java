package es.uah.matcomp.mp.el1.Practica2.ej2;


import org.junit.jupiter.api.Test;

class BookTest {
    Author aux1 = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
    Author aux2 = new Author("Paul Tan", "Paul@nowhere.com", 'm');
    Author[] authors = {aux1,aux2};


    Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
    Book javaPro = new Book("Java for Dummy", authors, 19.99);

    @Test
    void getName() {
    assertEquals(javaDummy.getName(),"Java for Dummy");
    }

    @Test
    void getAuthors() {
       Author[] authors1 = javaDummy.getAuthors();

        assertEquals(authors1[0].getName(),"Tan Ah Teck");
        assertEquals(authors1[1].getName(),"Paul Tan");
    }

    @Test
    void getPrice() {
        assertEquals(javaDummy.getPrice(),19.99);

    }

    @Test
    void setPrice() {
        javaDummy.setPrice(89);
        assertEquals(javaDummy.getPrice(),89);
    }

    @Test
    void getQty() {
        assertEquals(javaDummy.getQty(),99);
    }

    @Test
    void setQty() {
        javaDummy.setQty(90);
        assertEquals(javaDummy.getQty(),90);
    }

    @Test
    void testToString() {
        assertEquals(javaDummy.toString(),"Book[name=Java for Dummy authors = " +
                "[ Author[name= Tan Ah Teck email= AhTeck@somewhere.com gender= m] " +
                "Author[name= Paul Tan email= Paul@nowhere.com gender= m]  price=19.99 qty=99]");
    }

    @Test
    void getAuthorsNames() {
        assertEquals(javaDummy.getAuthorsNames(),"Tan Ah TeckPaul Tan");
    }
}