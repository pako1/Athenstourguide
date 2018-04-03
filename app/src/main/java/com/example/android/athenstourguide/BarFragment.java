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

public class BarFragment extends Fragment {

    @BindView(R.id.modelList)
    ListView listView;

    View rootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<Place> barList = new ArrayList<>();

        barList.add(new Place(R.drawable.aforathens, getString(R.string.aname), getString(R.string.athadd), getString(R.string.athphone), getString(R.string.athhour), getString(R.string.athprice), getString(R.string.aexp)));
        barList.add(new Place(R.drawable.materiaprimacavawinebar, getString(R.string.matname), getString(R.string.matadd), getString(R.string.matphone), getString(R.string.mathour), getString(R.string.matprice), getString(R.string.matexp)));
        barList.add(new Place(R.drawable.taf, getString(R.string.tafname), getString(R.string.tafadd), getString(R.string.tafphone), getString(R.string.tafhour), getString(R.string.tafprice), getString(R.string.tafexp)));
        barList.add(new Place(R.drawable.momix, getString(R.string.mimname), getString(R.string.mimadd), getString(R.string.mimphone), getString(R.string.mimhour), getString(R.string.mimprice), getString(R.string.mimexp)));
        barList.add(new Place(R.drawable.booze, getString(R.string.boozname), getString(R.string.boozadd), getString(R.string.  boozphone), getString(R.string.boozhour), getString(R.string.boozprice), getString(R.string.boozexp)));
        barList.add(new Place(R.drawable.superfly, getString(R.string.supname), getString(R.string.supadd), getString(R.string.supphone), getString(R.string.suphour), getString(R.string.supprice), getString(R.string.supexp)));

        rootView = inflater.inflate(R.layout.model_list, container, false);
        ButterKnife.bind(this,rootView);


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), barList);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        rootView = null;
    }

}
