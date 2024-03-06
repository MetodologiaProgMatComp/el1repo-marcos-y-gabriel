package es.uah.matcomp.mp.el1.Practica4.ej2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r3 = new Rectangle(1,1);

    @Test
    void testToString() {
        assertEquals(r3.toString(),"Rectangle[ widht=1.0, length=1.0]");
    }

    @Test
    void getArea() {
        assertEquals(r3.getArea(),1);
    }

    @Test
    void getPerimeter() {
        assertEquals(r3.getPerimeter(),4);
    }
}