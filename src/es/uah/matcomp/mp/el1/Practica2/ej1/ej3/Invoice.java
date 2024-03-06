package es.uah.matcomp.mp.el1.Practica2.ej1.ej3;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private int id;
    private Customer[] customer;
    private double amount;


    public Invoice(int id, Customer[] customer, double amount){
        this.id=id;
        this.customer=customer;
        this.amount=amount;
    }

    public int getId() {
        return id;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int[] getCustomerId(){
        int[] id = {};
        for (int i = 0; i< 2; i++){
            id[i] = customer[i].getId();
            }


        return id;

    }
    public String[] getCustomerName(){
        String[] id = {};
        for (int i=0;i< 2;i++){
            id[i] = customer[i].getName();
        }


        return id;
    }
    public  int[] getCustomerDiscount(){
        int[] id = {};
        for (int i=0;i< 2;i++){
            id[i] = customer[i].getDiscount();
        }


        return id;
    }
    public double getAmountAfterDiscount(){
        return amount-amount*customer[1].getDiscount();
    }
    public String toString(){
        return "Invoice[id="+id+",customer="+customer[1].getName()+id+customer[1].getDiscount()+amount+"]";
    }
}
