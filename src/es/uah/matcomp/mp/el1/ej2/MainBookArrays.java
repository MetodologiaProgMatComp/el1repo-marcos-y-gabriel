package es.uah.matcomp.mp.el1.ej2;

import es.uah.matcomp.mp.el1.ej1.Author;

public class MainBookArrays {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        // Declare and allocate a Book instance
        BookArrays javaDummy = new BookArrays("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}

