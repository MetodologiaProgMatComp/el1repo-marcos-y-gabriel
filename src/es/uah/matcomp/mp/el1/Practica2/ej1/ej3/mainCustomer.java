package es.uah.matcomp.mp.el1.Practica2.ej1.ej3;

public class mainCustomer {
    public static void main(String[] args){
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());
    }
}
