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
public class TemplesFragment extends Fragment {


    public TemplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.lingaraj, R.drawable.lingaraj));
        words.add(new Word(R.string.shiva, R.drawable.shiva));
        words.add(new Word(R.string.kali, R.drawable.kali));
        words.add(new Word(R.string.mangala, R.drawable.mangala));
        words.add(new Word(R.string.tara, R.drawable.tarini));
        words.add(new Word(R.string.tarini, R.drawable.tara));
        words.add(new Word(R.string.laxmi, R.drawable.laxmi));
        words.add(new Word(R.string.saraswati, R.drawable.saraswati));
        words.add(new Word(R.string.ganesh, R.drawable.ganesh));
        words.add(new Word(R.string.kartik, R.drawable.kartik));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words,R.color.category_temples);

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
