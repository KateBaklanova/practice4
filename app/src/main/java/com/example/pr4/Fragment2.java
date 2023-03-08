package com.example.pr4;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Fragment2 extends Fragment {


    private static final String TAG = "MyApp";
    public Fragment2() {
        super(R.layout.fragment2);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View contentView = inflater.inflate(R.layout.fragment2, container, false);

        ListView listView = (ListView) contentView.findViewById(R.id.listView);

        ArrayList<String> options = new ArrayList<String>();

        options.add("Видео");
        options.add("Карточки");
        options.add("Мини игры");
        ArrayAdapter<String> adapter1 = new ArrayAdapter(contentView.getContext(), android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Log.d(TAG, "itemClick: position = " + position + ", id = " + id);
            }
        });

        return contentView;
    }

}

