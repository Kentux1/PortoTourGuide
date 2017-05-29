package com.kentux.portotourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

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

        String placeName = currentPlace.getPlaceName();
        String placeAddress = currentPlace.getPlaceAddress();
        int imageResourceId = currentPlace.getImageResourceId();
        String placeDescription = currentPlace.getPlaceDescription();
        final String placeMap = currentPlace.getPlaceMap();

        TextView placeNameText = (TextView) listItemView.findViewById(R.id.place_name);
        TextView placeAddressText = (TextView) listItemView.findViewById(R.id.place_address);
        ImageView imageResourceIdImage = (ImageView) listItemView.findViewById(R.id.list_item_image);

        placeNameText.setText(currentPlace.getPlaceName());
        placeAddressText.setText(currentPlace.getPlaceAddress());
        imageResourceIdImage.setImageResource(currentPlace.getImageResourceId());

        final Intent placeDescriptionIntent = new Intent(context, PlaceDescriptionActivity.class);
        placeDescriptionIntent.putExtra(context.getString(R.string.place_name), placeName);
        placeDescriptionIntent.putExtra(context.getString(R.string.place_address), placeAddress);
        placeDescriptionIntent.putExtra(context.getString(R.string.place_description), placeDescription);
        placeDescriptionIntent.putExtra(context.getString(R.string.place_image_id), imageResourceId);
        placeDescriptionIntent.putExtra(context.getString(R.string.place_map), placeMap);

        Uri geoLocation = Uri.parse("geo:" + placeMap);
        final Intent gmapsIntent = new Intent(Intent.ACTION_VIEW, geoLocation);

        if (placeDescription != null) {
            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context.startActivity(placeDescriptionIntent);
                }
            });
        } else {
            listItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (gmapsIntent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(gmapsIntent);
                    }
                }
            });
        }


        return listItemView;
    }
}
