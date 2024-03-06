package es.uah.matcomp.mp.el1.Practica2.ej3;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej3.Customer;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej3.Invoice;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Customer p1 = new Customer(12,"P",13);
    Customer p2 = new Customer(13,"o",14);
    Customer p3 = new Customer(14,"t",15);
    Customer[] c1 = {p1,p2};
    Invoice x1 = new Invoice(32,c1,23);

    @Test
    void getId() {
        assertEquals(x1.getId(),32);
    }

    @Test
    void getCustomer() {
        Customer[] res = {p1,p2};
        Customer[] cont = x1.getCustomer();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i]);
        }
    }

    @Test
    void setCustomer() {
        Customer[] x2 = {p2,p3};
        x1.setCustomer(x2);
        assertEquals(x1.getCustomer(),x2);
    }

    @Test
    void getAmount() {
        assertEquals(x1.getAmount(),23);
    }

    @Test
    void setAmount() {
        x1.setAmount(24);
        assertEquals(x1.getAmount(),24);
    }

    @Test
    void getCustomerId() {
        Customer[] res = {p1,p2};
        int[]cont = x1.getCustomerId();

        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i].getId());
        }
    }

    @Test
    void getCustomerName() {
        Customer[] res = {p1,p2};
        String[] cont = x1.getCustomerName();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i].getName());
        }
    }

    @Test
    void getCustomerDiscount() {
        Customer[] res = {p1,p2};
        int[] cont = x1.getCustomerDiscount();
        for (int i=0;i<2 ;i++){
            assertEquals(cont[i],res[i].getDiscount());
        }
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(x1.getAmountAfterDiscount(),-299.0);
    }

    @Test
    void testToString() {
        assertEquals(x1.toString(),"Invoice[id=32,customer=o321423.0]");
    }
}