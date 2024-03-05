package es.uah.matcomp.mp.el1.Practica1;

public class Account {
    private String id;
    private String name;
    private Integer balance;

    public Account(String i, String n) {
        id = i;
        name = n;
        balance = 50;
    }

    public Account(String i, String n, Integer b) {
        id = i;
        name = n;
        balance = b;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer credit(Integer amount) {
        this.balance = amount + balance;
        return balance;
    }

    public Integer debit(Integer amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            return this.balance;
        } else {
            System.out.println("Amount esceeded balance");
            return balance;
        }


    }

    public Integer transferTo(Account another, Integer amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
            return balance;
        } else {
            System.out.println("Amount esceeded balance");
            return balance;
        }


    }

}
