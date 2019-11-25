package com.udacity.gradle.androidlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.udacity.gradle.androidlib.ui.joke.JokeFragment;

public class JokeActivity extends AppCompatActivity {
    public static String JOKE_KEY="jokeKey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, JokeFragment.newInstance())
                    .commitNow();
        }
    }
}
