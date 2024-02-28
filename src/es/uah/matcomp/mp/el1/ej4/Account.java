package es.uah.matcomp.mp.el1.ej4;

public class Account {
    private int id;
    private Customer_cliente customer;
    private double balance = 0.0;

    public Account(int id, Customer_cliente customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public Customer_cliente getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Customer=" + customer + (id) + ",balance=" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            ;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance");
        }
        return balance;
    }
}
