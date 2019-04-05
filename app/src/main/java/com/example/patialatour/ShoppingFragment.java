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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours=new ArrayList<Tour>();
        //tours.add("one");
        tours.add(new Tour(getString(R.string.sho1),getString(R.string.sho_des1)));
        tours.add(new Tour(getString(R.string.sho2),getString(R.string.sho_des2)));
        tours.add(new Tour(getString(R.string.sho3),getString(R.string.sho_des3)));
        tours.add(new Tour(getString(R.string.sho4),getString(R.string.sho_des4)));
        tours.add(new Tour(getString(R.string.sho5),getString(R.string.sho_des5)));

        TourAdapter adapter = new TourAdapter(getActivity(), tours,R.color.shopping_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
