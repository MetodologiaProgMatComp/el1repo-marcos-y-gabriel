package es.uah.matcomp.mp.el1.Practica3.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape s1 = new Shape();
    Shape s2 = new Shape("c",true);



    @Test
    void getColor() {
        assertEquals(s2.getColor(),"c");
    }

    @Test
    void setColor() {
        s2.setColor("E");
        assertEquals(s2.getColor(),"E");

    }

    @Test
    void isFilled() {
        assertEquals(s2.isFilled(),true);
    }

    @Test
    void setFilled() {
        s2.setFilled(false);
        assertEquals(s2.isFilled(),false);

    }

    @Test
    void testToString() {
        assertEquals(s2.toString(),"Shape[color='c, filled=true]");
    }
}