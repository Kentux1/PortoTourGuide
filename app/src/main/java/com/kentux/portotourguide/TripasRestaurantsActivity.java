package com.kentux.portotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TripasRestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurante_lider),
                getString(R.string.restaurante_lider_address),
                R.drawable.tripas_lider,
                null,
                getString(R.string.restaurante_lider_geolocation)));

        places.add(new Place(getString(R.string.restaurante_o_gaveto),
                getString(R.string.o_gaveto_address),
                R.drawable.tripas_o_gaveto,
                null,
                getString(R.string.o_gaveto_geolocation)));

        places.add(new Place(getString(R.string.restaurante_o_pombeiro),
                getString(R.string.o_pombeiro_address),
                R.drawable.tripas_o_pombeiro,
                null,
                getString(R.string.o_pombeiro_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
    }
}

