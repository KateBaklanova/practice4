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
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment3 extends Fragment {


    public Fragment3() {
        super(R.layout.fragment3);
    }

    ArrayList<Words> words = new ArrayList<Words>();
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // начальная инициализация списка
        setInitialData();
        View contentView = inflater.inflate(R.layout.fragment3, container, false);
        RecyclerView recyclerView = contentView.findViewById(R.id.list);
        // создаем адаптер
        WordsAdapter adapter = new WordsAdapter(contentView.getContext(), words);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
        return contentView;
    }

    private void setInitialData(){
        for (int i=0; i<=200; i++){
            words.add(new Words ("item"+i, R.drawable.dot));
        }
    }

}

