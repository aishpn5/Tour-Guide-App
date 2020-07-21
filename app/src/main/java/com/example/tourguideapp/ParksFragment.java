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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.indra, R.drawable.indra));
        words.add(new Word(R.string.madhusudan, R.drawable.madhusudan));
        words.add(new Word(R.string.buddha, R.drawable.buddha));
        words.add(new Word(R.string.bose, R.drawable.bose));
        words.add(new Word(R.string.forest, R.drawable.forest));
        words.add(new Word(R.string.vatika, R.drawable.vatika));
        words.add(new Word(R.string.ekambra, R.drawable.ekambra));
        words.add(new Word(R.string.jaydev, R.drawable.jaydev));
        words.add(new Word(R.string.madhu, R.drawable.madhu));
        words.add(new Word(R.string.kanan, R.drawable.kanan));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.category_parks);

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
