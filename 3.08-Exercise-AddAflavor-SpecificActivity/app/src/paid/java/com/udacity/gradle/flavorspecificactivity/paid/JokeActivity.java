package com.udacity.gradle.flavorspecificactivity.paid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.udacity.gradle.flavorspecificactivity.R;

public class JokeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }
}
