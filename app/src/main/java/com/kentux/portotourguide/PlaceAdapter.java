package com.kentux.portotourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tiago Gomes on 20/05/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> Place) {
        super(context, 0, Place);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Place currentPlace = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address);
        ImageView imageResourceId = (ImageView) listItemView.findViewById(R.id.list_item_image);
        if (currentPlace != null) {
            placeName.setText(currentPlace.getPlaceName());
            placeAddress.setText(currentPlace.getPlaceAddress());
            imageResourceId.setImageResource(currentPlace.getImageResourceId());
        }
        return listItemView;
    }
}
