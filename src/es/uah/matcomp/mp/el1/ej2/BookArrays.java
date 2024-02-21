package es.uah.matcomp.mp.el1.ej2;

import es.uah.matcomp.mp.el1.ej1.Author;

public class BookArrays {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public BookArrays(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookArrays(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + " authors = [" + authors.toString() + "] price=" + price + " qty="
                + qty + "]";
    }

    public getAuthorsNames() {
        String authorsString = "";
        for (int i = 0; i <= authors.length; i++) {

            authorsString += authors[i].getName();

        }
        return authorsString
    }

}
