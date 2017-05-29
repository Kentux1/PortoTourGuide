package com.kentux.portotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CaldoRestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurante_abadia_do_porto),
                getString(R.string.abadia_do_porto_address),
                R.drawable.bacalhau_abadia_do_porto,
                null,
                getString(R.string.abadia_do_porto_geolocation)));

        places.add(new Place(getString(R.string.restaurante_essencia_lusa),
                getString(R.string.essencia_lusa_address),
                R.drawable.caldo_essencia_lusa,
                null,
                getString(R.string.essencia_lusa_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
    }
}

