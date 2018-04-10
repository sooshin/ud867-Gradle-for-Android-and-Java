package com.example.android.lib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LibraryActivityFragment extends Fragment {

    public LibraryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);

        // Have the activity in the Android Library retrieve and display the joke.
        Intent intent = getActivity().getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            String jokeFromJavaLibrary = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView libraryTextView = rootView.findViewById(R.id.libraryTextView);
            if (jokeFromJavaLibrary != null && jokeFromJavaLibrary.length() != 0) {
                libraryTextView.setText(jokeFromJavaLibrary);
            }
        }
        return rootView;
    }
}
