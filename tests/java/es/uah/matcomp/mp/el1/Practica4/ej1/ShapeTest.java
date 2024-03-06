package es.uah.matcomp.mp.el1.Practica4.ej1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {
    Shape s2 = new Square(1,"c",true);
    Shape s1 = new Square();




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
        assertEquals(s2.toString(),"Square[Rectangle{Shape[color='c, filled=true]widht=1.0, length=1.0}]");
    }
}