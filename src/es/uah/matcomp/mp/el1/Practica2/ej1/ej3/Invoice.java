package es.uah.matcomp.mp.el1.Practica2.ej1.ej3;

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

    public void setCustomer(Customer customer) {
        this.customer = new Customer[]{customer};
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        return id;

    }
    public String getCustomerName(){
        return customer[1].getName();
    }
    public  int getCustomerDiscount(){
        return customer[1].getDiscount();

    }
    public double getAmountAfterDiscount(){
        return amount-amount*customer[1].getDiscount();
    }
    public String toString(){
        return "Invoice[id="+id+",customer="+customer[1].getName()+id+customer[1].getDiscount()+amount+"]";
    }
}
