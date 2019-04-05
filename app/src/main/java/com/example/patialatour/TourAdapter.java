package com.example.patialatour;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour>{

    private int mColorResourceId;

    public TourAdapter(Context context, ArrayList<Tour> words, int colorResourceId){
        super(context,0,words);
        mColorResourceId=colorResourceId;
    }

    private static final String LOG_TAG = TourAdapter.class.getSimpleName();
    public TourAdapter(Activity context, ArrayList<Tour> words){
        super(context,0,words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Tour currentTour=getItem(position);
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentTour.gettitle());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description);
        defaultTextView.setText(currentTour.getdescription());
        ImageView iconView=(ImageView) listItemView.findViewById(R.id.side_image);
        if(currentTour.hasImage()) {
            iconView.setImageResource(currentTour.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else
            iconView.setVisibility(View.GONE);
        View textContainer=listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
