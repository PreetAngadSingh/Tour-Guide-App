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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours=new ArrayList<Tour>();
        //tours.add("one");
        tours.add(new Tour(getString(R.string.res1),getString(R.string.res_des1)));
        tours.add(new Tour(getString(R.string.res2),getString(R.string.res_des2)));
        tours.add(new Tour(getString(R.string.res3),getString(R.string.res_des3)));
        tours.add(new Tour(getString(R.string.res4),getString(R.string.res_des4)));
        tours.add(new Tour(getString(R.string.res5),getString(R.string.res_des5)));
        tours.add(new Tour(getString(R.string.res6),getString(R.string.res_des6)));
        tours.add(new Tour(getString(R.string.res7),getString(R.string.res_des7)));

        TourAdapter adapter = new TourAdapter(getActivity(), tours,R.color.restaurant_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
