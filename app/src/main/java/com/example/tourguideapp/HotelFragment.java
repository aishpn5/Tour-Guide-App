package com.example.tourguideapp;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
// Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.mayfair, R.drawable.mayfair));
        words.add(new Word(R.string.swosti, R.drawable.swosti));
        words.add(new Word(R.string.crown, R.drawable.crown));
        words.add(new Word(R.string.venus, R.drawable.venus));
        words.add(new Word(R.string.priya, R.drawable.priya));
        words.add(new Word(R.string.angan, R.drawable.angan));
        words.add(new Word(R.string.crystal, R.drawable.crystal));
        words.add(new Word(R.string.franklin, R.drawable.franklin));
        words.add(new Word(R.string.trident, R.drawable.trident));
        words.add(new Word(R.string.presidency, R.drawable.presidency));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.category_hotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
