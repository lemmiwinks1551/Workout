package com.example.workout;

import androidx.annotation.NonNull;

public class Workout {
    private String name;
    private String description;

    private Workout (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final Workout pressPump = new Workout("ПРЕСС КАЧАТ", "раз \n раз \n раз");
    public static final  Workout running = new Workout("БЕГИТ", "быстро-быстро");
    public static final  Workout pushUps = new Workout("АНЖУМАНЯ", "с хлопком");
    public static final  Workout horizontalBar = new Workout("ТУРНИК", "и так 20 раз");

    public static final Workout[] exercises = {pressPump, running, pushUps, horizontalBar};

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name;
    }
}
