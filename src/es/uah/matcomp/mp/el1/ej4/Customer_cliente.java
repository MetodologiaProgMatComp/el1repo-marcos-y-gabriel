package es.uah.matcomp.mp.el1.ej4;

public class Customer_cliente {
    private int id;
    private String name;
    private char gender;
public Customer_cliente(int id, String name, char gender){
    this.id=id;
    this.name=name;
    this.gender=gender;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
    return " "+name+"("+id+")";
    }
}

