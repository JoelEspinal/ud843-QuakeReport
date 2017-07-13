package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 7/10/2017.
 */

public class Earthquake {

    private double mMagnitud;
    private String mLocation;
    private Date mDate;
    private long mTimeInMilliseconds;

    public Earthquake(){

    }

    public Earthquake(double magnitud, String location, long timeInMilliseconds) {
        this.mMagnitud = magnitud;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }


    public double getMagnitud() {
        return mMagnitud;
    }

    public void setMagnitud(double magnitud) {
        this.mMagnitud = magnitud;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        this.mLocation = location;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    @Override
    public String toString() {

        String date = (new SimpleDateFormat("MMM DD, yyyy")).format(mDate);

        return "Earthquake{" +
                "mMagnitud=" + mMagnitud +
                ", mLocation='" + mLocation + '\'' +
                ", mDate=" + date +
                '}';
    }
}
