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

public class ModelAdapter extends ArrayAdapter<Model> {

    public ModelAdapter(@NonNull Context context, @NonNull ArrayList<Model> modelArrayList) {
        super(context,0,modelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        Model currentModel = getItem(position);

        if (currentModel != null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.model_item, parent, false);
        }

        if (currentModel != null) {
            ImageView SightView = listItemView.findViewById(R.id.modelImage);
            SightView.setImageResource(currentModel.getmImage());
        }

        if (currentModel != null) {
            TextView nameView = listItemView.findViewById(R.id.nameView);
            nameView.setText(currentModel.getmSightname());
        }
        if (currentModel != null) {
            TextView explanationView = listItemView.findViewById(R.id.explanationView);
            explanationView.setText(currentModel.getmDescription());
        }

        if (currentModel != null) {
            TextView phone_numberView = listItemView.findViewById(R.id.phone_numberView);
            phone_numberView.setText(currentModel.getmPhone());
        }

        if (currentModel != null) {
            TextView scheduleView = listItemView.findViewById(R.id.scheduleView);
            scheduleView.setText(currentModel.getmSchedule());
        }

        if (currentModel != null) {
            TextView moneyView = listItemView.findViewById(R.id.moneyView);
            moneyView.setText(currentModel.getmPrice());
        }

        if (currentModel != null) {
            TextView locationView = listItemView.findViewById(R.id.locationView);
            locationView.setText(currentModel.getmAddress());
        }
            return listItemView;
    }
}
