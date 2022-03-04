package com.example.fragmentsatechange;

import android.app.Fragment;
import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentB extends Fragment {
    MediaPlayer song;
    private static  final String TAG  = "Fragment B";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate B()");
        song = MediaPlayer.create(getContext(),R.raw.ex_3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    public void onStart(){
        super.onStart();
        song.start();
        Log.e(TAG, "onStart B");

    }
    public void onResume(){
        super.onResume();
        Log.e(TAG, "onResume B");

    }
    public void onPause(){
        super.onPause();
        Log.e(TAG, "onPause B");
    }
    public void onStop(){
        super.onStop();
        song.pause();
        Log.e(TAG, "onStop B");
    }
    public void onDestroy(){
        super.onDestroy();
        song.release();
        Log.e(TAG, "onDestroy B");
    }

}