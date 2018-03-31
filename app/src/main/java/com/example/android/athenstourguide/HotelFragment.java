package com.example.android.athenstourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelFragment extends Fragment {

    @BindView(R.id.modelList)
    ListView listView;

    View rootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Model> hotelList = new ArrayList<>();

        hotelList.add(new Model(R.drawable.metropolis, getString(R.string.metname), getString(R.string.mitadd), getString(R.string.mitphone), getString(R.string.mithour), getString(R.string.mitprice), getString(R.string.mitexp)));
        hotelList.add(new Model(R.drawable.hilton, getString(R.string.hilame), getString(R.string.hiladd), getString(R.string.hilphone), getString(R.string.hilhour), getString(R.string.hilprice), getString(R.string.hilexp)));
        hotelList.add(new Model(R.drawable.george, getString(R.string.georgame), getString(R.string.georgeadd), getString(R.string.georgephone), getString(R.string.georgehour), getString(R.string.georgeprice), getString(R.string.kingexp)));
        hotelList.add(new Model(R.drawable.bretane, getString(R.string.grandame), getString(R.string.bretadd), getString(R.string.bretphone), getString(R.string.brethour), getString(R.string.bretprice), getString(R.string.bretagnexp)));

        rootView = inflater.inflate(R.layout.model_list, container, false);

        ButterKnife.bind(this,rootView);

        ModelAdapter modelAdapter = new ModelAdapter(getActivity(), hotelList);

        listView.setAdapter(modelAdapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        rootView = null;
    }

}
