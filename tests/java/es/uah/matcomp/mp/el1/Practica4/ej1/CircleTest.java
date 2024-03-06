package es.uah.matcomp.mp.el1.Practica4.ej1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(2);
    Circle c3 = new Circle(2,"r",true);

    @Test
    void getRadius() {
        assertEquals(c1.getRadius(),1);

    }

    @Test
    void setRadius() {
        c1.setRadius(2);
        assertEquals(c1.getRadius(),2);
    }


    @Test
    void getArea() {
        assertEquals(c1.getArea(),Math.PI);
    }
    @Test
    void getPerimeter() {
        assertEquals(c1.getPerimeter(),2*Math.PI);
    }


    @Test
    void testToString() {
        assertEquals(c1.toString(),"Circle[Shape[color='red, filled=true], radius=1.0]");
    }
}