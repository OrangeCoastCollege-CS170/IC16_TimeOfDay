package edu.orangecoastcollege.sbadajoz.ic16;

public class Time {
    private int mHour;
    private int mMinute;

    public Time (int hour, int minute) {
        setTime(hour, minute);
    }

    public Time() {
        this(0, 0);
    }

    public Time(Time other) {
       this(other.mHour, other.mMinute);
    }
    
    public int getHour() {
        return mHour;
    }
    
    public int getMinute() {
        return mMinute;
    }
    
    public void setHour(int hour) {
        if(hour < 0 || hour > 24)
            throw new IllegalArgumentException("Please enter an hour between 0 and 24");
        mHour = hour;
    }
    
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) 
            throw new IllegalArgumentException("Please enter a minute between 0 and 59");
        mMinute = minute;
    }
    public void setTime(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
        
    }
    
    public boolean isAM() {
        if(mHour < 12) return true;
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mHour;
        result = prime * result + mMinute;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Time other = (Time) obj;
        if (mHour != other.mHour) return false;
        if (mMinute != other.mMinute) return false;
        return true;
    }

    @Override
    public String toString()
    {
        if(isAM()) return "Time [" + mHour + ":" + mMinute + " AM]";
        return "Time [" + mHour + ":" + mMinute + " PM]";

    }
    
    
}
