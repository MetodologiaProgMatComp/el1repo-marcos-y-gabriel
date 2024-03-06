package es.uah.matcomp.mp.el1.Practica3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square s1 = new Square();
    Square s2 = new Square(1);
    Square s3 = new Square(1,"c",true);

    @Test
    void getSide() {
        assertEquals(s2.getSide(),1);
    }

    @Test
    void setSide() {
        s2.setSide(2);
        assertEquals(s2.getSide(),2);

    }

    @Test
    void setWidht() {
        s2.setWidht(3);
        assertEquals(s2.getWidht(),3);

    }

    @Test
    void setLength() {
        s2.setLength(2);
        assertEquals(s2.getLength(),2);
    }

    @Test
    void testToString() {
        assertEquals(s2.toString(),"Square[Rectangle{Shape[color='red, filled=true]widht=1.0, length=1.0}]");
    }
}