package es.uah.matcomp.mp.el1.Practica2.ej5;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyLine;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej5.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    MyPoint p1 = new MyPoint(2,4);
    MyPoint p2 = new MyPoint(6,7);
    MyPoint p3 = new MyPoint(1,1);
    MyLine linea = new MyLine(p1,p2);

    @Test
    void getBegin() {
        assertEquals(linea.getBegin(),p1);
    }

    @Test
    void setBegin() {
        linea.setBegin(p3);
        assertEquals(linea.getBegin(),p3);

    }

    @Test
    void getEnd() {
        assertEquals(linea.getEnd(),p2);
    }

    @Test
    void setEnd() {
        linea.setEnd(p3);
        assertEquals(linea.getEnd(),p3);
    }

    @Test
    void getBeginX() {
        assertEquals(linea.getBeginX(),2);
    }

    @Test
    void setBeginX() {
        linea.setBeginX(4);
        assertEquals(linea.getBeginX(),4);
    }

    @Test
    void getBeginY() {
        assertEquals(linea.getBeginY(),4);
    }

    @Test
    void setBeginY() {
        linea.setBeginY(5);
        assertEquals(linea.getBeginY(),5);
    }

    @Test
    void getEndX() {
        assertEquals(linea.getEndX(),6);
    }

    @Test
    void setEndX() {
        linea.setEndX(5);
        assertEquals(linea.getEndX(),6);
    }

    @Test
    void getEndY() {
        assertEquals(linea.getEndY(),7);
    }

    @Test
    void setEndY() {
        linea.setEndY(9);
        assertEquals(linea.getEndY(),9);
    }

    @Test
    void getBeginXY() {
        int[] res = {2,4};
        int[] cont = linea.getBeginXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void setBeginXY() {
        linea.setBeginXY(7,8);
        int[] res = {7,8};
        int[] cont = linea.getBeginXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void getEndXY() {
        int[] res = {6,7};
        int[] cont = linea.getEndXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void setEndXY() {
        linea.setEndXY(4,5);
        int[] res = {4,5};
        int[] cont = linea.getEndXY();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void getLength() {
        assertEquals(linea.getLength(),5);
    }

    @Test
    void getGradient() {
        assertEquals(linea.getGradient(),0.6435011087932844);
    }

    @Test
    void testToString() {
        assertEquals(linea.toString(),"MyLine[begin=(2,4), end=(6,7]");
    }
}