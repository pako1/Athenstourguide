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

public class ModelAdapter extends ArrayAdapter<Model> {




    public ModelAdapter(@NonNull Context context, @NonNull ArrayList<Model> modelArrayList) {
        super(context, 0, modelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;

        Model currentModel = getItem(position);

        if (currentModel != null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.model_item, parent, false);
            ButterKnife.bind(this,listItemView);
        }


        ButterKnife.bind(this,listItemView);
        ViewHolder holder = new ViewHolder(listItemView);

        if (currentModel != null) {
            holder.SightView.setImageResource(currentModel.getmImage());
        }

        if (currentModel != null) {
            holder.nameView.setText(currentModel.getmSightname());
        }
        if (currentModel != null) {
            holder.explanationView.setText(currentModel.getmDescription());
        }

        if (currentModel != null) {
            if (currentModel.getmPhone() != null) {
                holder.phone_numberView.setText(currentModel.getmPhone());
            } else {
                holder.phone_numberView.setVisibility(View.GONE);
                holder.phone.setVisibility(View.GONE);
            }
        }

        if (currentModel != null) {
            if (currentModel.getmSchedule() != null) {
               holder.scheduleView.setText(currentModel.getmSchedule());
            } else {
                holder.scheduleView.setVisibility(View.GONE);
                holder.time.setVisibility(View.GONE);
            }
        }

        if (currentModel != null) {
            holder.moneyView.setText(currentModel.getmPrice());
        }

        if (currentModel != null) {
            holder.locationView.setText(currentModel.getmAddress());
        }
        return listItemView;
    }

    static class ViewHolder{

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
