package com.example.workout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkoutDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkoutDetailFragment extends Fragment {
    // workoutId - идентификатор комплекса упражнений, выбранного пользователем. Позднее, при выводе
    // подробной информации, он будет использован для заполнения представлений фрагмента.
    private long workoutId;

    @Override
    public void onStart() {
        super.onStart();
        // Метод getView() получает корневой объект View фрагмента. Далее полученный
        // объект используется для получения ссылок на надписи, предназначенные для названия и описания комплекса упражнений.
        // У фрагментов отсутствует метод findViewById(). Чтобы получить ссылку на представления фрагмента,
        // сначала необходимо получить ссылку на корневое представление фрагмента методом getView() и по этой ссылке найти дочерние представления.
        View view = getView();
        TextView title = (TextView) view.findViewById(R.id.textTitle); // Ссылка к View с названием
        TextView description = (TextView) view.findViewById(R.id.textDescription);  // Ссылка к View с описанием
        Workout workout = Workout.exercises[(int) workoutId];   // Получает вид упражнение из массива в Workout.java по полученному из DetailActivity workoutId
        title.setText(workout.getName());
        description.setText(workout.getDescription());
    }

    public void setWorkout(long id) {
        // Метод для присваивания идентификатора. Метод используется
        // активностью для передачи значения идентификатора фрагменту.
        this.workoutId = id;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WorkoutDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WorkoutDetailFragment newInstance(String param1, String param2) {
        WorkoutDetailFragment fragment = new WorkoutDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // Метод, наполняющий фрагмент
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
}