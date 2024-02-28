package es.uah.matcomp.mp.el1.Practica2.ej1.ej1;

import es.uah.matcomp.mp.el1.Practica2.ej1.ej1.Author;
import es.uah.matcomp.mp.el1.Practica2.ej1.ej1.Book;

public class MainBook {
    public static void main(String[] args){
        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // es.uah.matcomp.mp.el1.ej1.Author's toString()
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99); // Test es.uah.matcomp.mp.el1.ej1.Book's Constructor
        System.out.println(dummyBook); // Test es.uah.matcomp.mp.el1.ej1.Book's toString()
// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); // es.uah.matcomp.mp.el1.ej1.Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
// Use an anonymous instance of es.uah.matcomp.mp.el1.ej1.Author to construct a es.uah.matcomp.mp.el1.ej1.Book instance
        Book anotherBook = new Book("more Java ",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook); // toString()



    }
}
