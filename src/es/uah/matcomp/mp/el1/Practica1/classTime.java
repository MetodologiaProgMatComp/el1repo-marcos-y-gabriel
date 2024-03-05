package es.uah.matcomp.mp.el1.Practica1;
public class classTime {

    private int hour;
    private int minute;
    private int second;

    public  void Time(int x, int y, int z) {
        hour = x;
        minute = y;
        second = z;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int newHour) {
        this.hour = newHour;

    }

    public void setMinute(int newminute) {
        this.minute = newminute;
    }

    public void setSecond(int newsecond) {
        this.second = newsecond;
    }

    public void setTime(int newhour, int newminute, int newsecond) {
        hour = newhour;
        minute = newminute;
        second = newsecond;
    }

    public String toString() {
        return (hour + ":" + minute + ":" + second);
    }

    public int nextSecond() {
        return  second+1;
    }
    public int previusSecond(){
        return second+1;
    }
}



