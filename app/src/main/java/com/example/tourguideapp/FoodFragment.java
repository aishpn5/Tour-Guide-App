package com.example.tourguideapp;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.chhena_poda, R.drawable.chhena_poda));
        words.add(new Word(R.string.chaat, R.drawable.chaat));
        words.add(new Word(R.string.pakhala, R.drawable.pakhala));
        words.add(new Word(R.string.pav, R.drawable.pav_bhaji));
        words.add(new Word(R.string.dosa, R.drawable.dosa));
        words.add(new Word(R.string.bature, R.drawable.bature));
        words.add(new Word(R.string.puri, R.drawable.puri));
        words.add(new Word(R.string.lassi, R.drawable.lassi));
        words.add(new Word(R.string.bhurji, R.drawable.bhurji));
        words.add(new Word(R.string.rasam, R.drawable.rasam));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.category_food);

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
