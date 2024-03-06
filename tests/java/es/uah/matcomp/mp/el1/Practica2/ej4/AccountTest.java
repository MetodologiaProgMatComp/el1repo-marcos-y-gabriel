package es.uah.matcomp.mp.el1.Practica2.ej4;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej4.Account;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej4.Customer_cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer_cliente c = new Customer_cliente(12,"po",'y');
    Account t2 = new Account(134,c,678);

    @Test
    void getId() {
        assertEquals(t2.getId(),134);
    }

    @Test
    void getCustomer() {
        assertEquals(t2.getCustomer(),c);
    }

    @Test
    void getBalance() {
        assertEquals(t2.getBalance(),678);
    }

    @Test
    void setBalance() {
        t2.setBalance(909);
        assertEquals(t2.getBalance(),909);
    }

    @Test
    void testToString() {
        assertEquals(t2.toString(),"Customer= po(12)134,balance=678.0");
    }

    @Test
    void getCustomerName() {
        assertEquals(t2.getCustomerName(),"po");
    }

    @Test
    void deposit() {
        assertEquals(t2.deposit(1),679);
    }

    @Test
    void withdraw() {
        assertEquals(t2.withdraw(1),677);
    }
}