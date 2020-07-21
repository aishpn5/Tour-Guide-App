package com.example.tourguideapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentManager;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {

        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext= context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TemplesFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new HotelFragment();
        } else {
            return new ParksFragment();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_temples);
        } else if (position == 1) {
            return mContext.getString(R.string.category_food);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_parks);
        }
    }

}