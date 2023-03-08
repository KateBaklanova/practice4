package com.example.pr4;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;


public class Fragment3 extends Fragment implements WordsAdapter.OnNoteListener {

    private static final String TAG = "MyApp";
    public Fragment3() {
        super(R.layout.fragment3);
    }

    ArrayList<Words> words = new ArrayList<Words>();
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setInitialData();
        View contentView = inflater.inflate(R.layout.fragment3, container, false);
        RecyclerView recyclerView = contentView.findViewById(R.id.list);
        WordsAdapter adapter = new WordsAdapter(contentView.getContext(), words, this);
        recyclerView.setAdapter(adapter);

        return contentView;
    }

    private void setInitialData(){
        for (int i=0; i<=200; i++){
            words.add(new Words ("item"+i, R.drawable.dot));
        }
    }

    @Override
    public void onNoteClick(int position) {
        words.get(position);
        Log.d(TAG, "itemClick "+ position);
    }
}