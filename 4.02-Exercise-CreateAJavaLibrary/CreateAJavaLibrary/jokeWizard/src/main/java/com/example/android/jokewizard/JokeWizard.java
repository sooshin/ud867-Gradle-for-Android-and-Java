package com.example.android.jokewizard;

import com.example.android.jokesmith.JokeSmith;

public class JokeWizard {

    public String getJoke() {
        JokeSmith jokeSmith = new JokeSmith();
        return jokeSmith.getJoke();
    }
}
