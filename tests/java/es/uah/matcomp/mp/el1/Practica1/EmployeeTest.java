package es.uah.matcomp.mp.el1.Practica1;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
Employee em=new Employee();
    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(em.getId(),0);

    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals(em.getFirstName(),"Juan");
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals(em.getLastName(),"Alberto");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(em.getName(),"Juan Alberto");
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        assertEquals(em.getSalary(),1200);
    }

    @org.junit.jupiter.api.Test
    void setSalary() {
        em.setSalary(1200);
        assertEquals(em.getSalary(),1200);
    }


    }


