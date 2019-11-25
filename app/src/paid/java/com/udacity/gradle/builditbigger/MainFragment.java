package com.udacity.gradle.builditbigger;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.udacity.gradle.androidlib.JokeActivity;
import com.udacity.gradle.builditbigger.R;
import com.udacity.gradle.javalib.Joker;
import com.udacity.gradle.builditbigger.paid.EndPointsAsyncTask;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    @BindView(R.id.jokeTxt)
    TextView jokeText;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R.id.jokeBtn)
    public void tellJoke(View view) {
        // Step 1: Create a Java Library
       /* Joker joker = new Joker();
        String joke = joker.tellJoke();
        Toast.makeText(getContext(), joke, Toast.LENGTH_SHORT).show();*/

        // Step 2: Create an Android Library
        /*   Joker joker = new Joker();
        Intent intent =new Intent(getActivity(), JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_KEY,joker.tellJoke());
        startActivity(intent);*/

        // Step 3: Setup GCE
        new EndPointsAsyncTask().execute(getContext());
    }
}

