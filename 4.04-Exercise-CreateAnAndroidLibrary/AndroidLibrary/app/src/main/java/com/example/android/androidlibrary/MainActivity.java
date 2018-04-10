package com.example.android.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.lib.LibraryActivity;
import com.example.android.supplyjoke.SupplyJoke;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchLibraryActivity(View view) {
        // Retrieves a joke from the Java library
        SupplyJoke supplyJoke = new SupplyJoke();
        String jokeFromJavaLibrary = supplyJoke.getJoke();

        Intent intent = new Intent(this, LibraryActivity.class);

        // Packages the joke as an intent extra
        intent.putExtra(Intent.EXTRA_TEXT, jokeFromJavaLibrary);

        // Launches the activity from the Android library
        startActivity(intent);
    }
}
