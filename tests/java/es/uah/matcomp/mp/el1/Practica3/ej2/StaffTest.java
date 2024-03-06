package es.uah.matcomp.mp.el1.Practica3.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {
    Staff s1 = new Staff("n","a","s",2);

    @Test
    void getSchool() {
        assertEquals(s1.getSchool(),"s");
    }

    @Test
    void setSchool() {
        s1.setSchool("e");
        assertEquals(s1.getSchool(),"e");
    }

    @Test
    void getPay() {
        assertEquals(s1.getPay(),2);
    }

    @Test
    void setPay() {
        s1.setPay(3);
        assertEquals(s1.getPay(),3);
    }

    @Test
    void testToString() {
        assertEquals(s1.toString(),"Staff{Person{name= n, addres= a},school='s,pay=2.0}");
    }
}