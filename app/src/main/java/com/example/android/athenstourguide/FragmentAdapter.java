package com.example.android.athenstourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SightsFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new BarFragment();
            default:
                return new HotelFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.sightTab);
            case 1:
                return mContext.getString(R.string.foodtab);
            case 2:
                return mContext.getString(R.string.bartab);
            default:
                return mContext.getString(R.string.hoteltab);
        }
    }
}


