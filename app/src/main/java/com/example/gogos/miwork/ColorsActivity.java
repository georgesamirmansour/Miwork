package com.example.gogos.miwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private ArrayList<word> words = new ArrayList<word>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        arrayList();
        arrayAdaptor();
    }

    private void arrayList() {

        words.add(new word("one", "lutti"));
        words.add(new word("two", "otiiko"));
        words.add(new word("three", "tolookosu"));
        words.add(new word("four", "oyyisa"));
        words.add(new word("five", "massokka"));
        words.add(new word("six", "temmokka"));
        words.add(new word("seven", "kenekaku"));
        words.add(new word("eight", "kawinta"));
        words.add(new word("nine", "wo’e"));
        words.add(new word("ten", "na’aacha"));
    }

    private void arrayAdaptor() {
        WordAdaptor itemsAdaptor =
                new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdaptor);
    }

//    public void fillInTextView() {
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for (int index = 0; index < words.size(); index++) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//        }
//    }
}
