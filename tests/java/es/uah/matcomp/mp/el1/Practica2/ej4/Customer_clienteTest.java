package es.uah.matcomp.mp.el1.Practica2.ej4;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej4.Customer_cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer_clienteTest {
    Customer_cliente c = new Customer_cliente(12,"po",'y');

    @Test
    void getId() {
        assertEquals(c.getId(),12);
    }

    @Test
    void getName() {
        assertEquals(c.getName(),"po");
    }

    @Test
    void getGender() {
        assertEquals(c.getGender(),'y');
    }

    @Test
    void testToString() {
        assertEquals(c.toString()," po(12)");
    }
}