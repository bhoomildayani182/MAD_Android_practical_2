package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Start","Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Start","Activity Start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("End","Activity Terminated");

    }
}