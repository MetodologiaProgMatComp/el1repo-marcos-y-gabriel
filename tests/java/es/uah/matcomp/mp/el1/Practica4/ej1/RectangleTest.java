package es.uah.matcomp.mp.el1.Practica4.ej1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(1,2);

    Rectangle r3 = new Rectangle(1,1,"c",true);



    @Test
    void getWidht() {
        assertEquals(r3.getWidht(),1);
    }

    @Test
    void setWidht() {
        r3.setWidht(3);
        assertEquals(r3.getWidht(),3);
    }

    @Test
    void getLength() {
        assertEquals(r3.getLength(),1);
    }

    @Test
    void setLength() {
        r3.setLength(3);
        assertEquals(r3.getLength(),3);
    }

    @Test
    void getArea() {
        assertEquals(r3.getArea(),1);
    }

    @Test
    void getPerimeter() {
        assertEquals(r3.getPerimeter(),4);
    }

    @Test
    void testToString() {
        assertEquals(r3.toString(),"Rectangle{Shape[color='c, filled=true]widht=1.0, length=1.0}");
    }
}