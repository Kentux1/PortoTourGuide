package com.kentux.portotourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlaceDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_description);
        Bundle placeDetails = getIntent().getExtras();
        String placeName = placeDetails.getString(getString(R.string.place_name));
        int placeImageResourceId = placeDetails.getInt(getString(R.string.place_image_id));
        String placeDescription = placeDetails.getString(getString(R.string.place_description));
        final String placeMap = placeDetails.getString(getString(R.string.place_map));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.setTitle(placeName);
        ImageView placeImage = (ImageView) findViewById(R.id.place_image);
        placeImage.setImageResource(placeImageResourceId);

        //TextView addressText = (TextView) findViewById(R.id.place_address);
        //addressText.setText(placeAddress);

        TextView descriptionText = (TextView) findViewById(R.id.place_description);
        descriptionText.setText(placeDescription);

        LinearLayout mapView = (LinearLayout) findViewById(R.id.map_view);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri geoLocation = Uri.parse("geo:" + placeMap);
                Intent gmapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                if (gmapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(gmapIntent);
                }
            }
        });

    }
}
