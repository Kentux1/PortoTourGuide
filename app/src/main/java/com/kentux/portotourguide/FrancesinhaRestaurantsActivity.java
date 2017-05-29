package com.kentux.portotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FrancesinhaRestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.francesinha_restaurante_capa_negra),
                getString(R.string.capa_negra_address),
                R.drawable.francesinha_restaurante_capa_negra,
                null,
                getString(R.string.capa_negra_geolocation)));

        places.add(new Place(getString(R.string.francesinha_tappas_caffe),
                getString(R.string.tappas_caffe_address),
                R.drawable.francesinha_tappas_caff_,
                null,
                getString(R.string.tappas_caffe_geolocation)));

        places.add(new Place(getString(R.string.francesinha_cafe_aviz),
                getString(R.string.cafe_aviz_address),
                R.drawable.francesinha_cafe_aviz,
                null,
                getString(R.string.cafe_aviz_geolocation)));

        places.add(new Place(getString(R.string.francesinha_lado_b),
                getString(R.string.lado_b_address),
                R.drawable.francesinha_lado_b,
                null,
                getString(R.string.lado_b_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
    }
}
