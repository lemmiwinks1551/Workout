package com.example.workout;

import androidx.annotation.NonNull;

public class Workout {
    private String name;
    private String description;

    private Workout (String name, String description) {
        this.name = name;
        this.description = description;
    }

    Workout pressPump = new Workout("ПРЕСС КАЧАТ", "оп");
    Workout running = new Workout("БЕГИТ", "быстро");
    Workout pushUps = new Workout("АНЖУМАНЯ", "с хлопком");
    Workout horizontalBar = new Workout("ТУРНИК", "и так 20 раз");

    Workout[] exercises = {pressPump, running, pushUps, horizontalBar};

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
