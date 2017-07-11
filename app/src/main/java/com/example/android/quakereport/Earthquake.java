package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by User on 7/10/2017.
 */

public class Earthquake {

    private double mMagnitud;
    private String mLocation;
    private Date mDate;

    public Earthquake(){

    }

    public Earthquake(double magnitud, String location, Date date) {
        this.mMagnitud = magnitud;
        this.mLocation = location;
        this.mDate = date;
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
}
