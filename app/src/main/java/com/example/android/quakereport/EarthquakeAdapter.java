package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by User on 7/10/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private TextView mMagnitudTextView;
    private TextView mSiteTextView;
    private TextView mDateTextView;

    public EarthquakeAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Earthquake earthquake = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        mMagnitudTextView = (TextView) listItemView.findViewById(R.id.tv_magnitud);
        mMagnitudTextView.setText(earthquake.getMagnitud() + "");

        mSiteTextView = (TextView) listItemView.findViewById(R.id.tv_location);
        mSiteTextView.setText(earthquake.getLocation());

        mDateTextView = (TextView) listItemView.findViewById(R.id.tv_date);
        String date = (new SimpleDateFormat("MM dd, yyyy")).format(earthquake.getDate());
        mDateTextView.setText(date);

        return listItemView;
    }
}
