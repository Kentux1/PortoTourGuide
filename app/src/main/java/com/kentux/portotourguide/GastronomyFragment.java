package com.kentux.portotourguide;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class GastronomyFragment extends Fragment {

    public GastronomyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        float cornerRadius = 20.0f;
        View rootView = inflater.inflate(R.layout.fragment_gastronomy, container, false);
        ImageView francesinhaImage = (ImageView) rootView.findViewById(R.id.francesinha_image);
        ImageView bacalhauImage = (ImageView) rootView.findViewById(R.id.bacalhau_a_gomes_de_sa_image);
        ImageView tripasImage = (ImageView) rootView.findViewById(R.id.tripas_a_moda_do_porto);
        ImageView caldoImage = (ImageView) rootView.findViewById(R.id.caldo_verde_image);
        Resources res = getResources();

        //Set Francesinha drawable as rounded (for round corners)
        Bitmap francesinhaSrc = BitmapFactory.decodeResource(res, R.drawable.francesinha);
        RoundedBitmapDrawable francesinha =
                RoundedBitmapDrawableFactory.create(res, francesinhaSrc);
        francesinha.setCornerRadius(cornerRadius);
        francesinhaImage.setImageDrawable(francesinha);

        //Set Bacalhau à Gomes de Sá drawable as rounded (for round corners)
        Bitmap bacalhauSrc = BitmapFactory.decodeResource(res, R.drawable.bacalhau_a_gomes_de_sa);
        RoundedBitmapDrawable bacalhau =
                RoundedBitmapDrawableFactory.create(res, bacalhauSrc);
        bacalhau.setCornerRadius(cornerRadius);
        bacalhauImage.setImageDrawable(bacalhau);

        //Set Tripas à moda do Porto drawable as rounded (for round corners)
        Bitmap tripasSrc = BitmapFactory.decodeResource(res, R.drawable.tripas_a_moda_do_porto);
        RoundedBitmapDrawable tripas =
                RoundedBitmapDrawableFactory.create(res, tripasSrc);
        tripas.setCornerRadius(cornerRadius);
        tripasImage.setImageDrawable(tripas);

        //Set Caldo Verde drawable as rounded (for round corners)
        Bitmap caldoSrc = BitmapFactory.decodeResource(res, R.drawable.caldo_verde);
        RoundedBitmapDrawable caldo =
                RoundedBitmapDrawableFactory.create(res, caldoSrc);
        caldo.setCornerRadius(cornerRadius);
        caldoImage.setImageDrawable(caldo);

        //OnClickListeners for each food
        CardView francesinhaView = (CardView) rootView.findViewById(R.id.francesinha_card_view);
        francesinhaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent francesinhaIntent = new Intent(getContext(), FrancesinhaRestaurantsActivity.class);
                getContext().startActivity(francesinhaIntent);
            }
        });
        CardView bacalhauView = (CardView) rootView.findViewById(R.id.bacalhau_card_view);
        bacalhauView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bacalhauIntent = new Intent(getContext(), BacalhauRestaurantsActivity.class);
                getContext().startActivity(bacalhauIntent);
            }
        });
        CardView tripasView = (CardView) rootView.findViewById(R.id.tripas_card_view);
        tripasView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tripasIntent = new Intent(getContext(), TripasRestaurantsActivity.class);
                getContext().startActivity(tripasIntent);
            }
        });
        CardView caldoView = (CardView) rootView.findViewById(R.id.caldo_card_view);
        caldoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caldoIntent = new Intent(getContext(), CaldoRestaurantsActivity.class);
                getContext().startActivity(caldoIntent);
            }
        });
        return rootView;
    }
}
