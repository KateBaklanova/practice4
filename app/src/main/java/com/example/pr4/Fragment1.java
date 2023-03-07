package com.example.pr4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainer;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    private static final String TAG = "MyApp";
    public Fragment1() {
        super(R.layout.fragment1);
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                "Тост 1", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onResume() {

        super.onResume();
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                "Тост 5", Toast.LENGTH_SHORT);

        Button button = (Button) getView().findViewById(R.id.button);

    }


    public void Play(View view){

    }



}


