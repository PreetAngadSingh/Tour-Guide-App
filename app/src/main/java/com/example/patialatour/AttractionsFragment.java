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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);
        final ArrayList<Tour> tours=new ArrayList<Tour>();
        //tours.add("one");
        tours.add(new Tour(getString(R.string.att1),getString(R.string.att_des1), R.drawable.att1));
        tours.add(new Tour(getString(R.string.att2),getString(R.string.att_des2), R.drawable.att2));
        tours.add(new Tour(getString(R.string.att3),getString(R.string.att_des3), R.drawable.att3));
        tours.add(new Tour(getString(R.string.att4),getString(R.string.att_des4), R.drawable.att4));
        tours.add(new Tour(getString(R.string.att5),getString(R.string.att_des5), R.drawable.att5));
        tours.add(new Tour(getString(R.string.att6),getString(R.string.att_des6), R.drawable.att6));
        tours.add(new Tour(getString(R.string.att7),getString(R.string.att_des7), R.drawable.att7));
        tours.add(new Tour(getString(R.string.att8),getString(R.string.att_des8), R.drawable.att8));

        TourAdapter adapter = new TourAdapter(getActivity(), tours,R.color.attraction_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
