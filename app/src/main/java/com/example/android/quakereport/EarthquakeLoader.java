package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by User on 9/11/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;


    public EarthquakeLoader(Context context, String url){
        super(context);
        mUrl = url;
        Log.i(LOG_TAG, "EarthquakeLoader constructor");
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        Log.i(LOG_TAG, "onStartLoading");
    }

    @Override
    public List<Earthquake> loadInBackground() {
        Log.i(LOG_TAG, "loadInBackground");

        List<Earthquake> earthquakes  = null;
        if (mUrl == null) {
            return earthquakes;
        }

        earthquakes = QueryUtils.extractEarthquakes(mUrl);
        return earthquakes;
    }
}
