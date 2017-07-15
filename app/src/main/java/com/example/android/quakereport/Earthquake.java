package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 7/10/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private Date mDate;
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public Earthquake(){

    }

    public Earthquake(double magnitud, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitud;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }


    public double getMagnitud() {
        return mMagnitude;
    }

    public void setMagnitud(double magnitud) {
        this.mMagnitude = magnitud;
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

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {

        String date = (new SimpleDateFormat("MMM DD, yyyy")).format(mDate);

        return "Earthquake{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mDate=" + date +
                '}';
    }
}
