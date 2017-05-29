package com.kentux.portotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.hotel_the_yeatman),
                getString(R.string.the_yeatman_address),
                R.drawable.hotel_the_yeatman,
                getString(R.string.desc_the_yeatman),
                getString(R.string.the_yeatman_geolocation)));

        places.add(new Place(getString(R.string.hotel_palacio_das_cardosas),
                getString(R.string.palacio_das_cardosas_address),
                R.drawable.hotel_palacio_das_cardosas,
                getString(R.string.desc_palacio_das_cardosas),
                getString(R.string.palacio_das_cardosas_geolocation)));

        places.add(new Place(getString(R.string.hotel_pousada_do_porto),
                getString(R.string.pousada_do_porto_address),
                R.drawable.hotel_pousada_do_porto,
                getString(R.string.desc_pousada_do_porto),
                getString(R.string.pousada_do_porto_geolocation)));

        places.add(new Place(getString(R.string.hotel_pestana_porto_hotel),
                getString(R.string.pestana_porto_hotel_address),
                R.drawable.hotel_pestana_porto_hotel,
                getString(R.string.desc_pestana_porto_hotel),
                getString(R.string.pestana_porto_geolocation)));

        places.add(new Place(getString(R.string.hotel_hotel_teatro),
                getString(R.string.hotel_teatro_address),
                R.drawable.hotel_teatro,
                getString(R.string.desc_hotel_teatro),
                getString(R.string.hotel_teatro_geolocation)));

        places.add(new Place(getString(R.string.hotel_flores_village),
                getString(R.string.flores_village_address),
                R.drawable.hotel_flores_village,
                getString(R.string.desc_flores_village),
                getString(R.string.flores_village_geolocation)));

        places.add(new Place(getString(R.string.hotel_vitoria_village),
                getString(R.string.vitoria_village_address),
                R.drawable.hotel_vitoria_village,
                getString(R.string.desc_vitoria_village),
                getString(R.string.vitoria_village_geolocation)));

        places.add(new Place(getString(R.string.hotel_pensao_favorita),
                getString(R.string.pensao_favorita_address),
                R.drawable.hotel_pensao_favorita,
                getString(R.string.desc_pensao_favorita),
                getString(R.string.pensao_favorita_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
        return rootView;
    }
}
