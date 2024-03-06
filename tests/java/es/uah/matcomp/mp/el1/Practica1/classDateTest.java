package es.uah.matcomp.mp.el1.Practica1;

import org.junit.Assert;
import org.junit.Test
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class classDateTest {
    Date fecha=new Date(12,2,2011);
    @org.junit.jupiter.api.Test
    void getDay() {
        Assert.assertEquals(fecha.getDay(),12);
    }

    @org.junit.jupiter.api.Test
    void getMonth() {
        assertEquals(fecha.getMonth(),2);

    }
    @org.junit.jupiter.api.Test
    void getYear() {
        assertEquals(fecha.getYear(),2011);
    }

    @org.junit.jupiter.api.Test
    void setDay() {
        fecha.setDate(12);
        assertEquals(fecha.getDay(),12);
    }

    @org.junit.jupiter.api.Test
    void setMonth() {
        fecha.setMonth(2);
        assertEquals(fecha.getMonth(),2);
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        fecha.setYear(12);
        assertEquals(fecha.getYear(),2011);
    }

    @org.junit.jupiter.api.Test
    void setDate() {
        fecha.setDate(12);
        assertEquals(fecha.getDay(),12);
        fecha.setMonth(2);
        assertEquals(fecha.getMonth(),2);
        fecha.setYear(12);
        assertEquals(fecha.getYear(),2011);
    }
}