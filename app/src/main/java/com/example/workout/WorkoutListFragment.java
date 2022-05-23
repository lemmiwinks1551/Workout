package com.example.workout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class WorkoutListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Создать массив из названий упражнений и заполнить его
        String [] names = new String[Workout.exercises.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Workout.exercises[i].getName();
        }

        // Создать адаптер массива
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),                          // Получить текущий контекст
                android.R.layout.simple_list_item_1,            // Вид списка
                names);                                         // Содержание списка

        setListAdapter(adapter);                                // Добавить адаптер

        return super.onCreateView(inflater, container, savedInstanceState);

    }
}