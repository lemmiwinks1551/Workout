package com.example.workout;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID = "id";

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

        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID); // Получить интент и id
        fragment.setWorkout(workoutId); // Вызывает метод setWorkout и передает ему id упражнения
    }
}