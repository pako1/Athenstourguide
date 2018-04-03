package com.example.android.athenstourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> placeArrayList) {
        super(context, 0, placeArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        Place currentPlace = getItem(position);

        if (currentPlace != null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.model_item, parent, false);
            ButterKnife.bind(this,listItemView);
        }

        ButterKnife.bind(this,listItemView);
        ViewHolder holder = new ViewHolder(listItemView);

        if (currentPlace != null) {
            holder.SightView.setImageResource(currentPlace.getmImage());
        }

        if (currentPlace != null) {
            holder.nameView.setText(currentPlace.getmSightname());
        }
        if (currentPlace != null) {
            holder.explanationView.setText(currentPlace.getmDescription());
        }

        if (currentPlace != null) {
            if (currentPlace.getmPhone() != null) {
                holder.phone_numberView.setText(currentPlace.getmPhone());
            } else {
                holder.phone_numberView.setVisibility(View.GONE);
                holder.phone.setVisibility(View.GONE);
            }
        }

        if (currentPlace != null) {
            if (currentPlace.getmSchedule() != null) {
               holder.scheduleView.setText(currentPlace.getmSchedule());
            } else {
                holder.scheduleView.setVisibility(View.GONE);
                holder.time.setVisibility(View.GONE);
            }
        }

        if (currentPlace != null) {
            holder.moneyView.setText(currentPlace.getmPrice());
        }

        if (currentPlace != null) {
            holder.locationView.setText(currentPlace.getmAddress());
        }
        return listItemView;
    }

     class ViewHolder{

        @BindView(R.id.modelImage)
        ImageView SightView;
        @BindView(R.id.nameView)
        TextView nameView;
        @BindView(R.id.explanationView)
        TextView explanationView;
        @BindView(R.id.phone_numberView)
        TextView phone_numberView;
        @BindView(R.id.phone_icon)
        ImageView phone;
        @BindView(R.id.scheduleView)
        TextView scheduleView;
        @BindView(R.id.timeView)
        ImageView time;
        @BindView(R.id.moneyView)
        TextView moneyView;
        @BindView(R.id.locationView)
        TextView locationView;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
