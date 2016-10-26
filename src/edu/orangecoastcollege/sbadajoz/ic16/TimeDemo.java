package edu.orangecoastcollege.sbadajoz.ic16;

public class TimeDemo {
    public static void checkEquals(Time a, Time b) {
        if(a.equals(b)) System.out.println(a + " is equal to " + b);
        else System.out.println(a + " is not equal to " + b);
    }

    public static void main(String [] args) {
        Time now = new Time(13, 6);
        Time copyOfNow = new Time(now);
        Time midnight = new Time();
        
        System.out.println(now);
        System.out.println(copyOfNow);
        System.out.println(midnight);
        
        copyOfNow.setHour(25);
        System.out.println(copyOfNow);
    }
}
