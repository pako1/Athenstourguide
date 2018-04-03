package com.example.android.athenstourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class FoodFragment extends Fragment {

    @BindView(R.id.modelList)
    ListView listView;

    View rootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Place> foodList = new ArrayList<>();

        foodList.add(new Place(R.drawable.aleria, getString(R.string.aleria), getString(R.string.aleradd), getString(R.string.alphone), getString(R.string.alhour), getString(R.string.alerprice), getString(R.string.aleriaexp)));
        foodList.add(new Place(R.drawable.funky, getString(R.string.funky), getString(R.string.funkadd), getString(R.string.funk), getString(R.string.funhour), getString(R.string.funprice), getString(R.string.funkexp)));
        foodList.add(new Place(R.drawable.oroscopo, getString(R.string.orosc), getString(R.string.orosadd), getString(R.string.orosphone), getString(R.string.orohour), getString(R.string.orosprice), getString(R.string.orscexp)));
        foodList.add(new Place(R.drawable.hot, getString(R.string.hothot), getString(R.string.hotadd), getString(R.string.hotphone), getString(R.string.hothour), getString(R.string.hotprice), getString(R.string.hotexp)));

        rootView = inflater.inflate(R.layout.model_list, container, false);

        ButterKnife.bind(this,rootView);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), foodList);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        rootView = null;
    }
}
