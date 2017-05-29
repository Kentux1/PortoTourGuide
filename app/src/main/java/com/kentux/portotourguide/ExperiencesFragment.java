package com.kentux.portotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperiencesFragment extends Fragment {

    public ExperiencesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.experience_lello_book_store),
                getString(R.string.lello_book_store_address),
                R.drawable.experience_lello_book_store,
                getString(R.string.desc_lello_book_store),
                getString(R.string.lello_geolocation)));

        places.add(new Place(getString(R.string.experience_majesctic_cafe),
                getString(R.string.majestic_cafe_address),
                R.drawable.experience_majestic_cafe,
                getString(R.string.desc_majestic_cafe),
                getString(R.string.majestic_geolocation)));

        places.add(new Place(getString(R.string.experience_sao_bento_station),
                getString(R.string.sao_bento_station_address),
                R.drawable.experience_sao_bento_station,
                getString(R.string.desc_sao_bento_station),
                getString(R.string.sao_bento_geolocation)));

        places.add(new Place(getString(R.string.experience_bolhao_market),
                getString(R.string.bolhao_market_address),
                R.drawable.experience_bolhao_market,
                getString(R.string.desc_bolhao_market),
                getString(R.string.bolhao_geolocation)));

        places.add(new Place(getString(R.string.experience_foz),
                getString(R.string.foz_address),
                R.drawable.experience_foz,
                getString(R.string.desc_foz),
                getString(R.string.foz_geolocation)));

        places.add(new Place(getString(R.string.experience_avenida_dos_aliados),
                getString(R.string.avenida_dos_aliados_address),
                R.drawable.experience_avenida_dos_aliados,
                getString(R.string.desc_avenida_dos_aliados),
                getString(R.string.avenida_dos_aliados_geolocation)));

        places.add(new Place(getString(R.string.experience_crystal_palace_gardens),
                getString(R.string.crystal_palace_gardens_address),
                R.drawable.experience_crystal_palace_gardens,
                getString(R.string.desc_crystal_palace_gardens),
                getString(R.string.crystal_palace_gardens_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
        return rootView;
    }
}
