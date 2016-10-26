package edu.orangecoastcollege.sbadajoz.ic16;

public class Time {
    int mHour;
    int mMinute;
    
    public Time (int hour, int minute) {
        if(hour < 0 || hour > 24)
            throw new IllegalArgumentException("Please enter an hour between 0 and 24");
        if(minute < 0 || minute > 59) 
            throw new IllegalArgumentException("Please enter a minute between 0 and 59");
    
    mHour = hour;
    mMinute = minute;
    }
    
    
}
