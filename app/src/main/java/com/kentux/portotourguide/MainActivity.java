package com.kentux.portotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Torre dos Clérigos", "R. de São Filipe de Nery", R.drawable.attraction_torre_dos_clerigos));

        PlaceAdapter placesAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
    }
}
