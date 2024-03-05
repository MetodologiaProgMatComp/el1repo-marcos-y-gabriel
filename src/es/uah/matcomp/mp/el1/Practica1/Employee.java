package es.uah.matcomp.mp.el1.Practica1;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
        id = 0;
        firstName = "..";
        lastName = "..";
        salary = 1200;
    }

    public Employee(int i, String x, String y, int j) {
        this.id = i;
        this.firstName = x;
        this.lastName = y;
        this.salary = j;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int NewSalary) {
        salary = NewSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int porcentaje) {
        salary = salary + (salary * porcentaje);
        return salary;
    }

    public String toString() {
        return ("Employee[id is:" + id + "name is:" + firstName + lastName
                + "salary is:" + salary + "]");
    }
}




