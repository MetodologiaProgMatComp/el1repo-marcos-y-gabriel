package es.uah.matcomp.mp.el1.Practica1;

public class testdate  {
    public static void main(String[] args) {
        // Test constructor and toString()
        classDate d1 = new classDate();
        System.out.println(d1); // toString()
        // Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1); // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());
        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1); // toString()
    }
}

