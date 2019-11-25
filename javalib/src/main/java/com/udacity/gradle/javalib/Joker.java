package com.udacity.gradle.javalib;

import java.util.ArrayList;
import java.util.Random;

public class Joker {
    private ArrayList<String> jokes = new ArrayList<>();

    public Joker() {
        loadJokes();
    }

    public String tellJoke() {
        // Get a random number between 0 and jokes.size - 1
        Random random = new Random();
        int low = 0;
        int high = jokes.size() - 1;
        int rndIndex = random.nextInt(high - low) + low;
        return jokes.get(rndIndex);
    }

    private void loadJokes() {
        jokes.add("I will marry the girl who look pretty in her Adhaar card.");
        jokes.add("Why do cows wear bells? \n Because their horns don't work.");
        jokes.add("Why do Java Programmers have to wear glasses? \n Because they don't c#.");
        jokes.add("Company Owner1 : How come your employees are always on time in the morning? \n Owner2 : Easy. 30 employees and 20 parking spaces.");
        jokes.add("Student1 : Can a leopard hide anywhere ? \n Student2 : No, he is always spotted!");
    }
}
