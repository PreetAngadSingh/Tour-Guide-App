package com.example.patialatour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalFragment extends Fragment {


    public HistoricalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours=new ArrayList<Tour>();
        //tours.add("one");
        tours.add(new Tour(getString(R.string.his1),getString(R.string.his_des1),R.drawable.his1));
        tours.add(new Tour(getString(R.string.his2),getString(R.string.his_des2),R.drawable.his2));
        tours.add(new Tour(getString(R.string.his3),getString(R.string.his_des3),R.drawable.his3));
        tours.add(new Tour(getString(R.string.his4),getString(R.string.his_des4),R.drawable.his4));
        tours.add(new Tour(getString(R.string.his5),getString(R.string.his_des5),R.drawable.his5));
        tours.add(new Tour(getString(R.string.his6),getString(R.string.his_des6),R.drawable.his6));

        TourAdapter adapter = new TourAdapter(getActivity(), tours,R.color.historical_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
