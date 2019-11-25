package com.udacity.gradle.androidlib.ui.joke;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.gradle.androidlib.JokeActivity;
import com.udacity.gradle.androidlib.R;

public class JokeFragment extends Fragment {

    public static JokeFragment newInstance() {
        return new JokeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.joke_fragment, container, false);
        TextView joke_textview = view.findViewById(R.id.jokeTv);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.JOKE_KEY);
        if (joke != null && joke.length() != 0) {
            joke_textview.setText(joke);
        }
        return view;
    }
}
