package es.uah.matcomp.mp.el1.Practica1;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
Account acount1=new Account("123","pepe",500);

@org.junit.jupiter.api.Test
    void getId() {
        assertEquals(acount1.getId(),"123");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(acount1.getName(),"pepe");
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(acount1.getBalance(),"500");
    }

    @org.junit.jupiter.api.Test
    void credit() {
        assertEquals(acount1.credit(30),500);
    }

    @org.junit.jupiter.api.Test
    void debit() {
        assertEquals(acount1.debit(30),500);
    }

    @org.junit.jupiter.api.Test
    void transferTo() {
        assertEquals(transferTo(),acount1,500);
    }
}