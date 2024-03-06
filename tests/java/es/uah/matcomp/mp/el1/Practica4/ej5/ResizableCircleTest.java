package es.uah.matcomp.mp.el1.Practica4.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {
    ResizableCircle c1 = new ResizableCircle(1);

    @Test
    void testToString() {
        assertEquals(c1.toString(),"ResizableCircle[Circle[radius=1.0]]");
    }

    @Test
    void resize() {
        c1.resize(50);
        assertEquals(c1.toString(),"ResizableCircle[Circle[radius=0.5]]");
    }
}