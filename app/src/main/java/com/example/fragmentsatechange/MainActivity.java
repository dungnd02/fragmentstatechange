package com.example.fragmentsatechange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void AddFragment(View view){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment =null;

        switch (view.getId()){
            case R.id.btnf1: fragment = new FragmentA();
                break;
            case R.id.btnf2: fragment = new FragmentB();
                break;
        }
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }
}