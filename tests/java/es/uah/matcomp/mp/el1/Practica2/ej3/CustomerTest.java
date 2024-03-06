package es.uah.matcomp.mp.el1.Practica2.ej3;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej3.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer p1 = new Customer(12,"P",13);
    @Test
    void getId() {
        assertEquals(p1.getId(),12);
    }

    @Test
    void getName() {
        assertEquals(p1.getName(),"P");
    }

    @Test
    void getDiscount() {
        assertEquals(p1.getDiscount(),13);
    }

    @Test
    void setDiscount() {
        p1.setDiscount(12);
        assertEquals(p1.getDiscount(),12);

    }

    @Test
    void testToString() {
        assertEquals(p1.toString(),"Name:Pid:12discount:13");
    }
}