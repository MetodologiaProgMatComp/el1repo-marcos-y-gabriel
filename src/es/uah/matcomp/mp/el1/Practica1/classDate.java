package es.uah.matcomp.mp.el1.Practica1;

import java.util.Date;

public class classDate {
    private int day;
    private int month;
    private int year;

    public void Date(int x, int y, int z) {
        this.day = x;
        this.month = y;
        this.year = z;

    }

    public int getDay(){
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public void setDay(int newDay){
        day=newDay;
    }

    public void setMonth(int newMonth) {
        month=newMonth;
    }

    public void setYear(int newYear) {
        year = newYear;
    }
    public void setDate(int newDay, int newMonth, int newYear){
        day=newDay;
        month=newMonth;
        year=newYear;
    }
    public String toString(){
        return(day+"/"+month+"/"+year);
    }
}
