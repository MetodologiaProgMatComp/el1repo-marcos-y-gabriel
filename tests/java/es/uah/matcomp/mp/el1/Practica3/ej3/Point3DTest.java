package es.uah.matcomp.mp.el1.Practica3.ej3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D s1 = new Point3D(1,1,1);

    @Test
    void getZ() {
        assertEquals(s1.getZ(),1);
    }

    @Test
    void setZ() {
        s1.setZ(2);
        assertEquals(s1.getZ(),2);

    }

    @Test
    void setXYZ() {
        s1.setXYZ(0,0,0);
        float[] res = {0,0,0};
        float[] pro = s1.getXYZ();
        for(int i = 1;i<4;i++) {
            assertEquals(pro[i - 1], res[i - 1]);
        }
    }

    @Test
    void getXYZ() {
        float[] res = {1,1,1};
        float[] pro = s1.getXYZ();
        for(int i = 1;i<4;i++) {
            assertEquals(pro[i - 1], res[i - 1]);
        }
    }

    @Test
    void testToString() {
        assertEquals(s1.toString(),"(1.0,1.0,1.0)");
    }
}