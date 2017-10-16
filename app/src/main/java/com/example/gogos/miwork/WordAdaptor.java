package com.example.gogos.miwork;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gogos on 2017-10-16.
 */

public class WordAdaptor extends ArrayAdapter<word> {

    public WordAdaptor(Activity context, ArrayList<word> word) {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView miworkTextView = listItemView.findViewById(R.id.miwork_text_view);
        miworkTextView.setText(currentWord.getMiWorkWord());
        TextView englishTextView = listItemView.findViewById(R.id.default_text_view);
        englishTextView.setText(currentWord.getEnglishWord());
        return listItemView;
    }
}
