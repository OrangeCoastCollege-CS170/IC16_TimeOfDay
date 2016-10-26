package edu.orangecoastcollege.sbadajoz.ic16;

public class TimeDemo {
    public static void checkEquals(Time a, Time b) {
        if(a.equals(b)) System.out.println(a + " is equal to " + b);
        else System.out.println(a + " is not equal to " + b);
    }

    public static void main(String [] args) {
        Time a = new Time();
        Time b = new Time(a);
        Time c = new Time(5, 3);

        checkEquals(a, b);
        checkEquals(b, c);

        a.setHour(14);
        System.out.println("The hour of time " + a + "is: " + a.getHour());
        b.setMinute(59);
        System.out.println("The minute of time" + b + "is: " + b.getMinute());
        c.setTime(14, 0);
        checkEquals(a, c);
        if(a.isAM()) System.out.println(a + " is an AM time");
    }
}
