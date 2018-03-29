package com.example.android.athenstourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Model> foodList = new ArrayList<>();

        foodList.add(new Model(R.drawable.aleria, "aleria", "Megalou Alexandrou 57", "+30 21 0522 2633", "10:00-22:00", "€€€€", "HI gihihaihiihihif"));
        foodList.add(new Model(R.drawable.aleria, "aleria", "Megalou Alexandrou 57", "+30 21 0522 2633", "10:00-22:00", "€€€€", "HI gihihaihiihihif"));

        View rootView = inflater.inflate(R.layout.model_list, container, false);

        ListView listView = rootView.findViewById(R.id.modelList);

        ModelAdapter modelAdapter = new ModelAdapter(getActivity(), foodList);

        listView.setAdapter(modelAdapter);

        return rootView;
    }
}
