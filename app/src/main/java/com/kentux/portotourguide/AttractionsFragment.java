package com.kentux.portotourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.attraction_cais_de_gaia),
                getString(R.string.cais_de_gaia_address),
                R.drawable.attraction_cais_de_gaia,
                getString(R.string.desc_cais_de_gaia), getString(R.string.cais_de_gaia_geolocation)));

        places.add(new Place(getString(R.string.attraction_serralves_museum),
                getString(R.string.serralves_museum_address),
                R.drawable.attraction_serralves_museum,
                getString(R.string.desc_serralves_museum), getString(R.string.serralves_museum_geolocation)));

        places.add(new Place(getString(R.string.attraction_casa_da_musica),
                getString(R.string.casa_da_musica_address),
                R.drawable.attraction_casa_da_musica,
                getString(R.string.desc_casa_da_musica), getString(R.string.casa_da_musica_geolocation)));

        places.add(new Place(getString(R.string.attraction_sao_francisco_church),
                getString(R.string.sao_francisco_church_address),
                R.drawable.attraction_sao_francisco_church,
                getString(R.string.desc_sao_francisco_church), getString(R.string.sao_francisco_geolocation)));

        places.add(new Place(getString(R.string.attraction_cais_da_ribeira),
                getString(R.string.cais_da_ribeira_address),
                R.drawable.attraction_cais_da_ribeira,
                getString(R.string.desc_cais_da_ribeira), getString(R.string.cais_da_ribeira_geolocation)));

        places.add(new Place(getString(R.string.attraction_se_catedral),
                getString(R.string.se_catedral_address),
                R.drawable.attraction_se_catedral,
                getString(R.string.desc_se_catedral), getString(R.string.se_catedral_geolocation)));

        places.add(new Place(getString(R.string.attraction_torre_clérigos),
                getString(R.string.torre_clérigos_address),
                R.drawable.attraction_torre_dos_clerigos,
                getString(R.string.desc_torre_dos_clerigos), getString(R.string.torre_clerigos_geolocation)));

        places.add(new Place(getString(R.string.attraction_palacio_da_bolsa),
                getString(R.string.palacio_da_bolsa_address),
                R.drawable.attraction_palacio_da_bolsa,
                getString(R.string.desc_palacio_da_bolsa), getString(R.string.palacio_da_bolsa_geolocation)));

        places.add(new Place(getString(R.string.attraction_dom_luis_bridge),
                getString(R.string.dom_luis_bridge_address),
                R.drawable.attraction_dom_luis_bridge,
                getString(R.string.desc_dom_luis_bridge), getString(R.string.dom_luis_bridge_geolocation)));

        places.add(new Place(getString(R.string.attraction_soares_dos_reis_museum),
                getString(R.string.soares_dos_reis_museum_address),
                R.drawable.attraction_soares_dos_reis_museum,
                getString(R.string.desc_soares_dos_reis_museum), getString(R.string.soares_dos_reis_museum_geolocation)));

        PlaceAdapter placesAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.place_list);
        if (listView != null) {
            listView.setAdapter(placesAdapter);
        }
        return rootView;
    }
}
