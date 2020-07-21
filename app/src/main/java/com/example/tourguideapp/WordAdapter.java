package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        this.mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.layout);
        relativeLayout.setBackgroundResource(mColorId);

        TextView wordTextView = (TextView) listItemView.findViewById(R.id.text_view);
        wordTextView.setText(currentWord.getmNameId());

        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.image_view);
        wordImageView.setImageResource(currentWord.getmResourceId());

        return listItemView;
    }
}