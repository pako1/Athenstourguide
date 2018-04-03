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

public class SightsFragment extends Fragment {

    @BindView(R.id.modelList)
    ListView listView;

    View rootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<Place> sightList = new ArrayList<>();

        sightList.add(new Place(R.drawable.acropolis, getString(R.string.acname), getString(R.string.acadd), getString(R.string.acaphone), getString(R.string.acahour), getString(R.string.acaprice), getString(R.string.acc)));
        sightList.add(new Place(R.drawable.national, getString(R.string.natname), getString(R.string.natadd), getString(R.string.natphone), getString(R.string.nathour), getString(R.string.natprice), getString(R.string.natexp)));
        sightList.add(new Place(R.drawable.agora, getString(R.string.agoraname), getString(R.string.agoradd), getString(R.string.zeusphone), getString(R.string.zeushour), getString(R.string.agorprice), getString(R.string.agorexp)));
        sightList.add(new Place(R.drawable.zeus, getString(R.string.zeusname), getString(R.string.zeusadd), getString(R.string.zeusprice), getString(R.string.zeusexp)));
        sightList.add(new Place(R.drawable.plakaanafiotika, getString(R.string.plakaname), getString(R.string.plakaadd), getString(R.string.plakaprice), getString(R.string.plakaexp)));

        rootView = inflater.inflate(R.layout.model_list, container, false);

        ButterKnife.bind(this,rootView);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), sightList);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        rootView = null;
    }
}
