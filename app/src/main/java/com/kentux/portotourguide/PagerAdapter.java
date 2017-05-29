package com.kentux.portotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public PagerAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new ExperiencesFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new GastronomyFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.category_experiences);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_gastronomy);
        }
    }
}
