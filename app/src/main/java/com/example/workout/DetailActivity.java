package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Получение ссылки на фрагмент происходит после вызова
        // setContentView(). Это очень важно, потому что до этого момента
        // фрагмент еще не был создан.

        // Получаем ссылку на фрагмент
        WorkoutDetailFragment fragment = (WorkoutDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        // Приказываем WorkoutDetailFragment вывести подробную информацию о произвольно выбранном комплексе, чтобы
        // убедиться в том, что все работает.
        fragment.setWorkout(1);
    }
}