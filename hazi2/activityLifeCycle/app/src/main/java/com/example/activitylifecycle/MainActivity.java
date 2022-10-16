package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("felulIrtCuccok", "onrestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("felulIrtCuccok", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("felulIrtCuccok", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("felulIrtCuccok", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("felulIrtCuccok", "onResume");
    }

    public void startActivityTwo(View v) {
        Intent myIntent = new Intent(this, ActivityTwo.class);
        startActivity(myIntent);
    }
}