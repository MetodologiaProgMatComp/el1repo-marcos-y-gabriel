package es.uah.matcomp.mp.el1.Practica3.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1 = new Student("n","a","p",1,1);

    @Test
    void getProgram() {
        assertEquals(s1.getProgram(),"p");
    }

    @Test
    void setProgram() {
        s1.setProgram("z");
        assertEquals(s1.getProgram(),"z");
    }

    @Test
    void getYear() {
        assertEquals(s1.getYear(),1);
    }

    @Test
    void setYear() {
        s1.setYear(2);
        assertEquals(s1.getYear(),2);
    }

    @Test
    void getFee() {
        assertEquals(s1.getFee(),1);
    }

    @Test
    void setFee() {
        s1.setFee(3);
        assertEquals(s1.getFee(),3);
    }

    @Test
    void testToString() {
        assertEquals(s1.toString(),"Student{Person{name= n, addres= a},program='p,year=1,fee=1.0}");
    }
}