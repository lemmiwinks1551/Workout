package com.example.workout;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

public class WorkoutListFragment extends ListFragment {

    private Listener listener;

    interface Listener {
        // Интерфейсу присваивается имя Listener
        // Любая активность, реализующая интерфей Listener, должна включать этот метод.
        // Он будет использоваться активностью для реакции на выбор варианта во фрагменте.
        void itemClicked(long id);
    }

    @Override
    public void onAttach(Context context) {
        // Вызывается, когда фрагмент связывается с активностью.
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        /**This method will be called when an item in the list is selected.*/
        // Вызывается метод itemClicked() активности с передачей выбранного упражнения выбранного пользователем.
        if (listener != null) {
            listener.itemClicked(id); // !! Строчка, передающая слушателю id нажатой клавиши
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Создать массив из названий упражнений и заполнить его
        String[] names = new String[Workout.exercises.length];
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